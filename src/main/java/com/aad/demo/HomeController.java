package com.aad.demo;

import java.security.Principal;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PreAuthorize("permitAll")
public class HomeController
{
	@GetMapping("/")
    @ResponseBody
    @PreAuthorize("permitAll")
	public String home(Principal principal)
	{
		return "THIS IS THE HOME";
	}

	@GetMapping("/webapiB")
    @ResponseBody
    @PreAuthorize("hasAuthority('SCOPE_WebApiB.ExampleScope')")
    public String file() 
	{
        return "Response from WebApiB.";
    }

    @GetMapping("/user")
    @ResponseBody
    @PreAuthorize("hasAuthority('SCOPE_User.Read')")
    public String user() 
    {
        return "User read success.";
    }
}
