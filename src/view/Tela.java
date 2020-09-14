package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controller.CarrosController;

public class Tela extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbCarro1 = new JLabel("Carro 1");
		lbCarro1.setHorizontalAlignment(SwingConstants.CENTER);
		lbCarro1.setBounds(10, 24, 73, 44);
		contentPane.add(lbCarro1);
		
		Icon icon1 = new ImageIcon(new ImageIcon("C:\\Users\\knmar\\eclipse-workspace\\SO1_Threads_Exercicio05\\relampago_marquinhos.png").getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT));
		lbCarro1.setIcon(icon1);
	
		
		JLabel lbCarro2 = new JLabel("Carro 2");
		lbCarro2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbCarro2.setForeground(Color.BLUE);
		lbCarro2.setHorizontalAlignment(SwingConstants.CENTER);
		lbCarro2.setBounds(10, 136, 81, 44);
		contentPane.add(lbCarro2);
		
		Icon icon2 = new ImageIcon(new ImageIcon("C:\\Users\\knmar\\eclipse-workspace\\SO1_Threads_Exercicio05\\garry.png").getImage().getScaledInstance(90, 50, Image.SCALE_DEFAULT));
		lbCarro2.setIcon(icon2);
		
		JLabel lblNewLabel_1 = new JLabel("____________________________________________|||||");
		lblNewLabel_1.setBounds(44, 93, 399, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnCorrer = new JButton("Correr!!");
		btnCorrer.setBounds(147, 224, 89, 23);
		contentPane.add(btnCorrer);
		
		textField = new JTextField();
		textField.setBounds(378, 210, 173, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(378, 250, 173, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Vencedor:");
		lblNewLabel.setBounds(313, 213, 68, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Perdedor:");
		lblNewLabel_2.setBounds(313, 253, 68, 14);
		contentPane.add(lblNewLabel_2);
		
		CarrosController carroscontroller = new CarrosController (btnCorrer, lbCarro1, lbCarro2, textField, textField_1);
		btnCorrer.addActionListener(carroscontroller);
		
		
		}
			
		
	}

