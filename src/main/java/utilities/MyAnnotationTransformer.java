package utilities;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class MyAnnotationTransformer implements IAnnotationTransformer
{
	public void transform(ITestAnnotation ita, Class cls, Constructor cont, Method meth)
	{
		ita.setRetryAnalyzer(MyRetryAnalyzer.class);
	}

}
