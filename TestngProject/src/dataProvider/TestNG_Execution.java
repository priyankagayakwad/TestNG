package dataProvider;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Execution {
	 @Test
     public void testCase1() {

           System.out.println("testCase1");
     }

     @Test
     public void testCase2() {

           System.out.println("testCase2");
     }
     
     @Test
     public void testCase3() {

           System.out.println("testCase2");
     }
     @Test
     public void testCase4() {

           System.out.println("testCase2");
     }
     @Test
     public void testCase5() {

           System.out.println("testCase2");
     }
     @BeforeMethod
     public void beforeMethod() {

         System.out.println("beforeMethod");
     }

     @BeforeClass
     public void beforeClass() {

           System.out.println("beforeClass");
     }

     @BeforeTest
     public void beforeTest() {

           System.out.println("beforeTest");
    }
}
