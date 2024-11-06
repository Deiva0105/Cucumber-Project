package org.step;

import org.helping.BaseClass;
import org.helping.JvmReport;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	@Before
	public void bef() {
		openFireFox();
		maximizeTheWindow();
		implictWait(3000);
		}
	
	@After
	public void Aft() {
		toCloseTheBrowser();
	}
	
}
