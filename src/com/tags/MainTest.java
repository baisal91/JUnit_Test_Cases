package com.tags;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)

@SelectPackages("com.tags")
//@IncludeTags({"production", "development"})
@IncludeTags("testing")
public class MainTest {

}
