/**
 * generated by Xtext 2.34.0
 */
package org.asmeta.xt.asmetal.impl;

import java.util.Collection;

import org.asmeta.xt.asmetal.AsmetalPackage;
import org.asmeta.xt.asmetal.LocalFunction;
import org.asmeta.xt.asmetal.Rule;
import org.asmeta.xt.asmetal.TurboLocalStateRule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Turbo Local State Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.asmeta.xt.asmetal.impl.TurboLocalStateRuleImpl#getLocalFunction <em>Local Function</em>}</li>
 *   <li>{@link org.asmeta.xt.asmetal.impl.TurboLocalStateRuleImpl#getInit <em>Init</em>}</li>
 *   <li>{@link org.asmeta.xt.asmetal.impl.TurboLocalStateRuleImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TurboLocalStateRuleImpl extends TurboRuleImpl implements TurboLocalStateRule
{
  /**
   * The cached value of the '{@link #getLocalFunction() <em>Local Function</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocalFunction()
   * @generated
   * @ordered
   */
  protected EList<LocalFunction> localFunction;

  /**
   * The cached value of the '{@link #getInit() <em>Init</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInit()
   * @generated
   * @ordered
   */
  protected EList<Rule> init;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected Rule body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TurboLocalStateRuleImpl()
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
    return AsmetalPackage.Literals.TURBO_LOCAL_STATE_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<LocalFunction> getLocalFunction()
  {
    if (localFunction == null)
    {
      localFunction = new EObjectContainmentEList<LocalFunction>(LocalFunction.class, this, AsmetalPackage.TURBO_LOCAL_STATE_RULE__LOCAL_FUNCTION);
    }
    return localFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Rule> getInit()
  {
    if (init == null)
    {
      init = new EObjectContainmentEList<Rule>(Rule.class, this, AsmetalPackage.TURBO_LOCAL_STATE_RULE__INIT);
    }
    return init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Rule getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(Rule newBody, NotificationChain msgs)
  {
    Rule oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsmetalPackage.TURBO_LOCAL_STATE_RULE__BODY, oldBody, newBody);
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
  public void setBody(Rule newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsmetalPackage.TURBO_LOCAL_STATE_RULE__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsmetalPackage.TURBO_LOCAL_STATE_RULE__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsmetalPackage.TURBO_LOCAL_STATE_RULE__BODY, newBody, newBody));
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
      case AsmetalPackage.TURBO_LOCAL_STATE_RULE__LOCAL_FUNCTION:
        return ((InternalEList<?>)getLocalFunction()).basicRemove(otherEnd, msgs);
      case AsmetalPackage.TURBO_LOCAL_STATE_RULE__INIT:
        return ((InternalEList<?>)getInit()).basicRemove(otherEnd, msgs);
      case AsmetalPackage.TURBO_LOCAL_STATE_RULE__BODY:
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
      case AsmetalPackage.TURBO_LOCAL_STATE_RULE__LOCAL_FUNCTION:
        return getLocalFunction();
      case AsmetalPackage.TURBO_LOCAL_STATE_RULE__INIT:
        return getInit();
      case AsmetalPackage.TURBO_LOCAL_STATE_RULE__BODY:
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
      case AsmetalPackage.TURBO_LOCAL_STATE_RULE__LOCAL_FUNCTION:
        getLocalFunction().clear();
        getLocalFunction().addAll((Collection<? extends LocalFunction>)newValue);
        return;
      case AsmetalPackage.TURBO_LOCAL_STATE_RULE__INIT:
        getInit().clear();
        getInit().addAll((Collection<? extends Rule>)newValue);
        return;
      case AsmetalPackage.TURBO_LOCAL_STATE_RULE__BODY:
        setBody((Rule)newValue);
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
      case AsmetalPackage.TURBO_LOCAL_STATE_RULE__LOCAL_FUNCTION:
        getLocalFunction().clear();
        return;
      case AsmetalPackage.TURBO_LOCAL_STATE_RULE__INIT:
        getInit().clear();
        return;
      case AsmetalPackage.TURBO_LOCAL_STATE_RULE__BODY:
        setBody((Rule)null);
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
      case AsmetalPackage.TURBO_LOCAL_STATE_RULE__LOCAL_FUNCTION:
        return localFunction != null && !localFunction.isEmpty();
      case AsmetalPackage.TURBO_LOCAL_STATE_RULE__INIT:
        return init != null && !init.isEmpty();
      case AsmetalPackage.TURBO_LOCAL_STATE_RULE__BODY:
        return body != null;
    }
    return super.eIsSet(featureID);
  }

} //TurboLocalStateRuleImpl
