package org.base;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class JvmReportGenerate {
	public static void generateJvmReport(String jsonpath) {
File f=new File("C:\\Users\\ADMIN\\eclipse-workspace\\Cucumber\\target\\JvmReports");
 Configuration con=new Configuration(f, "Facebook");
 con.addClassifications("Browser Name","Chrome");
 con.addClassifications("Browser version","135.0.7049.96");
 con.addClassifications("Os name","Windows 11");
 con.addClassifications("Browser Name","Chrome");
 List<String> l= new ArrayList<>();
 l.add(jsonpath);
 ReportBuilder r=new ReportBuilder(l,con);
 r.generateReports();
}
}