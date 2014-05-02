package up1.demo;

import resource.DemoResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

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
		// TODO Auto-generated method stub

	}

	@Override
	public void run(DemoConfiguration configuration, Environment environment) throws Exception {
		DemoResource demoResource = new DemoResource();
		environment.jersey().register(demoResource);
	}

}
