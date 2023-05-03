package consultorio.ventanas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;

import consultorio.baseDeDatos.ModRegistro;
import consultorio.Tools;

import javax.swing.border.EtchedBorder;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import javax.swing.UIManager;
import java.awt.Rectangle;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JList;
import javax.swing.JComboBox;

public class Registro extends JFrame {

	private JPanel contentPane;
	private JTextField fieldNombre;
	private JTextField fieldFeNa;
	private JTextField fieldDomi;
	private JTextField fieldTel;
	private JTextField fieldPade;
	private JTextField fieldTraMe;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
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
	public Registro() {
		setBackground(new Color(255, 255, 255));
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 511, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelFormu = new JLabel("Formulario");
		labelFormu.setBounds(201, 10, 93, 26);
		labelFormu.setFont(new Font("SansSerif", Font.PLAIN, 20));
		contentPane.add(labelFormu);
		
		JPanel panelPerso = new JPanel();
		panelPerso.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Personales", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelPerso.setBounds(10, 81, 475, 191);
		contentPane.add(panelPerso);
		panelPerso.setLayout(new GridLayout(0, 2, 0, 5));
		
		JLabel labelFolio = new JLabel("Folio: ");
		panelPerso.add(labelFolio);
		labelFolio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel outFolio = new JLabel("21351");
		panelPerso.add(outFolio);
		outFolio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel labelNombre = new JLabel("Nombre:");
		labelNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelPerso.add(labelNombre);
		
		fieldNombre = new JTextField();
		panelPerso.add(fieldNombre);
		fieldNombre.setColumns(10);
		
		JLabel labelFeNa = new JLabel("Fecha de nacimiento:");
		labelFeNa.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelPerso.add(labelFeNa);
		
		fieldFeNa = new JTextField();
		panelPerso.add(fieldFeNa);
		fieldFeNa.setColumns(10);
		
		JLabel labelDomi = new JLabel("Domicilio:");
		labelDomi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelPerso.add(labelDomi);
		
		fieldDomi = new JTextField();
		panelPerso.add(fieldDomi);
		fieldDomi.setColumns(10);
		
		JLabel labelTel = new JLabel("Telefono:");
		labelTel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelPerso.add(labelTel);
		
		fieldTel = new JTextField();
		panelPerso.add(fieldTel);
		fieldTel.setColumns(10);
		
		JLabel labelCategoria = new JLabel("Categoria");
		labelCategoria.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelPerso.add(labelCategoria);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.addItem("1 - de 10 a 12 años");
		comboBox.addItem("2 - de 13 a 15 años");
		comboBox.addItem("3 - de 16 a 18 años");
		comboBox.addItem("4 - de 19 a 21 años");
		panelPerso.add(comboBox);
		
		JPanel panelClini = new JPanel();
		panelClini.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Clinicos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelClini.setBounds(10, 308, 475, 84);
		contentPane.add(panelClini);
		panelClini.setLayout(new GridLayout(0, 2, 0, 5));
		
		JLabel labelPade = new JLabel("Padecimientos:");
		labelPade.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelClini.add(labelPade);
		
		fieldPade = new JTextField();
		fieldPade.setColumns(10);
		panelClini.add(fieldPade);
		
		JLabel labelTraMe = new JLabel("Tratamientos medicos:");
		labelTraMe.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelClini.add(labelTraMe);
		
		fieldTraMe = new JTextField();
		fieldTraMe.setColumns(10);
		panelClini.add(fieldTraMe);
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.setActionCommand("comprar");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBorder(new LineBorder(new Color(182, 182, 182), 3, true));
		btnNewButton.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tools tool = new Tools();
				ModRegistro registro = new ModRegistro();
				Menu menu = new Menu();
				int entero = 0;
				try{
					entero = Integer.parseInt(fieldTel.getText());
				} catch (Exception e) {
					e.printStackTrace();
					entero = 0;
				}
				registro.agregarRegistro(comboBox.getSelectedIndex(),entero,fieldFeNa.getText(),
						fieldDomi.getText(),fieldNombre.getText(),fieldPade.getText(),fieldTraMe.getText());
				dispatchEvent(new WindowEvent(new Registro(), WindowEvent.WINDOW_CLOSING));
				menu.main(null);
			}
		});
		btnNewButton.setBounds(201, 403, 93, 35);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Nota: Intorucir la fecha con el fomato dd/mm/aa");
		lblNewLabel.setForeground(new Color(103, 103, 103));
		lblNewLabel.setBounds(10, 56, 475, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNotaParaIngresar = new JLabel("Nota: Para ingresar un nuevo padecimiento o tratamiento coloque \"-\"");
		lblNotaParaIngresar.setForeground(new Color(103, 103, 103));
		lblNotaParaIngresar.setBounds(10, 283, 475, 14);
		contentPane.add(lblNotaParaIngresar);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
