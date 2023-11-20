package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ログイン画面を管理するためのコントローラ
 * @author akhino
 *
 */

@Controller
public class LoginController {

	@RequestMapping(value = "/login")
	public String index() {
		return "login";
	}
}
