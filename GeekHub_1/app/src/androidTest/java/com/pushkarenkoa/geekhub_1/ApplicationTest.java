package com.pushkarenkoa.geekhub_1;

import android.app.Application;
import android.test.ApplicationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }



       public void testFactorial(){
           assertEquals(1,Second.fact(0));
           assertEquals(5040,Second.fact(7));
           assertEquals(6,Second.fact(3));
           assertEquals(720,Second.fact(6));
       }
    public void testFibonachi(){
            assertEquals(1, Second.fibshow(1));
            assertEquals(2, Second.fibshow(3));
            assertEquals(3, Second.fibshow(4));
            assertEquals(5, Second.fibshow(5));
            assertEquals(8, Second.fibshow(6));
        }
    }
