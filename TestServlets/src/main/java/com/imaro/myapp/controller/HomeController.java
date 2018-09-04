package com.imaro.myapp.controller;

import java.text.DateFormat;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.imaro.myapp.dao.testVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = { "/loginform", "/" }, method = RequestMethod.GET)
	public String loginform(Locale locale, Model model) {
		logger.info("Welcome loginform! The client locale is {}.", locale);
		testVO testvo = new testVO();
		model.addAttribute("testvo", testvo);

		return "loginForm";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		logger.info("Welcome login! The client locale is {}.", locale);
		return "login";
	}

	@RequestMapping(value = "/joinform", method = RequestMethod.GET)
	public String joinform(Locale locale, Model model) {
		logger.info("Welcome joinform! The client locale is {}.", locale);
		testVO testvo = new testVO();
		model.addAttribute("testvo", testvo);

		return "joinForm";
	}

	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(testVO testvo, Locale locale, Model model) {
		logger.info("Welcome join! The client locale is {}.", locale);
		System.out.println(testvo.toString());
		model.addAttribute("testvo", testvo);
		return "join";
	}

	@RequestMapping(value = "/updateform", method = RequestMethod.GET)
	public String updateform(Locale locale, Model model) {
		logger.info("Welcome updateform! The client locale is {}.", locale);
		return "updateForm";
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(Locale locale, Model model) {
		logger.info("Welcome update! The client locale is {}.", locale);
		return "update";
	}

}
