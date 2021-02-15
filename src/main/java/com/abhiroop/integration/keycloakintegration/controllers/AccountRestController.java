package com.abhiroop.integration.keycloakintegration.controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.abhiroop.integration.keycloakintegration.services.AccountService;

@Controller
@RestController
public class AccountRestController {

	@Autowired
	AccountService accountService;

	@GetMapping(path = "/")
	public ModelAndView homePage() {
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}

	@GetMapping(path = "/account-list")
	public ModelAndView accountpage() {
		ModelAndView mv = new ModelAndView("accounts");
		return mv;
	}
	
	@GetMapping(path = "/accounts")
	public String getaccounts(Model model) {
		model.addAttribute("accounts", accountService.getaccounts());
		return "accounts";
	}
	

	@RequestMapping(path = "/logout", method = RequestMethod.GET)
	public ModelAndView logout(HttpServletRequest request) throws ServletException {
		request.logout();

		ModelAndView mv = new ModelAndView("home");
		return mv;
	}
}
