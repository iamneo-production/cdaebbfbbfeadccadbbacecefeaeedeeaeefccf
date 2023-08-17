package com.example.springapp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Controller
@SpringBootApplicatio
public class SpringappApplication {
	@RequestMapping("/welcome")
	@ResponseBody
public String welcome()
{
	return "Welcome String Boot";
}

}
