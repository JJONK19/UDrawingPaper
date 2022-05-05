/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Aplicacion;

import static Aplicacion.Login.data;
import Estructuras.Cliente;
import Estructuras.ListaSimple;
import Estructuras.NodoListaSimple;
import at.favre.lib.crypto.bcrypt.BCrypt;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author JJONK19
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Registro() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Regresar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        DPI = new javax.swing.JTextField();
        Registro1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Correo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Tel = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Contraseña = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        Direccion = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Municipio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("UDrawingPaper");
        setLocation(new java.awt.Point(100, 100));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(253, 251, 251));

        jLabel2.setBackground(java.awt.Color.darkGray);

        jLabel6.setFont(new java.awt.Font("Candara Light", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DPI");

        Nombre.setBackground(new java.awt.Color(253, 251, 251));

        jLabel5.setFont(new java.awt.Font("Candara Light", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nombre");

        Regresar.setBackground(new java.awt.Color(53, 108, 114));
        Regresar.setFont(new java.awt.Font("Candara Light", 2, 16)); // NOI18N
        Regresar.setForeground(new java.awt.Color(255, 255, 255));
        Regresar.setText("Iniciar Sesión");
        Regresar.setBorder(null);
        Regresar.setBorderPainted(false);
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Candara Light", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("REGISTRO DE USUARIOS");

        DPI.setBackground(new java.awt.Color(253, 251, 251));

        Registro1.setBackground(new java.awt.Color(53, 108, 114));
        Registro1.setFont(new java.awt.Font("Candara Light", 2, 16)); // NOI18N
        Registro1.setForeground(new java.awt.Color(255, 255, 255));
        Registro1.setText("Registrar");
        Registro1.setBorder(null);
        Registro1.setBorderPainted(false);
        Registro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registro1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Candara Light", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Username");

        Username.setBackground(new java.awt.Color(253, 251, 251));

        jLabel10.setFont(new java.awt.Font("Candara Light", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Correo Electronico");

        Correo.setBackground(new java.awt.Color(253, 251, 251));

        jLabel11.setFont(new java.awt.Font("Candara Light", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Teléfono");

        Tel.setBackground(new java.awt.Color(253, 251, 251));

        jLabel13.setFont(new java.awt.Font("Candara Light", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Contraseña");

        Contraseña.setBackground(new java.awt.Color(253, 251, 251));

        jLabel14.setFont(new java.awt.Font("Candara Light", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Direccion");

        Direccion.setBackground(new java.awt.Color(253, 251, 251));

        jLabel15.setFont(new java.awt.Font("Candara Light", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Municipio");

        Municipio.setBackground(new java.awt.Color(253, 251, 251));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DPI, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(Tel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(19, Short.MAX_VALUE)
                        .addComponent(Registro1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DPI, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Registro1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        try{
            URL url = new File("src/main/java/Imagenes/Registro.gif").toURI().toURL();
            ImageIcon imageIcon = new ImageIcon(url);
            jLabel2.setIcon(imageIcon);
        }catch(Exception e){

        }
        //Adaptado de https://stackoverflow.com/questions/3519151/how-to-limit-the-number-of-characters-in-jtextfield
        DPI.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (DPI.getText().length() >= 13 ) // limit textfield to 3 characters
                e.consume();
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        // TODO add your handling code here:
        //Serealizar
        try{    
            //Crear data    
            FileOutputStream f=new FileOutputStream("src/main/java/data.ser");    
            ObjectOutputStream out=new ObjectOutputStream(f); 
            out.writeObject(data);    
            out.flush();        
            out.close();    
        }catch(Exception e){
                    
        }
        
        Login n = new Login();
        n.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegresarActionPerformed

    private void Registro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registro1ActionPerformed
        // TODO add your handling code here:
        String dpi = DPI.getText();
        String nombre = Nombre.getText();
        String user = Username.getText();
        String correo = Correo.getText();
        String tel = Tel.getText();
        String dir = Direccion.getText();
        String municipio = Municipio.getText();
        String pass = String.valueOf(Contraseña.getPassword());
        
        if(dpi.length() == 0 || pass.length() == 0 || nombre.length() == 0 || user.length() == 0
                || correo.length() == 0 || tel.length() == 0 || dir.length() == 0 || municipio.length() == 0){
            JOptionPane.showMessageDialog(this, "Llene todos los campos para continuar.");
        }else{
            if(dpi.length() < 13){
                JOptionPane.showMessageDialog(this, "DPI no cumple con el formato (13 carácteres).", "Mensaje", JOptionPane.ERROR_MESSAGE);
            }else{
                if(data.isEmpty()){
                    String contra = BCrypt.withDefaults().hashToString(8, pass.toCharArray());
                    Cliente nuevo = new Cliente(dpi, nombre, user, correo, contra, tel, dir, municipio);
                    data.add(nuevo, user);
                    //Reiniciar las entradas
                    DPI.setText("");
                    Nombre.setText("");
                    Username.setText("");
                    Correo.setText("");
                    Tel.setText("");
                    Direccion.setText("");
                    Municipio.setText("");
                    Contraseña.setText("");
                    JOptionPane.showMessageDialog(this, "Registro Exitoso.");
                }else{
                    //Buscar Cliente 
                    NodoListaSimple bus = data.head;
                    while(bus != null){
                        Cliente temp = (Cliente) bus.content;
                        if(user.equals(temp.getUser()) && dpi.equals(temp.getDPI())){
                            break;
                        }
                        bus = bus.next;
                    }
                        
                    if(bus == null){
                        //Fuente: https://libraries.io/maven/at.favre.lib:bcrypt
                        String contra = BCrypt.withDefaults().hashToString(8, pass.toCharArray());
                        Cliente nuevo = new Cliente(dpi, nombre, user, correo, contra, tel, dir, municipio);
                        data.add(nuevo, user);
                        DPI.setText("");
                        Nombre.setText("");
                        Username.setText("");
                        Correo.setText("");
                        Tel.setText("");
                        Direccion.setText("");
                        Municipio.setText("");
                        Contraseña.setText("");
                        JOptionPane.showMessageDialog(this, "Registro Exitoso.");
                        
                    }else{
                         JOptionPane.showMessageDialog(this, "Este usuario ya está registrado.");
                    }
                }
            }
        }
    }//GEN-LAST:event_Registro1ActionPerformed

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
        }catch(Exception e){
                    
        }
        
        Login n = new Login();
        Login.data = this.data;
        n.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try {
            FileInputStream abrir = new FileInputStream("src/main/java/data.ser");
            ObjectInputStream escribir = new ObjectInputStream(abrir);
            data =  (ListaSimple) escribir.readObject();
            escribir.close();
            abrir.close();
        } catch (IOException i) {
           data = new ListaSimple();
            
        } catch (ClassNotFoundException c) {
            data = new ListaSimple();
        }
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //Montsr base de datos
        File temp = new File("src/main/java/data.ser");
        //Deserializar
        if(temp.exists()){
            try{    
            //Cargar info
                ObjectInputStream in=new ObjectInputStream(new FileInputStream("src/main/java/data.ser"));    
                data=(ListaSimple)in.readObject();    
                in.close();    
            }catch(Exception e){    
            }    
        }else{
            //Crear arbol
            data = new ListaSimple(); 
        }
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }
    
    static ListaSimple data = new ListaSimple();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JTextField Correo;
    private javax.swing.JTextField DPI;
    private javax.swing.JTextField Direccion;
    private javax.swing.JTextField Municipio;
    private javax.swing.JTextField Nombre;
    private javax.swing.JButton Registro1;
    private javax.swing.JButton Regresar;
    private javax.swing.JTextField Tel;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
