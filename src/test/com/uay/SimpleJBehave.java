package com.uay;

import java.util.Arrays;
import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;


import static org.jbehave.core.reporters.Format.CONSOLE;
import static org.jbehave.core.reporters.Format.TXT;

public class SimpleJBehave extends JUnitStories {

    @Override
    public Configuration configuration() {
        return new MostUsefulConfiguration().useStoryReporterBuilder(
                new StoryReporterBuilder()
                        .withDefaultFormats()
                        .withFormats(CONSOLE, TXT));
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new ExampleSteps());
    }

    @Override
    protected List<String> storyPaths() {
        return Arrays.asList("com/uay/Math.story");
    }
}