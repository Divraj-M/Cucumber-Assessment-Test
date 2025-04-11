package com.definition;

import com.utilities.HelperClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before
    public static void setupDriver() {
        HelperClass.setupDriver();
    }
	@After
    public static void teardown() {
        HelperClass.quitDriver();
    }
}
