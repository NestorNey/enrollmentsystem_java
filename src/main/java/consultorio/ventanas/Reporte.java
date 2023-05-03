package consultorio.ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class Reporte extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args, final int[] num) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reporte frame = new Reporte(num);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Reporte(int[] num) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 393, 277);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Categoria 1 - de 10 a 12 años:");
		lblNewLabel.setBounds(5, 6, 183, 45);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblNewLabel);
		
		JLabel cate1 = new JLabel("" + num[0]);
		cate1.setBounds(240, 6, 127, 45);
		cate1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(cate1);
		
		JLabel lblNewLabel_2 = new JLabel("Categoria 2 - de 13 a 15 años:");
		lblNewLabel_2.setBounds(5, 51, 183, 45);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_2);
		
		JLabel cate2 = new JLabel("" + num[1]);
		cate2.setBounds(240, 51, 131, 45);
		cate2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(cate2);
		
		JLabel lblNewLabel_4 = new JLabel("Categoria 3 - de 16 a 18 años:");
		lblNewLabel_4.setBounds(5, 96, 183, 45);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_4);
		
		JLabel cate3 = new JLabel("" + num[2]);
		cate3.setBounds(240, 96, 131, 45);
		cate3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(cate3);
		
		JLabel lblNewLabel_6 = new JLabel("Categoria 4 - de 19 a 21 años:");
		lblNewLabel_6.setBounds(5, 141, 183, 45);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_6);
		
		JLabel cate4 = new JLabel("" + num[3]);
		cate4.setBounds(240, 141, 131, 45);
		cate4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(cate4);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispatchEvent(new WindowEvent(new Registro(), WindowEvent.WINDOW_CLOSING));
			}
		});
		btnRegresar.setBackground(Color.LIGHT_GRAY);
		btnRegresar.setBounds(274, 204, 93, 23);
		contentPane.add(btnRegresar);
	}
}
