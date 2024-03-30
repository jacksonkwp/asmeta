/**
 * generated by Xtext 2.34.0
 */
package org.asmeta.xt.asmetal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choose Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.asmeta.xt.asmetal.ChooseRule#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.asmeta.xt.asmetal.ChooseRule#getRanges <em>Ranges</em>}</li>
 *   <li>{@link org.asmeta.xt.asmetal.ChooseRule#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.asmeta.xt.asmetal.ChooseRule#getDoRule <em>Do Rule</em>}</li>
 *   <li>{@link org.asmeta.xt.asmetal.ChooseRule#getIfnone <em>Ifnone</em>}</li>
 * </ul>
 *
 * @see org.asmeta.xt.asmetal.AsmetalPackage#getChooseRule()
 * @model
 * @generated
 */
public interface ChooseRule extends BasicRule
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
   * The list contents are of type {@link org.asmeta.xt.asmetal.VariableTerm}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference list.
   * @see org.asmeta.xt.asmetal.AsmetalPackage#getChooseRule_Variable()
   * @model containment="true"
   * @generated
   */
  EList<VariableTerm> getVariable();

  /**
   * Returns the value of the '<em><b>Ranges</b></em>' containment reference list.
   * The list contents are of type {@link org.asmeta.xt.asmetal.Term}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ranges</em>' containment reference list.
   * @see org.asmeta.xt.asmetal.AsmetalPackage#getChooseRule_Ranges()
   * @model containment="true"
   * @generated
   */
  EList<Term> getRanges();

  /**
   * Returns the value of the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' containment reference.
   * @see #setGuard(Term)
   * @see org.asmeta.xt.asmetal.AsmetalPackage#getChooseRule_Guard()
   * @model containment="true"
   * @generated
   */
  Term getGuard();

  /**
   * Sets the value of the '{@link org.asmeta.xt.asmetal.ChooseRule#getGuard <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' containment reference.
   * @see #getGuard()
   * @generated
   */
  void setGuard(Term value);

  /**
   * Returns the value of the '<em><b>Do Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Do Rule</em>' containment reference.
   * @see #setDoRule(Rule)
   * @see org.asmeta.xt.asmetal.AsmetalPackage#getChooseRule_DoRule()
   * @model containment="true"
   * @generated
   */
  Rule getDoRule();

  /**
   * Sets the value of the '{@link org.asmeta.xt.asmetal.ChooseRule#getDoRule <em>Do Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Do Rule</em>' containment reference.
   * @see #getDoRule()
   * @generated
   */
  void setDoRule(Rule value);

  /**
   * Returns the value of the '<em><b>Ifnone</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ifnone</em>' containment reference.
   * @see #setIfnone(Rule)
   * @see org.asmeta.xt.asmetal.AsmetalPackage#getChooseRule_Ifnone()
   * @model containment="true"
   * @generated
   */
  Rule getIfnone();

  /**
   * Sets the value of the '{@link org.asmeta.xt.asmetal.ChooseRule#getIfnone <em>Ifnone</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ifnone</em>' containment reference.
   * @see #getIfnone()
   * @generated
   */
  void setIfnone(Rule value);

  public void setRanges(EList<Term> list);
} // ChooseRule
