package com.example.demo;

import org.junit.Test;

import java.util.UUID;

public class DemoTest {
   @Test
   public void st(){
      UUID uuid = UUID.randomUUID();

      String otp = uuid.toString();
      System.out.println(otp);

   }
}
