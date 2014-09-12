package fr.unice.spinefm.ActionModel.UserActionModel.impl;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.unice.spinefm.ActionModel.UserActionModel.UserAction;
import fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelFactory;
import fr.unice.spinefm.ActionModel.UserActionModel.UserGenerate;
import fr.unice.spinefm.ProcessModel.ContextManager;
import fr.unice.spinefm.core.Constants;
import fr.unice.spinefm.exceptions.FatalSpineFMException;
import fr.unice.spinefm.utils.PersistModel;

public class UserGenerateImplDelegate extends UserGenerateImpl {

	protected static Logger log = Logger.getLogger(UserGenerateImplDelegate.class);
	
	@Override
	public void apply() throws FatalSpineFMException {
		log.info("\n\n\t\t Apply user action Generate on path "+this.getPath()+" \n\n");
		try {
			this.saveModels(this.getPath());
		} catch (IOException e) {
			e.printStackTrace();
			throw new FatalSpineFMException(e.getMessage(),this.getContextManager().getPast(),this.getStep());
		}
	}
	
	private void saveModels(String path) throws IOException {
		if (path == null || path.equals("")) {
			path = Constants.DEFAULT_SAVE_PATH;
		}
		PersistModel.saveModel(path, "mspl.xmi", this.getContextManager().getMspl());
		PersistModel.saveModel(path, "configuration.xmi", this.getContextManager());
	}

	@Override
	public String getDescription() {
		return "Generate the system at "+Calendar.getInstance().toString();
	}
	
	@Override
	public UserAction cloneActionWithStringAttributes() {
		UserGenerate result = UserActionModelFactory.eINSTANCE.createUserGenerate();
		result.setPath(this.getPath());
		return result;
	}
}
