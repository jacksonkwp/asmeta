/**
 * generated by Xtext 2.32.0
 */
package org.asmeta.xt.asmetal.impl;

import org.asmeta.xt.asmetal.AsmetalPackage;
import org.asmeta.xt.asmetal.Term;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TermImpl extends MinimalEObjectImpl.Container implements Term
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TermImpl()
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
    return AsmetalPackage.Literals.TERM;
  }

 public org.asmeta.xt.asmetal.Domain getDomain()
 {
  	return (org.asmeta.xt.asmetal.Domain) org.asmeta.xt.validation.utility.Utility.imported_all_domain_map.get(org.asmeta.xt.validation.utility.DomainCalculator.getDomainTerm(this).getCodeFromTree());
 }
  
 public  void setDomain(org.asmeta.xt.asmetal.Domain d){
 
 }
} //TermImpl
