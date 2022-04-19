package Tests;

import Tests.LogIn.Tests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({Tests.class})
public class BaseTest {}
