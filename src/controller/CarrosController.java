package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CarrosController implements ActionListener {
	
		private JButton btnCorrida;
		private JLabel lbCarro1;
		private JLabel lbCarro2;
		private JTextField vencedor;
		private JTextField perdedor;
		
		public CarrosController(JButton btnCorrida, JLabel lbCarro1, JLabel lbCarro2, JTextField vencedor, JTextField perdedor) {
			this.btnCorrida = btnCorrida;
			this.lbCarro1 = lbCarro1;
			this.lbCarro2 = lbCarro2;
			this.vencedor = vencedor;
			this.perdedor = perdedor;
		}
		
		private void botaoCorrida() {
			Thread carro1 = new ThreadCarros(btnCorrida, lbCarro1, vencedor, perdedor);
			Thread carro2  = new ThreadCarros(btnCorrida, lbCarro2, vencedor, perdedor);
			carro1.start();
			carro2.start();
		}
		
		
		public void actionPerformed(ActionEvent e) {
			botaoCorrida();
		}
		
	
}
