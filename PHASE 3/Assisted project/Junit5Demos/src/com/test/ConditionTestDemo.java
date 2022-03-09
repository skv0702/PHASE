package com.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class ConditionTestDemo {

	
	@Test
	@EnabledOnOs(OS.MAC)
	public void willRunOnlyOnMac()
	{
		System.out.println("will run only on mac");
	}
	@Test
	@EnabledOnOs(OS.WINDOWS)
	public void willRunOnlyOnWindows()
	{
		System.out.println("will run only on windows");
	}
	@Test
	@EnabledOnJre(value = JRE.JAVA_8)
	public void willRunOnlyWithJDK8()
	{
		System.out.println("will run only with jdk 8");
	}
	@Test
	@EnabledOnJre(value = JRE.JAVA_11)
	public void willRunOnlyWithJDK11()
	{
		System.out.println("will run only with jdk 11");
	}
}

