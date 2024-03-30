/**
 * generated by Xtext 2.34.0
 */
package org.asmeta.xt.asmetal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Justice Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.asmeta.xt.asmetal.JusticeConstraint#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.asmeta.xt.asmetal.AsmetalPackage#getJusticeConstraint()
 * @model
 * @generated
 */
public interface JusticeConstraint extends FairnessConstraint
{
  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(Term)
   * @see org.asmeta.xt.asmetal.AsmetalPackage#getJusticeConstraint_Body()
   * @model containment="true"
   * @generated
   */
  Term getBody();

  /**
   * Sets the value of the '{@link org.asmeta.xt.asmetal.JusticeConstraint#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Term value);

} // JusticeConstraint
