/**
 * generated by Xtext 2.34.0
 */
package org.asmeta.xt.asmetal.impl;

import org.asmeta.xt.asmetal.AsmetalPackage;
import org.asmeta.xt.asmetal.MonitoredFunction;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitored Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MonitoredFunctionImpl extends DynamicFunctionImpl implements MonitoredFunction
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MonitoredFunctionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AsmetalPackage.Literals.MONITORED_FUNCTION;
  }

  public org.asmeta.xt.asmetal.DynamicFunction getInitializedFunction()
  {
  	org.asmeta.xt.asmetal.Function f = org.asmeta.xt.validation.utility.Utility.getFunctionByName(this.name);
	if (f instanceof org.asmeta.xt.asmetal.DynamicFunction)
		return (org.asmeta.xt.asmetal.DynamicFunction)f;
	return null;
  }
} //MonitoredFunctionImpl
