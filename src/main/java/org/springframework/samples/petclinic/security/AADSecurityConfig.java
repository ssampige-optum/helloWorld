package org.springframework.samples.petclinic.security;

import com.azure.spring.aad.webapi.AADResourceServerWebSecurityConfigurerAdapter;

import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class AADSecurityConfig extends AADResourceServerWebSecurityConfigurerAdapter
{
    /**
     * Add configuration logic as needed.
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);
        http.authorizeRequests().anyRequest().authenticated();
        for(int i=0;i<10;i++)
        {
            System.out.println(" ------------------------------------->>>> FINISHED Configuring AADSecurityConfig !!!!!");
        }
    }

}