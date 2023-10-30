/**
 * generated by Xtext 2.32.0
 */
package org.asmeta.xt.asmetal.impl;

import java.util.Collection;

import org.asmeta.xt.asmetal.AsmetalPackage;
import org.asmeta.xt.asmetal.Domain;
import org.asmeta.xt.asmetal.FunctionInitialization;
import org.asmeta.xt.asmetal.Term;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Initialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.asmeta.xt.asmetal.impl.FunctionInitializationImpl#getInizializedFunctionName <em>Inizialized Function Name</em>}</li>
 *   <li>{@link org.asmeta.xt.asmetal.impl.FunctionInitializationImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.asmeta.xt.asmetal.impl.FunctionInitializationImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.asmeta.xt.asmetal.impl.FunctionInitializationImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionInitializationImpl extends MinimalEObjectImpl.Container implements FunctionInitialization
{
  /**
   * The default value of the '{@link #getInizializedFunctionName() <em>Inizialized Function Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInizializedFunctionName()
   * @generated
   * @ordered
   */
  protected static final String INIZIALIZED_FUNCTION_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInizializedFunctionName() <em>Inizialized Function Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInizializedFunctionName()
   * @generated
   * @ordered
   */
  protected String inizializedFunctionName = INIZIALIZED_FUNCTION_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<String> variables;

  /**
   * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomain()
   * @generated
   * @ordered
   */
  protected EList<Domain> domain;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected Term body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionInitializationImpl()
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
    return AsmetalPackage.Literals.FUNCTION_INITIALIZATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getInizializedFunctionName()
  {
    return inizializedFunctionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInizializedFunctionName(String newInizializedFunctionName)
  {
    String oldInizializedFunctionName = inizializedFunctionName;
    inizializedFunctionName = newInizializedFunctionName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsmetalPackage.FUNCTION_INITIALIZATION__INIZIALIZED_FUNCTION_NAME, oldInizializedFunctionName, inizializedFunctionName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getVariables()
  {
    if (variables == null)
    {
      variables = new EDataTypeEList<String>(String.class, this, AsmetalPackage.FUNCTION_INITIALIZATION__VARIABLES);
    }
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Domain> getDomain()
  {
    if (domain == null)
    {
      domain = new EObjectContainmentEList<Domain>(Domain.class, this, AsmetalPackage.FUNCTION_INITIALIZATION__DOMAIN);
    }
    return domain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Term getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(Term newBody, NotificationChain msgs)
  {
    Term oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsmetalPackage.FUNCTION_INITIALIZATION__BODY, oldBody, newBody);
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
  public void setBody(Term newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsmetalPackage.FUNCTION_INITIALIZATION__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsmetalPackage.FUNCTION_INITIALIZATION__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsmetalPackage.FUNCTION_INITIALIZATION__BODY, newBody, newBody));
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
      case AsmetalPackage.FUNCTION_INITIALIZATION__DOMAIN:
        return ((InternalEList<?>)getDomain()).basicRemove(otherEnd, msgs);
      case AsmetalPackage.FUNCTION_INITIALIZATION__BODY:
        return basicSetBody(null, msgs);
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
      case AsmetalPackage.FUNCTION_INITIALIZATION__INIZIALIZED_FUNCTION_NAME:
        return getInizializedFunctionName();
      case AsmetalPackage.FUNCTION_INITIALIZATION__VARIABLES:
        return getVariables();
      case AsmetalPackage.FUNCTION_INITIALIZATION__DOMAIN:
        return getDomain();
      case AsmetalPackage.FUNCTION_INITIALIZATION__BODY:
        return getBody();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AsmetalPackage.FUNCTION_INITIALIZATION__INIZIALIZED_FUNCTION_NAME:
        setInizializedFunctionName((String)newValue);
        return;
      case AsmetalPackage.FUNCTION_INITIALIZATION__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends String>)newValue);
        return;
      case AsmetalPackage.FUNCTION_INITIALIZATION__DOMAIN:
        getDomain().clear();
        getDomain().addAll((Collection<? extends Domain>)newValue);
        return;
      case AsmetalPackage.FUNCTION_INITIALIZATION__BODY:
        setBody((Term)newValue);
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
      case AsmetalPackage.FUNCTION_INITIALIZATION__INIZIALIZED_FUNCTION_NAME:
        setInizializedFunctionName(INIZIALIZED_FUNCTION_NAME_EDEFAULT);
        return;
      case AsmetalPackage.FUNCTION_INITIALIZATION__VARIABLES:
        getVariables().clear();
        return;
      case AsmetalPackage.FUNCTION_INITIALIZATION__DOMAIN:
        getDomain().clear();
        return;
      case AsmetalPackage.FUNCTION_INITIALIZATION__BODY:
        setBody((Term)null);
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
      case AsmetalPackage.FUNCTION_INITIALIZATION__INIZIALIZED_FUNCTION_NAME:
        return INIZIALIZED_FUNCTION_NAME_EDEFAULT == null ? inizializedFunctionName != null : !INIZIALIZED_FUNCTION_NAME_EDEFAULT.equals(inizializedFunctionName);
      case AsmetalPackage.FUNCTION_INITIALIZATION__VARIABLES:
        return variables != null && !variables.isEmpty();
      case AsmetalPackage.FUNCTION_INITIALIZATION__DOMAIN:
        return domain != null && !domain.isEmpty();
      case AsmetalPackage.FUNCTION_INITIALIZATION__BODY:
        return body != null;
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
    result.append(" (inizializedFunctionName: ");
    result.append(inizializedFunctionName);
    result.append(", variables: ");
    result.append(variables);
    result.append(')');
    return result.toString();
  }

  public org.asmeta.xt.asmetal.DynamicFunction getInitializedFunction()
  {
  	if (org.asmeta.xt.validation.utility.Utility.getFunctionByName(this.inizializedFunctionName) instanceof org.asmeta.xt.asmetal.DynamicFunction)
    	return (org.asmeta.xt.asmetal.DynamicFunction) org.asmeta.xt.validation.utility.Utility.getFunctionByName(this.inizializedFunctionName); 
    
    return null; 
  }
  
  public java.util.List<org.asmeta.xt.asmetal.VariableTerm> getVariable() {
  	org.eclipse.emf.common.util.EList<org.asmeta.xt.asmetal.VariableTerm> variableList = new org.eclipse.emf.common.util.BasicEList<org.asmeta.xt.asmetal.VariableTerm>();
	  
	for (String s : this.getVariables()) {
		org.asmeta.xt.asmetal.VariableTerm vt = org.asmeta.xt.asmetal.AsmetalFactory.eINSTANCE.createVariableTerm();
		vt.setDomain(org.asmeta.xt.validation.utility.Utility.getDomainFromVariable(s));
		vt.setName(s);
		variableList.add(vt);
	}

	return variableList;
  }
} //FunctionInitializationImpl
