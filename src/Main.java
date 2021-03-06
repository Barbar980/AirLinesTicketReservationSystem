
import users.userCreation;
import flights.addflight;
import tickets.ticket;
import tickets.ticketreport;
import customers.addCustomer;
import customers.searchCustomer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Barbar
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        customerBarMenu = new javax.swing.JMenu();
        addCustomerMenuBar = new javax.swing.JMenuItem();
        searchCustomerBarMenu = new javax.swing.JMenuItem();
        ticketsBarMenu = new javax.swing.JMenu();
        ticketReportBarMenu = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        flightBarMenu = new javax.swing.JMenu();
        addFlightBarMenu = new javax.swing.JMenuItem();
        userBarMenu = new javax.swing.JMenu();
        userCreationBarMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(800, 800));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1335, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 707, Short.MAX_VALUE)
        );

        customerBarMenu.setText("Customer");

        addCustomerMenuBar.setText("Add Customer");
        addCustomerMenuBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerMenuBarActionPerformed(evt);
            }
        });
        customerBarMenu.add(addCustomerMenuBar);

        searchCustomerBarMenu.setText("Search Customer");
        searchCustomerBarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustomerBarMenuActionPerformed(evt);
            }
        });
        customerBarMenu.add(searchCustomerBarMenu);

        jMenuBar1.add(customerBarMenu);

        ticketsBarMenu.setText("Tickets");

        ticketReportBarMenu.setText("Book Ticket");
        ticketReportBarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketReportBarMenuActionPerformed(evt);
            }
        });
        ticketsBarMenu.add(ticketReportBarMenu);

        jMenuItem6.setText("Ticket Report");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        ticketsBarMenu.add(jMenuItem6);

        jMenuBar1.add(ticketsBarMenu);

        flightBarMenu.setText("Flight");

        addFlightBarMenu.setText("Add Flight");
        addFlightBarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFlightBarMenuActionPerformed(evt);
            }
        });
        flightBarMenu.add(addFlightBarMenu);

        jMenuBar1.add(flightBarMenu);

        userBarMenu.setText("User");

        userCreationBarMenu.setText("User Creation");
        userCreationBarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userCreationBarMenuActionPerformed(evt);
            }
        });
        userBarMenu.add(userCreationBarMenu);

        jMenuBar1.add(userBarMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1335, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /********************
    Create connect betwen main menu and subwindow where we can add new CUstomer
    ********************/
    private void addCustomerMenuBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerMenuBarActionPerformed
        addCustomer cus = new addCustomer();
        jDesktopPane1.add(cus);
        cus.setVisible(true); 
    }//GEN-LAST:event_addCustomerMenuBarActionPerformed

    private void searchCustomerBarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustomerBarMenuActionPerformed
        searchCustomer scus = new searchCustomer();
        jDesktopPane1.add(scus);
        scus.setVisible(true); 
    }//GEN-LAST:event_searchCustomerBarMenuActionPerformed

    private void addFlightBarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFlightBarMenuActionPerformed
        addflight addFlight = new addflight();
        jDesktopPane1.add(addFlight);
        addFlight.setVisible(true); 
    }//GEN-LAST:event_addFlightBarMenuActionPerformed

    private void ticketReportBarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketReportBarMenuActionPerformed
        ticket bookTicket = new ticket();
        jDesktopPane1.add(bookTicket);
        bookTicket.setVisible(true); 
    }//GEN-LAST:event_ticketReportBarMenuActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        ticketreport ticketReport = new ticketreport();
        jDesktopPane1.add(ticketReport);
        ticketReport.setVisible(true); 
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void userCreationBarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userCreationBarMenuActionPerformed
        userCreation userCreation = new userCreation();
        jDesktopPane1.add(userCreation);
        userCreation.setVisible(true); 
    }//GEN-LAST:event_userCreationBarMenuActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addCustomerMenuBar;
    private javax.swing.JMenuItem addFlightBarMenu;
    private javax.swing.JMenu customerBarMenu;
    private javax.swing.JMenu flightBarMenu;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem searchCustomerBarMenu;
    private javax.swing.JMenuItem ticketReportBarMenu;
    private javax.swing.JMenu ticketsBarMenu;
    private javax.swing.JMenu userBarMenu;
    private javax.swing.JMenuItem userCreationBarMenu;
    // End of variables declaration//GEN-END:variables
}
