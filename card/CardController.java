package com.jse.card;
import com.jse.util.Constants;
import javax.swing.JOptionPane;

public class CardController {
	public static void main(String[] args) {
		CardServiceImpl cardService = new CardServiceImpl();
		Card card =null;
		while(true) {
			switch(JOptionPane.showInputDialog(Constants.MENU2)) {
			case "0": return;
			case "1": JOptionPane.showInputDialog(Constants.CARD_MENU);
				
			for(int i=0; i<3;i++) {
				
				String[] values = JOptionPane.showInputDialog(Constants.CARD_MENU).split(",");
				card = new Card();
				card.setKind(values[0]);
				card.setNumber(values[1]);
				cardService.add(card);
				
			}
			break;
			case "2":
				JOptionPane.showInputDialog(null, cardService);
			break;
			case "3":
				
				
			break;
			}
		}
}
}
