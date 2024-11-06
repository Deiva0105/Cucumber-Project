package org.helping;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void generateJvmReport(String jsonPath) {
		
		File f = new File("C:\\Users\\Guhan\\eclipse-workspace\\Cucumber\\Reports\\JVM Report");
		
		Configuration c = new Configuration(f, "Facebook Application");
		c.addClassifications("Watching Time", "2 hours");
		c.addClassifications("Playing Time", "1 hour");
		
		List<String> l = new ArrayList();
		l.add(jsonPath);
		
		ReportBuilder rb = new ReportBuilder(l, c);
		rb.generateReports();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
