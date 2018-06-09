package by.htp.inventary.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import by.htp.inventary.dao.EquipmentDAO;
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

public class EquipmentDAOImpl implements EquipmentDAO {

	@Override
	public List<Brand> brandAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();

		Criteria criteria = session.createCriteria(Diagonal.class);

		return criteria.list();
	}

	@Override
	public List<Diagonal> diagonalAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();

		Criteria criteria = session.createCriteria(Diagonal.class);

		return criteria.list();
	}

	@Override
	public List<Cpu> cpuAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();

		Criteria criteria = session.createCriteria(Diagonal.class);

		return criteria.list();
	}

	@Override
	public List<Gpu> gpuAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();

		Criteria criteria = session.createCriteria(Diagonal.class);

		return criteria.list();
	}

	@Override
	public List<Hdd> hddAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();

		Criteria criteria = session.createCriteria(Diagonal.class);

		return criteria.list();
	}

	@Override
	public List<Ssd> ssdAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();

		Criteria criteria = session.createCriteria(Diagonal.class);

		return criteria.list();
	}

	@Override
	public List<Ram> ramAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();

		Criteria criteria = session.createCriteria(Diagonal.class);

		return criteria.list();
	}

	@Override
	public List<Type> typeAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();

		Criteria criteria = session.createCriteria(Diagonal.class);

		return criteria.list();
	}

	@Override
	public List<Port> portAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();

		Criteria criteria = session.createCriteria(Diagonal.class);

		return criteria.list();
	}

	@Override
	public List<Ethernet> ethernetAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();

		Criteria criteria = session.createCriteria(Diagonal.class);

		return criteria.list();
	}

	@Override
	public List<AmountColor> amountColorAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();

		Criteria criteria = session.createCriteria(Diagonal.class);

		return criteria.list();
	}

	@Override
	public List<TypeCartridge> typeCartridgeAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();

		Criteria criteria = session.createCriteria(Diagonal.class);

		return criteria.list();
	}

	@Override
	public List<TypePrinter> typePrinterAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();

		Criteria criteria = session.createCriteria(Diagonal.class);

		return criteria.list();
	}

	@Override
	public void addMonitor(Monitor monitor) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		session.save(monitor);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public List<Monitor> monitorAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();

		Criteria criteria = session.createCriteria(Diagonal.class);

		return criteria.list();
	}

	@Override
	public void deleteMonitor(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		Monitor monitor = (Monitor) session.get(Monitor.class, id);
		session.delete(monitor);
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public void updateMonitor(Monitor newMonitor) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		Monitor monitor = (Monitor) session.get(Monitor.class, newMonitor.getId());
		session.getTransaction().begin();
		monitor.setInventaryId(newMonitor.getInventaryId());
		monitor.setBrand(newMonitor.getBrand());
		monitor.setDiagonal(newMonitor.getDiagonal());
		monitor.setInventaryId(newMonitor.getInventaryId());
		monitor.setModel(newMonitor.getModel());
		monitor.setUser(newMonitor.getUser());
		monitor.setInputDoc(newMonitor.getInputDoc());
		monitor.setUser(newMonitor.getUser());
		session.update(monitor);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Monitor getMonitor(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Monitor monitor = (Monitor) session.get(Monitor.class, id);
		session.close();
		return monitor;
	}

	@Override
	public void addCommutator(Commutator commutator) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		session.save(commutator);
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public List<Commutator> commutatorAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();

		Criteria criteria = session.createCriteria(Diagonal.class);

		return criteria.list();
	}

	@Override
	public void deleteCommutator(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		Commutator commutator = (Commutator) session.get(Commutator.class, id);
		session.delete(commutator);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void updateCommutator(Commutator newCommutator) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		Commutator commutator = (Commutator) session.get(Commutator.class, newCommutator.getId());
		session.getTransaction().begin();
		commutator.setInventoryId(newCommutator.getInventoryId());
		commutator.setInputDoc(newCommutator.getInputDoc());
		commutator.setInventoryId(newCommutator.getInventoryId());
		commutator.setModel(newCommutator.getModel());
		commutator.setPort(newCommutator.getPort());
		commutator.setUser(newCommutator.getUser());
		session.update(commutator);
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public Commutator getCommutator(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Commutator commutator = (Commutator) session.get(Commutator.class, id);
		session.close();
		return commutator;
	}

	@Override
	public void addComputer(Computer computer) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		session.save(computer);
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public List<Computer> computerAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();

		Criteria criteria = session.createCriteria(Diagonal.class);

		return criteria.list();
	}

	@Override
	public void deleteComputer(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		Computer computer = (Computer) session.get(Computer.class, id);
		session.delete(computer);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void updateComputer(Computer newComputer) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		Computer computer = (Computer) session.get(Computer.class, newComputer.getId());
		session.getTransaction().begin();
		computer.setInventoryId(newComputer.getInventoryId());
		computer.setCpu(newComputer.getCpu());
		computer.setGpu(newComputer.getGpu());
		computer.setHdd(newComputer.getHdd());
		computer.setInputDoc(newComputer.getInventoryId());
		computer.setRam(newComputer.getRam());
		computer.setSsd(newComputer.getSsd());
		computer.setUser(newComputer.getUser());
		session.update(computer);
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public Computer getComputer(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Computer computer = (Computer) session.get(Computer.class, id);
		session.close();
		return computer;
	}

	@Override
	public void addLaptop(Laptop laptop) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		session.save(laptop);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public List<Laptop> laptopAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();

		Criteria criteria = session.createCriteria(Diagonal.class);

		return criteria.list();
	}

	@Override
	public void deleteLaptop(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		Laptop laptop = (Laptop) session.get(Laptop.class, id);
		session.delete(laptop);
		session.getTransaction().commit();
		session.close();		
	}

	@Override
	public void updateLaptop(Laptop newLaptop) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		Laptop laptop = (Laptop) session.get(Laptop.class, newLaptop.getId());
		session.getTransaction().begin();
		laptop.setInventoryId(newLaptop.getInventoryId());
		laptop.setBrand(newLaptop.getBrand());
		laptop.setCpu(newLaptop.getCpu());
		laptop.setDiagonal(newLaptop.getDiagonal());
		laptop.setHdd(newLaptop.getHdd());
		laptop.setInputDoc(newLaptop.getInputDoc());
		laptop.setModel(newLaptop.getModel());
		laptop.setRam(newLaptop.getRam());
		laptop.setUser(newLaptop.getUser());
		session.update(laptop);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Laptop getLaptop(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Laptop laptop = (Laptop) session.get(Laptop.class, id);
		session.close();
		return laptop;
	}

	@Override
	public void addPrinter(Printer printer) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		session.save(printer);
		session.getTransaction().commit();
		session.close();		
	}

	@Override
	public List<Printer> printerAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();

		Criteria criteria = session.createCriteria(Diagonal.class);

		return criteria.list();
	}

	@Override
	public void deletePrinter(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		Printer printer = (Printer) session.get(Printer.class, id);
		session.delete(printer);
		session.getTransaction().commit();
		session.close();	
	}

	@Override
	public void updatePrinter(Printer newPrinter) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		Printer printer = (Printer) session.get(Printer.class, newPrinter.getId());
		session.getTransaction().begin();
		printer.setAmountColor(newPrinter.getAmountColor());
		printer.setInputDoc(newPrinter.getInputDoc());
		printer.setModel(newPrinter.getModel());
		printer.setInventoryId(newPrinter.getInventoryId());
		printer.setModel(newPrinter.getModel());
		printer.setTypeCartridge(newPrinter.getTypeCartridge());
		printer.setTypePrinter(newPrinter.getTypePrinter());
		printer.setUser(newPrinter.getUser());
		session.update(printer);
		session.close();
	}

	@Override
	public Printer getPrinter(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Printer printer = (Printer) session.get(Printer.class, id);
		session.close();
		return printer;
	}

	@Override
	public void addTerminal(Terminal terminal) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		session.save(terminal);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public List<Terminal> terminalAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();

		Criteria criteria = session.createCriteria(Diagonal.class);

		return criteria.list();
	}

	@Override
	public void deleteTerminal(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		Terminal terminal = (Terminal) session.get(Terminal.class, id);
		session.delete(terminal);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void updateTerminal(Printer newTerminal) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		Terminal terminal = (Terminal) session.get(Terminal.class, newTerminal.getId());
		session.getTransaction().begin();
		terminal.setInputDoc(newTerminal.getInputDoc());
		terminal.setInventoryId(newTerminal.getInventoryId());
		terminal.setModel(newTerminal.getModel());
		terminal.setUser(newTerminal.getUser());
		session.update(terminal);
		session.close();
		
	}

	@Override
	public Terminal getTerminal(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Terminal terminal = (Terminal) session.get(Terminal.class, id);
		session.close();
		return terminal;
	}

	@Override
	public void addTerminalDocStation(TerminalDocStation terminalDocStation) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		session.save(terminalDocStation);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public List<TerminalDocStation> terminalDocStationAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();

		Criteria criteria = session.createCriteria(Diagonal.class);

		return criteria.list();
	}

	@Override
	public void deleteTerminalDocStation(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		TerminalDocStation terminalDocStation = (TerminalDocStation) session.get(TerminalDocStation.class, id);
		session.delete(terminalDocStation);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void updateTerminalDocStation(TerminalDocStation newTerminalDocStation) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		TerminalDocStation terminalDocStation = (TerminalDocStation) session.get(TerminalDocStation.class, newTerminalDocStation.getId());
		session.getTransaction().begin();
		terminalDocStation.setInputDoc(newTerminalDocStation.getInputDoc());
		terminalDocStation.setInventaryId(newTerminalDocStation.getInventaryId());
		terminalDocStation.setModel(newTerminalDocStation.getModel());
		terminalDocStation.setUser(newTerminalDocStation.getUser());
		session.update(terminalDocStation);
		session.close();
		
	}

	@Override
	public TerminalDocStation getTerminalDocStation(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		TerminalDocStation terminalDocStation = (TerminalDocStation) session.get(TerminalDocStation.class, id);
		session.close();
		return terminalDocStation;
	}

	@Override
	public void addWiFiDot(WiFiDot wifiDot) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		session.save(wifiDot);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public List<WiFiDot> wifiDotAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();

		Criteria criteria = session.createCriteria(Diagonal.class);

		return criteria.list();
	}

	@Override
	public void deleteWiFiDot(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		WiFiDot wifiDot = (WiFiDot) session.get(WiFiDot.class, id);
		session.delete(wifiDot);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void updateWiFiDot(WiFiDot newWiFiDot) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		WiFiDot wifiDot = (WiFiDot) session.get(WiFiDot.class, newWiFiDot.getId());
		session.getTransaction().begin();
		wifiDot.setInputDoc(newWiFiDot.getInputDoc());
		wifiDot.setInventoryId(newWiFiDot.getInventoryId());
		wifiDot.setModel(newWiFiDot.getModel());
		wifiDot.setUser(newWiFiDot.getUser());
		session.update(wifiDot);
		session.close();
		
	}

	@Override
	public WiFiDot getWiFiDot(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		WiFiDot wifiDot = (WiFiDot) session.get(WiFiDot.class, id);
		session.close();
		return wifiDot;
	}

}
