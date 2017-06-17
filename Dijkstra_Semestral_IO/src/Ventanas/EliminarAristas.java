

package Ventanas;

import Clases.Grafo;
import Clases.Pintar;
import java.awt.Frame;
import javax.swing.JOptionPane;


public class EliminarAristas extends javax.swing.JFrame {
	int i;
	

	public void repintar(){
		for (int j = 0; j < i; j++) {
			for (int k = 0; k < i; k++) {
				if(grafo.getmAdyacencia(j, k) == 1)
					Pintar.pintarLinea(VentanaPrincipal.jPanel1.getGraphics(),grafo.getCordeX(j),grafo.getCordeY(j), grafo.getCordeX(k), grafo.getCordeY(k),grafo.getmCoeficiente(j, k));
			}
		}
		for (int j = 0; j < i; j++) {
			Pintar.pintarCirculo(VentanaPrincipal.jPanel1.getGraphics(), grafo.getCordeX(j),grafo.getCordeY(j),String.valueOf(grafo.getNombre(j)));

		}
	}
	Pintar pintar ;
	Grafo grafo ;
	Frame frame;
	public EliminarAristas(Pintar pinta , Grafo grafo ,int ii, Frame fram) {
		initComponents();
		i=ii;
		this.pintar =pinta;
		this.grafo=grafo;
		frame = fram;
	}


	@SuppressWarnings("unchecked")
	
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		n1 = new javax.swing.JTextField();
		n2 = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();

		setTitle("Eliminar");
		setPreferredSize(new java.awt.Dimension(159, 343));
		setResizable(false);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent evt) {
				formWindowClosing(evt);
			}
		});
		getContentPane().setLayout(null);

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Eliminar Arista"));
		jPanel1.setLayout(null);

		n1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				n1ActionPerformed(evt);
			}
		});
		n1.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				n1KeyPressed(evt);
			}
			public void keyReleased(java.awt.event.KeyEvent evt) {
				n1KeyReleased(evt);
			}
		});
		jPanel1.add(n1);
		n1.setBounds(100, 30, 30, 20);

		n2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				n2ActionPerformed(evt);
			}
		});
		n2.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyReleased(java.awt.event.KeyEvent evt) {
				n2KeyReleased(evt);
			}
		});
		jPanel1.add(n2);
		n2.setBounds(100, 60, 30, 20);

		jLabel1.setText("Digite el Nodo 1");
		jPanel1.add(jLabel1);
		jLabel1.setBounds(10, 30, 110, 14);

		jLabel2.setText("Digite el nodo 2");
		jPanel1.add(jLabel2);
		jLabel2.setBounds(10, 60, 100, 14);

		getContentPane().add(jPanel1);
		jPanel1.setBounds(10, 10, 150, 90);

		jButton1.setText("Eliminar");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		getContentPane().add(jButton1);
		jButton1.setBounds(30, 110, 90, 23);

		setBounds(60, 130, 182, 179);
	}

	private void n1ActionPerformed(java.awt.event.ActionEvent evt) {
		
	}

	private void n1KeyPressed(java.awt.event.KeyEvent evt) {
		
	}
	
	private void n1KeyReleased(java.awt.event.KeyEvent evt) {
		String tem = new String(n1.getText());
		StringBuffer tem2= new StringBuffer();
		for (int j = 0; j < tem.length(); j++) {
			if(Character.isDigit(tem.charAt(j))){
				tem2.append(tem.charAt(j));
			}
		}
		n1.setText(""+tem2);
	}

	private void n2KeyReleased(java.awt.event.KeyEvent evt) {
		String tem = new String(n2.getText());
		StringBuffer tem2= new StringBuffer();
		for (int j = 0; j < tem.length(); j++) {
			if(Character.isDigit(tem.charAt(j))){
				tem2.append(tem.charAt(j));
			}
		}
		n2.setText(""+tem2);        
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		int x;int y;int ta;
		if(n1.getText().length()<1 || n2.getText().length()<1 )
			JOptionPane.showMessageDialog(null,"Faltan datos : ");
		else{
			x=Integer.parseInt(n1.getText());
			y=Integer.parseInt(n2.getText());


			if(x==y)
				JOptionPane.showMessageDialog(null,"Debe digitar un nodo diferente a : "+y);
			else if(x<0 || x>=i || y<0 || y>=i){
				JOptionPane.showMessageDialog(null,"Nodos No validos ");
			}else{
				grafo.setmAdyacencia(x, y, 0);
				grafo.setmAdyacencia(y, x, 0);
				grafo.setmCoeficiente(x, y, 0);
				grafo.setmCoeficiente(y, x, 0);
				n1.setText(null);
				n2.setText(null);
				VentanaPrincipal.jPanel1.paint(VentanaPrincipal.jPanel1.getGraphics());

				repintar();

			}
		}
	}
	
	private void n2ActionPerformed(java.awt.event.ActionEvent evt) {
		
	}

	private void formWindowClosing(java.awt.event.WindowEvent evt) {
		frame.setEnabled(true);  
	}

	
	public static void main(String args[]) {
	
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(EliminarAristas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(EliminarAristas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(EliminarAristas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(EliminarAristas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		

	}

	
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField n1;
	private javax.swing.JTextField n2;

}
