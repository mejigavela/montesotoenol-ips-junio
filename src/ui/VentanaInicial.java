package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import data.GestorBD;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaInicial extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnGenerarBD;
	private JButton btnCargarDatos;
	private JButton btnSolicitarEnvio;
	private JButton btnVerEnvios;
	private JButton btnSeguimiento;
	private JButton btnAsignarTarifas;
	private JButton btnTransportista;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInicial frame = new VentanaInicial();
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
	public VentanaInicial() {
		setResizable(false);
		setTitle("Gestión De Paquetes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(7, 1, 0, 0));
		
		contentPane.add(getBtnGenerarBD());
		
		contentPane.add(getBtnCargarDatos());
		
		contentPane.add(getBtnSolicitarEnvio());
		
		contentPane.add(getBtnVerEnvios());
		
		contentPane.add(getBtnSeguimiento());
		contentPane.add(getBtnAsignarTarifas());
		contentPane.add(getBtnTransportista());
	}

	private JButton getBtnGenerarBD() {
		if (btnGenerarBD == null) {
			btnGenerarBD = new JButton("Generar Base De Datos En Blanco");
			btnGenerarBD.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GestorBD.generarBaseDeDatosEnBlanco();
				}
			});
		}
		return btnGenerarBD;
	}
	private JButton getBtnCargarDatos() {
		if (btnCargarDatos == null) {
			btnCargarDatos = new JButton("Cargar Datos Inicales");
			btnCargarDatos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GestorBD.cargarDatosIniciales();
				}
			});
		}
		return btnCargarDatos;
	}
	private JButton getBtnSolicitarEnvio() {
		if (btnSolicitarEnvio == null) {
			btnSolicitarEnvio = new JButton("(HU1) Solicitar Envío");
			btnSolicitarEnvio.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mostrarVentanaSolicitarPedido();
				}
			});
		}
		return btnSolicitarEnvio;
	}
	private JButton getBtnVerEnvios() {
		if (btnVerEnvios == null) {
			btnVerEnvios = new JButton("(HU2) Ver Todos Mis Envíos");
			btnVerEnvios.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mostrarVentanaVerEnvios();
				}
			});
		}
		return btnVerEnvios;
	}
	private JButton getBtnSeguimiento() {
		if (btnSeguimiento == null) {
			btnSeguimiento = new JButton("(HU3, HU4) Realizar Seguimiento De Envío");
			btnSeguimiento.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mostrarVentanaSeguimiento();
				}
			});
		}
		return btnSeguimiento;
	}
	
	// Comportamiento
	private void mostrarVentanaVerEnvios() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaVerEnvios frame = new VentanaVerEnvios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void mostrarVentanaSolicitarPedido() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaSolicitarEnvio frame = new VentanaSolicitarEnvio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void mostrarVentanaSeguimiento() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaSeguimiento frame = new VentanaSeguimiento();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void mostrarVentanaTarifas() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaTarifas frame = new VentanaTarifas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private JButton getBtnAsignarTarifas() {
		if (btnAsignarTarifas == null) {
			btnAsignarTarifas = new JButton("(HU5, HU6) Asignar Tarifas");
			btnAsignarTarifas.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mostrarVentanaTarifas();
				}
			});
		}
		return btnAsignarTarifas;
	}
	private JButton getBtnTransportista() {
		if (btnTransportista == null) {
			btnTransportista = new JButton("(HU7, HU8) Panel De Transportista");
			btnTransportista.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mostrarVentanaTransportista();
				}
			});
		}
		return btnTransportista;
	}
	
	private void mostrarVentanaTransportista() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaTransportista frame = new VentanaTransportista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
