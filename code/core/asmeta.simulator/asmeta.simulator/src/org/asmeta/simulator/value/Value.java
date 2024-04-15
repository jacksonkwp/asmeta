/**
 * Value.java
 *
 * Created on 22/ago/06, 10:44:37
 *
 */
package org.asmeta.simulator.value;

import org.asmeta.simulator.TermEvaluator;

import asmeta.definitions.domains.BooleanDomain;
import asmeta.terms.basicterms.Term;

/**
 * The super class of all values. The subclasses act as wrappers for the
 * corresponding Java implementations.
 *
 * @param <T> the generic type representing the value type in Java
 */
public abstract class Value<T> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	public abstract Value<T> clone();

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public abstract T getValue();

	// in case one wants to build a value with a lazy evaluation
	// build the value with
	public static Value lazy(Term term, final TermEvaluator termEvaluator) {
		if (term.getDomain() instanceof BooleanDomain)
			return new BooleanValue() {
		    // the evaluator to be used to evaluate
			@Override
				public Boolean getValue() {
				BooleanValue v = (BooleanValue) termEvaluator.visit(term);
					return v.getValue();
			}
		};
	// no lazy eval is possible
	return termEvaluator.visit(term);
}}
