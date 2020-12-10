package org.mp.sesion09;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Locale;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Dimension;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.apache.commons.math3.stat.regression.SimpleRegression;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.mp.sesion06.ConjuntoDatos;
import org.mp.sesion06.Estadistica;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

/**
 * The Class AnalisisDatos.
 */
public class AnalisisDatos extends JFrame {

	/** The content pane. */
	private JPanel contentPane;

	/** The table. */
	private JTable table;

	/** The cd. */
	private ConjuntoDatos cd;

	/** The estadistica. */
	private Estadistica estadistica;

	/**
	 * Launch the application.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnalisisDatos frame = new AnalisisDatos();
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
	public AnalisisDatos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AnalisisDatos.class.getResource("/org/mp/sesion09/images/analisis.png")));
		setTitle("An\u00E1lisis Datos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 479);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);

		JMenuItem mntmAbrir = new JMenuItem("Abrir");
		mntmAbrir.setIcon(new ImageIcon(AnalisisDatos.class.getResource("/org/mp/sesion09/images/open 16x16.png")));
		mnArchivo.add(mntmAbrir);

		JSeparator separator_2 = new JSeparator();
		mnArchivo.add(separator_2);

		JMenuItem mntmGuardar = new JMenuItem("Guardar");
		mnArchivo.add(mntmGuardar);

		JSeparator separator_3 = new JSeparator();
		mnArchivo.add(separator_3);

		JMenuItem mntmCerrar = new JMenuItem("Cerrar");
		mnArchivo.add(mntmCerrar);

		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panelNorte = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelNorte.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panelNorte, BorderLayout.NORTH);

		JButton btnA = new JButton("");
		btnA.setToolTipText("Abrir Archivo");
		btnA.setIcon(new ImageIcon(AnalisisDatos.class.getResource("/org/mp/sesion09/images/open 16x16.png")));
		panelNorte.add(btnA);

		JButton btnG = new JButton("");
		btnG.setToolTipText("Guardar");
		btnG.setIcon(new ImageIcon(AnalisisDatos.class.getResource("/org/mp/sesion09/images/guardar 16x16.png")));
		panelNorte.add(btnG);

		JPanel panelCentro = new JPanel();
		contentPane.add(panelCentro, BorderLayout.CENTER);
		panelCentro.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollTable = new JScrollPane();
		panelCentro.add(scrollTable);

		table = new JTable();
		table.setRowSelectionAllowed(false);
		table.setColumnSelectionAllowed(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		scrollTable.setViewportView(table);

		JPanel panelSur = new JPanel();
		contentPane.add(panelSur, BorderLayout.SOUTH);
		panelSur.setLayout(new BorderLayout(0, 0));

		JPanel panelSurNorte = new JPanel();
		panelSur.add(panelSurNorte, BorderLayout.NORTH);

		JLabel lblSeleccionarProceso = new JLabel("Seleccionar proceso");
		panelSurNorte.add(lblSeleccionarProceso);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Estad\u00EDstica", "Regresion"}));
		panelSurNorte.add(comboBox);

		JButton btnCalcular = new JButton("Calcular");
		panelSurNorte.add(btnCalcular);

		JButton btnGrfica = new JButton("Gr\u00E1fica");
		panelSurNorte.add(btnGrfica);

		JPanel panelSurSur = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panelSurSur.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panelSur.add(panelSurSur, BorderLayout.SOUTH);

		JLabel lblDirectorio = new JLabel("Directorio");
		panelSurSur.add(lblDirectorio);

		JPanel panelSurCentro = new JPanel();
		panelSurCentro.setPreferredSize(new Dimension(100, 100));
		panelSur.add(panelSurCentro, BorderLayout.CENTER);
		panelSurCentro.setLayout(new BorderLayout(0, 0));


		JTextArea textArea = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setViewportView(textArea);
		panelSurCentro.add(scrollPane);


		ActionListener actionOpen=new ActionListener() {
			//abrir por defecto el la sesion 06
			@Override
			public void actionPerformed(ActionEvent e) {
				String dir=System.getProperty("user.dir")+File.separator+"test"+File.separator+"org"+File.separator+"mp"+File.separator+"sesion06"+File.separator;
				JFileChooser jfc=new JFileChooser(dir);
				jfc.showOpenDialog(null);//para que no me lo abra encima del programa

				File f=jfc.getSelectedFile();
				if(f==null){
					return;
				}else{
					 cd=new ConjuntoDatos(f, ";", new Locale("English", "US"));
					double [][]datos=cd.getDatos();
					//lo pasamos a object
					Object	[][] data= new Object[datos.length][datos[0].length];
					for (int i = 0; i < data.length; i++) {
						for (int j = 0; j < data[0].length; j++) {
							data[i][j]=datos [i][j];
						}

					}
					String [] cabecera= new String [cd.getCabecera().size()];
					cd.getCabecera().toArray(cabecera);

					DefaultTableModel dtm=new DefaultTableModel(data, cabecera);
					table.setModel(dtm);
					lblDirectorio.setText(f.getAbsolutePath());

				}
			}
		};
		//objeto accon calcular
		ActionListener actionCalcular= new ActionListener() {



			@SuppressWarnings("unused")
			@Override
			public void actionPerformed(ActionEvent e) {
				try{
				if(comboBox.getSelectedIndex()==0){ //Estaditica
					//aqui selecciona en un array el nombre de la columna
					String nombreColumna= (String) cd.getCabecera().get(table.getSelectedColumn());
					estadistica=new Estadistica(cd);
					double media=estadistica.media(nombreColumna);
					double suma=estadistica.suma(nombreColumna);
					double min=estadistica.min(nombreColumna);
					double max=estadistica.max(nombreColumna);
					double var=estadistica.var(nombreColumna);
					double stddesv=estadistica.stdDesv(nombreColumna);
					double n=estadistica.n(nombreColumna);

					String text=textArea.getText();
					text+= "Estadística: "+nombreColumna+"\n";
					text+= "============================\n";
					text+="N: " +n+"\n";
					text+="Max " +max+"\n";
					text+="Min " +min+"\n";
					text+="Media " +media+"\n";
					text+="Varianza " +var+"\n";
					text+="Desviación Estandar " +stddesv+"\n\n";
					textArea.setText(text);

				}else{//regresion

					SimpleRegression sr=new SimpleRegression();
					String nombreColumna= (String) cd.getCabecera().get(table.getSelectedColumn());
					double[][]data=new double [cd.getNumeroLineas()][2];
					double[]columna=cd.getColumna(nombreColumna);
					for (int i = 0; i < columna.length; i++) {
						data [i][0]=i;//metemos el indice
						data[i][1]=columna[i];//en la otra columna dos datos

					}
					sr.addData(data);
					double n= sr.getN();
					double corte=sr.getIntercept();
					double pendiente=sr.getSlope();
					double r=sr.getR();
					double r2=sr.getRSquare();

					String text=textArea.getText();
					text+= "Regresión: "+nombreColumna+"\n";
					text+= "============================\n";
					text+="N: " +n+"\n";
					text+="Corte: " +corte+"\n";
					text+="Pendiente " +pendiente+"\n";
					text+="R: " +r+"\n";
					text+="R cuadrado: " +r2+"\n\n";
					textArea.setText(text);
				}
				}catch(NullPointerException ex){

					JOptionPane.showMessageDialog(contentPane, "Debes Cargar un Archivo\n" , "Error", JOptionPane.ERROR_MESSAGE);
				}catch(ArrayIndexOutOfBoundsException ex){
					JOptionPane.showMessageDialog(contentPane, "Debes selecionar una columna\n" , "Error", JOptionPane.ERROR_MESSAGE);
				}


			}
		};

		ActionListener actionGrafica=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try{
				XYDataset dataset=new XYSeriesCollection();
				String nombreColumna= (String) cd.getCabecera().get(table.getSelectedColumn());
				XYSeries serie =new XYSeries(nombreColumna);
				double[][]data=new double [cd.getNumeroLineas()][2];
				double[]columna=cd.getColumna(nombreColumna);
				for (int i = 0; i < columna.length; i++) {
				serie.add(i,columna[i]);
				}
				((XYSeriesCollection) dataset).addSeries(serie);
				JFreeChart chart= ChartFactory.createXYLineChart("Gráfica", "N", nombreColumna, dataset,PlotOrientation.VERTICAL,true,true,false);
				ChartPanel charPanel= new ChartPanel(chart);
				charPanel.setPreferredSize(new Dimension(500, 270));
				charPanel.setVisible(true);
				JFrame jf= new JFrame();
				jf.getContentPane().add(charPanel);
				jf.setVisible(true);
				jf.setTitle("Gráfica " +nombreColumna);;
				jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				jf.setBounds(100, 100, 450, 300);
			}catch(NullPointerException ex){
				JOptionPane.showMessageDialog(contentPane, "Debes Cargar un Archivo\n" , "Error", JOptionPane.ERROR_MESSAGE);
			}catch(ArrayIndexOutOfBoundsException ex){
				JOptionPane.showMessageDialog(contentPane, "Debes selecionar una columna\n" , "Error", JOptionPane.ERROR_MESSAGE);
			}
		}


		};
		btnGrfica.addActionListener(actionGrafica);
		btnA.addActionListener(actionOpen);
		//el nombre mntm del panel de abrir en diseño
		mntmAbrir.addActionListener(actionOpen);
		btnCalcular.addActionListener(actionCalcular);

	}


}
