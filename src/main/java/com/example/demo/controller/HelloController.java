package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController{
	
	/**
	 * 初期処理 ユーザ用TOPページのビューを取得
	 * @return ユーザ用TOPページのビュー
	 */
	@RequestMapping("/hello")
	private String init() {
		return "hello";
	}

}