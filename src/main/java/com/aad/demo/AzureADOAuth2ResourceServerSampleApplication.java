package com.aad.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class AzureADOAuth2ResourceServerSampleApplication 
{
	private static Logger logger = LoggerFactory.getLogger(AzureADOAuth2ResourceServerSampleApplication.class);
	
    public static void main(String[] args) 
    {
    	logger.info("############# main() ###############");
    	System.out.println("############# main() ###############");
        SpringApplication.run(AzureADOAuth2ResourceServerSampleApplication.class, args);
        for (int i=0;i<5;i++) 
        {
        	System.out.println("V3 Starting application......"+i);
        	logger.info("V3 Starting application......"+i);
        }
        System.out.println("----------- INITIALIZED APPLICATION----------------------");
        logger.info("----------- INITIALIZED APPLICATION----------------------");
    }
}