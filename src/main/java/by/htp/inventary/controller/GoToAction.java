package by.htp.inventary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/")
public class GoToAction {
	@RequestMapping(value="/allEquipment", method=RequestMethod.GET)
	public String goToListEquipment() {
		return "listEquipment";
	}
	
	@RequestMapping(value="/addEquipment", method=RequestMethod.GET)
	public String goToAddEquipment() {
		return "addEquipment";
	}
}
