package fr.unice.spinefm.stats;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.emf.common.util.EList;

import fr.unice.spinefm.ActionModel.ActionMode;
import fr.unice.spinefm.ActionModel.SystemActionModel.SystemAction;
import fr.unice.spinefm.HistoryModel.Step;
import fr.unice.spinefm.HistoryModel.impl.PastImplDelegate;
import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;
import fr.unice.spinefm.ProcessModel.Context;
import fr.unice.spinefm.ProcessModel.ContextManager;

@XmlRootElement
public class ProcessStats {

	private int numberOfUserActions;
	private int numberOfAutomaticActions;
	private int numberOfFMActions;
	private int numberOfContexts;
	private int numberOfCPS;
	private int nbUserUndo;
	private int nbSystemUndo;
	private int nbCallsUndo;
	
	public ProcessStats() {}
	
	public void computeFiguresFromContextManager(ContextManager cm) {
		this.numberOfAutomaticActions = 0;
		this.numberOfFMActions = 0;
		this.numberOfContexts = 0;
		this.numberOfCPS = 0;
		List<Context> allContexts = new ArrayList<Context>();
		allContexts.addAll(cm.getLocalContexts());
		allContexts.add(cm.getGlobalContext());
		
		for (Context ctx : allContexts) {
			this.numberOfCPS += ctx.getCPS().size();
		}
		
		this.numberOfContexts = allContexts.size();
		
		this.numberOfUserActions = cm.getPast().getSteps().size();
		
		for (Step s : cm.getPast().getSteps()) {
			for (SystemAction sa : s.getLaunchedActions()) {
				if (sa.getType().equals(ActionMode.AUTOMATIC)) {
					this.numberOfAutomaticActions++;
				} else if (sa.getType().equals(ActionMode.FM)) {
					this.numberOfFMActions++;
				}
			}
		}
		
		this.nbSystemUndo = ((PastImplDelegate)cm.getPast()).nbSystemUndo;
		this.nbUserUndo = ((PastImplDelegate)cm.getPast()).nbUserUndo;
		this.nbCallsUndo = ((PastImplDelegate)cm.getPast()).nbCallUndo;
	}
	
	@XmlElement
	public int getNumberOfUserActions() {
		return this.numberOfUserActions;
	}
	
	@XmlElement
	public int getNumberOfAutomaticActions() {
		return this.numberOfAutomaticActions;
	}
	
	@XmlElement
	public int getNumberOfFMActions() {
		return this.numberOfFMActions;
	}
	
	@XmlElement
	public int getNumberOfContexts() {
		return this.numberOfContexts;
	}
	
	@XmlElement
	public int getTotalNumberOfActions() {
		return this.numberOfAutomaticActions+this.numberOfUserActions+this.numberOfFMActions;
	}
	
	@XmlElement
	public int getNumberOfCPS() {
		return this.numberOfCPS;
	}
	
	@XmlElement
	public double percentageOfUserActions() {
		return (this.numberOfUserActions / this.getTotalNumberOfActions())*100;
	}
	
	@XmlElement
	public double percentageOfFMActions() {
		return (this.numberOfFMActions / this.getTotalNumberOfActions())*100;
	}
	
	@XmlElement
	public double percentageOfAutomaticActions() {
		return (this.numberOfAutomaticActions / this.getTotalNumberOfActions())*100;
	}

	@XmlElement
	public int getNbUserUndo() {
		return nbUserUndo;
	}

	@XmlElement
	public int getNbSystemUndo() {
		return nbSystemUndo;
	}
	
	@XmlElement
	public int getNbCalledUndo() {
		return nbCallsUndo;
	}
	
}
