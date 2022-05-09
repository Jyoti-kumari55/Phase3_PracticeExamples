package com.example.registers;


import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.loader.custom.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class StudentController {
	@Autowired
	StudentRepo repo;
	Logger log=Logger.getAnonymousLogger();
@RequestMapping("/register-user/{user}/{password}/{email}")
	public ModelAndView register(@PathVariable("user") String user,@PathVariable("password") String password,@PathVariable("email") String email,HttpServletRequest req, HttpServletResponse res) {
	Student s=new Student();
	ModelAndView mv=new ModelAndView();
	log.info("recievd the data from login ms "+user +" "+password+"  "+email);
	log.info("setter started");
		s.setSuser(user);
		s.setSpassword(password);
		s.setEmail(email);
	log.info("setter closed with"+s.getSuser()+" " +s.getSpassword()+" "+s.getEmail());
	log.info("insertion started");	
	Student ss=repo.save(s);
	log.info("insertion done and stored in object ss"+ss.getSuser()+"  "+ss.getSpassword()+"  "+ss.getEmail());
	mv.addObject("studentobj", ss);
	log.info("went to view display.jsp");
	mv.setViewName("display");
	log.info("ms closed");
		return mv;
	}

}
	

