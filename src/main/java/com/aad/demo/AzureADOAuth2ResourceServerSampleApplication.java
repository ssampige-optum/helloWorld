package com.aad.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AzureADOAuth2ResourceServerSampleApplication {

    public static void main(String[] args) 
    {
    	System.out.println("############# main() ###############");
        SpringApplication.run(AzureADOAuth2ResourceServerSampleApplication.class, args);
        for (int i=0;i<5;i++) 
        {
        	System.out.println("V3 Starting application......"+i);
        }
        System.out.println("----------- INITIALIZED APPLICATION----------------------");
    }
}