/**
 * 
 */
package com.agnie.gwt.introjs.client;

import com.agnie.gwt.introjs.client.resources.Resources;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.ScriptInjector;

/**
 * @author rajgaurav
 *
 */
public class IntroJsEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {
		ScriptInjector.fromString(Resources.INSTANCE.introJs().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
	}
}
