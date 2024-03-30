/**
 * generated by Xtext 2.34.0
 */
package org.asmeta.xt.asmetal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extend Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.asmeta.xt.asmetal.ExtendRule#getExtendedDomain <em>Extended Domain</em>}</li>
 *   <li>{@link org.asmeta.xt.asmetal.ExtendRule#getBoundVar <em>Bound Var</em>}</li>
 *   <li>{@link org.asmeta.xt.asmetal.ExtendRule#getDoRule <em>Do Rule</em>}</li>
 * </ul>
 *
 * @see org.asmeta.xt.asmetal.AsmetalPackage#getExtendRule()
 * @model
 * @generated
 */
public interface ExtendRule extends BasicRule
{
  /**
   * Returns the value of the '<em><b>Extended Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extended Domain</em>' containment reference.
   * @see #setExtendedDomain(Domain)
   * @see org.asmeta.xt.asmetal.AsmetalPackage#getExtendRule_ExtendedDomain()
   * @model containment="true"
   * @generated
   */
  Domain getExtendedDomain();

  /**
   * Sets the value of the '{@link org.asmeta.xt.asmetal.ExtendRule#getExtendedDomain <em>Extended Domain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extended Domain</em>' containment reference.
   * @see #getExtendedDomain()
   * @generated
   */
  void setExtendedDomain(Domain value);

  /**
   * Returns the value of the '<em><b>Bound Var</b></em>' containment reference list.
   * The list contents are of type {@link org.asmeta.xt.asmetal.VariableTerm}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bound Var</em>' containment reference list.
   * @see org.asmeta.xt.asmetal.AsmetalPackage#getExtendRule_BoundVar()
   * @model containment="true"
   * @generated
   */
  EList<VariableTerm> getBoundVar();

  /**
   * Returns the value of the '<em><b>Do Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Do Rule</em>' containment reference.
   * @see #setDoRule(Rule)
   * @see org.asmeta.xt.asmetal.AsmetalPackage#getExtendRule_DoRule()
   * @model containment="true"
   * @generated
   */
  Rule getDoRule();

  /**
   * Sets the value of the '{@link org.asmeta.xt.asmetal.ExtendRule#getDoRule <em>Do Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Do Rule</em>' containment reference.
   * @see #getDoRule()
   * @generated
   */
  void setDoRule(Rule value);

} // ExtendRule
