package com.automationwebsitejunit2;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class SampleFinal {
public static void main(String[] args) {
	Result rs = JUnitCore.runClasses(ClassA.class,ClassB.class);
	System.out.println("Ignorecount"+rs.getIgnoreCount());
	System.out.println("Run count"+rs.getRunCount());
	System.out.println("Run time"+rs.getRunTime());
	System.out.println("Failure count"+rs.getFailureCount());
	List<Failure> failures = rs.getFailures();
	for (Failure failuretestcases : failures) {
		System.out.println("failuretestcases"+failuretestcases);
	}
}
}
