package com.mavdemo.customlist;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{

public AppTest( String testName )
{
    super(testName);
}

/**
 * @return the suite of tests being tested
 */
public static TestSuite Suite()
{
    return new TestSuite(AppTest.class);
}

/**
 * Rigourous Test :-)
 */
public void testApp()
{
    assertTrue(true);
}
}
