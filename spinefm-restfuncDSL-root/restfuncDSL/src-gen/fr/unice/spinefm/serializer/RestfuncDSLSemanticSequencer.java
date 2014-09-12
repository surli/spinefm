package fr.unice.spinefm.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.unice.spinefm.restfuncDSL.GroupFeature;
import fr.unice.spinefm.restfuncDSL.LeftPart;
import fr.unice.spinefm.restfuncDSL.RestFunc;
import fr.unice.spinefm.restfuncDSL.RestfuncDSLPackage;
import fr.unice.spinefm.restfuncDSL.RightPart;
import fr.unice.spinefm.restfuncDSL.RuleString;
import fr.unice.spinefm.restfuncDSL.SingleFeature;
import fr.unice.spinefm.restfuncDSL.Source;
import fr.unice.spinefm.restfuncDSL.SourceAndTarget;
import fr.unice.spinefm.restfuncDSL.StarFeature;
import fr.unice.spinefm.restfuncDSL.Target;
import fr.unice.spinefm.restfuncDSL.Variable;
import fr.unice.spinefm.restfuncDSL.VariableFeature;
import fr.unice.spinefm.services.RestfuncDSLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class RestfuncDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RestfuncDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == RestfuncDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RestfuncDSLPackage.GROUP_FEATURE:
				if(context == grammarAccess.getGroupFeatureRule()) {
					sequence_GroupFeature(context, (GroupFeature) semanticObject); 
					return; 
				}
				else break;
			case RestfuncDSLPackage.LEFT_PART:
				if(context == grammarAccess.getLeftPartRule()) {
					sequence_LeftPart(context, (LeftPart) semanticObject); 
					return; 
				}
				else break;
			case RestfuncDSLPackage.REST_FUNC:
				if(context == grammarAccess.getRestFuncRule()) {
					sequence_RestFunc(context, (RestFunc) semanticObject); 
					return; 
				}
				else break;
			case RestfuncDSLPackage.RIGHT_PART:
				if(context == grammarAccess.getRightPartRule()) {
					sequence_RightPart(context, (RightPart) semanticObject); 
					return; 
				}
				else break;
			case RestfuncDSLPackage.RULE_STRING:
				if(context == grammarAccess.getRuleStringRule()) {
					sequence_RuleString(context, (RuleString) semanticObject); 
					return; 
				}
				else break;
			case RestfuncDSLPackage.SINGLE_FEATURE:
				if(context == grammarAccess.getFeatureNamedRule() ||
				   context == grammarAccess.getSingleFeatureRule()) {
					sequence_SingleFeature(context, (SingleFeature) semanticObject); 
					return; 
				}
				else break;
			case RestfuncDSLPackage.SOURCE:
				if(context == grammarAccess.getSourceRule()) {
					sequence_Source(context, (Source) semanticObject); 
					return; 
				}
				else break;
			case RestfuncDSLPackage.SOURCE_AND_TARGET:
				if(context == grammarAccess.getSourceAndTargetRule()) {
					sequence_SourceAndTarget(context, (SourceAndTarget) semanticObject); 
					return; 
				}
				else break;
			case RestfuncDSLPackage.STAR_FEATURE:
				if(context == grammarAccess.getFeatureNamedRule() ||
				   context == grammarAccess.getStarFeatureRule()) {
					sequence_StarFeature(context, (StarFeature) semanticObject); 
					return; 
				}
				else break;
			case RestfuncDSLPackage.TARGET:
				if(context == grammarAccess.getTargetRule()) {
					sequence_Target(context, (Target) semanticObject); 
					return; 
				}
				else break;
			case RestfuncDSLPackage.VARIABLE:
				if(context == grammarAccess.getVariableRule()) {
					sequence_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			case RestfuncDSLPackage.VARIABLE_FEATURE:
				if(context == grammarAccess.getFeatureNamedRule() ||
				   context == grammarAccess.getVariableFeatureRule()) {
					sequence_VariableFeature(context, (VariableFeature) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (state=FM_STATE feature+=FeatureNamed feature+=FeatureNamed*)
	 */
	protected void sequence_GroupFeature(EObject context, GroupFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     features+=GroupFeature+
	 */
	protected void sequence_LeftPart(EObject context, LeftPart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (init=SourceAndTarget rules+=RuleString+)
	 */
	protected void sequence_RestFunc(EObject context, RestFunc semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (action=ACTION feature=FeatureNamed)
	 */
	protected void sequence_RightPart(EObject context, RightPart semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RestfuncDSLPackage.Literals.RIGHT_PART__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestfuncDSLPackage.Literals.RIGHT_PART__ACTION));
			if(transientValues.isValueTransient(semanticObject, RestfuncDSLPackage.Literals.RIGHT_PART__FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestfuncDSLPackage.Literals.RIGHT_PART__FEATURE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRightPartAccess().getActionACTIONParserRuleCall_0_0(), semanticObject.getAction());
		feeder.accept(grammarAccess.getRightPartAccess().getFeatureFeatureNamedParserRuleCall_1_0(), semanticObject.getFeature());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID? left=LeftPart right=RightPart)
	 */
	protected void sequence_RuleString(EObject context, RuleString semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     featureName=ID
	 */
	protected void sequence_SingleFeature(EObject context, SingleFeature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RestfuncDSLPackage.Literals.FEATURE_NAMED__FEATURE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestfuncDSLPackage.Literals.FEATURE_NAMED__FEATURE_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSingleFeatureAccess().getFeatureNameIDTerminalRuleCall_0(), semanticObject.getFeatureName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (source=Source target=Target)
	 */
	protected void sequence_SourceAndTarget(EObject context, SourceAndTarget semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RestfuncDSLPackage.Literals.SOURCE_AND_TARGET__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestfuncDSLPackage.Literals.SOURCE_AND_TARGET__SOURCE));
			if(transientValues.isValueTransient(semanticObject, RestfuncDSLPackage.Literals.SOURCE_AND_TARGET__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestfuncDSLPackage.Literals.SOURCE_AND_TARGET__TARGET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSourceAndTargetAccess().getSourceSourceParserRuleCall_0_0(), semanticObject.getSource());
		feeder.accept(grammarAccess.getSourceAndTargetAccess().getTargetTargetParserRuleCall_1_0(), semanticObject.getTarget());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     deSrc=ID
	 */
	protected void sequence_Source(EObject context, Source semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RestfuncDSLPackage.Literals.SOURCE__DE_SRC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestfuncDSLPackage.Literals.SOURCE__DE_SRC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSourceAccess().getDeSrcIDTerminalRuleCall_2_0(), semanticObject.getDeSrc());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     featureName=ID
	 */
	protected void sequence_StarFeature(EObject context, StarFeature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RestfuncDSLPackage.Literals.FEATURE_NAMED__FEATURE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestfuncDSLPackage.Literals.FEATURE_NAMED__FEATURE_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStarFeatureAccess().getFeatureNameIDTerminalRuleCall_0_0(), semanticObject.getFeatureName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     deTarget=ID
	 */
	protected void sequence_Target(EObject context, Target semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RestfuncDSLPackage.Literals.TARGET__DE_TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestfuncDSLPackage.Literals.TARGET__DE_TARGET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTargetAccess().getDeTargetIDTerminalRuleCall_2_0(), semanticObject.getDeTarget());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (featureName=ID variable=Variable)
	 */
	protected void sequence_VariableFeature(EObject context, VariableFeature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RestfuncDSLPackage.Literals.FEATURE_NAMED__FEATURE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestfuncDSLPackage.Literals.FEATURE_NAMED__FEATURE_NAME));
			if(transientValues.isValueTransient(semanticObject, RestfuncDSLPackage.Literals.VARIABLE_FEATURE__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestfuncDSLPackage.Literals.VARIABLE_FEATURE__VARIABLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableFeatureAccess().getFeatureNameIDTerminalRuleCall_0_0(), semanticObject.getFeatureName());
		feeder.accept(grammarAccess.getVariableFeatureAccess().getVariableVariableParserRuleCall_2_0(), semanticObject.getVariable());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     id=ID
	 */
	protected void sequence_Variable(EObject context, Variable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RestfuncDSLPackage.Literals.VARIABLE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestfuncDSLPackage.Literals.VARIABLE__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableAccess().getIdIDTerminalRuleCall_1_0(), semanticObject.getId());
		feeder.finish();
	}
}
