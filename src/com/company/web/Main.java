package com.company.web;

import javax.lang.model.type.MirroredTypesException;
import javax.management.RuntimeErrorException;
import javax.xml.crypto.NoSuchMechanismException;
import javax.xml.transform.TransformerFactoryConfigurationError;
import java.io.*;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
//        //Task 1
//        List<Error> t1 = new ArrayList<>();
//        t1.add(new ExceptionInInitializerError());
//        t1.add(new NoClassDefFoundError());
//        t1.add(new InternalError());
//        t1.add(new TransformerFactoryConfigurationError());
//        t1.add(new AssertionError());
//        for (int i = 0; i < t1.size(); i++) {
//            if (t1.get(i) instanceof Error) {
//                System.out.println("instanceOf Error");
//            } else {
//                System.out.println("not instanceOf Error");
//            }
//        }
//        //Task 2
//        List<RuntimeException> t2 = new ArrayList<>();
//        t2.add(new NullPointerException());
//        t2.add(new NoSuchElementException());
//        t2.add(new EmptyStackException());
//        t2.add(new NoSuchMechanismException());
//        t2.add(new IndexOutOfBoundsException());
//        for (int i = 0; i < t2.size(); i++) {
//            if (t2.get(i) instanceof RuntimeException) {
//                System.out.println("instanceOf RuntimeException");
//            } else {
//                System.out.println("not instanceOf RuntimeException");
//            }
//        }
//        //Task 3
//        List<Exception> t3 = new ArrayList<>();
//        t3.add(new IOException());
//        t3.add(new InterruptedException());
//        t3.add(new SQLException());
//        t3.add(new FileNotFoundException());
//        t3.add(new Exception());
//        for (int i = 0; i < t3.size(); i++) {
//            if (!(t3.get(i) instanceof RuntimeException) && t3.get(i) instanceof Exception) {
//                System.out.println("instanceOf Checked");
//            } else {
//                System.out.println("not instanceOf Checked");
//            }
//        }
        //Task 4
        throw new RuntimeException(); //comment this to see other tasks
        //Task 5
        throw new SQLException(); //comment this to see other tasks
//        //Task 9_10
//        try {
//            throw new SQLException();
//        } catch (SQLException e) {
//
//        }
//        catch (Exception e){
//
//        }
//        //Task 11
//        try{
//
//        }
//        finally {
//
//        }
//        //Task 12
//        try(BufferedReader bu=new BufferedReader(new InputStreamReader(System.in))){
//
//        }
        //Task 13
        Thread thread = new Thread() {
            @Override
            public void run() {
                if (true) {
                    throw new RuntimeException();
                }
                System.out.println("You can't see this inscription");
            }
        };
        thread.run();
        //Task 15_16
//        Exception exception=new RuntimeException();
//        exception.getCause();
//        exception.getMessage();
//        exception.getStackTrace();
//        exception.printStackTrace();
        //Task 17
//        try {
//            throw new Exception().initCause(new NullPointerException());
//        } catch (Throwable throwable) {
//            throwable.getCause();
//        }
        //Task 18
        try{
            System.exit(0);
        }
        finally {
            System.out.println("after exit (we can't see that message)");
        }
        //Task 19
        System.out.println(new Main().doubleReturnTask19());
        //Task 20
        new Main().Task20();//comment this to see other tasks
        //Task 21
        new Main().Task21();//comment this to see other tasks

    }

    public void task6() {
        try {
            throw new SQLException();
        } catch (SQLException e) {

        } finally {
        }

    }

//    public void task7_8() throws FileNotFoundException {
//        try {
//            throw new SQLException();
//        } catch (SQLException e) {
//
//        } finally {
//
//        }
//
//        throw new FileNotFoundException();
//    }

    public Integer doubleReturnTask19() {
        try {
            return 2;
        } finally {
            return 3;
        }
    }

    public void Task20() throws SQLException {
        try {
            if (true) {
                throw new SQLException();
            }
        } finally {
            throw new RuntimeException();
        }
    }

    public Integer Task21() throws SQLException {
        try {
            if (true) {
                throw new SQLException();
            }
        } finally {
            return 33;
        }
    }
}
