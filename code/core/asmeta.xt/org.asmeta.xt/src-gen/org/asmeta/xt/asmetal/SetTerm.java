/**
 * generated by Xtext 2.34.0
 */
package org.asmeta.xt.asmetal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.asmeta.xt.asmetal.SetTerm#getStart_term <em>Start term</em>}</li>
 *   <li>{@link org.asmeta.xt.asmetal.SetTerm#getOther_terms <em>Other terms</em>}</li>
 *   <li>{@link org.asmeta.xt.asmetal.SetTerm#getEnd_term <em>End term</em>}</li>
 *   <li>{@link org.asmeta.xt.asmetal.SetTerm#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see org.asmeta.xt.asmetal.AsmetalPackage#getSetTerm()
 * @model
 * @generated
 */
public interface SetTerm extends CollectionTerm
{
  /**
   * Returns the value of the '<em><b>Start term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start term</em>' containment reference.
   * @see #setStart_term(Term)
   * @see org.asmeta.xt.asmetal.AsmetalPackage#getSetTerm_Start_term()
   * @model containment="true"
   * @generated
   */
  Term getStart_term();

  /**
   * Sets the value of the '{@link org.asmeta.xt.asmetal.SetTerm#getStart_term <em>Start term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start term</em>' containment reference.
   * @see #getStart_term()
   * @generated
   */
  void setStart_term(Term value);

  /**
   * Returns the value of the '<em><b>Other terms</b></em>' containment reference list.
   * The list contents are of type {@link org.asmeta.xt.asmetal.Term}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Other terms</em>' containment reference list.
   * @see org.asmeta.xt.asmetal.AsmetalPackage#getSetTerm_Other_terms()
   * @model containment="true"
   * @generated
   */
  EList<Term> getOther_terms();

  /**
   * Returns the value of the '<em><b>End term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>End term</em>' containment reference.
   * @see #setEnd_term(Term)
   * @see org.asmeta.xt.asmetal.AsmetalPackage#getSetTerm_End_term()
   * @model containment="true"
   * @generated
   */
  Term getEnd_term();

  /**
   * Sets the value of the '{@link org.asmeta.xt.asmetal.SetTerm#getEnd_term <em>End term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End term</em>' containment reference.
   * @see #getEnd_term()
   * @generated
   */
  void setEnd_term(Term value);

  /**
   * Returns the value of the '<em><b>Step</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Step</em>' containment reference.
   * @see #setStep(ConstantTerm)
   * @see org.asmeta.xt.asmetal.AsmetalPackage#getSetTerm_Step()
   * @model containment="true"
   * @generated
   */
  ConstantTerm getStep();

  /**
   * Sets the value of the '{@link org.asmeta.xt.asmetal.SetTerm#getStep <em>Step</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Step</em>' containment reference.
   * @see #getStep()
   * @generated
   */
  void setStep(ConstantTerm value);

  Integer getSize();
  
  java.util.Collection<org.asmeta.xt.asmetal.Term> getTerm();
  
  void setSize(Integer size);
} // SetTerm
