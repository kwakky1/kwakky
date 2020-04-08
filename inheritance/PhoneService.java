package com.jse.inheritance;

public class PhoneService {
	private Phone[] phones;
	private CellPhone[] cellPhones;
	private int count;
	
	
	public PhoneService() {
		phones = new Phone[3];
		cellPhones = new CellPhone[3];
		count = 0;
	}
	public void setPhones(Phone[] phones) {
		this.phones = phones;
	}
	public Phone[] getPhones() {
		return phones;
	}
	
	public CellPhone[] getCellPhones() {
		return cellPhones;
	}
	public void setCellPhones(CellPhone[] cellPhones) {
		this.cellPhones = cellPhones;
	}
	
	public void add(Phone phone){
		phones[count] = phone;
		count++;
	}
	public void addCellPhone(CellPhone phone) {
		cellPhones[count] = phone;
		count++;
	}
}
