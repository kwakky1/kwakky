package com.jse.phone;

public interface PhoneService {
	public void add(Phone phone);
	public void add(CellPhone phone);
	public void add(Iphone phone);
	public void add(GalaxyNote phone);
	
	public Phone[] phoneList();
	public CellPhone[] cellPhoneList();
	public Iphone[] iPhoneList();
	public GalaxyNote[] galaxyNoteList();
	
	public Phone detail(Iphone phone);
	public Phone detail(GalaxyNote phone);
	
	public int count();
	
	public void update(Iphone phone);
	public void update(GalaxyNote phone);
	
	public void delete(Iphone iphone);
	public void delete(GalaxyNote galaxyNote);
	
}
