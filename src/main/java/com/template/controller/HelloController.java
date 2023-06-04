package com.template.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 表示サンプル用コントローラ.
 *
 * @author isodakeisuke
 */
@RestController
public class HelloController {

	/**
	 * サンプルメソッド.
	 */
	@GetMapping("/hello")
	public String hello() {
		return "Hello World!";
	}
}
