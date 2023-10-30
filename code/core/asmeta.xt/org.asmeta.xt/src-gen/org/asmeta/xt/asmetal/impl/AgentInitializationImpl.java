/**
 * generated by Xtext 2.32.0
 */
package org.asmeta.xt.asmetal.impl;

import org.asmeta.xt.asmetal.AgentInitialization;
import org.asmeta.xt.asmetal.AsmetalPackage;
import org.asmeta.xt.asmetal.MacroCallRule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent Initialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.asmeta.xt.asmetal.impl.AgentInitializationImpl#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link org.asmeta.xt.asmetal.impl.AgentInitializationImpl#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgentInitializationImpl extends MinimalEObjectImpl.Container implements AgentInitialization
{
  /**
   * The default value of the '{@link #getDomainName() <em>Domain Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomainName()
   * @generated
   * @ordered
   */
  protected static final String DOMAIN_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDomainName() <em>Domain Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomainName()
   * @generated
   * @ordered
   */
  protected String domainName = DOMAIN_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getProgram() <em>Program</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProgram()
   * @generated
   * @ordered
   */
  protected MacroCallRule program;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AgentInitializationImpl()
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
    return AsmetalPackage.Literals.AGENT_INITIALIZATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDomainName()
  {
    return domainName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDomainName(String newDomainName)
  {
    String oldDomainName = domainName;
    domainName = newDomainName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsmetalPackage.AGENT_INITIALIZATION__DOMAIN_NAME, oldDomainName, domainName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MacroCallRule getProgram()
  {
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProgram(MacroCallRule newProgram, NotificationChain msgs)
  {
    MacroCallRule oldProgram = program;
    program = newProgram;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsmetalPackage.AGENT_INITIALIZATION__PROGRAM, oldProgram, newProgram);
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
  public void setProgram(MacroCallRule newProgram)
  {
    if (newProgram != program)
    {
      NotificationChain msgs = null;
      if (program != null)
        msgs = ((InternalEObject)program).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsmetalPackage.AGENT_INITIALIZATION__PROGRAM, null, msgs);
      if (newProgram != null)
        msgs = ((InternalEObject)newProgram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsmetalPackage.AGENT_INITIALIZATION__PROGRAM, null, msgs);
      msgs = basicSetProgram(newProgram, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsmetalPackage.AGENT_INITIALIZATION__PROGRAM, newProgram, newProgram));
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
      case AsmetalPackage.AGENT_INITIALIZATION__PROGRAM:
        return basicSetProgram(null, msgs);
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
      case AsmetalPackage.AGENT_INITIALIZATION__DOMAIN_NAME:
        return getDomainName();
      case AsmetalPackage.AGENT_INITIALIZATION__PROGRAM:
        return getProgram();
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
      case AsmetalPackage.AGENT_INITIALIZATION__DOMAIN_NAME:
        setDomainName((String)newValue);
        return;
      case AsmetalPackage.AGENT_INITIALIZATION__PROGRAM:
        setProgram((MacroCallRule)newValue);
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
      case AsmetalPackage.AGENT_INITIALIZATION__DOMAIN_NAME:
        setDomainName(DOMAIN_NAME_EDEFAULT);
        return;
      case AsmetalPackage.AGENT_INITIALIZATION__PROGRAM:
        setProgram((MacroCallRule)null);
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
      case AsmetalPackage.AGENT_INITIALIZATION__DOMAIN_NAME:
        return DOMAIN_NAME_EDEFAULT == null ? domainName != null : !DOMAIN_NAME_EDEFAULT.equals(domainName);
      case AsmetalPackage.AGENT_INITIALIZATION__PROGRAM:
        return program != null;
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
    result.append(" (domainName: ");
    result.append(domainName);
    result.append(')');
    return result.toString();
  }

  public org.asmeta.xt.asmetal.Domain getDomain()
  {
  	return org.asmeta.xt.validation.utility.Utility.getDomain(this.domainName);
  }
} //AgentInitializationImpl
