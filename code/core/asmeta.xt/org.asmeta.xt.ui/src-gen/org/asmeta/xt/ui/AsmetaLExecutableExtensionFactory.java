/*
 * generated by Xtext 2.32.0
 */
package org.asmeta.xt.ui;

import com.google.inject.Injector;
import org.asmeta.xt.ui.internal.XtActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class AsmetaLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(XtActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		XtActivator activator = XtActivator.getInstance();
		return activator != null ? activator.getInjector(XtActivator.ORG_ASMETA_XT_ASMETAL) : null;
	}

}
