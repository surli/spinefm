package fr.unice.spinefm.rest;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelFactory;
import fr.unice.spinefm.ActionModel.UserActionModel.UserInit;
import fr.unice.spinefm.ProcessModel.ContextManager;
import fr.unice.spinefm.exceptions.ElementNotFoundException;
import fr.unice.spinefm.exceptions.FatalSpineFMException;
import fr.unice.spinefm.rest.service.exception.CoreNotExistingException;

public class CoreRegistry {
	
	private static final String DEFAULT_MODEL_PATH = "/var/yourcast/MSPL/";
	private static final String DEFAULT_MODEL_FILENAME = "MultipleSoftwareProductLine.xmi";
	private static final String DEFAULT_PERSISTENCY_PATH = "/tmp/spinefm/";

	private Map<String,RestSpineFMInstance> restSpineInstances;
	private Map<String,ContextManager> coreInstances;
	
	private static CoreRegistry instance = new CoreRegistry();
	
	private CoreRegistry() {
		this.coreInstances = new HashMap<String,ContextManager>();
		this.restSpineInstances = new HashMap<String,RestSpineFMInstance>();
	}
	
	public static CoreRegistry getInstance() {
		return instance;
	}
	
	public String createCore(String modelPath, String description) throws FatalSpineFMException, ElementNotFoundException {
		UserInit init = UserActionModelFactory.eINSTANCE.createUserInit();
		init.setFilePath(modelPath);
		init.setConfDescription(description);
		init.apply();
		
		ContextManager cm = init.getContextManager();
		RestSpineFMInstance rspinefm = new RestSpineFMInstance(cm.getId(), description, new Date(), cm.getMspl().getId());
		
		this.coreInstances.put(cm.getId(),cm);
		this.restSpineInstances.put(cm.getId(), rspinefm);
		return cm.getId();
	}
	
	public String importCore(String pastPath) throws ElementNotFoundException, FatalSpineFMException {
		UserInit init = UserActionModelFactory.eINSTANCE.createUserInit();
		init.setPastPath(pastPath);
		init.apply();
		
		ContextManager cm = init.getContextManager();
		RestSpineFMInstance rspinefm = new RestSpineFMInstance(cm.getId(), "", new Date(), cm.getMspl().getId());
		rspinefm.setModificationDate(new Date());
		rspinefm.setDescription(cm.getGlobalContext().getConfiguration().getName());
		this.coreInstances.put(cm.getId(),cm);
		this.restSpineInstances.put(cm.getId(), rspinefm);
		return cm.getId();
	}
	
	public ContextManager getCore(String s) throws CoreNotExistingException {
		if (s == null) {
			throw new CoreNotExistingException("SpineFM instance ID can not be null");
		}
		if (!this.coreInstances.containsKey(s)) {
			throw new CoreNotExistingException("The SpineFM instances identified with the UUID "+s+" doesn't exist or is expired.");
		}
		return this.coreInstances.get(s);

	}

	public RestSpineFMInstance getRestSpineFMInstance(String s) throws CoreNotExistingException {
		if (s == null) {
			throw new CoreNotExistingException("SpineFM instance ID can not be null");
		}
		if (!this.coreInstances.containsKey(s)) {
			throw new CoreNotExistingException("The SpineFM instances identified with the UUID "+s+" doesn't exist or is expired.");
		}
		return this.restSpineInstances.get(s);
	}
	
	public Collection<RestSpineFMInstance> getAllInstances() {
		return this.restSpineInstances.values();
	}
}
