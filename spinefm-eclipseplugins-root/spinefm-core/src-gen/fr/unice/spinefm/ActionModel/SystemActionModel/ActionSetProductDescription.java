/**
 */
package fr.unice.spinefm.ActionModel.SystemActionModel;

import fr.unice.spinefm.ConfigurationModel.CompositeConfiguration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Set Product Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionSetProductDescription#getProduct <em>Product</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage#getActionSetProductDescription()
 * @model
 * @generated
 */
public interface ActionSetProductDescription extends ActionAbstractRename
{
	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(CompositeConfiguration)
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage#getActionSetProductDescription_Product()
	 * @model required="true"
	 * @generated
	 */
	CompositeConfiguration getProduct();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionSetProductDescription#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(CompositeConfiguration value);

} // ActionSetProductDescription
