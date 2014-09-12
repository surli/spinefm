package fr.unice.spinefm.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.unice.spinefm.HistoryModel.HistoryModelPackage;
import fr.unice.spinefm.HistoryModel.Past;
import fr.unice.spinefm.ProcessModel.ContextManager;
import fr.unice.spinefm.core.Constants;
import fr.unice.spinefm.exceptions.FatalSpineFMException;


/**
 * This class is part of SpineFM framework.
 * 
 * Class to manage persistency with two static methods to load or save models in XMI.
 * @author Simon Urli
 *
 */
public class PersistModel {

	private static Logger log = Logger.getLogger(PersistModel.class);
	
	/**
	 * Load a model and return the first element (generally it is the root element) of the model.
	 * @param filepath The path of xmi model.
	 * @param pack The package instance associated to the model.
	 * @return An object created from the first element of the model.
	 * @throws FatalSpineFMException 
	 */
	public static <T> T loadModel(String filepath, EPackage pack, int index) throws FatalSpineFMException {
		ResourceSet resourceSet = new ResourceSetImpl();
		
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
		(Resource.Factory.Registry.DEFAULT_EXTENSION, 
		 new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put
		(pack.getNsURI(), 
		 pack);
		
		File file = new File(filepath);
		URI uri = file.isFile() ? URI.createFileURI(file.getAbsolutePath()): URI.createURI(filepath);
		
		try {
			Resource resource = resourceSet.getResource(uri, true);
			log.info("Loaded " + uri);
			EcoreUtil.resolveAll(resource);
			EObject eobj = resource.getContents().get(index);
			return (T) eobj;
		}
		catch (RuntimeException exception) {
			throw new FatalSpineFMException("Errors when loading the model: "+uri+".\n"+exception.getMessage());
		}
	}
	
	public static <T> T loadModel(String filepath, EPackage pack) throws FatalSpineFMException {
		return PersistModel.loadModel(filepath, pack, 0);
	}
	
	/**
	 * Save a resource as a XMI model.
	 * @param filepath The destination file to save.
	 * @param res The resource to save.
	 * @throws IOException 
	 */
	private static void saveModel(String filepath, Resource res) throws IOException {
		//EcoreUtil.resolveAll(res);
		FileOutputStream fos;
		fos = new FileOutputStream(filepath);
		res.save(fos,null);
	}
	
	public static void saveModel(String dirPath, String modelName, List<EObject> modelList) throws IOException {
		File fPath = new File(dirPath);
		fPath.mkdirs();
		
		String modelPath = dirPath+"/"+modelName;
		
		//String pathResActions = path+"actions.xmi";
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
		(Resource.Factory.Registry.DEFAULT_EXTENSION, 
				new XMIResourceFactoryImpl());

		Resource resource = resSet.createResource(URI.createURI(modelPath));
		for (EObject model : modelList) {
			resource.getContents().add(model);
		}
		PersistModel.saveModel(modelPath, resource);
	}
	
	public static void saveModel(String dirPath, String modelName, EObject model) throws IOException {
		List<EObject> modelList = new ArrayList<EObject>();
		modelList.add(model);
		PersistModel.saveModel(dirPath, modelName, modelList);
	}
	
	
	/*public static void main(String args[]) throws FatalSpineFMException {
		String filepath = "/Users/urli/pastToto.xmi";
		Past p = PersistModel.loadModel(filepath, HistoryModelPackage.eINSTANCE);
		Past p2 = PersistModel.loadModel(filepath, HistoryModelPackage.eINSTANCE);
		System.out.println(p2.getRootPath());
	}*/
}
