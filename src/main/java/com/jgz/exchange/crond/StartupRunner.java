package com.jgz.exchange.crond;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Run some specific code once the SpringApplication has started.
 */
@Component
public class StartupRunner implements ApplicationRunner {

    private static final Logger LOG = LoggerFactory.getLogger(StartupRunner.class);

    @Override
    public void run(ApplicationArguments args) {
        LOG.debug("Do something once the SpringApplication has started...");
    }
}