package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@RequestMapping(value = "/getCharNum", method = RequestMethod.GET)
	public @ResponseBody AjaxResp getCharNum(@RequestParam String text) {
		Calc calc = new Calc();

		AjaxResp resp = new AjaxResp();
		resp.setResult(calc.getResult(text));
		return resp;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Calculator");
		return "hello";
	}
}