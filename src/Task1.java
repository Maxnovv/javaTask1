package com.example.task3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.;

import com.example.task3.MyOwnException;

public class Task1
{
    public static void main(String[] args){

        try
        {
            Method method = TestClassWithMain.class.getDeclaredMethod("testMethod1");
            method.setAccessible(true);
            var a = method.invoke("this");
        }
        catch (NoSuchMethodException e)
        {
            e.printStackTrace();
        }
        catch (InvocationTargetException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }

        /// -------------
        long number = 12L;

        int smaller = (int) number;
        Integer integer = 12;

        String text = "Hello world!";

        TestClassWithMain.testMethod1();
        try {
            TestClassWithMain.testMethod2();
            TestClassWithMain.testMethod1();
            String a = "dawdaw";
            TestClassWithMain.testMethod1();
            TestClassWithMain.testMethod1();


        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {

        }
        finally
        {

        }


        parseNumber(text);
        modifyFile();
    }

    public static int parseNumber(String text) throws MyOwnException
    {
        try
        {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            throw new MyOwnException("Cannot parse number", System.currentTimeMillis());
        }
    }

    public static void modifyFile(File file) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            // do something useful
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}