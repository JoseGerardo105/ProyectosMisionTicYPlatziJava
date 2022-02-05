package Model;

import java.util.ArrayList;
import java.util.Calendar;

/**
*
* @author Andres Mesa - Nairo Pérez
*/

public class Client {
	private String nameC;
	private String CC;
	private ArrayList<Bill> bills;
	
	public Client(String nameC, String CC) {
		this.nameC = nameC;
		this.CC = CC;
		bills = new ArrayList<>();
	}
	
	public Client() {
		
	}

	public String getNameC() {
		return nameC;
	}

	public void setNameC(String nameC) {
		this.nameC = nameC;
	}

	public String getCC() {
		return CC;
	}

	public void setCC(String cC) {
		CC = cC;
	}
	
	public boolean addBill(String number,Client client) {
		bills.add(new Bill());
		return true;
	}
	
	public ArrayList<Bill> getBill(){
		return (ArrayList<Bill>)bills.clone();
	}
	
}
