/**
 * generated by Xtext 2.34.0
 */
package org.asmeta.xt.asmetal.impl;

import java.util.Collection;

import org.asmeta.xt.asmetal.AsmetalPackage;
import org.asmeta.xt.asmetal.BagTerm;
import org.asmeta.xt.asmetal.BasicTerm;
import org.asmeta.xt.asmetal.ConstantTerm;

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
 * An implementation of the model object '<em><b>Bag Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.asmeta.xt.asmetal.impl.BagTermImpl#getStart_term <em>Start term</em>}</li>
 *   <li>{@link org.asmeta.xt.asmetal.impl.BagTermImpl#getOther_terms <em>Other terms</em>}</li>
 *   <li>{@link org.asmeta.xt.asmetal.impl.BagTermImpl#getEnd_term <em>End term</em>}</li>
 *   <li>{@link org.asmeta.xt.asmetal.impl.BagTermImpl#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BagTermImpl extends CollectionTermImpl implements BagTerm
{
  /**
   * The cached value of the '{@link #getStart_term() <em>Start term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart_term()
   * @generated
   * @ordered
   */
  protected BasicTerm start_term;

  /**
   * The cached value of the '{@link #getOther_terms() <em>Other terms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOther_terms()
   * @generated
   * @ordered
   */
  protected EList<BasicTerm> other_terms;

  /**
   * The cached value of the '{@link #getEnd_term() <em>End term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd_term()
   * @generated
   * @ordered
   */
  protected ConstantTerm end_term;

  /**
   * The cached value of the '{@link #getStep() <em>Step</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStep()
   * @generated
   * @ordered
   */
  protected ConstantTerm step;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BagTermImpl()
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
    return AsmetalPackage.Literals.BAG_TERM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BasicTerm getStart_term()
  {
    return start_term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStart_term(BasicTerm newStart_term, NotificationChain msgs)
  {
    BasicTerm oldStart_term = start_term;
    start_term = newStart_term;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsmetalPackage.BAG_TERM__START_TERM, oldStart_term, newStart_term);
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
  public void setStart_term(BasicTerm newStart_term)
  {
    if (newStart_term != start_term)
    {
      NotificationChain msgs = null;
      if (start_term != null)
        msgs = ((InternalEObject)start_term).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsmetalPackage.BAG_TERM__START_TERM, null, msgs);
      if (newStart_term != null)
        msgs = ((InternalEObject)newStart_term).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsmetalPackage.BAG_TERM__START_TERM, null, msgs);
      msgs = basicSetStart_term(newStart_term, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsmetalPackage.BAG_TERM__START_TERM, newStart_term, newStart_term));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<BasicTerm> getOther_terms()
  {
    if (other_terms == null)
    {
      other_terms = new EObjectContainmentEList<BasicTerm>(BasicTerm.class, this, AsmetalPackage.BAG_TERM__OTHER_TERMS);
    }
    return other_terms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConstantTerm getEnd_term()
  {
    return end_term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnd_term(ConstantTerm newEnd_term, NotificationChain msgs)
  {
    ConstantTerm oldEnd_term = end_term;
    end_term = newEnd_term;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsmetalPackage.BAG_TERM__END_TERM, oldEnd_term, newEnd_term);
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
  public void setEnd_term(ConstantTerm newEnd_term)
  {
    if (newEnd_term != end_term)
    {
      NotificationChain msgs = null;
      if (end_term != null)
        msgs = ((InternalEObject)end_term).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsmetalPackage.BAG_TERM__END_TERM, null, msgs);
      if (newEnd_term != null)
        msgs = ((InternalEObject)newEnd_term).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsmetalPackage.BAG_TERM__END_TERM, null, msgs);
      msgs = basicSetEnd_term(newEnd_term, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsmetalPackage.BAG_TERM__END_TERM, newEnd_term, newEnd_term));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConstantTerm getStep()
  {
    return step;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStep(ConstantTerm newStep, NotificationChain msgs)
  {
    ConstantTerm oldStep = step;
    step = newStep;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsmetalPackage.BAG_TERM__STEP, oldStep, newStep);
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
  public void setStep(ConstantTerm newStep)
  {
    if (newStep != step)
    {
      NotificationChain msgs = null;
      if (step != null)
        msgs = ((InternalEObject)step).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsmetalPackage.BAG_TERM__STEP, null, msgs);
      if (newStep != null)
        msgs = ((InternalEObject)newStep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsmetalPackage.BAG_TERM__STEP, null, msgs);
      msgs = basicSetStep(newStep, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsmetalPackage.BAG_TERM__STEP, newStep, newStep));
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
      case AsmetalPackage.BAG_TERM__START_TERM:
        return basicSetStart_term(null, msgs);
      case AsmetalPackage.BAG_TERM__OTHER_TERMS:
        return ((InternalEList<?>)getOther_terms()).basicRemove(otherEnd, msgs);
      case AsmetalPackage.BAG_TERM__END_TERM:
        return basicSetEnd_term(null, msgs);
      case AsmetalPackage.BAG_TERM__STEP:
        return basicSetStep(null, msgs);
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
      case AsmetalPackage.BAG_TERM__START_TERM:
        return getStart_term();
      case AsmetalPackage.BAG_TERM__OTHER_TERMS:
        return getOther_terms();
      case AsmetalPackage.BAG_TERM__END_TERM:
        return getEnd_term();
      case AsmetalPackage.BAG_TERM__STEP:
        return getStep();
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
      case AsmetalPackage.BAG_TERM__START_TERM:
        setStart_term((BasicTerm)newValue);
        return;
      case AsmetalPackage.BAG_TERM__OTHER_TERMS:
        getOther_terms().clear();
        getOther_terms().addAll((Collection<? extends BasicTerm>)newValue);
        return;
      case AsmetalPackage.BAG_TERM__END_TERM:
        setEnd_term((ConstantTerm)newValue);
        return;
      case AsmetalPackage.BAG_TERM__STEP:
        setStep((ConstantTerm)newValue);
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
      case AsmetalPackage.BAG_TERM__START_TERM:
        setStart_term((BasicTerm)null);
        return;
      case AsmetalPackage.BAG_TERM__OTHER_TERMS:
        getOther_terms().clear();
        return;
      case AsmetalPackage.BAG_TERM__END_TERM:
        setEnd_term((ConstantTerm)null);
        return;
      case AsmetalPackage.BAG_TERM__STEP:
        setStep((ConstantTerm)null);
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
      case AsmetalPackage.BAG_TERM__START_TERM:
        return start_term != null;
      case AsmetalPackage.BAG_TERM__OTHER_TERMS:
        return other_terms != null && !other_terms.isEmpty();
      case AsmetalPackage.BAG_TERM__END_TERM:
        return end_term != null;
      case AsmetalPackage.BAG_TERM__STEP:
        return step != null;
    }
    return super.eIsSet(featureID);
  }

  public java.util.Collection<org.asmeta.xt.asmetal.Term> getTerm()
  {
  	java.util.List<org.asmeta.xt.asmetal.Term> termList = new java.util.ArrayList<org.asmeta.xt.asmetal.Term>();
  	float stepVal = 0;
  	float startTerm = 0;
  	float endTerm = 0;
	
	if (this.start_term == null && this.end_term == null && (this.other_terms == null || this.other_terms.size() == 0))
  		return termList;
	
	if (this.other_terms != null && this.other_terms.size()>0 && this.start_term != null) {
		// All the terms are specified
		termList.add(this.start_term);
		if (this.end_term != null)
			termList.add(this.end_term);
		termList.addAll(other_terms);
		return termList;
  	}
	
	if (this.start_term != null && this.other_terms != null && this.other_terms.size() == 1 && this.end_term == null) {
		// All the terms are specified
		termList.add(this.start_term);
		termList.addAll(other_terms);
		return termList;
  	}
  	
  	if (this.start_term != null && (this.other_terms == null || this.other_terms.size() == 0) && this.end_term == null) {
		// Only the start term is specified
		termList.add(this.start_term);
		return termList;
	}
		
	// A range is specified, so only Natural, Integer and Real can be used
	if (!(this.start_term instanceof org.asmeta.xt.asmetal.NaturalTerm || this.start_term instanceof org.asmeta.xt.asmetal.NumberTerm))
		throw new RuntimeException("The start term in a bag term used as a range can only be Integer, Natural or Real");
	if (!(this.end_term instanceof org.asmeta.xt.asmetal.NaturalTerm || this.end_term instanceof org.asmeta.xt.asmetal.NumberTerm))
		throw new RuntimeException("The start term in a bag term used as a range can only be Integer, Natural or Real");
	
	if (this.step != null) {
		// The step has been specified
		if (this.step instanceof org.asmeta.xt.asmetal.NaturalTerm || this.step instanceof org.asmeta.xt.asmetal.NumberTerm)
			stepVal = Float.parseFloat(this.step.getSymbol().replace("n", ""));
		else 
			throw new RuntimeException("The step in a bag term can only be Integer, Natural or Real");
	} else {
		// Use step = 1
		stepVal = 1;
	}
	
	startTerm = Float.parseFloat(((org.asmeta.xt.asmetal.impl.ConstantTermImpl)this.start_term).getSymbol().replace("n", ""));
	endTerm = Float.parseFloat(((org.asmeta.xt.asmetal.impl.ConstantTermImpl)this.end_term).getSymbol().replace("n", ""));		
	
	for (float i=startTerm; i<=endTerm; i+=stepVal) {
		org.asmeta.xt.asmetal.Term newTerm;
		if (this.start_term instanceof org.asmeta.xt.asmetal.NaturalTerm) {
			newTerm = org.asmeta.xt.asmetal.AsmetalFactory.eINSTANCE.createNaturalTerm();
			((org.asmeta.xt.asmetal.impl.NaturalTermImpl)newTerm).symbol = (int)i + "n";
			termList.add(newTerm);
		}
		
		if (this.start_term instanceof org.asmeta.xt.asmetal.IntegerTerm) {
			newTerm = org.asmeta.xt.asmetal.AsmetalFactory.eINSTANCE.createIntegerTerm();
			((org.asmeta.xt.asmetal.impl.IntegerTermImpl)newTerm).symbol = String.valueOf((int)i);
			termList.add(newTerm);
		}
		
		if (this.start_term instanceof org.asmeta.xt.asmetal.RealTerm) {
			newTerm = org.asmeta.xt.asmetal.AsmetalFactory.eINSTANCE.createRealTerm();
			((org.asmeta.xt.asmetal.impl.RealTermImpl)newTerm).symbol = String.valueOf(i);
			termList.add(newTerm);
		}
	}
	
  	return termList;
  }
} //BagTermImpl
