package net.skhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class MainController {

	@RequestMapping("faq")
	public String faq(Model model) {
		model.addAttribute("boardName","FAQ");
		return "/board";
	}

	@RequestMapping("index")
	public String index(Model model) {
		return "/index";
	}
	@RequestMapping("notice")
	public String notice(Model model) {
		model.addAttribute("boardName","공지사항");
		return "/board";
	}

}
