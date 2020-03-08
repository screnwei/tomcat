package net.dwade.tomcat.test;

import org.junit.Test;

public class ClassLoaderTest {

	public static void main(String[] args) {
		String json = "{\"name\":\"90后才了\", \"id\":123}";
		ClassLoader loader = ClassLoaderTest.class.getClassLoader();
		for(;;) {
			if (loader == null) break;
			System.out.println( loader + " --> " + loader.getParent() );
			loader = loader.getParent();
		}
	}
	
	@Test
	public void testComputor() {
		System.out.println( 2000*8 + 4000 * (37 * 12) );
	}

}
