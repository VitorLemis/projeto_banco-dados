package Estudo_java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerEvent implements ActionListener{
	Eventos ev;
	ActionListenerEvent() {
		ev = new Eventos();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == MainWindow.btnJogar) {
			ev.jogar();
		}else if (e.getSource() ==  MainWindow.btnSair) {
			ev.sair();
		}
	}
}
