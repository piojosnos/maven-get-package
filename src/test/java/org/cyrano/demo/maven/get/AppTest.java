package org.cyrano.demo.maven.get;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        System.out.println("Hello World! Put Version=" + org.cyrano.demo.maven.put.Constants.VERSION);
        System.out.println("Hello World! Get Version=" + org.cyrano.demo.maven.get.Constants.VERSION);

        assertTrue(true);
    }
}
