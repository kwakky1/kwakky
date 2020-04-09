package com.jse.phone;

public class PhoneService {
	private Phone[] phones;
	private CellPhone[] cellPhones;
	private Iphone[] iphones;
	private GalaxyNote[] galaxyNotes;
	private int count;
	
	
	public PhoneService() {
		phones = new Phone[3];
		cellPhones = new CellPhone[3];
		iphones = new Iphone[3];
		galaxyNotes = new GalaxyNote[3];
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
	
	public Iphone[] getIphones() {
		return iphones;
	}
	public void setIphones(Iphone[] iphones) {
		this.iphones = iphones;
	}
	public GalaxyNote[] getGalaxyNotes() {
		return galaxyNotes;
	}
	public void setGalaxyNotes(GalaxyNote[] galaxyNotes) {
		this.galaxyNotes = galaxyNotes;
	}
	public void add(Phone phone){
		phones[count] = phone;
		count++;
	}
	public void addCellPhone(CellPhone phone) {
		cellPhones[count] = phone;
		count++;
	}
	public void addSearch(Iphone phone) {
		iphones[count] = phone;
		count++;
	}
	public void addGalaxyNote(GalaxyNote phone) {
		galaxyNotes[count] = phone;
		count++;
	}
}
