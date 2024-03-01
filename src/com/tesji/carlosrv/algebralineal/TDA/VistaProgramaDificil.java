package com.tesji.carlosrv.algebralineal.TDA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.tesji.carlosrv.algebralineal.funcionamiento.ProgramaDificilHechoPorCarlos;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class VistaProgramaDificil extends JFrame {

	private JPanel contentPane;
	private JTextField Uno;
	private JTextField Dos;
	private JTextField Tres;
	private JTextField Cuatro;
	private JTextField Cinco;
	private JTextField Seis;
	private JTextField Siete;
	private JTextField Ocho;
	private JTextField Nueve;
	private JTextField Diez;
	private JTextField Once;
	private JTextField Doce;
	private JTextField UnoCarlos;
	private JTextField DosCarlos;
	private JTextField TresCarlos;
	private JTextField CuatroCarlos;
	private JTextField CincoCarlos;
	private JTextField SeisCarlos;
	private JTextField SieteCarlos;
	private JTextField OchoCarlos;
	private JTextField NueveCarlos;
	private JTextField DiezCarlos;
	private JTextField OnceCarlos;
	private JTextField DoceCarlos;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaProgramaDificil frame = new VistaProgramaDificil();
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
	public VistaProgramaDificil() {
		setTitle("GAUSS JORDAN TRABAJO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 735, 266);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(25, 25, 112));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Uno = new JTextField();
		Uno.setBounds(28, 90, 47, 20);
		contentPane.add(Uno);
		Uno.setColumns(10);

		Dos = new JTextField();
		Dos.setColumns(10);
		Dos.setBounds(85, 90, 47, 20);
		contentPane.add(Dos);

		Tres = new JTextField();
		Tres.setColumns(10);
		Tres.setBounds(142, 90, 47, 20);
		contentPane.add(Tres);

		Cuatro = new JTextField();
		Cuatro.setColumns(10);
		Cuatro.setBounds(199, 90, 47, 20);
		contentPane.add(Cuatro);

		Cinco = new JTextField();
		Cinco.setColumns(10);
		Cinco.setBounds(28, 121, 47, 20);
		contentPane.add(Cinco);

		Seis = new JTextField();
		Seis.setColumns(10);
		Seis.setBounds(85, 121, 47, 20);
		contentPane.add(Seis);

		Siete = new JTextField();
		Siete.setColumns(10);
		Siete.setBounds(142, 121, 47, 20);
		contentPane.add(Siete);

		Ocho = new JTextField();
		Ocho.setColumns(10);
		Ocho.setBounds(199, 121, 47, 20);
		contentPane.add(Ocho);

		Nueve = new JTextField();
		Nueve.setColumns(10);
		Nueve.setBounds(28, 152, 47, 20);
		contentPane.add(Nueve);

		Diez = new JTextField();
		Diez.setColumns(10);
		Diez.setBounds(85, 152, 47, 20);
		contentPane.add(Diez);

		Once = new JTextField();
		Once.setColumns(10);
		Once.setBounds(142, 152, 47, 20);
		contentPane.add(Once);

		Doce = new JTextField();
		Doce.setColumns(10);
		Doce.setBounds(199, 152, 47, 20);
		contentPane.add(Doce);

		JLabel lblY = new JLabel("Y");
		lblY.setForeground(new Color(135, 206, 235));
		lblY.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblY.setBounds(669, 122, 48, 14);
		contentPane.add(lblY);

		JLabel lblZ = new JLabel("Z");
		lblZ.setForeground(new Color(135, 206, 235));
		lblZ.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblZ.setBounds(669, 153, 48, 14);
		contentPane.add(lblZ);

		JLabel Eti_dinamic = new JLabel("AQU\u00CD SE MOSTRAR\u00C1 EL RESULTADO DE TU MATRIZ");
		Eti_dinamic.setForeground(new Color(135, 206, 250));
		Eti_dinamic.setFont(new Font("Arial Black", Font.PLAIN, 13));
		Eti_dinamic.setBounds(323, 56, 372, 23);
		contentPane.add(Eti_dinamic);

		UnoCarlos = new JTextField();
		UnoCarlos.setEditable(false);
		UnoCarlos.setColumns(10);
		UnoCarlos.setBounds(394, 90, 47, 20);
		contentPane.add(UnoCarlos);

		DosCarlos = new JTextField();
		DosCarlos.setEditable(false);
		DosCarlos.setColumns(10);
		DosCarlos.setBounds(451, 90, 47, 20);
		contentPane.add(DosCarlos);

		TresCarlos = new JTextField();
		TresCarlos.setEditable(false);
		TresCarlos.setColumns(10);
		TresCarlos.setBounds(508, 90, 47, 20);
		contentPane.add(TresCarlos);

		CuatroCarlos = new JTextField();
		CuatroCarlos.setEditable(false);
		CuatroCarlos.setColumns(10);
		CuatroCarlos.setBounds(565, 90, 94, 20);
		contentPane.add(CuatroCarlos);

		CincoCarlos = new JTextField();
		CincoCarlos.setEditable(false);
		CincoCarlos.setColumns(10);
		CincoCarlos.setBounds(394, 121, 47, 20);
		contentPane.add(CincoCarlos);

		SeisCarlos = new JTextField();
		SeisCarlos.setEditable(false);
		SeisCarlos.setColumns(10);
		SeisCarlos.setBounds(451, 121, 47, 20);
		contentPane.add(SeisCarlos);

		SieteCarlos = new JTextField();
		SieteCarlos.setEditable(false);
		SieteCarlos.setColumns(10);
		SieteCarlos.setBounds(508, 121, 47, 20);
		contentPane.add(SieteCarlos);

		OchoCarlos = new JTextField();
		OchoCarlos.setEditable(false);
		OchoCarlos.setColumns(10);
		OchoCarlos.setBounds(565, 121, 94, 20);
		contentPane.add(OchoCarlos);

		NueveCarlos = new JTextField();
		NueveCarlos.setEditable(false);
		NueveCarlos.setColumns(10);
		NueveCarlos.setBounds(394, 152, 47, 20);
		contentPane.add(NueveCarlos);

		DiezCarlos = new JTextField();
		DiezCarlos.setEditable(false);
		DiezCarlos.setColumns(10);
		DiezCarlos.setBounds(451, 152, 47, 20);
		contentPane.add(DiezCarlos);

		OnceCarlos = new JTextField();
		OnceCarlos.setEditable(false);
		OnceCarlos.setColumns(10);
		OnceCarlos.setBounds(508, 152, 47, 20);
		contentPane.add(OnceCarlos);

		DoceCarlos = new JTextField();
		DoceCarlos.setEditable(false);
		DoceCarlos.setColumns(10);
		DoceCarlos.setBounds(565, 152, 94, 20);
		contentPane.add(DoceCarlos);

		JButton btnCalcular = new JButton("CALCULAR MATRIZ ");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double[][] matrizIdentidadCarlos = new double[3][4];
				ProgramaDificilHechoPorCarlos objeto = new ProgramaDificilHechoPorCarlos();

				try {
					objeto.setUno(Integer.parseInt(Uno.getText()));
					objeto.setDos(Integer.parseInt(Dos.getText()));
					objeto.setTres(Integer.parseInt(Tres.getText()));
					objeto.setCuatro(Integer.parseInt(Cuatro.getText()));
					objeto.setCinco(Integer.parseInt(Cinco.getText()));
					objeto.setSeis(Integer.parseInt(Seis.getText()));
					objeto.setSiete(Integer.parseInt(Siete.getText()));
					objeto.setOcho(Integer.parseInt(Ocho.getText()));
					objeto.setNueve(Integer.parseInt(Nueve.getText()));
					objeto.setDiez(Integer.parseInt(Diez.getText()));
					objeto.setOnce(Integer.parseInt(Once.getText()));
					objeto.setDoce(Integer.parseInt(Doce.getText()));
				} catch (NumberFormatException e3) {

					JOptionPane.showMessageDialog(rootPane, "DEBE DIGITAR UN NUMERO"
							+ "\n RECUERDE QUE SOLO PUEDE DIGITAR NUMEROS Y NO DEBE \nDEJAR " + "ESPACIOS EN BLANCO");
				}

				objeto.Imprimir();
				Eti_dinamic.setText("LA MATRIZ IDENTIDAD ES LA SIGUIENTE: ");

				matrizIdentidadCarlos = objeto.enviarValoresCarlos();

				UnoCarlos.setText("" + matrizIdentidadCarlos[0][0]);
				DosCarlos.setText("" + matrizIdentidadCarlos[0][1]);
				TresCarlos.setText("" + matrizIdentidadCarlos[0][2]);
				CuatroCarlos.setText("" + matrizIdentidadCarlos[0][3]);
				CincoCarlos.setText("" + matrizIdentidadCarlos[1][0]);
				SeisCarlos.setText("" + matrizIdentidadCarlos[1][1]);
				SieteCarlos.setText("" + matrizIdentidadCarlos[1][2]);
				OchoCarlos.setText("" + matrizIdentidadCarlos[1][3]);
				NueveCarlos.setText("" + matrizIdentidadCarlos[2][0]);
				DiezCarlos.setText("" + matrizIdentidadCarlos[2][1]);
				OnceCarlos.setText("" + matrizIdentidadCarlos[2][2]);
				DoceCarlos.setText("" + matrizIdentidadCarlos[2][3]);
			}

		});
		btnCalcular.setBounds(45, 183, 163, 23);
		contentPane.add(btnCalcular);

		JLabel lblNewLabel_1 = new JLabel("X");
		lblNewLabel_1.setForeground(new Color(135, 206, 250));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(45, 65, 15, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblY_1 = new JLabel("Y");
		lblY_1.setForeground(new Color(135, 206, 235));
		lblY_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblY_1.setBounds(102, 65, 48, 14);
		contentPane.add(lblY_1);

		JLabel lblZ_1 = new JLabel("Z");
		lblZ_1.setForeground(new Color(135, 206, 235));
		lblZ_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblZ_1.setBounds(160, 65, 48, 14);
		contentPane.add(lblZ_1);

		JLabel lblI = new JLabel("i\r\n");
		lblI.setForeground(new Color(135, 206, 235));
		lblI.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblI.setBounds(218, 65, 15, 14);
		contentPane.add(lblI);

		JLabel lblNewLabel_2 = new JLabel("X");
		lblNewLabel_2.setForeground(new Color(135, 206, 235));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(669, 91, 15, 14);
		contentPane.add(lblNewLabel_2);

		JLabel Eti_dinamic_1 = new JLabel("PROGRAMA DE GAUSS JORDAN");
		Eti_dinamic_1.setForeground(new Color(173, 216, 230));
		Eti_dinamic_1.setFont(new Font("Arial Black", Font.PLAIN, 25));
		Eti_dinamic_1.setBounds(10, 11, 457, 43);
		contentPane.add(Eti_dinamic_1);

		JButton btn_Nuevo = new JButton("NUEVO");
		btn_Nuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Uno.setText(null);
				Dos.setText(null);
				Tres.setText(null);
				Cuatro.setText(null);
				Cinco.setText(null);
				Seis.setText(null);
				Siete.setText(null);
				Ocho.setText(null);
				Nueve.setText(null);
				Diez.setText(null);
				Once.setText(null);
				Doce.setText(null);
				
				
				UnoCarlos.setText(null);
				DosCarlos.setText(null);
				TresCarlos.setText(null);
				CuatroCarlos.setText(null);
				CincoCarlos.setText(null);
				SeisCarlos.setText(null);
				SieteCarlos.setText(null);
				OchoCarlos.setText(null);
				NueveCarlos.setText(null);
				DiezCarlos.setText(null);
				OnceCarlos.setText(null);
				DoceCarlos.setText(null);
			}
		});
		btn_Nuevo.setBounds(394, 183, 89, 23);
		contentPane.add(btn_Nuevo);

		JButton btn_Salir = new JButton("SALIR");
		btn_Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(ABORT);
			}
		});
		btn_Salir.setBounds(594, 183, 89, 23);
		contentPane.add(btn_Salir);

		lblNewLabel = new JLabel("CARLOS RICARDO VERTIZ 3302");
		lblNewLabel.setForeground(new Color(135, 206, 235));
		lblNewLabel.setBounds(508, 11, 187, 14);
		contentPane.add(lblNewLabel);

	}
}
