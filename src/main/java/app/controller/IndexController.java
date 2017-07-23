package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

	@RequestMapping(value = { "/", "/index**" }, method = RequestMethod.GET)
	public String index(){
		
		return "index/index";
	}
	
	@RequestMapping(value = { "/order"}, method = RequestMethod.GET)
	public String order(){
		
		return "index/order";
	}
	@RequestMapping(value = { "/gallery"}, method = RequestMethod.GET)
	public String gallery(){
		
		return "index/gallery";
	}
	@RequestMapping(value = { "/services"}, method = RequestMethod.GET)
	public String services(){
		
		return "index/services";
	}
	
	@RequestMapping(value = { "/about-us"}, method = RequestMethod.GET)
	public String about(){
		
		return "index/about-us";
	}


}
