package com.test.architect.week6.assessment1.a;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import com.test.architect.utils.HandleProperties;

public class RetryAnnotationTransformer implements IAnnotationTransformer {

	@SuppressWarnings("rawtypes")
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(Retry.class);
		annotation.setDataProviderClass(UserDataProvider.class);
		annotation.setDataProvider(HandleProperties.readConfigProperties("Dataprovider"));
	}

}