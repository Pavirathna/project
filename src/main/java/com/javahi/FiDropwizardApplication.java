package com.javahi;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class FiDropwizardApplication extends Application<FiDropwizardConfiguration> {

    public static void main(final String[] args) throws Exception {
        new FiDropwizardApplication().run(args);
    }

    @Override
    public String getName() {
        return "FiDropwizard";
    }

    @Override
    public void initialize(final Bootstrap<FiDropwizardConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final FiDropwizardConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
