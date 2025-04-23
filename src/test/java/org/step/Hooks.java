package org.step;

import org.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{
@Before
public void beforeLaunch() {
  openChrome();
  toPassUrl("https://www.facebook.com/");
  maxWindow();
}
@After
public void afterLaunch() {
	toClose();

}
}
