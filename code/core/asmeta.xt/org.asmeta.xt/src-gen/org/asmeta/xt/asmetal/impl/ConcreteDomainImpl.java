/**
 * generated by Xtext 2.34.0
 */
package org.asmeta.xt.asmetal.impl;

import org.asmeta.xt.asmetal.AsmetalPackage;
import org.asmeta.xt.asmetal.ConcreteDomain;
import org.asmeta.xt.asmetal.Domain;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.asmeta.xt.asmetal.impl.ConcreteDomainImpl#isDynamic <em>Dynamic</em>}</li>
 *   <li>{@link org.asmeta.xt.asmetal.impl.ConcreteDomainImpl#getTypeDomain <em>Type Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcreteDomainImpl extends DomainImpl implements ConcreteDomain
{
  /**
   * The default value of the '{@link #isDynamic() <em>Dynamic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDynamic()
   * @generated
   * @ordered
   */
  protected static final boolean DYNAMIC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDynamic() <em>Dynamic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDynamic()
   * @generated
   * @ordered
   */
  protected boolean dynamic = DYNAMIC_EDEFAULT;

  /**
   * The cached value of the '{@link #getTypeDomain() <em>Type Domain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeDomain()
   * @generated
   * @ordered
   */
  protected Domain typeDomain;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConcreteDomainImpl()
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
    return AsmetalPackage.Literals.CONCRETE_DOMAIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isDynamic()
  {
    return dynamic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDynamic(boolean newDynamic)
  {
    boolean oldDynamic = dynamic;
    dynamic = newDynamic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsmetalPackage.CONCRETE_DOMAIN__DYNAMIC, oldDynamic, dynamic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Domain getTypeDomain()
  {
    return typeDomain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeDomain(Domain newTypeDomain, NotificationChain msgs)
  {
    Domain oldTypeDomain = typeDomain;
    typeDomain = newTypeDomain;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsmetalPackage.CONCRETE_DOMAIN__TYPE_DOMAIN, oldTypeDomain, newTypeDomain);
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
  public void setTypeDomain(Domain newTypeDomain)
  {
    if (newTypeDomain != typeDomain)
    {
      NotificationChain msgs = null;
      if (typeDomain != null)
        msgs = ((InternalEObject)typeDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsmetalPackage.CONCRETE_DOMAIN__TYPE_DOMAIN, null, msgs);
      if (newTypeDomain != null)
        msgs = ((InternalEObject)newTypeDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsmetalPackage.CONCRETE_DOMAIN__TYPE_DOMAIN, null, msgs);
      msgs = basicSetTypeDomain(newTypeDomain, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsmetalPackage.CONCRETE_DOMAIN__TYPE_DOMAIN, newTypeDomain, newTypeDomain));
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
      case AsmetalPackage.CONCRETE_DOMAIN__TYPE_DOMAIN:
        return basicSetTypeDomain(null, msgs);
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
      case AsmetalPackage.CONCRETE_DOMAIN__DYNAMIC:
        return isDynamic();
      case AsmetalPackage.CONCRETE_DOMAIN__TYPE_DOMAIN:
        return getTypeDomain();
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
      case AsmetalPackage.CONCRETE_DOMAIN__DYNAMIC:
        setDynamic((Boolean)newValue);
        return;
      case AsmetalPackage.CONCRETE_DOMAIN__TYPE_DOMAIN:
        setTypeDomain((Domain)newValue);
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
      case AsmetalPackage.CONCRETE_DOMAIN__DYNAMIC:
        setDynamic(DYNAMIC_EDEFAULT);
        return;
      case AsmetalPackage.CONCRETE_DOMAIN__TYPE_DOMAIN:
        setTypeDomain((Domain)null);
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
      case AsmetalPackage.CONCRETE_DOMAIN__DYNAMIC:
        return dynamic != DYNAMIC_EDEFAULT;
      case AsmetalPackage.CONCRETE_DOMAIN__TYPE_DOMAIN:
        return typeDomain != null;
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
    result.append(" (dynamic: ");
    result.append(dynamic);
    result.append(')');
    return result.toString();
  }

  public boolean getIsDynamic()
  {
  	return this.isDynamic();
  }
  
  public org.asmeta.xt.asmetal.DomainDefinition getDefinition()
  {
  	return org.asmeta.xt.validation.utility.Utility.domain_declarations_map.get(this);
  }
} //ConcreteDomainImpl
