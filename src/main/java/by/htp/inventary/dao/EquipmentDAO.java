package by.htp.inventary.dao;

import java.util.List;

import by.htp.inventary.domain.AmountColor;
import by.htp.inventary.domain.Brand;
import by.htp.inventary.domain.Commutator;
import by.htp.inventary.domain.Computer;
import by.htp.inventary.domain.Cpu;
import by.htp.inventary.domain.Diagonal;
import by.htp.inventary.domain.Ethernet;
import by.htp.inventary.domain.Gpu;
import by.htp.inventary.domain.Hdd;
import by.htp.inventary.domain.Laptop;
import by.htp.inventary.domain.Monitor;
import by.htp.inventary.domain.Port;
import by.htp.inventary.domain.Printer;
import by.htp.inventary.domain.Ram;
import by.htp.inventary.domain.Ssd;
import by.htp.inventary.domain.Terminal;
import by.htp.inventary.domain.TerminalDocStation;
import by.htp.inventary.domain.Type;
import by.htp.inventary.domain.TypeCartridge;
import by.htp.inventary.domain.TypePrinter;
import by.htp.inventary.domain.WiFiDot;

public interface EquipmentDAO {
	
	List<Brand> brandAll();
	List<Diagonal> diagonalAll();
	List<Cpu> cpuAll();
	List<Gpu> gpuAll();
	List<Hdd> hddAll();
	List<Ssd> ssdAll();
	List<Ram> ramAll();
	List<Type> typeAll();
	List<Port> portAll();
	List<Ethernet> ethernetAll();
	List<AmountColor> amountColorAll();
	List<TypeCartridge> typeCartridgeAll();
	List<TypePrinter> typePrinterAll();
	
	void addMonitor(Monitor monitor);
	List<Monitor> monitorAll();
	void deleteMonitor(int id);
	void updateMonitor(Monitor newMonitor);
	Monitor getMonitor(int id);
	
	void addCommutator(Commutator commutator);
	List<Commutator> commutatorAll();
	void deleteCommutator(int id);
	void updateCommutator(Commutator newCommutator);
	Commutator getCommutator(int id);
	
	void addComputer(Computer computer);
	List<Computer> computerAll();
	void deleteComputer(int id);
	void updateComputer(Computer newComputer);
	Computer getComputer(int id);
	
	void addLaptop(Laptop laptop);
	List<Laptop> laptopAll();
	void deleteLaptop(int id);
	void updateLaptop(Laptop newLaptop);
	Laptop getLaptop(int id);
	
	void addPrinter(Printer printer);
	List<Printer> printerAll();
	void deletePrinter(int id);
	void updatePrinter(Printer newPrinter);
	Printer getPrinter(int id);
	
	void addTerminal(Terminal terminal);
	List<Terminal> terminalAll();
	void deleteTerminal(int id);
	void updateTerminal(Printer newTerminal);
	Terminal getTerminal(int id);
	
	void addTerminalDocStation(TerminalDocStation terminalDocStation);
	List<TerminalDocStation> terminalDocStationAll();
	void deleteTerminalDocStation(int id);
	void updateTerminalDocStation(TerminalDocStation newTerminalDocStation);
	TerminalDocStation getTerminalDocStation(int id);
	
	void addWiFiDot(WiFiDot wifiDot);
	List<WiFiDot> wifiDotAll();
	void deleteWiFiDot(int id);
	void updateWiFiDot(WiFiDot newWiFiDot);
	WiFiDot getWiFiDot(int id);
	
}
