package tests123;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.IConfigurationAnnotation;
import org.testng.annotations.ITestAnnotation;

public class Annot implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation  annotation, Class testClass, Constructor testConstructor,
			Method testMethod) {
		
	
			annotation.setRetryAnalyzer(RetryFailed.class);
		
	}

}
