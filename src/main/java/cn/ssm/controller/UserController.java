package cn.ssm.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.ssm.po.User;
import cn.ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/userLogin", method=RequestMethod.POST)
	public String userLogin(HttpSession session, Model model,@ModelAttribute User user) throws Exception {
				
		User u = userService.searchUser(user);
		
		if(u == null) {
			model.addAttribute("loginErrorMessage", "输入错误，请重新登录！");	
			return "userLogin";	
		}
		
		session.setAttribute("username", u.getUsername());
		model.addAttribute("loginUserName", u.getUsername());
		return "loginSuccess";
	}
	
	@RequestMapping(value="/userExit", method=RequestMethod.GET)
	public String userExit(HttpSession session) throws Exception {
		
		session.invalidate();
		return "userLogin";
	}
}
