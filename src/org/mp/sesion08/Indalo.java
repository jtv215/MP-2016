package org.mp.sesion08;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * The Class Indalo.
 */
public class Indalo extends JFrame {

	/** The content pane. */
	private JPanel contentPane;

	/**
	 * Launch the application.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Indalo frame = new Indalo();
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
	public Indalo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(new IndaloPanel2());
		setContentPane(contentPane);
	}

/**
 * The Class IndaloPanel2.
 */
private class IndaloPanel2 extends JPanel{


	protected void paintComponent (Graphics graphics){
		super.paintComponent(graphics);
		Graphics2D g=(Graphics2D) graphics;
		//(orienatacion ,ancho, largo
		int w=getWidth();
		int h=getHeight();


		//cuerpo
		g.drawLine((int)(w*0.50),(int)(h*0.40),(int)(w*0.50),(int) (h*0.70));
		//pierna izquie
		g.drawLine((int)(w*0.50),(int)(h*0.70),(int)(w*0.35),(int) (h*0.95));
		//pierna derecha
		g.drawLine((int)(w*0.50),(int)(h*0.70),(int)(w*0.65),(int) (h*0.95));
		//brazos
		g.drawLine((int)(w*0.35),(int)(h*0.40),(int)(w*0.65),(int) (h*0.40));
		//cabeza
		g.drawOval((int)(w*0.45),(int)(h*0.25),(int)(w*0.10),(int) (h*0.15));
		//arco
		g.drawArc((int)(w*0.35),(int)(h*0.22),(int)(w*0.30),(int) (h*0.35),0,180);
		g.drawString("Indalo",(int)(w*0.45),(int)(h*0.20));
	}
}
}
