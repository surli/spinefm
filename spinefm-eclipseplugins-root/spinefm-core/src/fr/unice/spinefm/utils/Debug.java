package fr.unice.spinefm.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.ConcurrentModificationException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Debug {

	private static String SESSION = "\n// New Session SpineFM : "+Calendar.getInstance().getTime()+"\n\n";
	private static boolean displayDebug = true;
	private static boolean saveScript = false;
	private static boolean displayScript = true;
	
	private static String ScriptPath = "/tmp/SpineFMTrace.fml";
	private static BufferedWriter bw = null;
	private static Logger log = Logger.getLogger(Debug.class);
	
	public static void setSaveScript(boolean s) {
		saveScript = s;
	}
	
	public static void setDisplayScript(boolean s) {
		displayScript = s;
	}
	
	public static void setDisplayDebug(boolean s) {
		displayDebug = s;
	}
	
	/*public static void trace(String s) {
		if (displayDebug)
			log.info("SpineFM Debug >> "+s);
	}*/
	
	public static void setVerbose() {
		log.setLevel(Level.INFO);
	}
	
	// TODO : conserve trace by session
	public static void traceToScript(String s) {
		//if (displayScript)
		//	trace("Script FML: "+s);
		if (saveScript) {
			if (bw == null) {
				try {
					log.info("FML Script will be saved in the following file : "+ScriptPath);
					bw = new BufferedWriter(new FileWriter(ScriptPath));
					bw.write(SESSION);
					bw.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			try {
				bw.write(s+"\n");
				bw.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void setScriptPath(String path) {
		if (bw != null)
			throw new ConcurrentModificationException("Writer already initialized.");
		ScriptPath = path;
	}
}
