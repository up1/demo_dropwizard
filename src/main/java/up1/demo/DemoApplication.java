package up1.demo;

import health.TemplateHealthCheck;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import resource.DemoResource;

public class DemoApplication extends Application<DemoConfiguration> {

	public static void main(String[] args) throws Exception {
		new DemoApplication().run(args);
	}

	@Override
	public String getName() {
		return "Demo";
	}

	@Override
	public void initialize(Bootstrap<DemoConfiguration> arg0) {
	}

	@Override
	public void run(DemoConfiguration configuration, Environment environment) throws Exception {
		DemoResource demoResource = new DemoResource();
		TemplateHealthCheck healthCheck = new TemplateHealthCheck();
		environment.healthChecks().register("template", healthCheck);
		environment.jersey().register(demoResource);
	}
}
