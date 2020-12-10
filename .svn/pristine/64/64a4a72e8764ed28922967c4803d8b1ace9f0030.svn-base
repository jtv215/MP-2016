package org.mp.sesion08;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.EventObject;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 * The Class CalculadoraSencilla.
 */
public class CalculadoraSencilla extends JFrame {

	/** The content pane. */
	private JPanel contentPane;

	/** The text field. */
	private JTextField textField;

	/** The nueva operacion. */
	private boolean nuevaOperacion = true;

	/** The resultado. */
	private double resultado;

	/** The valor. */
	private String valor;

	/**
	 * Launch the application.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraSencilla frame = new CalculadoraSencilla();
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
	public CalculadoraSencilla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 375);
		setResizable(false);
		setTitle("Calculadora Sencilla");

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setBackground(new Color(0, 128, 128));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("0");
		textField.setEditable(false);
		textField.setBounds(10, 11, 324, 31);
		contentPane.add(textField);
		textField.setColumns(10);

		botonesNumeros("0", 10, 227);
		botonesNumeros("1", 10, 171);
		botonesNumeros("2", 89, 171);
		botonesNumeros("3", 168, 171);
		botonesNumeros("4", 10, 114);
		botonesNumeros("5", 89, 114);
		botonesNumeros("6", 168, 114);
		botonesNumeros("7", 10, 58);
		botonesNumeros("8", 89, 58);
		botonesNumeros("9", 168, 58);
		botonesNumeros(".", 89, 227);

		botonesOperacion("+", 247, 227, Color.RED);
		botonesOperacion("-", 247, 171, Color.RED);
		botonesOperacion("*", 247, 58, Color.RED);
		botonesOperacion("/", 247, 114, Color.RED);
		botonesOperacion("%", 168, 227, Color.RED);
		botonesOperacion("CE", 168, 284, Color.BLUE);
		botonesOperacion("=", 247, 284, Color.BLUE);

	}

	/**
	 * Botones numeros.
	 *
	 * @param tecla the tecla
	 * @param x the x
	 * @param y the y
	 */
	private void botonesNumeros(String tecla, int x, int y) {
		JButton button = new JButton(tecla);
		button.setBounds(x, y, 80, 51);
		button.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent evento) {
				pulsacionNumero(((JButton) evento.getSource()).getText());
			}

		});

		contentPane.add(button);

	}

	/**
	 * Botones operacion.
	 *
	 * @param tecla the tecla
	 * @param x the x
	 * @param y the y
	 * @param color the color
	 */
	private void botonesOperacion(String tecla, int x, int y, Color color) {
		JButton button = new JButton(tecla);
		button.setBounds(x, y, 80, 51);
		button.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent evento) {
				pulsacionOperacion(((JButton) evento.getSource()).getText());
			}
		});
		contentPane.add(button);
	}

	/**
	 * Pulsacion numero.
	 *
	 * @param tecla the tecla
	 */
	private void pulsacionNumero(String tecla) {

		if (textField.getText().equals("0") || nuevaOperacion) {
			textField.setText(tecla);
		} else {
			textField.setText(textField.getText() + tecla);

		}
		nuevaOperacion = false;
	}

	/**
	 * Pulsacion operacion.
	 *
	 * @param tecla the tecla
	 */
	private void pulsacionOperacion(String tecla) {

		if (tecla.equals("=")) {
			calcular();

		} else if (tecla.equals("CE")) {
			resultado = 0;
			textField.setText("0");
			nuevaOperacion = true;

		} else {
			valor = tecla;
			if ((resultado > 0) && !nuevaOperacion) {
				calcular();

			} else {
				try {
					resultado = new Double(textField.getText());

				} catch (Exception e) {
					textField.setText("Error");
				}
			}
		}
		nuevaOperacion = true;

	}

	/**
	 * Calcular.
	 */
	private void calcular() {
		try {
			switch (valor) {
			case "+":
				resultado += new Double(textField.getText());
				break;
			case "-":
				resultado -= new Double(textField.getText());
				break;
			case "/":
				resultado /= new Double(textField.getText());
				break;
			case "*":
				resultado *= new Double(textField.getText());
				break;
			case "%":
				resultado = resultado * (new Double(textField.getText())) / 100;
				break;
			default:
				break;
			}
			textField.setText("" + resultado);
			valor = "";
		} catch (Exception e) {
			textField.setText("Error");
		}
	}
}
