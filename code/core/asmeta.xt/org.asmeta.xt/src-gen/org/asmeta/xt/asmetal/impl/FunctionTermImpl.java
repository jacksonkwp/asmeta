/**
 * generated by Xtext 2.34.0
 */
package org.asmeta.xt.asmetal.impl;

import org.asmeta.xt.asmetal.AsmetalPackage;
import org.asmeta.xt.asmetal.FunctionTerm;
import org.asmeta.xt.asmetal.TupleTerm;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.asmeta.xt.asmetal.impl.FunctionTermImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link org.asmeta.xt.asmetal.impl.FunctionTermImpl#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link org.asmeta.xt.asmetal.impl.FunctionTermImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionTermImpl extends BasicTermImpl implements FunctionTerm
{
  /**
   * The default value of the '{@link #getAgent() <em>Agent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgent()
   * @generated
   * @ordered
   */
  protected static final String AGENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAgent() <em>Agent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgent()
   * @generated
   * @ordered
   */
  protected String agent = AGENT_EDEFAULT;

  /**
   * The default value of the '{@link #getFunctionName() <em>Function Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionName()
   * @generated
   * @ordered
   */
  protected static final String FUNCTION_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFunctionName() <em>Function Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionName()
   * @generated
   * @ordered
   */
  protected String functionName = FUNCTION_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArguments()
   * @generated
   * @ordered
   */
  protected TupleTerm arguments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionTermImpl()
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
    return AsmetalPackage.Literals.FUNCTION_TERM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAgent()
  {
    return agent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAgent(String newAgent)
  {
    String oldAgent = agent;
    agent = newAgent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsmetalPackage.FUNCTION_TERM__AGENT, oldAgent, agent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFunctionName()
  {
    return functionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFunctionName(String newFunctionName)
  {
    String oldFunctionName = functionName;
    functionName = newFunctionName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsmetalPackage.FUNCTION_TERM__FUNCTION_NAME, oldFunctionName, functionName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TupleTerm getArguments()
  {
    return arguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArguments(TupleTerm newArguments, NotificationChain msgs)
  {
    TupleTerm oldArguments = arguments;
    arguments = newArguments;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsmetalPackage.FUNCTION_TERM__ARGUMENTS, oldArguments, newArguments);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setArguments(TupleTerm newArguments)
  {
    if (newArguments != arguments)
    {
      NotificationChain msgs = null;
      if (arguments != null)
        msgs = ((InternalEObject)arguments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsmetalPackage.FUNCTION_TERM__ARGUMENTS, null, msgs);
      if (newArguments != null)
        msgs = ((InternalEObject)newArguments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsmetalPackage.FUNCTION_TERM__ARGUMENTS, null, msgs);
      msgs = basicSetArguments(newArguments, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsmetalPackage.FUNCTION_TERM__ARGUMENTS, newArguments, newArguments));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AsmetalPackage.FUNCTION_TERM__ARGUMENTS:
        return basicSetArguments(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AsmetalPackage.FUNCTION_TERM__AGENT:
        return getAgent();
      case AsmetalPackage.FUNCTION_TERM__FUNCTION_NAME:
        return getFunctionName();
      case AsmetalPackage.FUNCTION_TERM__ARGUMENTS:
        return getArguments();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AsmetalPackage.FUNCTION_TERM__AGENT:
        setAgent((String)newValue);
        return;
      case AsmetalPackage.FUNCTION_TERM__FUNCTION_NAME:
        setFunctionName((String)newValue);
        return;
      case AsmetalPackage.FUNCTION_TERM__ARGUMENTS:
        setArguments((TupleTerm)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AsmetalPackage.FUNCTION_TERM__AGENT:
        setAgent(AGENT_EDEFAULT);
        return;
      case AsmetalPackage.FUNCTION_TERM__FUNCTION_NAME:
        setFunctionName(FUNCTION_NAME_EDEFAULT);
        return;
      case AsmetalPackage.FUNCTION_TERM__ARGUMENTS:
        setArguments((TupleTerm)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AsmetalPackage.FUNCTION_TERM__AGENT:
        return AGENT_EDEFAULT == null ? agent != null : !AGENT_EDEFAULT.equals(agent);
      case AsmetalPackage.FUNCTION_TERM__FUNCTION_NAME:
        return FUNCTION_NAME_EDEFAULT == null ? functionName != null : !FUNCTION_NAME_EDEFAULT.equals(functionName);
      case AsmetalPackage.FUNCTION_TERM__ARGUMENTS:
        return arguments != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (agent: ");
    result.append(agent);
    result.append(", functionName: ");
    result.append(functionName);
    result.append(')');
    return result.toString();
  }

  public org.asmeta.xt.asmetal.Function getFunction() 
  {
  	// attenzione nel caso di overload il nome potrebeb non bastare
  	org.asmeta.xt.asmetal.Function f = org.asmeta.xt.validation.utility.Utility.getFunctionByName(functionName);
  	return f;
  }
  
  public void setFunction(org.asmeta.xt.asmetal.Function f) {
    // TODO impostare anche gli argomenti
  	functionName = f.getName();
  }
} //FunctionTermImpl
