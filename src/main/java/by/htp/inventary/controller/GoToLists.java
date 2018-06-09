package by.htp.inventary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import by.htp.inventary.domain.Commutator;
import by.htp.inventary.domain.Computer;
import by.htp.inventary.domain.Laptop;
import by.htp.inventary.domain.Monitor;
import by.htp.inventary.domain.Printer;
import by.htp.inventary.domain.Terminal;
import by.htp.inventary.domain.TerminalDocStation;
import by.htp.inventary.domain.WiFiDot;
import by.htp.inventary.service.EquipmentService;

@Controller
public class GoToLists {
	
	@Autowired
	private EquipmentService equipmentService;
	
	@RequestMapping(value="/listMonitor", method=RequestMethod.GET)
	public String listMonitor(ModelMap model) {
		List<Monitor> monitorAll = equipmentService.monitorAll();
		model.addAttribute("monitorAll", monitorAll);
		return "listMonitor";
	}
	
	@RequestMapping(value="/listLaptop", method=RequestMethod.GET)
	public String listLaptop(ModelMap model) {
		List<Laptop> laptopAll = equipmentService.laptopAll();
		model.addAttribute("laptopAll", laptopAll);
		return "listLaptop";
	}
	
	@RequestMapping(value="/listComputer", method=RequestMethod.GET)
	public String listComputer(ModelMap model) {
		List<Computer> computerAll = equipmentService.computerAll();
		model.addAttribute("computerAll", computerAll);
		return "listComputer";
	}
	
	@RequestMapping(value="/listCommutator", method=RequestMethod.GET)
	public String listCommutator(ModelMap model) {
		List<Commutator> commutatorAll = equipmentService.commutatorAll();
		model.addAttribute("commutatorAll", commutatorAll);
		return "listCommutator";
	}
	
	@RequestMapping(value="/listPrinter")
	public String listPrinter(ModelMap model) {
		List<Printer> printerAll = equipmentService.printerAll();
		model.addAttribute("printerAll", printerAll);
		return "listPrinter";
	}
	
	@RequestMapping(value="/listTerminal")
	public String listTerminal(ModelMap model) {
		List<Terminal> terminalAll = equipmentService.terminalAll();
		model.addAttribute("terminalAll", terminalAll);
		return "listTerminal";
	}
	
	@RequestMapping(value="/listTermDocStation")
	public String listTermDocStation(ModelMap model) {
		List<TerminalDocStation> termDocStationAll = equipmentService.terminalDocStationAll();
		model.addAttribute("termDocStationAll", termDocStationAll);
		return "listTermDocStation";
	}
	
	
	@RequestMapping(value="/listWiFiDot")
	public String listWiFiDot(ModelMap model) {
		List<WiFiDot> wifiDotAll = equipmentService.wifiDotAll();
		model.addAttribute("wifiDotAll", wifiDotAll);
		return "listWiFiDot";
	}
}
