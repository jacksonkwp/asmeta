/**
 * generated by Xtext 2.32.0
 */
package org.asmeta.xt.asmetal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum TD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.asmeta.xt.asmetal.EnumTD#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see org.asmeta.xt.asmetal.AsmetalPackage#getEnumTD()
 * @model
 * @generated
 */
public interface EnumTD extends TypeDomain
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' containment reference list.
   * The list contents are of type {@link org.asmeta.xt.asmetal.EnumElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' containment reference list.
   * @see org.asmeta.xt.asmetal.AsmetalPackage#getEnumTD_Element()
   * @model containment="true"
   * @generated
   */
  EList<EnumElement> getElement();

} // EnumTD
