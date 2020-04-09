package com.jse.inheritance;
import com.jse.util.Constants;
import javax.swing.JOptionPane;

public class Engine {
	
	public static void main(String[] args) {
		PhoneService phoneservice = new PhoneService();
		String message;
		while (true) {
			System.out.println();
			switch (JOptionPane.showInputDialog(Constants.MENU)) {
			case "0":
				return;
			case "1":

				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.PHONE_MENU).split(",");
					phoneservice.add(new Phone(values[0], values[1], values[2]));
				}
				break;
			case "2":
				Phone[] phones = phoneservice.getPhones();
				message = "";
				for (int i = 0; i < 3; i++) {
					message += phones[i].toString()+"\t";

				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "3":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.CELLPHONE_MENU).split(",");
					phoneservice.addCellPhone(new CellPhone(values[0], values[1], values[2], true));
				}
				break;
			case "4":
				CellPhone[] cellPhones = phoneservice.getCellPhones();
				message = "";
				for (int i = 0; i < 3; i++) {
					message += cellPhones[i].toString()+"\t";				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "5":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.IPHONE_MENU).split(",");
					phoneservice.addSearch(new Iphone(values[0], values[1], values[2], true, values[3]));
				}
				break;
			case "6":
				Iphone[] iPhones = phoneservice.getIphones();
				message = "";
				for (int i = 0; i < 3; i++) {
					message += iPhones[i].toString()+"\t";
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "7":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.GALAXYNOTE_MENU).split(",");
					phoneservice.addGalaxyNote(new GalaxyNote(values[0], values[1], values[2], true, values[3],values[4]));
				}
				break;
			case "8":
				GalaxyNote[] galaxyNotes = phoneservice.getGalaxyNotes();
				message = "";
				for (int i = 0; i < 3; i++) {
					message += galaxyNotes[i].toString()+"\t";
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			}
		}
	}
}
