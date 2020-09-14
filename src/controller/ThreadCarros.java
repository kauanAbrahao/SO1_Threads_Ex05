package controller;

import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ThreadCarros extends Thread {
	
	private static int colocacao = 0;
	private JButton btnCorrida;
	private JLabel lbCarro;
	private JTextField vencedor;
	private JTextField perdedor;
	
	public ThreadCarros(JButton btnCorrida, JLabel lbCarro, JTextField vencedor, JTextField perdedor) {
		this.btnCorrida = btnCorrida;
		this.lbCarro = lbCarro;
		this.vencedor = vencedor;
		this.perdedor = perdedor;
	}
	
	public void run() {
		aceleraCarro();
		
	}
	
	private void aceleraCarro() {
		btnCorrida.setEnabled(false);
		
		Rectangle pos;
		pos = this.lbCarro.getBounds();
		this.lbCarro.setBounds(pos);
		int distancia = 0;
		while(pos.x < 300) {
			distancia = distancia + (int) (Math.random() * (15-1)+1);
			pos.x = pos.x + distancia;
			if (distancia < 300) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			lbCarro.setBounds(pos);
 		}
		

		colocacao++;
		if (colocacao == 1) {
			if (lbCarro.getText().contains("1")) {
				vencedor.setText("Relâmpago marquinhos!");
				perdedor.setText("Garry!!");
			}
			else {
				vencedor.setText("Garry!!!");
				perdedor.setText("Relâmpago marquinhos!");
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			pos.x = 0;
			lbCarro.setBounds(pos);
		}
		while(colocacao!= 2) {
			
		}
		pos.x = 0;
		lbCarro.setBounds(pos);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		vencedor.setText("");
		perdedor.setText("");
		btnCorrida.setEnabled(true);
		colocacao = 0;
		
		
		
	}
	

}
