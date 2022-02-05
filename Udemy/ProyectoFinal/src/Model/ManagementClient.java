package Model;

import java.util.ArrayList;
import java.util.Calendar;

public class ManagementClient {
	private Client client;
	private Bill bill;
	private ArrayList<Client>clients;
	private ArrayList<Bill> bills;
	
	public ManagementClient(){
		
		clients = new ArrayList<Client>(); 
		bills = new ArrayList<Bill>();
	}
	
	public Client findClient(String CC) {
		for(Client client : clients) {
			if(client.getCC().equals(CC)) {
				return client;
			}
		}
		return null;
	}
	
	public boolean addClients(String nameC, String CC) {
		client=new Client();
		if(findClient(CC)==null) {
			clients.add(new Client(nameC, CC));
			return true;
		}else {
		return false;
		}
	}
//	public String addBill(Client client){
//		
//		bills.add(new Bill("B"+contadorFactura+"", new GregorianCalendar(),client));
//		contadorFactura++;
//		return bills.size()>0?bills.get(bills.size()-1).getNumber():bills.get(0).getNumber();
//}
	public String addBill(Client client) {
		int contadorFactura=0;
		bills.add(new Bill());
		contadorFactura++;
		return bills.size()>0?bills.get(bills.size()-1).getNumber():bills.get(0).getNumber();	}
	
	public Bill findBill(String code) {
		// TODO Auto-generated method stub
		for(int i = 0; i<bills.size(); i++) {
			if(code.equals(bills.get(i).getNumber())) {
				return 	bills.get(i);			
			}
		}
		return null;
	}

	public ArrayList<Client> getClients(){
		return (ArrayList<Client>)clients.clone();
	}
	
	public ArrayList<Bill> getBills(){
		return (ArrayList<Bill>)bills.clone();
	}
	
}
