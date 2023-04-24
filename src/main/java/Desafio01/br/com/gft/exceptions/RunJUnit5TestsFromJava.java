/*package Desafio01.br.com.gft.exceptions;

import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.TestPlan;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;import Desafio01.br.com.gft.model.Veiculo;

public class RunJUnit5TestsFromJava {
	SummaryGeneratingListener listener = new SummaryGeneratingListener();
	
	public void runAll() {
	    LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
	      .selectors()
	      .filters(includeClassNamePatterns(".*Test"))
	      .build();
	    Launcher launcher = LauncherFactory.create();
	    TestPlan testPlan = launcher.discover(request);
	    launcher.registerTestExecutionListeners(listener);
	    launcher.execute(request);
	}
	
}*/
