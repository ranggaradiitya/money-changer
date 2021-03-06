/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneychanger;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author user
 */
public class Home extends javax.swing.JFrame implements Dashboard {
    
    //Deklarasi variabel
    double input = 0, result = 0;
    String from, to, amount1, amount2, name, utilities;

    /**
     * Creates new form MoneyChangerF
     */
    public Home() {
      initComponents();

      // PERINTAH AGAR TAMPILAN PROGRAM DITENGAH LAYAR
      // mengambil ukuran layar
      Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

      // membuat titik x dan y
      int x = layar.width / 2  - this.getSize().width / 2;
      int y = layar.height / 2 - this.getSize().height / 2;

      this.setLocation(x, y); 
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel2 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    cmbFrom = new javax.swing.JComboBox<>();
    cmbTo = new javax.swing.JComboBox<>();
    jLabel5 = new javax.swing.JLabel();
    btnConvert = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    amount = new javax.swing.JTextField();
    amountConverted = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    btnReset = new javax.swing.JButton();
    jLabel6 = new javax.swing.JLabel();
    txtName = new javax.swing.JTextField();
    txtUtilities = new javax.swing.JTextField();
    jLabel8 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    btnExit = new javax.swing.JButton();
    jButton1 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel2.setBackground(new java.awt.Color(204, 204, 204));

    jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel2.setText("From :");

    cmbFrom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    cmbFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "US Dollar", "Euro", "British Pound", "Indonesian Rupiah", "Indian Rupee" }));
    cmbFrom.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cmbFromActionPerformed(evt);
      }
    });

    cmbTo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    cmbTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "US Dollar", "Euro", "British Pound", "Indonesian Rupiah", "Indian Rupee" }));
    cmbTo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cmbToActionPerformed(evt);
      }
    });

    jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel5.setText("To :");

    btnConvert.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
    btnConvert.setText("Convert ");
    btnConvert.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnConvertActionPerformed(evt);
      }
    });

    jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jTable1.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null}
      },
      new String [] {
        "Name", "Utilities", "From", "To", "Amount", "Converted Amount"
      }
    ));
    jTable1.setGridColor(java.awt.Color.black);
    jTable1.setRowHeight(25);
    jScrollPane1.setViewportView(jTable1);

    amount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    amount.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        amountActionPerformed(evt);
      }
    });

    amountConverted.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    amountConverted.setForeground(java.awt.Color.red);
    amountConverted.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        amountConvertedActionPerformed(evt);
      }
    });

    jLabel4.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(255, 0, 0));
    jLabel4.setText("Dolarindo");

    jLabel1.setBackground(new java.awt.Color(255, 51, 51));
    jLabel1.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(0, 51, 255));
    jLabel1.setText("Money Changer");

    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel3.setText("Enter Amount to Convert : ");

    jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel7.setText("Total Amount Converted :");

    btnReset.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
    btnReset.setText("Reset");
    btnReset.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnResetActionPerformed(evt);
      }
    });

    jLabel6.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 36)); // NOI18N
    jLabel6.setText("History");

    txtName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

    txtUtilities.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    txtUtilities.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtUtilitiesActionPerformed(evt);
      }
    });

    jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel8.setText("Name :");

    jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel9.setText("Utilities :");

    btnExit.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
    btnExit.setText("Exit");
    btnExit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnExitActionPerformed(evt);
      }
    });

    jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
    jButton1.setText("Generate Receipt");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(42, 42, 42)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel8)
              .addComponent(amount)
              .addComponent(cmbFrom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(txtName))
            .addGap(66, 66, 66)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel9)
              .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(amountConverted)
                .addComponent(cmbTo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtUtilities))))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(96, 96, 96)
            .addComponent(btnConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel6)
            .addGap(114, 114, 114)
            .addComponent(jButton1))
          .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(20, 20, 20))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(338, 338, 338))
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(393, 393, 393)
        .addComponent(jLabel4)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel4)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(113, 113, 113)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel9))
            .addGap(18, 18, 18)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtUtilities, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbTo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel3)
              .addComponent(jLabel7))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(amountConverted, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(58, 58, 58)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(btnConvert)
              .addComponent(btnReset)
              .addComponent(btnExit))
            .addGap(34, 34, 34))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel1)
            .addGap(32, 32, 32)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel6)
              .addComponent(jButton1))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    @Override
    public void setWidthColumnForTable() {
      jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
      TableColumn col;

      col = jTable1.getColumnModel().getColumn(0);
      col.setPreferredWidth(100);

      col = jTable1.getColumnModel().getColumn(1);
      col.setPreferredWidth(117);

      col = jTable1.getColumnModel().getColumn(2);
      col.setPreferredWidth(100);

      col = jTable1.getColumnModel().getColumn(3);
      col.setPreferredWidth(100);

      col = jTable1.getColumnModel().getColumn(4);
      col.setPreferredWidth(100);

      col = jTable1.getColumnModel().getColumn(5);
      col.setPreferredWidth(100);
    }
    
    @Override
    public void createReceipt() {
      Receipt r = new Receipt();

      r.setVisible(true);

      r.area.setText("****************************************\n");
      r.area.setText(r.area.getText() + "*        Dolarindo Money Changer       *\n");
      r.area.setText(r.area.getText() + "****************************************\n");

      Date obj = new Date();

      String date = obj.toString();

      r.area.setText(r.area.getText() + "\n " + date + "\n\n");
      r.area.setText(r.area.getText() + " Name : " + txtName.getText() + "\n\n");
      r.area.setText(r.area.getText() + " Utilities : " + txtUtilities.getText() + "\n\n");
      r.area.setText(r.area.getText() + " From : " + cmbFrom.getSelectedItem().toString() + "\n\n");
      r.area.setText(r.area.getText() + " To : " + cmbTo.getSelectedItem().toString() + "\n\n");
      r.area.setText(r.area.getText() + " Amount of Convert : " + amount.getText() + "\n\n");
      r.area.setText(r.area.getText() + " Total Amount Converted : " + amountConverted.getText() + "\n\n");
    }
    
    public Home(ArrayList<String> p) {
      initComponents();
    }
    
    ArrayList<Form> riwayat = new ArrayList<>();
    DefaultTableModel tableMode1;

    @Override
    public void history() {{
      String[] columns = {"Name", "Utilities", "From", "To", "Amount", "Converted Amount"};
      Object[][] objData = new Object[riwayat.size()][6];

      int i = 0;
      for (Form n : riwayat) {
          String[] arrData = {n.getName(),n.getUtilities(), n.getFromCurrency(), n.getToCurrency(), n.getAmountToConvert(), n.getAmountConverted()};
          objData[i] = arrData;
          i++;
      }

      tableMode1 = new DefaultTableModel(objData, columns) {
          @Override
          public boolean isCellEditable(int rowIndex, int colIndex) {
              return false;
          }
      };

      jTable1.setModel(tableMode1);  
    }}
    
    @Override
    public void isiData(String name, String utilities, String from, String to, String amount1, String amount2) {
      Form ed = new Form(name, utilities, from, to, amount1, amount2);
      riwayat.add(ed);
    }
    
    @Override
    public boolean validation() {
      return !(txtName.getText().equals("") || txtUtilities.getText().equals("") || amount.getText().equals(""));
    }
    
    private void amountConvertedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountConvertedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountConvertedActionPerformed

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountActionPerformed

    private void cmbToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbToActionPerformed

    private void cmbFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFromActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
      txtName.setText(null);
      txtUtilities.setText(null);
      cmbFrom.setSelectedIndex(0);
      cmbTo.setSelectedIndex(0);
      amount.setText(null);
      amountConverted.setText(null);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
      if (!validation()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields! except total amount converted");
      } else {
        if (amount.getText().matches(".*[a-zA-Z]+.*")) {
          JOptionPane.showMessageDialog(this, "Input can only be numbers in the amount to convert field!");
        } else {
          name = txtName.getText();
          utilities = txtUtilities.getText();
          from = cmbFrom.getSelectedItem().toString();
          to = cmbTo.getSelectedItem().toString();
          amount1 = amount.getText();
          input = Double.parseDouble(amount1);

          Currency convertDollar = new Dollar(cmbTo, input, result);
          Currency convertEuro = new Euro(cmbTo, input, result);
          Currency convertPound = new Pound(cmbTo, input, result);
          Currency convertRupiah = new Rupiah(cmbTo, input, result);
          Currency convertRupee = new Rupee(cmbTo, input, result);

          if (cmbFrom.getSelectedItem() == "US Dollar") {
              convertDollar.convert();
              result = convertDollar.getResult();
          } else if (cmbFrom.getSelectedItem() == "Euro") {
              convertEuro.convert();
              result = convertEuro.getResult();
          } else if (cmbFrom.getSelectedItem() == "British Pound") {
              convertPound.convert();
              result = convertPound.getResult();
          } else if (cmbFrom.getSelectedItem() == "Indonesian Rupiah") {
              convertRupiah.convert();
              result = convertRupiah.getResult();
          } else {
              convertRupee.convert();
              result = convertRupee.getResult();
          }

          String value = String.format("%.2f", result);
          amountConverted.setText(value);
          amount2 = amountConverted.getText();
          isiData(name, utilities, from, to, amount1, amount2);
          history();
          setWidthColumnForTable();
        }
      }
    }//GEN-LAST:event_btnConvertActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtUtilitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUtilitiesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUtilitiesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      createReceipt();
    }//GEN-LAST:event_jButton1ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Home().setVisible(true);
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextField amount;
  private javax.swing.JTextField amountConverted;
  private javax.swing.JButton btnConvert;
  private javax.swing.JButton btnExit;
  private javax.swing.JButton btnReset;
  private javax.swing.JComboBox<String> cmbFrom;
  private javax.swing.JComboBox<String> cmbTo;
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTable1;
  private javax.swing.JTextField txtName;
  private javax.swing.JTextField txtUtilities;
  // End of variables declaration//GEN-END:variables
}
