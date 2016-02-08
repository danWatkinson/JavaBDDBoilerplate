package com.boilerplate.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProblemTest {
    
    @Test
    public void problemsExist() {
        Problem problem = new Problem(null);
        assertEquals(true, problem instanceof Problem);
    }
}
