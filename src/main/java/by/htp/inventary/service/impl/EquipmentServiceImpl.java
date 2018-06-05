package by.htp.inventary.service.impl;

import java.util.List;

import by.htp.inventary.dao.EquipmentDAO;
import by.htp.inventary.dao.impl.EquipmentDAOImpl;
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
import by.htp.inventary.service.EquipmentService;

public class EquipmentServiceImpl implements EquipmentService {

	private EquipmentDAO equipmentDAO;

	public EquipmentServiceImpl() {
	}

	public void setEquipmentDAO(EquipmentDAO equipmentDAO) {
		this.equipmentDAO = equipmentDAO;
	}

	@Override
	public List<Brand> brandAll() {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		return equipmentDAO.brandAll();
	}

	@Override
	public List<Diagonal> diagonalAll() {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		return equipmentDAO.diagonalAll();
	}

	@Override
	public List<Cpu> cpuAll() {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		return equipmentDAO.cpuAll();
	}

	@Override
	public List<Gpu> gpuAll() {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		return equipmentDAO.gpuAll();
	}

	@Override
	public List<Hdd> hddAll() {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		return equipmentDAO.hddAll();
	}

	@Override
	public List<Ssd> ssdAll() {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		return equipmentDAO.ssdAll();
	}

	@Override
	public List<Ram> ramAll() {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		return equipmentDAO.ramAll();
	}

	@Override
	public List<Type> typeAll() {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		return equipmentDAO.typeAll();
	}

	@Override
	public List<Port> portAll() {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		return equipmentDAO.portAll();
	}

	@Override
	public List<Ethernet> ethernetAll() {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		return equipmentDAO.ethernetAll();
	}

	@Override
	public List<AmountColor> amountColorAll() {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		return equipmentDAO.amountColorAll();
	}

	@Override
	public List<TypeCartridge> typeCartridgeAll() {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		return equipmentDAO.typeCartridgeAll();
	}

	@Override
	public List<TypePrinter> typePrinterAll() {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		return equipmentDAO.typePrinterAll();
	}

	@Override
	public void addMonitor(Monitor monitor) {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		equipmentDAO.addMonitor(monitor);

	}

	@Override
	public List<Monitor> monitorAll() {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		return equipmentDAO.monitorAll();
	}

	@Override
	public void deleteMonitor(int id) {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		equipmentDAO.deleteMonitor(id);
	}

	@Override
	public void updateMonitor(Monitor newMonitor) {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		equipmentDAO.updateMonitor(newMonitor);
	}

	@Override
	public Monitor getMonitor(int id) {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		return equipmentDAO.getMonitor(id);
	}

	@Override
	public void addCommutator(Commutator commutator) {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		equipmentDAO.addCommutator(commutator);
	}

	@Override
	public List<Commutator> commutstorAll() {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		return equipmentDAO.commutstorAll();
	}

	@Override
	public void deleteCommutator(int id) {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		equipmentDAO.deleteCommutator(id);
	}

	@Override
	public void updateCommutator(Commutator newCommutator) {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		equipmentDAO.updateCommutator(newCommutator);
	}

	@Override
	public Commutator getCommutator(int id) {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		return equipmentDAO.getCommutator(id);
	}

	@Override
	public void addComputer(Computer computer) {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		equipmentDAO.addComputer(computer);
	}

	@Override
	public List<Computer> computerAll() {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		return equipmentDAO.computerAll();
	}

	@Override
	public void deleteComputer(int id) {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		equipmentDAO.deleteComputer(id);
	}

	@Override
	public void updateComputer(Computer newComputer) {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		equipmentDAO.updateComputer(newComputer);
	}

	@Override
	public Computer getComputer(int id) {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		return equipmentDAO.getComputer(id);
	}

	@Override
	public void addLaptop(Laptop laptop) {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		equipmentDAO.addLaptop(laptop);
	}

	@Override
	public List<Laptop> laptopAll() {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		return equipmentDAO.laptopAll();
	}

	@Override
	public void deleteLaptop(int id) {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		equipmentDAO.deleteCommutator(id);
	}

	@Override
	public void updateLaptop(Laptop newLaptop) {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		equipmentDAO.updateLaptop(newLaptop);
	}

	@Override
	public Laptop getLaptop(int id) {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		return equipmentDAO.getLaptop(id);
	}

	@Override
	public void addPrinter(Printer printer) {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		equipmentDAO.addPrinter(printer);
	}

	@Override
	public List<Printer> printerAll() {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		return equipmentDAO.printerAll();
	}

	@Override
	public void deletePrinter(int id) {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		equipmentDAO.deletePrinter(id);
	}

	@Override
	public void updatePrinter(Printer newPrinter) {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		equipmentDAO.updatePrinter(newPrinter);
	}

	@Override
	public Printer getPrinter(int id) {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		return equipmentDAO.getPrinter(id);
	}

	@Override
	public void addTerminal(Terminal terminal) {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		equipmentDAO.addTerminal(terminal);
	}

	@Override
	public List<Terminal> terminalAll() {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		return equipmentDAO.terminalAll();
	}

	@Override
	public void deleteTerminal(int id) {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		equipmentDAO.deleteTerminal(id);
	}

	@Override
	public void updateTerminal(Printer newTerminal) {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		equipmentDAO.updateTerminal(newTerminal);
	}

	@Override
	public Terminal getTerminal(int id) {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		return equipmentDAO.getTerminal(id);
	}

	@Override
	public void addTerminalDocStation(TerminalDocStation terminalDocStation) {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		equipmentDAO.addTerminalDocStation(terminalDocStation);
	}

	@Override
	public List<TerminalDocStation> terminalDocStationAll() {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		return equipmentDAO.terminalDocStationAll();
	}

	@Override
	public void deleteTerminalDocStation(int id) {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		equipmentDAO.deleteTerminalDocStation(id);
	}

	@Override
	public void updateTerminalDocStation(TerminalDocStation newTerminalDocStation) {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		equipmentDAO.updateTerminalDocStation(newTerminalDocStation);
	}

	@Override
	public TerminalDocStation getTerminalDocStation(int id) {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		return equipmentDAO.getTerminalDocStation(id);
	}

	@Override
	public void addWiFiDot(WiFiDot wifiDot) {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		equipmentDAO.addWiFiDot(wifiDot);
	}

	@Override
	public List<WiFiDot> wifiDotAll() {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		return equipmentDAO.wifiDotAll();
	}

	@Override
	public void deleteWiFiDot(int id) {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		equipmentDAO.deleteWiFiDot(id);
	}

	@Override
	public void updateWiFiDot(WiFiDot newWiFiDot) {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		equipmentDAO.updateWiFiDot(newWiFiDot);
	}

	@Override
	public WiFiDot getWiFiDot(int id) {
		EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
		return equipmentDAO.getWiFiDot(id);
	}

}
