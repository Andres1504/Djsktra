
package Ventanas;

import Clases.Grafo;
import Clases.Pintar;
import Clases.Dijkstra;
import java.awt.Color;
import javax.swing.JOptionPane;



public class VentanaPrincipal extends javax.swing.JFrame {

	
	Pintar pintar =new Pintar();
	Grafo grafo = new Grafo();    
	public static void R_repaint(int tope, Grafo grafo){
		for (int j = 0; j < tope; j++) {
			for (int k = 0; k < tope; k++) {
				if(grafo.getmAdyacencia(j, k) == 1)
					Pintar.pintarLinea(jPanel1.getGraphics(),grafo.getCordeX(j),grafo.getCordeY(j), grafo.getCordeX(k), grafo.getCordeY(k),grafo.getmCoeficiente(j, k));
			}
		}
		for (int j = 0; j < tope; j++) 
			Pintar.pintarCirculo(jPanel1.getGraphics(), grafo.getCordeX(j),grafo.getCordeY(j),String.valueOf(grafo.getNombre(j)));

	}

	public static int ingresarNodoOrigen(String nodoOrige, String noExiste,int tope){
		int nodoOrigen = 0;
		try{
			nodoOrigen = Integer.parseInt(JOptionPane.showInputDialog(""+nodoOrige));   
			if(nodoOrigen>=tope){  
				JOptionPane.showMessageDialog(null,""+noExiste+"\nDebe de ingresar el Id de un Nodo existente");
				nodoOrigen = ingresarNodoOrigen(nodoOrige,noExiste, tope);
			}
		}catch(Exception ex){
			nodoOrigen = ingresarNodoOrigen(nodoOrige,noExiste,tope);
		}
		return nodoOrigen;
	}          
	public  int ingresarTamano(String tama){        
		int tamano = 0;
		try{
			tamano = Integer.parseInt(JOptionPane.showInputDialog(""+tama));
			if(tamano<1){ JOptionPane.showMessageDialog(null,"Debe Ingresar un tamaño mayor a 1");
			tamano = ingresarTamano(tama);
			}
		}catch(Exception ex){
			tamano = ingresarTamano(tama);
		}
		return tamano;
	}



	public VentanaPrincipal() { 
		initComponents();
		jPanel2.setVisible(false);   
		jDialog1.setLocationRelativeTo(null);

	}    
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {
		pnlArista = new javax.swing.JPanel();
		jDialog1 = new javax.swing.JDialog();
		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		jButton10 = new javax.swing.JButton();
		jButton11 = new javax.swing.JButton();
		jButton12 = new javax.swing.JButton();
		jButton13 = new javax.swing.JButton();
		jButton14 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenuItem13 = new javax.swing.JMenuItem();
		jMenuItem2 = new javax.swing.JMenuItem();
		jMenuItem4 = new javax.swing.JMenuItem();
		jMenuItem1 = new javax.swing.JMenuItem();
		jMenu2 = new javax.swing.JMenu();
		jMenuItem10 = new javax.swing.JMenuItem();
		jMenuItem9 = new javax.swing.JMenuItem();
		jMenuItem12 = new javax.swing.JMenuItem();
		jDialog1.setMaximumSize(new java.awt.Dimension(700, 450));
		jDialog1.setMinimumSize(new java.awt.Dimension(700, 450));
		jDialog1.setPreferredSize(new java.awt.Dimension(700, 450));
		jDialog1.setResizable(false);
		jDialog1.getContentPane().setLayout(null);


		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Algoritmo de Dijkstra");
		setResizable(false);
		getContentPane().setLayout(null);
		pnlArista.setBackground(new java.awt.Color(204, 204, 255));

		jPanel1.setBackground(new java.awt.Color(0, 102, 102));
		jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jPanel1.setMinimumSize(new java.awt.Dimension(900, 550));
		jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jPanel1MouseClicked(evt);
			}
			public void mousePressed(java.awt.event.MouseEvent evt) {
				jPanel1MousePressed(evt);
			}
		});

		jPanel1.setLayout(null);


		getContentPane().add(jPanel1);
		jPanel1.setBounds(10, 10, 990,550 );
		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
		jPanel2.setLayout(null);

		jButton2.setBackground(new java.awt.Color(0, 153, 153));
		jButton2.setForeground(new java.awt.Color(153, 153, 0));
		jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
		jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				jButton2MousePressed(evt);
			}
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				jButton2MouseReleased(evt);
			}
		});
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		jPanel2.add(jButton2);
		jButton2.setBounds(10, 10, 20, 20);

		jButton3.setBackground(new java.awt.Color(204, 0, 204));
		jButton3.setForeground(new java.awt.Color(153, 153, 0));
		jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
		jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				jButton3MousePressed(evt);
			}
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				jButton3MouseReleased(evt);
			}
		});
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});
		jPanel2.add(jButton3);
		jButton3.setBounds(40, 10, 20, 20);

		jButton4.setBackground(new java.awt.Color(189, 182, 182));
		jButton4.setForeground(new java.awt.Color(153, 153, 0));
		jButton4.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
		jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton4MouseClicked(evt);
			}
			public void mousePressed(java.awt.event.MouseEvent evt) {
				jButton4MousePressed(evt);
			}
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				jButton4MouseReleased(evt);
			}
		});
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});
		jPanel2.add(jButton4);
		jButton4.setBounds(100, 10, 20, 20);

		jButton5.setBackground(new java.awt.Color(51, 0, 51));
		jButton5.setForeground(new java.awt.Color(153, 153, 0));
		jButton5.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
		jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				jButton5MousePressed(evt);
			}
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				jButton5MouseReleased(evt);
			}
		});
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});
		jPanel2.add(jButton5);
		jButton5.setBounds(10, 40, 20, 20);

		jButton6.setBackground(java.awt.Color.lightGray);
		jButton6.setForeground(new java.awt.Color(153, 153, 0));
		jButton6.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
		jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				jButton6MousePressed(evt);
			}
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				jButton6MouseReleased(evt);
			}
		});
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});
		jPanel2.add(jButton6);
		jButton6.setBounds(40, 40, 20, 20);

		jButton7.setBackground(new java.awt.Color(164, 167, 255));
		jButton7.setForeground(new java.awt.Color(153, 153, 0));
		jButton7.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
		jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				jButton7MousePressed(evt);
			}
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				jButton7MouseReleased(evt);
			}
		});
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});
		jPanel2.add(jButton7);
		jButton7.setBounds(70, 70, 20, 20);

		jButton8.setBackground(new java.awt.Color(141, 141, 141));
		jButton8.setForeground(new java.awt.Color(153, 153, 0));
		jButton8.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
		jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				jButton8MousePressed(evt);
			}
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				jButton8MouseReleased(evt);
			}
		});
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});
		jPanel2.add(jButton8);
		jButton8.setBounds(100, 40, 20, 20);

		jButton9.setBackground(new java.awt.Color(0, 0, 255));
		jButton9.setForeground(new java.awt.Color(153, 153, 0));
		jButton9.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
		jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				jButton9MousePressed(evt);
			}
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				jButton9MouseReleased(evt);
			}
		});
		jPanel2.add(jButton9);
		jButton9.setBounds(100, 70, 20, 20);

		jButton10.setBackground(new java.awt.Color(153, 0, 0));
		jButton10.setForeground(new java.awt.Color(153, 153, 0));
		jButton10.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
		jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				jButton10MousePressed(evt);
			}
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				jButton10MouseReleased(evt);
			}
		});
		jButton10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton10ActionPerformed(evt);
			}
		});
		jPanel2.add(jButton10);
		jButton10.setBounds(70, 10, 20, 20);

		jButton11.setBackground(new java.awt.Color(0, 102, 102));
		jButton11.setForeground(new java.awt.Color(153, 153, 0));
		jButton11.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
		jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				jButton11MousePressed(evt);
			}
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				jButton11MouseReleased(evt);
			}
		});
		jPanel2.add(jButton11);
		jButton11.setBounds(40, 70, 20, 20);

		jButton12.setBackground(java.awt.Color.white);
		jButton12.setForeground(new java.awt.Color(153, 153, 0));
		jButton12.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
		jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				jButton12MousePressed(evt);
			}
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				jButton12MouseReleased(evt);
			}
		});
		jPanel2.add(jButton12);
		jButton12.setBounds(70, 40, 20, 20);

		jButton13.setBackground(new java.awt.Color(0, 51, 51));
		jButton13.setForeground(new java.awt.Color(153, 153, 0));
		jButton13.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
		jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				jButton13MousePressed(evt);
			}
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				jButton13MouseReleased(evt);
			}
		});
		jPanel2.add(jButton13);
		jButton13.setBounds(10, 70, 20, 20);

		jButton14.setText("OK");
		jButton14.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton14ActionPerformed(evt);
			}
		});
		jPanel2.add(jButton14);
		jButton14.setBounds(30, 100, 60, 23);

		getContentPane().add(jPanel2);
		jPanel2.setBounds(40, 40, 130, 130);

		jLabel1.setFont(new java.awt.Font("AngsanaUPC", 2, 18)); // NOI18N
		jLabel1.setText("iNGENIERIA DE SOFTWARE INVESTIGACIÓN DE OPERACIONES");
		getContentPane().add(jLabel1);
		jLabel1.setBounds(220, 530, 400, 20);

		jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Peso Acumulado"));
		jPanel3.setLayout(null);

		getContentPane().add(jPanel3);
		jPanel3.setBounds(30, 470, 130, 60);

		jMenu1.setText("Nodo");

		jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem13.setText("Camino Mas Corto");
		jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem13ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem13);


		jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem2.setText("Nueva Arista");
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem2ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem2);



		jMenuItem4.setText("Ejemplo ");
		jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				jMenuItem4MousePressed(evt);
			}
		});
		jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem4ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem4);


		jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
		jMenuItem1.setText("Nuevo Proyecto");
		jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem1ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem1);
		jMenuBar1.add(jMenu1);

		jMenu2.setText("Eliminar");

		jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
		jMenuItem10.setText("Eliminar Nodo");
		jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem10ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem10);

		jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem9.setText("Eliminar Arista");
		jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem9ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem9);
		jMenuBar1.add(jMenu2);


		jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
		jMenuItem12.setText("Color");
		jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem12ActionPerformed(evt);
			}
		});
		setJMenuBar(jMenuBar1);

		setSize(new java.awt.Dimension(1012, 623));
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
		int xxx, yyy;   
		xxx=evt.getX();
		yyy=evt.getY();
		if(tope<50){
			grafo.setCordeX(tope,xxx);
			grafo.setCordeY(tope,yyy);
			grafo.setNombre(tope, tope);
			Pintar.pintarCirculo(jPanel1.getGraphics(),grafo.getCordeX(tope), grafo.getCordeY(tope),String.valueOf(grafo.getNombre(tope)));
			tope++;          
		} 
		else JOptionPane.showMessageDialog(null,"Se ha llegado al Maximo de nodos..");
	}


	private void jMenuItem4MousePressed(java.awt.event.MouseEvent evt) {

	}

	private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {
		jPanel1.paint(jPanel1.getGraphics()); 
		n=0;
		id=-1;
		id2=-1;
		int Matriz[][]={{0,1,0,1,1,0,0,1},
				{1,0,1,0,0,0,0,0},
				{0,1,0,1,1,0,0,0},
				{1,0,1,0,0,0,0,0},
				{1,0,1,0,0,1,0,0},
				{0,0,0,0,1,0,1,1},
				{0,0,0,0,0,1,0,0},
				{1,0,0,0,0,1,0,0}
		};
		int coe[][]={{0,50,0,46,216,0,0,578}, 
				{50,0,59,0,0,0,0,0}, 
				{0,59,0,89,174,0,0,0},
				{46,0,89,0,0,0,0,0},
				{216,0,174,0,0,471,0,0} ,
				{0,0,0,0,471,0,194,398},  
				{0,0,0,0,0,194,0,0}, 
				{578,0,0,0,0,398,0,0},

		};
		int xx1[]={202,102,8,198,248,352,481,416};
		int yy1[]={12,74,165,113,233,300,368,177};
		int nom[]={0,1,2,3,4,5,6,7};          
		aristaMayor=600;       
		for (int j = 0; j < 8; j++) {
			grafo.setCordeX(j, xx1[j]);
			grafo.setCordeY(j, yy1[j]);
			grafo.setNombre(j, nom[j]);      

		}
		for (int j = 0; j < 8; j++) {            
			for (int k = 0; k < 8; k++) {
				grafo.setmAdyacencia(j,k, Matriz[j][k]);
				grafo.setmCoeficiente(j, k, coe[j][k]); 
			}
		}        
		tope=8;       
		R_repaint(tope,grafo);
	}



	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
		if(tope<=1)
			JOptionPane.showMessageDialog(null,"Cree nuevo nodo : ");

		else{
			this.setEnabled(false);
			new VentanaArista(grafo,pintar,tope,this).setVisible(true);
			jPanel1.paint(jPanel1.getGraphics());
			R_repaint(tope,grafo);        
		}
	}//GEN-LAST:event_jMenuItem2ActionPerformed



	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed


		for (int j = 0; j < tope; j++) {
			grafo.setCordeX(j,0);
			grafo.setCordeY(j,0);              
			grafo.setNombre(j,0);            
		}
		for (int j = 0; j < tope; j++) {
			for (int k = 0; k < tope; k++) {
				grafo.setmAdyacencia(j, k, 0);
				grafo.setmCoeficiente(j, k, 0);                 
			}            
		}
		tope=00;   
		jPanel1.repaint(); 

	}//GEN-LAST:event_jMenuItem1ActionPerformed


	private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
		if(tope>=2){
			this.setEnabled(false);
			new EliminarAristas(pintar,grafo,tope,this).setVisible(true);
			jPanel1.paint(jPanel1.getGraphics());
			R_repaint(tope,grafo); 
		}
		else  JOptionPane.showMessageDialog(null,"No Hay Nodos Enlazados... ");

	}//GEN-LAST:event_jMenuItem9ActionPerformed

	private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
		int Eliminar= ingresarNodoOrigen("Ingrese Nodo a Eliminar ","Nodo No existe",tope); 
		if(Eliminar<=tope && Eliminar>=0 && tope>0){
			for (int j = 0; j < tope; j++) {
				for (int k = 0; k < tope; k++){
					if(j==Eliminar ||k==Eliminar){
						grafo.setmAdyacencia(j, k, -1);                    
					}
				}
			}
			for (int l = 0; l < tope-1; l++) {
				for (int m = 0; m < tope; m++) {
					if(grafo.getmAdyacencia(l, m)==-1){
						grafo.setmAdyacencia(l, m,grafo.getmAdyacencia(l+1, m)); 
						grafo.setmAdyacencia(l+1, m,-1);
						grafo.setmCoeficiente(l, m,grafo.getmCoeficiente(l+1, m));
					}
				}
			}
			for (int l = 0; l < tope; l++) {
				for (int m = 0; m < tope-1; m++) {

					if(grafo.getmAdyacencia(l, m)==-1){
						grafo.setmAdyacencia(l, m,grafo.getmAdyacencia(l, m+1)); 
						grafo.setmAdyacencia(l, m+1,-1);
						grafo.setmCoeficiente(l, m,grafo.getmCoeficiente(l, m+1));

					}
				}
			}

			grafo.setCordeX(Eliminar,-10);
			grafo.setCordeY(Eliminar,-10);
			grafo.setNombre(Eliminar, -10);
			for (int j = 0; j < tope; j++) {
				for (int k = 0; k < tope-1; k++) {
					if(grafo.getCordeX(k)==-10){
						grafo.setCordeX(k, grafo.getCordeX(k+1));
						grafo.setCordeX(k+1, -10);
						grafo.setCordeY(k, grafo.getCordeY(k+1));
						grafo.setCordeY(k+1, -10);
						grafo.setNombre(k, grafo.getNombre(k+1));
						grafo.setNombre(k+1,-10);
					}
				}
			}
			for (int j = 0; j < tope; j++)                      
				grafo.setNombre(j,j);// renombramos             

			// eliminamos los -1 y  los -10 
			for (int j = 0; j < tope+1; j++) {
				for (int k = 0; k < tope+1; k++) {
					if( grafo.getmAdyacencia(j, k)!=-1)
						grafo.setmAdyacencia(j, k, grafo.getmAdyacencia(j, k));
					else 
						grafo.setmAdyacencia(j, k, 0);                       
					if(grafo.getmCoeficiente(j, k) !=-10)
						grafo.setmCoeficiente(j, k, grafo.getmCoeficiente(j, k));
					else
						grafo.setmCoeficiente(j, k, 0);                        
				}         
			}
			tope--;
			jPanel1.paint(jPanel1.getGraphics());
			R_repaint(tope,grafo);
		}    
	}//GEN-LAST:event_jMenuItem10ActionPerformed


	private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
		jPanel1.setBackground(jButton3.getBackground());


	}//GEN-LAST:event_jButton3MousePressed

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_jButton3ActionPerformed

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

	}//GEN-LAST:event_jButton2ActionPerformed

	private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

	}//GEN-LAST:event_jButton10ActionPerformed

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

	}//GEN-LAST:event_jButton4ActionPerformed

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

	}//GEN-LAST:event_jButton5ActionPerformed

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

	}//GEN-LAST:event_jButton6ActionPerformed

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

	}//GEN-LAST:event_jButton7ActionPerformed
	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

	}//GEN-LAST:event_jButton8ActionPerformed

	private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
		jPanel2.setVisible(false);  // TODO add your handling code here:
	}//GEN-LAST:event_jButton14ActionPerformed

	private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
		jPanel2.setVisible(true);// TODO add your handling code here:
	}//GEN-LAST:event_jMenuItem12ActionPerformed

	private void jButton4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseReleased
		R_repaint(tope,grafo);   // TODO add your handling code here:
	}//GEN-LAST:event_jButton4MouseReleased

	private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
		// TODO add your handling code here:
	}//GEN-LAST:event_jButton4MouseClicked

	private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
		jPanel1.setBackground(jButton4.getBackground());
		// TODO add your handling code here:
	}//GEN-LAST:event_jButton4MousePressed

	private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
		jPanel1.setBackground(jButton2.getBackground());
		// TODO add your handling code here:
	}//GEN-LAST:event_jButton2MousePressed

	private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseReleased
		R_repaint(tope,grafo);  // TODO add your handling code here:
	}//GEN-LAST:event_jButton2MouseReleased

	private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased
		R_repaint(tope,grafo);        // TODO add your handling code here:
	}//GEN-LAST:event_jButton3MouseReleased

	private void jButton10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MousePressed
		jPanel1.setBackground(jButton10.getBackground());
		// TODO add your handling code here:
	}//GEN-LAST:event_jButton10MousePressed

	private void jButton10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseReleased
		R_repaint(tope,grafo);        // TODO add your handling code here:
	}//GEN-LAST:event_jButton10MouseReleased

	private void jButton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MousePressed
		jPanel1.setBackground(jButton5.getBackground());
		// TODO add your handling code here:
	}//GEN-LAST:event_jButton5MousePressed

	private void jButton5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseReleased
		R_repaint(tope,grafo);        // TODO add your handling code here:
	}//GEN-LAST:event_jButton5MouseReleased

	private void jButton7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MousePressed
		jPanel1.setBackground(jButton7.getBackground());
		// TODO add your handling code here:
	}//GEN-LAST:event_jButton7MousePressed

	private void jButton7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseReleased
		R_repaint(tope,grafo);        // TODO add your handling code here:
	}//GEN-LAST:event_jButton7MouseReleased

	private void jButton8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MousePressed
		jPanel1.setBackground(jButton8.getBackground());        // TODO add your handling code here:
	}//GEN-LAST:event_jButton8MousePressed

	private void jButton8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseReleased
		R_repaint(tope,grafo);  // TODO add your handling code here:
	}//GEN-LAST:event_jButton8MouseReleased

	private void jButton6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MousePressed
		jPanel1.setBackground(jButton6.getBackground());  // TODO add your handling code here:
	}//GEN-LAST:event_jButton6MousePressed

	private void jButton6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseReleased
		R_repaint(tope,grafo);        // TODO add your handling code here:
	}//GEN-LAST:event_jButton6MouseReleased

	private void jButton13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MousePressed
		jPanel1.setBackground(jButton13.getBackground());  // TODO add your handling code here:
	}//GEN-LAST:event_jButton13MousePressed

	private void jButton11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MousePressed
		jPanel1.setBackground(jButton11.getBackground());        // TODO add your handling code here:
	}//GEN-LAST:event_jButton11MousePressed

	private void jButton12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseReleased
		R_repaint(tope,grafo);        // TODO add your handling code here:
	}//GEN-LAST:event_jButton12MouseReleased

	private void jButton9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MousePressed
		jPanel1.setBackground(jButton9.getBackground());     // TODO add your handling code here:
	}//GEN-LAST:event_jButton9MousePressed

	private void jButton12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MousePressed
		jPanel1.setBackground(jButton12.getBackground()); // TODO add your handling code here:
	}//GEN-LAST:event_jButton12MousePressed

	private void jButton11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseReleased
		R_repaint(tope,grafo);  // TODO add your handling code here:
	}//GEN-LAST:event_jButton11MouseReleased

	private void jButton9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseReleased
		R_repaint(tope,grafo);        // TODO add your handling code here:
	}//GEN-LAST:event_jButton9MouseReleased

	private void jButton13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseReleased
		R_repaint(tope,grafo);        // TODO add your handling code here:
	}//GEN-LAST:event_jButton13MouseReleased

	private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
		if(tope>=2){
			permanente =  ingresarNodoOrigen("Ingrese Nodo Origen..","nodo Origen No existe",tope);     
			nodoFin =  ingresarNodoOrigen("Ingrese Nodo Fin..","nodo fin No existe",tope);
			Dijkstra Dijkstra = new Dijkstra(grafo,tope,permanente,nodoFin);
			Dijkstra.dijkstra();
			JOptionPane.showMessageDialog(null,"El peso Acumulado es: "+Dijkstra.getAcumulado() ,"Peso Acumulado", JOptionPane.INFORMATION_MESSAGE);
		}
		else JOptionPane.showMessageDialog(null,"Se deben de crear mas nodos ... ");
	}//GEN-LAST:event_jMenuItem13ActionPerformed

	private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
		// TODO add your handling code here:
	}//GEN-LAST:event_jPanel1MouseClicked



	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {        

	}
	private int tope=0;// numero de nodos Creados
	private int nodoFin;
	private int permanente;
	int n=0,nn=0,id,id2;// permite controlar que se halla dado click sobre un nodo
	private int aristaMayor;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton11;
	private javax.swing.JButton jButton12;
	private javax.swing.JButton jButton13;
	private javax.swing.JButton jButton14;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JDialog jDialog1; 
	private javax.swing.JLabel jLabel1;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem10;
	private javax.swing.JMenuItem jMenuItem12;
	private javax.swing.JMenuItem jMenuItem13;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JMenuItem jMenuItem4;
	private javax.swing.JMenuItem jMenuItem9;
	public static javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel pnlArista;
	private javax.swing.JPanel jPanel3;
	// End of variables declaration//GEN-END:variables
}
