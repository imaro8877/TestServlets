package com.imaro.myapp.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	@ResponseBody
	@RequestMapping(value = { "/loginform", "/" }, method = RequestMethod.GET)
	public String loginform(Locale locale, Model model) {
		logger.info("Welcome loginform! The client locale is {}.", locale);
		testVO testvo = new testVO();
		model.addAttribute("testvo", testvo);

		return "loginForm";
	}

	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(Locale locale, Model model) {
		logger.info("Welcome login! The client locale is {}.", locale);
		List<testVO> testList = new ArrayList<testVO>();
		testVO testvo = new testVO();
		testvo.setId("id");
		testvo.setPwd("pwd");
		testvo.setName("name");
		testvo.setPhone("phone");
		testvo.setPostno("postno");
		testList.add(testvo);

		testVO testvo1 = new testVO();
		testvo1.setId("id1");
		testvo1.setPwd("pwd1");
		testvo1.setName("name1");
		testvo1.setPhone("phone1");
		testvo1.setPostno("postno1");
		testList.add(testvo1);

		testVO testvo2 = new testVO();

		testvo2.setId("id3");
		testvo2.setPwd("pwd3");
		testvo2.setName("name3");
		testvo2.setPhone("phone3");
		testvo2.setPostno("postno3");
		testList.add(testvo2);

		model.addAttribute("testvo", testList);

		return "login";
	}

	@ResponseBody
	@RequestMapping(value = "/joinform", method = RequestMethod.GET)
	public String joinform(Locale locale, Model model) {
		logger.info("Welcome joinform! The client locale is {}.", locale);
		testVO testvo = new testVO();
		model.addAttribute("testvo", testvo);

		return "joinForm";
	}

	@ResponseBody
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(testVO testvo, Locale locale, Model model) {
		logger.info("Welcome join! The client locale is {}.", locale);
		return "join";
	}

	@ResponseBody
	@RequestMapping(value = "/updateform", method = RequestMethod.GET)
	public String updateform(Locale locale, Model model) {
		logger.info("Welcome updateform! The client locale is {}.", locale);
		return "updateForm";
	}

	@ResponseBody
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(Locale locale, Model model) {
		logger.info("Welcome update! The client locale is {}.", locale);
		return "update";
	}

}
