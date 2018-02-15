/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FOI;

import Data_Base.DATA_BASE;
import Data_Base.Parameter;
import Data_Base.ResultSetTableModel;
import java.sql.ResultSet;

/**
 *
 * @author DARIN
 */
public final class recu extends javax.swing.JFrame {

    /**
     * Creates new form recu
     */
    
    ResultSet rs;
    DATA_BASE db;
    
    public recu() {
        db = new DATA_BASE(new Parameter().HOST_DB, new Parameter().USERNAME_DB, new Parameter().PASSWORD_DB, 
                new Parameter().IPHOST, new Parameter().PORT);
        initComponents();
        importer();
    }
    
    public void importer() {
       String colon[] = {"num_invoice","code_product","reference","sales_price","stock_out","subtotal"};
        rs = db.fcSelectCommand(colon, "sales", "num_invoice='" + cashier.invoice_num.getText() + "'");
        table_Print.setModel(new ResultSetTableModel(rs));
        lbltot.setText(cashier.total_Rp2.getText());
        lblcas.setText(cashier.txt_cash.getText());
        payapres();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        table_print = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbltot = new javax.swing.JLabel();
        lblcas = new javax.swing.JLabel();
        lblpay = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_Print = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblpaid = new javax.swing.JLabel();
        lblcash = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(640, 450));
        setPreferredSize(new java.awt.Dimension(640, 450));
        setSize(new java.awt.Dimension(640, 450));
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Receipt");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(310, 40, 100, 50);

        table_print.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Num Invoice", "Code Product", "Reference", "Price of Sale", "Stock Out", "Subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_print);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 110, 630, 90);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("total :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(380, 230, 83, 28);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Cash  :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(370, 270, 83, 28);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Pay later :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(350, 310, 120, 28);

        lbltot.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbltot.setText("xx");
        jPanel1.add(lbltot);
        lbltot.setBounds(540, 230, 83, 28);

        lblcas.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblcas.setText("xx");
        jPanel1.add(lblcas);
        lblcas.setBounds(540, 270, 83, 28);

        lblpay.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblpay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpay.setText("xx");
        lblpay.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblpay);
        lblpay.setBounds(520, 310, 60, 28);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(60, 240, 140, 40);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(60, 290, 140, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 0, 410);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel3.setText("Receipt");
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(240, 10, 120, 55);

        table_Print.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "num_invoice", "code_product", "reference", "sales_price", "stock_out", "subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_Print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_PrintMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table_Print);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(10, 120, 600, 100);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Print");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(40, 280, 140, 50);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("Total:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(280, 250, 60, 40);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Cash:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(280, 300, 60, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setText("Paid Later:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(230, 350, 110, 40);

        lblpaid.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblpaid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpaid.setText("xx");
        lblpaid.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblpaid);
        lblpaid.setBounds(400, 350, 150, 40);

        lblcash.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblcash.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcash.setText("xx");
        getContentPane().add(lblcash);
        lblcash.setBounds(400, 300, 150, 40);

        lbltotal.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbltotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltotal.setText("xx");
        getContentPane().add(lbltotal);
        lbltotal.setBounds(400, 250, 150, 40);

        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(530, 30, 50, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.printComponents(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*cashier s = new cashier();
        s.setVisible(true);*/
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void table_PrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_PrintMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table_PrintMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.printComponents(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed
    
    //
     public void payapres() {
        double a = Double.parseDouble(cashier.total_Rp2.getText());
        double b = Double.parseDouble(cashier.txt_cash.getText());
        double c = b - a;
        lblpay.setText(Double.toString(c));
    }
     
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
            java.util.logging.Logger.getLogger(recu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new recu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JLabel lblcas;
    private javax.swing.JLabel lblcash;
    private javax.swing.JLabel lblpaid;
    public javax.swing.JLabel lblpay;
    public javax.swing.JLabel lbltot;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JTable table_Print;
    public javax.swing.JTable table_print;
    // End of variables declaration//GEN-END:variables
}