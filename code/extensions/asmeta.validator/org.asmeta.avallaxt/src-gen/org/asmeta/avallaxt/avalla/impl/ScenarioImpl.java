/**
 * generated by Xtext 2.27.0
 */
package org.asmeta.avallaxt.avalla.impl;

import java.util.Collection;

import org.asmeta.avallaxt.avalla.AvallaPackage;
import org.asmeta.avallaxt.avalla.Element;
import org.asmeta.avallaxt.avalla.Invariant;
import org.asmeta.avallaxt.avalla.Scenario;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.asmeta.avallaxt.avalla.impl.ScenarioImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.asmeta.avallaxt.avalla.impl.ScenarioImpl#getSpec <em>Spec</em>}</li>
 *   <li>{@link org.asmeta.avallaxt.avalla.impl.ScenarioImpl#getInvariants <em>Invariants</em>}</li>
 *   <li>{@link org.asmeta.avallaxt.avalla.impl.ScenarioImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getSpec() <em>Spec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpec()
   * @generated
   * @ordered
   */
  protected static final String SPEC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSpec() <em>Spec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpec()
   * @generated
   * @ordered
   */
  protected String spec = SPEC_EDEFAULT;

  /**
   * The cached value of the '{@link #getInvariants() <em>Invariants</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInvariants()
   * @generated
   * @ordered
   */
  protected EList<Invariant> invariants;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<Element> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScenarioImpl()
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
    return AvallaPackage.Literals.SCENARIO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AvallaPackage.SCENARIO__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSpec()
  {
    return spec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSpec(String newSpec)
  {
    String oldSpec = spec;
    spec = newSpec;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AvallaPackage.SCENARIO__SPEC, oldSpec, spec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Invariant> getInvariants()
  {
    if (invariants == null)
    {
      invariants = new EObjectContainmentEList<Invariant>(Invariant.class, this, AvallaPackage.SCENARIO__INVARIANTS);
    }
    return invariants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Element> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<Element>(Element.class, this, AvallaPackage.SCENARIO__ELEMENTS);
    }
    return elements;
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
      case AvallaPackage.SCENARIO__INVARIANTS:
        return ((InternalEList<?>)getInvariants()).basicRemove(otherEnd, msgs);
      case AvallaPackage.SCENARIO__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
      case AvallaPackage.SCENARIO__NAME:
        return getName();
      case AvallaPackage.SCENARIO__SPEC:
        return getSpec();
      case AvallaPackage.SCENARIO__INVARIANTS:
        return getInvariants();
      case AvallaPackage.SCENARIO__ELEMENTS:
        return getElements();
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
      case AvallaPackage.SCENARIO__NAME:
        setName((String)newValue);
        return;
      case AvallaPackage.SCENARIO__SPEC:
        setSpec((String)newValue);
        return;
      case AvallaPackage.SCENARIO__INVARIANTS:
        getInvariants().clear();
        getInvariants().addAll((Collection<? extends Invariant>)newValue);
        return;
      case AvallaPackage.SCENARIO__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends Element>)newValue);
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
      case AvallaPackage.SCENARIO__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AvallaPackage.SCENARIO__SPEC:
        setSpec(SPEC_EDEFAULT);
        return;
      case AvallaPackage.SCENARIO__INVARIANTS:
        getInvariants().clear();
        return;
      case AvallaPackage.SCENARIO__ELEMENTS:
        getElements().clear();
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
      case AvallaPackage.SCENARIO__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AvallaPackage.SCENARIO__SPEC:
        return SPEC_EDEFAULT == null ? spec != null : !SPEC_EDEFAULT.equals(spec);
      case AvallaPackage.SCENARIO__INVARIANTS:
        return invariants != null && !invariants.isEmpty();
      case AvallaPackage.SCENARIO__ELEMENTS:
        return elements != null && !elements.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", spec: ");
    result.append(spec);
    result.append(')');
    return result.toString();
  }

} //ScenarioImpl
