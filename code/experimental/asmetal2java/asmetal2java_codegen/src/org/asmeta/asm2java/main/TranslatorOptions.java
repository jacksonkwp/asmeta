package org.asmeta.asm2java.main;

/** 
 * contains the translation options used by the generators to decide the behaviors of the generators
 */
public class TranslatorOptions {
	
	// the dialect - TODO add new options 
	enum CompilerType {
		DESKTOP_COMPILER
	}
	// TODO; private CompilerType compilerType;
	
	// code to be formatted?
	private boolean formatter;
	
	private boolean shuffleRandom;
	
	// if true -> only those used (to improve code coverage)
	private boolean optimizeSeqMacroRule;
	
	/** default constructor */
	TranslatorOptions(){
		this(false,false,false);
	}
	
	public TranslatorOptions(boolean formatter, boolean shuffleRandom, boolean optmizeSeqRule){
		// TODO: compilerType may be set to DESKTOP_COMPILER;
		this.formatter = formatter;
		this.shuffleRandom = shuffleRandom;
		this.optimizeSeqMacroRule = optmizeSeqRule;
	}

	public boolean getShuffleRandom() {
		return shuffleRandom;
	}
	
	public boolean getFormatter() {
		return formatter;
	}
	
	public boolean getOptimizeSeqMacroRule() {
		return optimizeSeqMacroRule;
	}

}
