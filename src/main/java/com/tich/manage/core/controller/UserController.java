package com.tich.manage.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tich.manage.core.entity.User;
import com.tich.manage.core.service.UserService;

/**
 * 用户控制器
 */
@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "id", required = true) String id) {
		User user = userService.getUserById(id);

		ModelAndView mav = new ModelAndView();
		if (user == null) {
			// 跳转至失败页
			mav.setViewName("fail");
			return mav;
		} else {
			// 跳转至成功页
			mav.addObject("id", user.getId());
			mav.addObject("name", user.getUserName());
			mav.addObject("gender", user.getUserGender());
			mav.addObject("birthday", user.getUserBirthday());
			mav.setViewName("success");
			return mav;
		}
	}
}
