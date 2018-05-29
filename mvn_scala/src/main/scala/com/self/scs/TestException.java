package com.self.scs;

public class TestException {
    public static void main(String[] args) {
       try {
           Test_one.testException();
       }catch (Exception e ){
          e.printStackTrace();
       }finally {
           System.out.println("method is over");
       }
    }
}
