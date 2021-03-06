/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import java.awt.Color;
import javax.swing.JOptionPane;
import tempconversionlab.DoubleNumberLengthValidator;
import tempconversionlab.TempConverter;
import tempconversionlab.TextFieldValidateable;

/**
 *
 * @author Mark
 */
public class TempGui extends javax.swing.JDialog {
    
        private TempConverter tc;
        private final String DEGREE_SYMBOL="\u00b0";
    /**
     * Creates new form NewJDialog
     */
    public TempGui(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public TempGui() {
        initComponents();
        this.startNewConvert();
    }
    
    public void startNewConvert (){
        tc = new TempConverter();
        this.lblWarning.setText("");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblInputTemp = new javax.swing.JLabel();
        txtEnterTemp = new TextFieldValidateable(5);
        lblOut = new javax.swing.JLabel();
        btnEnter = new javax.swing.JButton();
        lblWarning = new javax.swing.JLabel();
        rdbF2C = new javax.swing.JRadioButton();
        rdbC2F = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblInputTemp.setFont(new java.awt.Font("Papyrus", 0, 13)); // NOI18N
        lblInputTemp.setForeground(new java.awt.Color(0, 0, 204));
        lblInputTemp.setText("Enter Temperature:");

        txtEnterTemp.setBackground(new java.awt.Color(240, 240, 240));
        txtEnterTemp.setFont(new java.awt.Font("Papyrus", 0, 13)); // NOI18N
        txtEnterTemp.setForeground(new java.awt.Color(204, 0, 102));
        txtEnterTemp.setText("0.00");
        txtEnterTemp.setValidator(new DoubleNumberLengthValidator("500","-100"));
        txtEnterTemp.setErrorMsg("Range Wrong");

        lblOut.setFont(new java.awt.Font("Papyrus", 1, 13)); // NOI18N
        lblOut.setForeground(new java.awt.Color(153, 0, 153));

        btnEnter.setFont(new java.awt.Font("Papyrus", 0, 13)); // NOI18N
        btnEnter.setText("Convert...");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        lblWarning.setFont(new java.awt.Font("Papyrus", 3, 13)); // NOI18N

        buttonGroup1.add(rdbF2C);
        rdbF2C.setFont(new java.awt.Font("Papyrus", 0, 13)); // NOI18N
        rdbF2C.setForeground(new java.awt.Color(0, 204, 204));
        rdbF2C.setSelected(true);
        rdbF2C.setText("F To C");

        buttonGroup1.add(rdbC2F);
        rdbC2F.setFont(new java.awt.Font("Papyrus", 0, 13)); // NOI18N
        rdbC2F.setForeground(new java.awt.Color(0, 204, 102));
        rdbC2F.setText("C To F");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblInputTemp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(txtEnterTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnEnter)
                        .addGap(68, 68, 68)
                        .addComponent(rdbF2C)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbC2F)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblOut, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInputTemp)
                    .addComponent(txtEnterTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbF2C)
                    .addComponent(rdbC2F)
                    .addComponent(btnEnter))
                .addGap(18, 18, 18)
                .addComponent(lblOut, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(lblWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
       Validator v=this.txtEnterTemp.getValidator;
       v.setTestValue(this.txtEnterTemp);
       if(!v.isValid()){
           JOptionPane.showMessageDialog(null, this.txtEnterTemp.getErrorMsg(), 
		"Validation Error", JOptionPane.ERROR_MESSAGE);
       }else{
        try{
           if(this.rdbF2C.isSelected()){
            tc.setfTempFromString(this.txtEnterTemp.getText());
            tc.convertFToC();
            this.lblOut.setText(tc.getcTempString()+this.DEGREE_SYMBOL+" C");
            this.lblWarning.setText("");
           }else{
            tc.setcTempFromString(this.txtEnterTemp.getText());
            tc.convertCToF();
            this.lblOut.setText(tc.getfTempString()+this.DEGREE_SYMBOL+" F");
            this.lblWarning.setText("");
           }
       }catch(NumberFormatException nf){
           this.lblWarning.setForeground(Color.GREEN);
           this.lblWarning.setText("Please Enter Only Numbers");
           
       }
      }  
       
    }//GEN-LAST:event_btnEnterActionPerformed

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
            java.util.logging.Logger.getLogger(TempGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TempGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TempGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TempGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TempGui dialog = new TempGui(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnter;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblInputTemp;
    private javax.swing.JLabel lblOut;
    private javax.swing.JLabel lblWarning;
    private javax.swing.JRadioButton rdbC2F;
    private javax.swing.JRadioButton rdbF2C;
    private javax.swing.JTextField txtEnterTemp;
    // End of variables declaration//GEN-END:variables
}
