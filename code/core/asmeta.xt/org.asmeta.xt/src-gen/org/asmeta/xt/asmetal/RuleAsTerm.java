/**
 * generated by Xtext 2.34.0
 */
package org.asmeta.xt.asmetal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule As Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.asmeta.xt.asmetal.RuleAsTerm#getName <em>Name</em>}</li>
 *   <li>{@link org.asmeta.xt.asmetal.RuleAsTerm#getDomains <em>Domains</em>}</li>
 * </ul>
 *
 * @see org.asmeta.xt.asmetal.AsmetalPackage#getRuleAsTerm()
 * @model
 * @generated
 */
public interface RuleAsTerm extends ExtendedTerm
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.asmeta.xt.asmetal.AsmetalPackage#getRuleAsTerm_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.asmeta.xt.asmetal.RuleAsTerm#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Domains</b></em>' containment reference list.
   * The list contents are of type {@link org.asmeta.xt.asmetal.Domain}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domains</em>' containment reference list.
   * @see org.asmeta.xt.asmetal.AsmetalPackage#getRuleAsTerm_Domains()
   * @model containment="true"
   * @generated
   */
  EList<Domain> getDomains();

} // RuleAsTerm
