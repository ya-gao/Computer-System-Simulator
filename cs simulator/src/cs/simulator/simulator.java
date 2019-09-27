/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.simulator;

/**
 *
 * @author dilipvarma
 */

import Registers.*;
import Memory.*;

public class simulator extends javax.swing.JFrame {

    /**
     * Creates new form simulator
     */
    public simulator() {
        initComponents();
        store.setEnabled(false);
        load.setEnabled(false);
        halt.setEnabled(false);
        r0.setEnabled(false);
        r1.setEnabled(false);
        r2.setEnabled(false);
        r3.setEnabled(false);
        pc.setEnabled(false);
        mar.setEnabled(false);
        mbr.setEnabled(false);
        mfr.setEnabled(false);
        cc.setEnabled(false);
        ixr1.setEnabled(false);
        ixr2.setEnabled(false);
        ixr3.setEnabled(false);
        ir.setEnabled(false);
        input.setEnabled(false);
        jLabel1.setEnabled(false);
        jLabel2.setEnabled(false);
        jLabel3.setEnabled(false);
        jLabel4.setEnabled(false);
        jLabel5.setEnabled(false);
        jLabel6.setEnabled(false);
        jLabel7.setEnabled(false);
        jLabel8.setEnabled(false);
        jLabel9.setEnabled(false);
        jLabel10.setEnabled(false);
        jLabel11.setEnabled(false);
        jLabel12.setEnabled(false);
        jLabel13.setEnabled(false);
        jLabel15.setEnabled(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ipl = new javax.swing.JButton();
        load = new javax.swing.JButton();
        store = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        input = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        halt = new javax.swing.JButton();
        r0 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        r1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        r2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        r3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        mar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        mbr = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        mfr = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ixr1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ixr2 = new javax.swing.JTextField();
        ixr3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        ir = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ipl.setText("IPL");
        ipl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iplActionPerformed(evt);
            }
        });

        load.setText("Load");
        load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadActionPerformed(evt);
            }
        });

        store.setText("Store");
        store.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeActionPerformed(evt);
            }
        });

        input.setColumns(20);
        input.setRows(5);
        jScrollPane1.setViewportView(input);

        jLabel1.setText("R0");

        halt.setText("Halt");

        jLabel2.setText("R1");

        jLabel3.setText("R2");

        jLabel4.setText("R3");

        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });

        jLabel5.setText("PC");

        pc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcActionPerformed(evt);
            }
        });

        jLabel6.setText("MAR");

        jLabel7.setText("MBR");

        jLabel8.setText("MFR");

        jLabel9.setText("CC");

        jLabel10.setText("IXR1");

        jLabel11.setText("IXR2");

        jLabel12.setText("IXR3");

        jLabel13.setText("IR");

        ir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irActionPerformed(evt);
            }
        });

        jLabel15.setText("Input");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(r2)
                    .addComponent(r3)
                    .addComponent(pc)
                    .addComponent(mar)
                    .addComponent(mbr)
                    .addComponent(mfr)
                    .addComponent(cc)
                    .addComponent(ixr1)
                    .addComponent(r0)
                    .addComponent(ixr3)
                    .addComponent(ir)
                    .addComponent(ixr2))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ipl, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(halt, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(load, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(store, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(halt, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                        .addComponent(load, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(store, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ipl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(r0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(r3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(pc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(mar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(mbr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(mfr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ixr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ixr2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(ixr3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(ir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r3ActionPerformed

    private void pcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcActionPerformed

    private void irActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_irActionPerformed

    private void loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadActionPerformed
                    // TODO add your handling code here:
                    
                    String instruction= input.getText();
                  String opcode = instruction.substring(0,3);
	        String reg = instruction.substring(4,5);
                int reg1= Integer.parseInt(reg);
	        String ireg = instruction.substring(6,7);
                int ireg1= Integer.parseInt(ireg);
	        String mem = instruction.substring(8,9);
                int mem1= Integer.parseInt(mem);
	        String indirectadd = instruction.substring(10);
                int indirectadd1= Integer.parseInt(indirectadd);
        switch (opcode) {
            case "LDR":
                opcode = "000000";
                break;
            case "STR":
                opcode = "000010";
                break;
            case "LDA":
                opcode = "000011";
                break;
            case "LDX":
                opcode = "101001";
                break;
            default:
                opcode = "101010";
                break;
        }

        switch (reg) {
            case "0":
                reg = "00";
                break;
            case "1":
                reg = "01";
                break;
            case "2":
                reg = "10";
                break;
            case "3":
                reg = "11";
                break;
            default:
                break;
        }
        switch (ireg) {
            case "0":
                ireg = "00";
                break;
            case "1":
                ireg = "01";
                break;
            case "2":
                ireg = "10";
                break;
            case "3":
                ireg = "11";
                break;
            default:
                break;
        }
                //String s1="10";
         int j= Integer.parseInt(indirectadd);
        // System.out.println(j);
         String q= Integer.toBinaryString(j);
         int j1= Integer.parseInt(q);
         //System.out.println(j1);
         int count=0;
         while(j1>0)
         {
             j1=j1/10;
             count=count+1;
             
         }
         int count1=5-count;
         while(count1!=0)
         {
             q=0+q;
             count1--;
         }
                //  System.out.println(q);

	        String str = opcode + reg + ireg + mem + q;
	        System.out.println(str);
        Registers R = new Registers();
        Memory M = new Memory();
	        // LDR Instruction

                if(mem1!=0)
                {
                    if(ireg1!=00)
                    {
                        // indirect addressing/indexing
                        // Calculating Effective Address
                        // Add M[mem] and IX1 to get EA in integer format
                        int intEA = Integer.parseInt(M.getMemValue(R.getIX(ireg1)), 2) +
                                    Integer.parseInt(M.getMemValue(mem), 2);
                        // Convert integer EA into Binary String with leading zeros
                        String EA = String.format("%016d", Integer.toBinaryString(intEA));
                        // Set MAR with EA
                        R.setMAR(EA);
                        // Fetch M[MAR] into MBR
                        R.setMBR(M.getMemValue(R.getMAR()));
                        // Move the content of MBR into designated GPR
                        R.setGPR(reg1, R.getMBR());
                    }
                }
                else
                {
                    // NO indirect addressing, fetch the data stored at the address(ending part)
                    // Move content of M[mem] into MAR
                    /*
                     * Object R and M should be created when clicking the IPL button
                     */
                    R.setMAR(mem);
                    // Fetch M[MAR] into MBR
                    R.serMBR(M.getMemValue(R.getMAR()));
                    // Move the content of MBR into designated GPR
                    R.setGPR(reg1, R.getMBR());
                }
    }//GEN-LAST:event_loadActionPerformed

    private void iplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iplActionPerformed
        //ipl.setEnabled(false);
        //loadActionPerformed()
        store.setEnabled(true);
        load.setEnabled(true);
        halt.setEnabled(true);
        r0.setEnabled(true);
        r1.setEnabled(true);
        r2.setEnabled(true);
        r3.setEnabled(true);
        pc.setEnabled(true);
        mar.setEnabled(true);
        mbr.setEnabled(true);
        mfr.setEnabled(true);
        cc.setEnabled(true);
        ixr1.setEnabled(true);
        ixr2.setEnabled(true);
        ixr3.setEnabled(true);
        ir.setEnabled(true);
        input.setEnabled(true);
        jLabel1.setEnabled(true);
        jLabel2.setEnabled(true);
        jLabel3.setEnabled(true);
        jLabel4.setEnabled(true);
        jLabel5.setEnabled(true);
        jLabel6.setEnabled(true);
        jLabel7.setEnabled(true);
        jLabel8.setEnabled(true);
        jLabel9.setEnabled(true);
        jLabel10.setEnabled(true);
        jLabel11.setEnabled(true);
        jLabel12.setEnabled(true);
        jLabel13.setEnabled(true);
        jLabel15.setEnabled(true);
        

        
    }//GEN-LAST:event_iplActionPerformed

    private void storeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeActionPerformed
        // TODO add your handling code here:
         String instruction= input.getText();
                  String opcode = instruction.substring(0,3);
	        String reg = instruction.substring(4,5);
                int reg1= Integer.parseInt(reg);
	        String ireg = instruction.substring(6,7);
                int ireg1= Integer.parseInt(ireg);
	        String mem = instruction.substring(8,9);
                int mem1= Integer.parseInt(mem);
	        String indirectadd = instruction.substring(10);
                int indirectadd1= Integer.parseInt(indirectadd);
        switch (opcode) {
            case "LDR":
                opcode = "000000";
                break;
            case "STR":
                opcode = "000010";
                break;
            case "LDA":
                opcode = "000011";
                break;
            case "LDX":
                opcode = "101001";
                break;
            default:
                opcode = "101010";
                break;
        }

        switch (reg) {
            case "0":
                reg = "00";
                break;
            case "1":
                reg = "01";
                break;
            case "2":
                reg = "10";
                break;
            case "3":
                reg = "11";
                break;
            default:
                break;
        }
        switch (ireg) {
            case "0":
                ireg = "00";
                break;
            case "1":
                ireg = "01";
                break;
            case "2":
                ireg = "10";
                break;
            case "3":
                ireg = "11";
                break;
            default:
                break;
        }
                //String s1="10";
         int j= Integer.parseInt(indirectadd);
        // System.out.println(j);
         String q= Integer.toBinaryString(j);
         int j1= Integer.parseInt(q);
         //System.out.println(j1);
         int count=0;
         while(j1>0)
         {
             j1=j1/10;
             count=count+1;
             
         }
         int count1=5-count;
         while(count1!=0)
         {
             q=0+q;
             count1--;
         }
                //  System.out.println(q);

	        String str = opcode + reg + ireg + mem + q;
	        System.out.println(str);
                if(mem1!=0)
                {
                    if(ireg1!=00)
                    {
                        // fetch the data stored at IX register which will be an address
                        // add the data fetched with the address given in instruction
                        // load the resultant data into register
                    }
                }
                else
                {
                    // fetch the data stored at the address(ending part)
                    // store the data to memory from register
                }
        
    }//GEN-LAST:event_storeActionPerformed

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
            java.util.logging.Logger.getLogger(simulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(simulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(simulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(simulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new simulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cc;
    private javax.swing.JButton halt;
    private javax.swing.JTextArea input;
    private javax.swing.JButton ipl;
    private javax.swing.JTextField ir;
    private javax.swing.JTextField ixr1;
    private javax.swing.JTextField ixr2;
    private javax.swing.JTextField ixr3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton load;
    private javax.swing.JTextField mar;
    private javax.swing.JTextField mbr;
    private javax.swing.JTextField mfr;
    private javax.swing.JTextField pc;
    private javax.swing.JTextField r0;
    private javax.swing.JTextField r1;
    private javax.swing.JTextField r2;
    private javax.swing.JTextField r3;
    private javax.swing.JButton store;
    // End of variables declaration//GEN-END:variables
}
