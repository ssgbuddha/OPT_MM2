/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPT_UI;

/**
 *
 * @author Fogim
 */
public class Rotation_control extends javax.swing.JPanel {

    /**
     * Creates new form Rotation_control
     */
    OPT_hostframe parent_;
    int steps_per_revolution = 2000;
    
    public Rotation_control() {
        initComponents();
    }

    public void initialise(OPT_hostframe parent_ref){
        parent_ = parent_ref;
        calc_numproj_options();
    }
    
    public void calc_numproj_options(){
        steps_per_revolution = Integer.parseInt(steps_per_rev.getText());
        //Maybe try to reset value to nearest old one when I have time
        //int old_val = Integer.parseInt(num_proj.getSelectedItem().toString());
        num_proj.removeAllItems();
        //No point in checking when the divisor is <2...
        for (int i=1;i<=(steps_per_revolution/2)+1;i++){
            if (steps_per_revolution%i==0){
                num_proj.addItem(Integer.toString(i));
            }
        }
        //Add the whole number, for completeness
        num_proj.addItem(Integer.toString(steps_per_revolution));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        num_proj = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        steps_per_rev = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        run_acq = new javax.swing.JButton();
        run_calib = new javax.swing.JButton();

        num_proj.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        num_proj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_projActionPerformed(evt);
            }
        });

        jLabel1.setText("# projections");

        steps_per_rev.setText("2000");
        steps_per_rev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                steps_per_revActionPerformed(evt);
            }
        });

        jLabel2.setText("steps/rev");

        run_acq.setText("Run acquisition");
        run_acq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                run_acqActionPerformed(evt);
            }
        });

        run_calib.setText("Calibration");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(num_proj, 0, 124, Short.MAX_VALUE)
                    .addComponent(steps_per_rev))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(run_acq, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(run_calib, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num_proj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(run_acq))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(steps_per_rev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(run_calib))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void num_projActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_projActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_projActionPerformed

    private void steps_per_revActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_steps_per_revActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_steps_per_revActionPerformed

    private void run_acqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_run_acqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_run_acqActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> num_proj;
    private javax.swing.JButton run_acq;
    private javax.swing.JButton run_calib;
    private javax.swing.JTextField steps_per_rev;
    // End of variables declaration//GEN-END:variables
}