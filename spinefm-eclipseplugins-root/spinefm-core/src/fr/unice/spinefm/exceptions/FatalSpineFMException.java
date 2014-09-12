package fr.unice.spinefm.exceptions;

import java.util.List;

import fr.unice.spinefm.ActionModel.SystemActionModel.SystemAction;
import fr.unice.spinefm.HistoryModel.Past;
import fr.unice.spinefm.HistoryModel.Step;

public class FatalSpineFMException extends Exception {
	
	private String completeMessage;
	
	public FatalSpineFMException(String msg) {
		super(msg);
		this.completeMessage = "";
	}
	
	public FatalSpineFMException(String msg, Past p, Step s) {
		super(msg);
		
		this.completeMessage = "\n\nThe last launched action was "+s.getDescription()+" \n\n";
		this.completeMessage += "The following system actions have been launched:\n";
		
		for (SystemAction sa : s.getLaunchedActions()) {
			this.completeMessage += sa.toString()+" \n";
		}
		
		List<Step> allSteps = p.getSteps();
		
		int index = allSteps.indexOf(s);
		
		int begin = index-10;
		if (begin < 0) {
			begin = 0;
		}
		
		this.completeMessage += "Last 10 user actions :\n";
		for (int i = begin; i < index; i++) {
			this.completeMessage += allSteps.get(i).getDescription()+"\n";
		}
	}
	
	public String getMessage() {
		return super.getMessage()+this.completeMessage;
	}
}
