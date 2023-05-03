package consultorio.ventanas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import consultorio.Tools;

import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;

public class Menu extends JFrame {

	private JPanel contentPane;
	private int SEL;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		Calendar c = Calendar.getInstance();
		final Tools tool = new Tools();
		String dia = Integer.toString(c.get(Calendar.DATE));
		String mes = Integer.toString(c.get(Calendar.MONTH) + 1);
		String annio = Integer.toString(c.get(Calendar.YEAR));
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 742, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(255, 255, 255), 1, true));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel datosPane = new JPanel();
		datosPane.setBounds(10, 11, 279, 135);
		contentPane.add(datosPane);
		datosPane.setBorder(new TitledBorder(null, "Datos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		datosPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel labelPR = new JLabel("Corredores registrados:");
		labelPR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		datosPane.add(labelPR);
		
		JLabel outPR = new JLabel("" + (tool.getFolio()));
		outPR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		datosPane.add(outPR);
		
		JLabel labelFecha = new JLabel("Fecha:");
		labelFecha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		datosPane.add(labelFecha);
		
		JLabel outFecha = new JLabel(dia + " / " + mes + " / " + annio);
		outFecha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		datosPane.add(outFecha);
		
		JLabel lblFechaLimite = new JLabel("Fecha limite:");
		lblFechaLimite.setFont(new Font("Tahoma", Font.PLAIN, 12));
		datosPane.add(lblFechaLimite);
		
		JLabel lblDic = new JLabel("20 / Dic / 2022");
		lblDic.setFont(new Font("Tahoma", Font.PLAIN, 12));
		datosPane.add(lblDic);
		
		JPanel panel = new JPanel();
		panel.setLocation(10, 157);
		contentPane.add(panel);
		panel.setSize(new Dimension(279, 188));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ultimo corredor registrado", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel labelFolio = new JLabel("Folio:");
		labelFolio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(labelFolio);
		
		JLabel outFolio = new JLabel("" + tool.getFolio());
		outFolio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(outFolio);
		
		JLabel labelNombre = new JLabel("Nombre: ");
		labelNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(labelNombre);
		
		JLabel outNombre = new JLabel(tool.getNombre(tool.getFolio()));
		outNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(outNombre);
		
		JLabel labelFeDN = new JLabel("Fecha de nacimiento:");
		labelFeDN.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(labelFeDN);
		
		JLabel outFeDN = new JLabel(tool.getfeDeNa(tool.getFolio()));
		outFeDN.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(outFeDN);
		
		JLabel labelDomi = new JLabel("Domicilio:");
		labelDomi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(labelDomi);
		
		JLabel outDomi = new JLabel(tool.getDomi(tool.getFolio()));
		outDomi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(outDomi);
		
		JLabel labelTel = new JLabel("Telefono:");
		labelTel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(labelTel);
		
		JLabel outTel = new JLabel("" + tool.getTel(tool.getFolio()));
		outTel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(outTel);
		
		JLabel labeVer = new JLabel("Version: Dev - 0.0.1");
		labeVer.setFont(new Font("Tahoma", Font.PLAIN, 10));
		labeVer.setForeground(new Color(148, 148, 148));
		labeVer.setBounds(613, 333, 103, 14);
		contentPane.add(labeVer);
		
		JLabel labelTitulo = new JLabel("CARRERA 2022");
		labelTitulo.setForeground(new Color(114, 114, 114));
		labelTitulo.setFont(new Font("Arial Black", Font.BOLD, 35));
		labelTitulo.setBounds(353, 11, 311, 73);
		contentPane.add(labelTitulo);
		
		JButton btnNewButton = new JButton("Registrar corredor");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispatchEvent(new WindowEvent(new Registro(), WindowEvent.WINDOW_CLOSING));
				Registro registro = new Registro();
				registro.main(null);
			}
		});
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBounds(324, 156, 153, 47);
		contentPane.add(btnNewButton);
		
		JButton btnAtender = new JButton("Borrar");
		btnAtender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispatchEvent(new WindowEvent(new Registro(), WindowEvent.WINDOW_CLOSING));
				tool.borrarForm();
			}
		});
		btnAtender.setBackground(new Color(192, 192, 192));
		btnAtender.setBounds(532, 156, 153, 47);
		contentPane.add(btnAtender);
		
		JButton btnReporte = new JButton("Reporte");
		btnReporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tool.reporte(tool.getFolio());
			}
		});
		btnReporte.setBackground(new Color(192, 192, 192));
		btnReporte.setBounds(324, 236, 153, 47);
		contentPane.add(btnReporte);
		
		JButton btnNewButton_2_1 = new JButton("Salir");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2_1.setBackground(new Color(192, 192, 192));
		btnNewButton_2_1.setBounds(532, 236, 153, 47);
		contentPane.add(btnNewButton_2_1);
		
	}
	public void setSel(int num) {
		SEL = num;
	}
	public int getSel() {
		return SEL;
	}
}
