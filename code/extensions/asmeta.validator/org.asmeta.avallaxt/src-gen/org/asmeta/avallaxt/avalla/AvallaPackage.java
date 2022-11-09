/**
 * generated by Xtext 2.27.0
 */
package org.asmeta.avallaxt.avalla;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.asmeta.avallaxt.avalla.AvallaFactory
 * @model kind="package"
 * @generated
 */
public interface AvallaPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "avalla";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.asmeta.org/avallaxt/Avalla";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "avalla";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AvallaPackage eINSTANCE = org.asmeta.avallaxt.avalla.impl.AvallaPackageImpl.init();

  /**
   * The meta object id for the '{@link org.asmeta.avallaxt.avalla.impl.ScenarioImpl <em>Scenario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.asmeta.avallaxt.avalla.impl.ScenarioImpl
   * @see org.asmeta.avallaxt.avalla.impl.AvallaPackageImpl#getScenario()
   * @generated
   */
  int SCENARIO = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__NAME = 0;

  /**
   * The feature id for the '<em><b>Spec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__SPEC = 1;

  /**
   * The feature id for the '<em><b>Invariants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__INVARIANTS = 2;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__ELEMENTS = 3;

  /**
   * The number of structural features of the '<em>Scenario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.asmeta.avallaxt.avalla.impl.InvariantImpl <em>Invariant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.asmeta.avallaxt.avalla.impl.InvariantImpl
   * @see org.asmeta.avallaxt.avalla.impl.AvallaPackageImpl#getInvariant()
   * @generated
   */
  int INVARIANT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVARIANT__NAME = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVARIANT__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Invariant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVARIANT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.asmeta.avallaxt.avalla.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.asmeta.avallaxt.avalla.impl.ElementImpl
   * @see org.asmeta.avallaxt.avalla.impl.AvallaPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 2;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.asmeta.avallaxt.avalla.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.asmeta.avallaxt.avalla.impl.CommandImpl
   * @see org.asmeta.avallaxt.avalla.impl.AvallaPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 3;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.asmeta.avallaxt.avalla.impl.CheckImpl <em>Check</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.asmeta.avallaxt.avalla.impl.CheckImpl
   * @see org.asmeta.avallaxt.avalla.impl.AvallaPackageImpl#getCheck()
   * @generated
   */
  int CHECK = 4;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK__EXPRESSION = COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Check</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.asmeta.avallaxt.avalla.impl.SetImpl <em>Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.asmeta.avallaxt.avalla.impl.SetImpl
   * @see org.asmeta.avallaxt.avalla.impl.AvallaPackageImpl#getSet()
   * @generated
   */
  int SET = 5;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET__LOCATION = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET__VALUE = COMMAND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.asmeta.avallaxt.avalla.impl.StepUntilImpl <em>Step Until</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.asmeta.avallaxt.avalla.impl.StepUntilImpl
   * @see org.asmeta.avallaxt.avalla.impl.AvallaPackageImpl#getStepUntil()
   * @generated
   */
  int STEP_UNTIL = 6;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP_UNTIL__EXPRESSION = COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Step Until</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP_UNTIL_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.asmeta.avallaxt.avalla.impl.ExecImpl <em>Exec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.asmeta.avallaxt.avalla.impl.ExecImpl
   * @see org.asmeta.avallaxt.avalla.impl.AvallaPackageImpl#getExec()
   * @generated
   */
  int EXEC = 7;

  /**
   * The feature id for the '<em><b>Rule</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC__RULE = COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Exec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.asmeta.avallaxt.avalla.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.asmeta.avallaxt.avalla.impl.BlockImpl
   * @see org.asmeta.avallaxt.avalla.impl.AvallaPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__NAME = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__ELEMENTS = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.asmeta.avallaxt.avalla.impl.ExecBlockImpl <em>Exec Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.asmeta.avallaxt.avalla.impl.ExecBlockImpl
   * @see org.asmeta.avallaxt.avalla.impl.AvallaPackageImpl#getExecBlock()
   * @generated
   */
  int EXEC_BLOCK = 9;

  /**
   * The feature id for the '<em><b>Scenario</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_BLOCK__SCENARIO = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Block</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_BLOCK__BLOCK = COMMAND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Exec Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_BLOCK_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.asmeta.avallaxt.avalla.impl.StepImpl <em>Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.asmeta.avallaxt.avalla.impl.StepImpl
   * @see org.asmeta.avallaxt.avalla.impl.AvallaPackageImpl#getStep()
   * @generated
   */
  int STEP = 10;

  /**
   * The number of structural features of the '<em>Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.asmeta.avallaxt.avalla.Scenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scenario</em>'.
   * @see org.asmeta.avallaxt.avalla.Scenario
   * @generated
   */
  EClass getScenario();

  /**
   * Returns the meta object for the attribute '{@link org.asmeta.avallaxt.avalla.Scenario#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.asmeta.avallaxt.avalla.Scenario#getName()
   * @see #getScenario()
   * @generated
   */
  EAttribute getScenario_Name();

  /**
   * Returns the meta object for the attribute '{@link org.asmeta.avallaxt.avalla.Scenario#getSpec <em>Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Spec</em>'.
   * @see org.asmeta.avallaxt.avalla.Scenario#getSpec()
   * @see #getScenario()
   * @generated
   */
  EAttribute getScenario_Spec();

  /**
   * Returns the meta object for the containment reference list '{@link org.asmeta.avallaxt.avalla.Scenario#getInvariants <em>Invariants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Invariants</em>'.
   * @see org.asmeta.avallaxt.avalla.Scenario#getInvariants()
   * @see #getScenario()
   * @generated
   */
  EReference getScenario_Invariants();

  /**
   * Returns the meta object for the containment reference list '{@link org.asmeta.avallaxt.avalla.Scenario#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.asmeta.avallaxt.avalla.Scenario#getElements()
   * @see #getScenario()
   * @generated
   */
  EReference getScenario_Elements();

  /**
   * Returns the meta object for class '{@link org.asmeta.avallaxt.avalla.Invariant <em>Invariant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Invariant</em>'.
   * @see org.asmeta.avallaxt.avalla.Invariant
   * @generated
   */
  EClass getInvariant();

  /**
   * Returns the meta object for the attribute '{@link org.asmeta.avallaxt.avalla.Invariant#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.asmeta.avallaxt.avalla.Invariant#getName()
   * @see #getInvariant()
   * @generated
   */
  EAttribute getInvariant_Name();

  /**
   * Returns the meta object for the attribute '{@link org.asmeta.avallaxt.avalla.Invariant#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expression</em>'.
   * @see org.asmeta.avallaxt.avalla.Invariant#getExpression()
   * @see #getInvariant()
   * @generated
   */
  EAttribute getInvariant_Expression();

  /**
   * Returns the meta object for class '{@link org.asmeta.avallaxt.avalla.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see org.asmeta.avallaxt.avalla.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for class '{@link org.asmeta.avallaxt.avalla.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see org.asmeta.avallaxt.avalla.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for class '{@link org.asmeta.avallaxt.avalla.Check <em>Check</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Check</em>'.
   * @see org.asmeta.avallaxt.avalla.Check
   * @generated
   */
  EClass getCheck();

  /**
   * Returns the meta object for the attribute '{@link org.asmeta.avallaxt.avalla.Check#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expression</em>'.
   * @see org.asmeta.avallaxt.avalla.Check#getExpression()
   * @see #getCheck()
   * @generated
   */
  EAttribute getCheck_Expression();

  /**
   * Returns the meta object for class '{@link org.asmeta.avallaxt.avalla.Set <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set</em>'.
   * @see org.asmeta.avallaxt.avalla.Set
   * @generated
   */
  EClass getSet();

  /**
   * Returns the meta object for the attribute '{@link org.asmeta.avallaxt.avalla.Set#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Location</em>'.
   * @see org.asmeta.avallaxt.avalla.Set#getLocation()
   * @see #getSet()
   * @generated
   */
  EAttribute getSet_Location();

  /**
   * Returns the meta object for the attribute '{@link org.asmeta.avallaxt.avalla.Set#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.asmeta.avallaxt.avalla.Set#getValue()
   * @see #getSet()
   * @generated
   */
  EAttribute getSet_Value();

  /**
   * Returns the meta object for class '{@link org.asmeta.avallaxt.avalla.StepUntil <em>Step Until</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Step Until</em>'.
   * @see org.asmeta.avallaxt.avalla.StepUntil
   * @generated
   */
  EClass getStepUntil();

  /**
   * Returns the meta object for the attribute '{@link org.asmeta.avallaxt.avalla.StepUntil#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expression</em>'.
   * @see org.asmeta.avallaxt.avalla.StepUntil#getExpression()
   * @see #getStepUntil()
   * @generated
   */
  EAttribute getStepUntil_Expression();

  /**
   * Returns the meta object for class '{@link org.asmeta.avallaxt.avalla.Exec <em>Exec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exec</em>'.
   * @see org.asmeta.avallaxt.avalla.Exec
   * @generated
   */
  EClass getExec();

  /**
   * Returns the meta object for the attribute '{@link org.asmeta.avallaxt.avalla.Exec#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rule</em>'.
   * @see org.asmeta.avallaxt.avalla.Exec#getRule()
   * @see #getExec()
   * @generated
   */
  EAttribute getExec_Rule();

  /**
   * Returns the meta object for class '{@link org.asmeta.avallaxt.avalla.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see org.asmeta.avallaxt.avalla.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the attribute '{@link org.asmeta.avallaxt.avalla.Block#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.asmeta.avallaxt.avalla.Block#getName()
   * @see #getBlock()
   * @generated
   */
  EAttribute getBlock_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.asmeta.avallaxt.avalla.Block#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.asmeta.avallaxt.avalla.Block#getElements()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_Elements();

  /**
   * Returns the meta object for class '{@link org.asmeta.avallaxt.avalla.ExecBlock <em>Exec Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exec Block</em>'.
   * @see org.asmeta.avallaxt.avalla.ExecBlock
   * @generated
   */
  EClass getExecBlock();

  /**
   * Returns the meta object for the attribute '{@link org.asmeta.avallaxt.avalla.ExecBlock#getScenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scenario</em>'.
   * @see org.asmeta.avallaxt.avalla.ExecBlock#getScenario()
   * @see #getExecBlock()
   * @generated
   */
  EAttribute getExecBlock_Scenario();

  /**
   * Returns the meta object for the attribute '{@link org.asmeta.avallaxt.avalla.ExecBlock#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Block</em>'.
   * @see org.asmeta.avallaxt.avalla.ExecBlock#getBlock()
   * @see #getExecBlock()
   * @generated
   */
  EAttribute getExecBlock_Block();

  /**
   * Returns the meta object for class '{@link org.asmeta.avallaxt.avalla.Step <em>Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Step</em>'.
   * @see org.asmeta.avallaxt.avalla.Step
   * @generated
   */
  EClass getStep();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AvallaFactory getAvallaFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.asmeta.avallaxt.avalla.impl.ScenarioImpl <em>Scenario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.asmeta.avallaxt.avalla.impl.ScenarioImpl
     * @see org.asmeta.avallaxt.avalla.impl.AvallaPackageImpl#getScenario()
     * @generated
     */
    EClass SCENARIO = eINSTANCE.getScenario();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCENARIO__NAME = eINSTANCE.getScenario_Name();

    /**
     * The meta object literal for the '<em><b>Spec</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCENARIO__SPEC = eINSTANCE.getScenario_Spec();

    /**
     * The meta object literal for the '<em><b>Invariants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENARIO__INVARIANTS = eINSTANCE.getScenario_Invariants();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENARIO__ELEMENTS = eINSTANCE.getScenario_Elements();

    /**
     * The meta object literal for the '{@link org.asmeta.avallaxt.avalla.impl.InvariantImpl <em>Invariant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.asmeta.avallaxt.avalla.impl.InvariantImpl
     * @see org.asmeta.avallaxt.avalla.impl.AvallaPackageImpl#getInvariant()
     * @generated
     */
    EClass INVARIANT = eINSTANCE.getInvariant();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INVARIANT__NAME = eINSTANCE.getInvariant_Name();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INVARIANT__EXPRESSION = eINSTANCE.getInvariant_Expression();

    /**
     * The meta object literal for the '{@link org.asmeta.avallaxt.avalla.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.asmeta.avallaxt.avalla.impl.ElementImpl
     * @see org.asmeta.avallaxt.avalla.impl.AvallaPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '{@link org.asmeta.avallaxt.avalla.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.asmeta.avallaxt.avalla.impl.CommandImpl
     * @see org.asmeta.avallaxt.avalla.impl.AvallaPackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '{@link org.asmeta.avallaxt.avalla.impl.CheckImpl <em>Check</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.asmeta.avallaxt.avalla.impl.CheckImpl
     * @see org.asmeta.avallaxt.avalla.impl.AvallaPackageImpl#getCheck()
     * @generated
     */
    EClass CHECK = eINSTANCE.getCheck();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHECK__EXPRESSION = eINSTANCE.getCheck_Expression();

    /**
     * The meta object literal for the '{@link org.asmeta.avallaxt.avalla.impl.SetImpl <em>Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.asmeta.avallaxt.avalla.impl.SetImpl
     * @see org.asmeta.avallaxt.avalla.impl.AvallaPackageImpl#getSet()
     * @generated
     */
    EClass SET = eINSTANCE.getSet();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET__LOCATION = eINSTANCE.getSet_Location();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET__VALUE = eINSTANCE.getSet_Value();

    /**
     * The meta object literal for the '{@link org.asmeta.avallaxt.avalla.impl.StepUntilImpl <em>Step Until</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.asmeta.avallaxt.avalla.impl.StepUntilImpl
     * @see org.asmeta.avallaxt.avalla.impl.AvallaPackageImpl#getStepUntil()
     * @generated
     */
    EClass STEP_UNTIL = eINSTANCE.getStepUntil();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STEP_UNTIL__EXPRESSION = eINSTANCE.getStepUntil_Expression();

    /**
     * The meta object literal for the '{@link org.asmeta.avallaxt.avalla.impl.ExecImpl <em>Exec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.asmeta.avallaxt.avalla.impl.ExecImpl
     * @see org.asmeta.avallaxt.avalla.impl.AvallaPackageImpl#getExec()
     * @generated
     */
    EClass EXEC = eINSTANCE.getExec();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXEC__RULE = eINSTANCE.getExec_Rule();

    /**
     * The meta object literal for the '{@link org.asmeta.avallaxt.avalla.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.asmeta.avallaxt.avalla.impl.BlockImpl
     * @see org.asmeta.avallaxt.avalla.impl.AvallaPackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BLOCK__NAME = eINSTANCE.getBlock_Name();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__ELEMENTS = eINSTANCE.getBlock_Elements();

    /**
     * The meta object literal for the '{@link org.asmeta.avallaxt.avalla.impl.ExecBlockImpl <em>Exec Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.asmeta.avallaxt.avalla.impl.ExecBlockImpl
     * @see org.asmeta.avallaxt.avalla.impl.AvallaPackageImpl#getExecBlock()
     * @generated
     */
    EClass EXEC_BLOCK = eINSTANCE.getExecBlock();

    /**
     * The meta object literal for the '<em><b>Scenario</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXEC_BLOCK__SCENARIO = eINSTANCE.getExecBlock_Scenario();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXEC_BLOCK__BLOCK = eINSTANCE.getExecBlock_Block();

    /**
     * The meta object literal for the '{@link org.asmeta.avallaxt.avalla.impl.StepImpl <em>Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.asmeta.avallaxt.avalla.impl.StepImpl
     * @see org.asmeta.avallaxt.avalla.impl.AvallaPackageImpl#getStep()
     * @generated
     */
    EClass STEP = eINSTANCE.getStep();

  }

} //AvallaPackage
