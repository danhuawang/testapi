package cn.wangdanhua.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.wangdanhua.restapi.domain.User;
import cn.wangdanhua.restapi.service.UserService;

@RestController
@RequestMapping("users*")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping
	public List<User> userList() {
		List<User> userList = userService.findAll();
		return userList;
	}

	@RequestMapping("/{id}")
	public User findUser(@PathVariable("id") Long userId) {
		User user = userService.findUser(userId);
		return user;
	}

}
