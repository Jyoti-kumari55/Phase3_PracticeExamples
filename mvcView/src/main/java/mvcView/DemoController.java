package mvcView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

public class DemoController {

	@RequestMapping("/first")
	public ModelAndView displayId(HttpServletRequest req,HttpServletResponse res) {
	Student s=new Student();
	String id=req.getParameter("id");
	s.setId(id);
	ModelAndView mv=new ModelAndView();
	mv.setViewName("display.jsp");
	mv.addObject("objname", s);
		return mv;
	}
	
@RequestMapping("/second")
	public String displayName(HttpServletRequest req,HttpServletResponse res) {
		return req.getParameter("name");
	}
}



