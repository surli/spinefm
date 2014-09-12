package fr.unice.spinefm.restfunc;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import fr.unice.spinefm.restfunc.exceptions.RestrictionFunctionParserException;
import fr.unice.spinefm.restfuncDSL.*;
import fr.unice.spinefm.utils.Utils;
import fr.unice.spinefm.RestfuncDSLStandaloneSetupGenerated;



public class RestrictionFunctionParser {
	private Resource _resource;
	private XtextResourceSet _resourceSet;
	private Injector _injector;
	
	public RestrictionFunctionParser() {
		this._injector = new RestfuncDSLStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
		_resourceSet = _injector.getInstance(XtextResourceSet.class);
		_resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
	}
	
	public RestFunc fileParser(String filename, String id) throws RestrictionFunctionParserException {
		String cmd = "";
		StringWriter sw = new StringWriter();
		try {
			FileReader fr = new FileReader(filename);
			while (fr.ready())
				sw.write(fr.read());
			sw.flush();
			cmd = sw.toString();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println(e);
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.stringParser(cmd,id);
	}
	
	private RestFunc stringParser(String cmd, String id) throws RestrictionFunctionParserException {
		//System.out.println("Command to parse :"+cmd);
		this._resource = this._resourceSet.createResource(URI.createURI("dummy:/"+id+".restfunc"));
		
		InputStream in = new ByteArrayInputStream(cmd.getBytes());
		try {
			this._resource.load(in, this._resourceSet.getLoadOptions());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (this._resource.getErrors().size() > 0) {
			throw new RestrictionFunctionParserException("parsing errors " + this._resource.getErrors().toString()); // better
		} else if (this._resource.getContents().size() == 0) {
			throw new RestrictionFunctionParserException("resource.getContents().size() == 0 ");
		}
		else {
			RestFunc datas = (RestFunc) this._resource.getContents().get(0);
			return datas;
		}
	}
	
	public static void main(String args[]) {
		RestrictionFunctionParser rfp = new RestrictionFunctionParser();
		try {
			RestFunc rf = rfp.fileParser("/var/yourcast/MSPL/restfunc/AssoBehaviourZone/BZ_Element.restfunc", "BZ_Element");
			System.out.println(rf.getInit().getSource().getDeSrc());
		} catch (RestrictionFunctionParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
