package com.jse.phone;

public class PhoneServiceImpl implements PhoneService {
	private Phone[] phones;
	private CellPhone[] cellPhones;
	private Iphone[] iphones;
	private GalaxyNote[] galaxyNotes;
	private int count;
	
	
	public PhoneServiceImpl() {
		phones = new Phone[3];
		cellPhones = new CellPhone[3];
		iphones = new Iphone[3];
		galaxyNotes = new GalaxyNote[3];
		count = 0;
	}


	@Override
	public Iphone[] iPhoneList() {
		// TODO Auto-generated method stub
		return iphones;
	}


	@Override
	public GalaxyNote[] galaxyNoteList() {
		// TODO Auto-generated method stub
		return galaxyNotes;
	}


	@Override
	public Phone detail(Phone phone) {
		// TODO Auto-generated method stub
		return phone;
	}


	@Override
	public Phone detail(Iphone iphone) {
		// TODO Auto-generated method stub
		return iphone;
	}


	@Override
	public Phone detail(GalaxyNote galaxyNote) {
		// TODO Auto-generated method stub
		return galaxyNote;
	}


	@Override
	public int count() {
		// TODO Auto-generated method stub
		return count;
	}


	@Override
	public void update(Phone phone) {
		
	}


	@Override
	public void update(Iphone iphone) {
		
	}


	@Override
	public void update(GalaxyNote galaxyNote) {
		
	}


	@Override
	public void delete(Phone phone) {
		
	}


	@Override
	public void delete(Iphone iphone) {
		
	}


	@Override
	public void delete(GalaxyNote galaxyNote) {
		
	}

	@Override
	public void add(Phone phone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(CellPhone phone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(Iphone phone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(GalaxyNote phone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Phone[] phoneList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CellPhone[] cellPhoneList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
