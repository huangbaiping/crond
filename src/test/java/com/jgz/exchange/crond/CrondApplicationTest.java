package com.jgz.exchange.crond;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {CrondApplication.class})
@ActiveProfiles("scratch")
public class CrondApplicationTest {

    /**
     * A simple sanity check test that will fail if the application context cannot start.
     */
    @Test
    public void contextLoads() throws Exception {
    }
}