/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Aplicacion;

import static Aplicacion.Administrador.data;
import static Aplicacion.Administrador.lugares;
import Estructuras.ListaSimple;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author JJONK19
 */
public class Estructuras extends javax.swing.JDialog {

    /**
     * Creates new form Estructuras
     */
    public Estructuras(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        icono = new javax.swing.JLabel();
        mostrar = new javax.swing.JButton();
        lista = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        ar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("UDrawing Paper");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(253, 251, 251));

        jLabel1.setFont(new java.awt.Font("Candara Light", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Estructuras");

        mostrar.setBackground(new java.awt.Color(53, 108, 114));
        mostrar.setFont(new java.awt.Font("Candara Light", 2, 16)); // NOI18N
        mostrar.setForeground(new java.awt.Color(255, 255, 255));
        mostrar.setText("Mostrar Esstructura");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        lista.setBackground(new java.awt.Color(53, 108, 114));
        lista.setFont(new java.awt.Font("Candara Light", 0, 16)); // NOI18N
        lista.setForeground(new java.awt.Color(0, 0, 0));
        lista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Clientes", "Mensajeros", "Lista Adyacencia", "Rutas" }));
        lista.setBorder(null);
        lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(ar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(mostrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 396, Short.MAX_VALUE))
                    .addComponent(lista, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addComponent(lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        try{
            URL url = new File("src/main/java/Imagenes/LogoR(I).png").toURI().toURL();
            ImageIcon imageIcon = new ImageIcon(url);
            icono.setIcon(imageIcon);
        }catch(Exception e){

        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        // TODO add your handling code here:
        String na =  (String) lista.getSelectedItem();
        switch(na){
            case "Seleccionar":
                break;
                
            case "Clientes":
                if(!data.isEmpty()){
                    File a = new File ("src/main/java/Imagenes/Clientes.png");
                    if(a.exists()){
                        try {
                            BufferedImage img = ImageIO.read(a.getAbsoluteFile());
                            Image tmp = img.getScaledInstance(img.getWidth(),img.getHeight(), Image.SCALE_SMOOTH);
                            ar.setSize(img.getWidth(),img.getHeight());
                            ar.setIcon(new ImageIcon(tmp));
                        }catch (Exception ex) {

                        }
                    }else{
                        ar.setIcon(null);

                    }
                }
                break;
                
            case "Mensajeros":
                break;
                
            case "Lista Adyacencia":
                if(!lugares.isEmpty()){
                    File a = new File ("src/main/java/Imagenes/Adyacente.png");
                    if(a.exists()){
                        try {
                            BufferedImage img = ImageIO.read(a.getAbsoluteFile());
                            Image tmp = img.getScaledInstance(img.getWidth(),img.getHeight(), Image.SCALE_SMOOTH);
                            ar.setSize(img.getWidth(),img.getHeight());
                            ar.setIcon(new ImageIcon(tmp));
                        }catch (Exception ex) {

                        }
                    }else{
                        ar.setIcon(null);

                    }
                }
                break;
                
            case "Rutas":
                if(!data.isEmpty()){
                    File a = new File ("src/main/java/Imagenes/Rutas.png");
                    if(a.exists()){
                        try {
                            BufferedImage img = ImageIO.read(a.getAbsoluteFile());
                            Image tmp = img.getScaledInstance(img.getWidth(),img.getHeight(), Image.SCALE_SMOOTH);
                            ar.setSize(img.getWidth(),img.getHeight());
                            ar.setIcon(new ImageIcon(tmp));
                        }catch (Exception ex) {

                        }
                    }else{
                        ar.setIcon(null);

                    }
                }
                break;
        }
        
    }//GEN-LAST:event_mostrarActionPerformed

    private void listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaActionPerformed
        // TODO add your handling code here:
        String na =  (String) lista.getSelectedItem();
        switch(na){
            case "Seleccionar":
                break;
                
            case "Clientes":
                if(!data.isEmpty()){
                    data.dibujar("src/main/java/Imagenes/Clientes.txt", "src/main/java/Imagenes/Clientes.png");
                }
                
            case "Mensajeros":
                break;
                
            case "Lista Adyacencia":
                if(!lugares.isEmpty()){
                    lugares.dibujarA("src/main/java/Imagenes/Adyacente.txt", "src/main/java/Imagenes/Adyacente.png");
                }
                break;
                
            case "Rutas":
                if(!lugares.isEmpty()){
                    lugares.dibujarG("src/main/java/Imagenes/Rutas.txt", "src/main/java/Imagenes/Rutas.png");
                }
                break;
        }
    }//GEN-LAST:event_listaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try {
            FileInputStream abrir = new FileInputStream("src/main/java/data.ser");
            ObjectInputStream escribir = new ObjectInputStream(abrir);
            data =  (ListaSimple) escribir.readObject();
            escribir.close();
            abrir.close();
            
             //Lugares
            abrir = new FileInputStream("src/main/java/lugares.ser");
            escribir = new ObjectInputStream(abrir);
            lugares =  (ListaSimple) escribir.readObject();
            escribir.close();
            abrir.close();
            
            
        } catch (IOException i) {
           data = new ListaSimple();
           lugares = new ListaSimple();
           i.printStackTrace();
            
        } catch (ClassNotFoundException c) {
            data = new ListaSimple();
            lugares = new ListaSimple();
            c.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        //Serealizar
        try{    
            //Crear data    
            FileOutputStream f=new FileOutputStream("src/main/java/data.ser");    
            ObjectOutputStream out=new ObjectOutputStream(f); 
            out.writeObject(data);    
            out.flush();        
            out.close();   
            
            //Lugares    
            f=new FileOutputStream("src/main/java/lugares.ser");    
            out=new ObjectOutputStream(f); 
            out.writeObject(lugares);    
            out.flush();        
            out.close(); 
        }catch(Exception e){
                    
        }
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Estructuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estructuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estructuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estructuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Estructuras dialog = new Estructuras(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    static ListaSimple data = new ListaSimple();
    public static ListaSimple lugares = new ListaSimple();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ar;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> lista;
    private javax.swing.JButton mostrar;
    // End of variables declaration//GEN-END:variables
}
