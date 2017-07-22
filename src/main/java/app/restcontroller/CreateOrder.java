package app.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/create")
public class CreateOrder {
	
	@RequestMapping(value = "/order")
	public String createOrder(){
		
		return "Success";
	}
}
