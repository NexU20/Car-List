/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Car;
import Business.CarList;
import java.awt.BorderLayout;
import java.util.Enumeration;
import java.util.ListIterator;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author ankit
 */
public class SearchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchJPanel
     */
    CarList cc;
    
    public SearchJPanel(CarList cc) {
        initComponents();
        this.cc=cc;
        
        numOfCarsJTextField.setText(String.valueOf(cc.getCarCatalogue().size()));
        avalCarsNumJTextField.setText(String.valueOf(cc.noOfAvailableCars()));
        updatedDateTextField.setText(cc.getUpdateTime());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchButtonGroup = new javax.swing.ButtonGroup();
        firstAvalJBtn = new javax.swing.JButton();
        searchTxtField = new javax.swing.JTextField();
        ManufacturerJRadioButton = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        manYearJRadioButton = new javax.swing.JRadioButton();
        showAvalToggleBtn = new javax.swing.JToggleButton();
        modNumJRadioButton = new javax.swing.JRadioButton();
        cityJRadioButton = new javax.swing.JRadioButton();
        expMainCertJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        numOfCarsJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        avalCarsNumJTextField = new javax.swing.JTextField();
        searchFinalJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ourCarManJButton = new javax.swing.JButton();
        avaWithSeatsJBtn = new javax.swing.JButton();
        initialSeatTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        finalSeatTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        updatedDateTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(18, 18, 19));

        firstAvalJBtn.setBackground(new java.awt.Color(2, 132, 199));
        firstAvalJBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        firstAvalJBtn.setForeground(new java.awt.Color(255, 255, 255));
        firstAvalJBtn.setText("First Available Car");
        firstAvalJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstAvalJBtnActionPerformed(evt);
            }
        });

        searchButtonGroup.add(ManufacturerJRadioButton);
        ManufacturerJRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        ManufacturerJRadioButton.setSelected(true);
        ManufacturerJRadioButton.setText("Pabrik");
        ManufacturerJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManufacturerJRadioButtonActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cari Berdasarkan: ");

        searchButtonGroup.add(manYearJRadioButton);
        manYearJRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        manYearJRadioButton.setText("Tahun Produksi");
        manYearJRadioButton.setToolTipText("");

        showAvalToggleBtn.setBackground(new java.awt.Color(2, 132, 199));
        showAvalToggleBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        showAvalToggleBtn.setForeground(new java.awt.Color(255, 255, 255));
        showAvalToggleBtn.setText("Lihat yang Tersedia Saja");
        showAvalToggleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAvalToggleBtnActionPerformed(evt);
            }
        });

        searchButtonGroup.add(modNumJRadioButton);
        modNumJRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        modNumJRadioButton.setText("Nomor Model");

        searchButtonGroup.add(cityJRadioButton);
        cityJRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        cityJRadioButton.setText("Kota");

        expMainCertJButton.setText("Cars with Expired Maintenance Certificate");
        expMainCertJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expMainCertJButtonActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Jumlah Mobil:");

        numOfCarsJTextField.setEditable(false);
        numOfCarsJTextField.setEnabled(false);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total Mobil yang Tersedia: ");

        avalCarsNumJTextField.setEditable(false);
        avalCarsNumJTextField.setEnabled(false);

        searchFinalJButton.setBackground(new java.awt.Color(132, 204, 22));
        searchFinalJButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchFinalJButton.setText("Cari !");
        searchFinalJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFinalJButtonActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Get Available Cars: ");

        ourCarManJButton.setBackground(new java.awt.Color(2, 132, 199));
        ourCarManJButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ourCarManJButton.setForeground(new java.awt.Color(255, 255, 255));
        ourCarManJButton.setText("List Pabrik");
        ourCarManJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ourCarManJButtonActionPerformed(evt);
            }
        });

        avaWithSeatsJBtn.setBackground(new java.awt.Color(2, 132, 199));
        avaWithSeatsJBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        avaWithSeatsJBtn.setForeground(new java.awt.Color(255, 255, 255));
        avaWithSeatsJBtn.setText("Available with seats between");
        avaWithSeatsJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avaWithSeatsJBtnActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("and");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Last Updated On: ");

        updatedDateTextField.setEditable(false);
        updatedDateTextField.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cari Mobil di Katalog");

        searchButtonGroup.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Nomor Seri");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ManufacturerJRadioButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstAvalJBtn)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(avaWithSeatsJBtn)
                                            .addGap(18, 18, 18)
                                            .addComponent(initialSeatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel7)
                                            .addGap(18, 18, 18)
                                            .addComponent(finalSeatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(searchFinalJButton)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(18, 18, 18)
                                            .addComponent(avalCarsNumJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(showAvalToggleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(searchTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityJRadioButton)
                            .addComponent(manYearJRadioButton)
                            .addComponent(jLabel2)
                            .addComponent(ourCarManJButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(numOfCarsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(expMainCertJButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updatedDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(modNumJRadioButton)
                            .addComponent(jRadioButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel9)))
                .addContainerGap(448, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(33, 33, 33)
                .addComponent(ourCarManJButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(numOfCarsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(avalCarsNumJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstAvalJBtn)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avaWithSeatsJBtn)
                    .addComponent(initialSeatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(finalSeatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchFinalJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ManufacturerJRadioButton)
                    .addComponent(showAvalToggleBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manYearJRadioButton)
                .addGap(8, 8, 8)
                .addComponent(modNumJRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cityJRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(expMainCertJButton)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(updatedDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void firstAvalJBtnActionPerformed(java.awt.event.ActionEvent evt) {
        cc.flushSearchCatalog();
        Car firstAvail = findFirstAvailableCar();

        if (firstAvail == null) {
            JOptionPane.showMessageDialog(null, "Sorry! No cars are available at this time.");
        } else {
            cc.addCarToSearch(firstAvail);
        }

        ViewSearchJPanelFinal vp = new ViewSearchJPanelFinal(cc);

        setLayout(new BorderLayout());
        add(vp, BorderLayout.EAST, 1); // 3rd argument is index
        setVisible(true);
        repaint();
        revalidate();
    }

    // Helper method to find the first available car
    private Car findFirstAvailableCar() {
        for (Car car : cc.getCarCatalogue()) {
            if (car.getIsAvailable()) {
                return car;
            }
        }
        return null;
    }//GEN-LAST:event_firstAvalJBtnActionPerformed

    private void searchFinalJButtonActionPerformed(java.awt.event.ActionEvent evt) {
        cc.flushSearchCatalog();
        String check = getSelectedButtonText(searchButtonGroup);

        if (searchTxtField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Tolong masukan kata kunci pencarian.");
        } else {
            cc.searchList(searchTxtField.getText(), check);

            if (showAvalToggleBtn.isSelected()) {
                ListIterator<Car> iter = cc.getCarSearchCatalogue().listIterator();
                while (iter.hasNext()) {
                    if (!iter.next().getIsAvailable()) {
                        iter.remove();
                    }
                }
            }

            ViewSearchJPanelFinal vp = new ViewSearchJPanelFinal(cc);
            setLayout(new BorderLayout());
            add(vp, BorderLayout.EAST, 1); // 3rd argument is index
            setVisible(true);
            repaint();
            revalidate();
        }
    }

    // Helper method to get the selected radio button text
    private String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements(); ) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                return button.getText();
            }
        }
        return null;
    }//GEN-LAST:event_searchFinalJButtonActionPerformed

    private void ManufacturerJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManufacturerJRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ManufacturerJRadioButtonActionPerformed

    private void showAvalToggleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAvalToggleBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showAvalToggleBtnActionPerformed

    private void expMainCertJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expMainCertJButtonActionPerformed
        // TODO add your handling code here:
        
         cc.flushSearchCatalog();
                
         cc.searchList("Expired", "Certificate");
         ViewSearchJPanelFinal vp= new ViewSearchJPanelFinal(cc);

          setLayout(new BorderLayout());
          add(vp ,BorderLayout.EAST,1);//3rd argument is index
          setVisible(true);
          repaint();
          revalidate();
    }//GEN-LAST:event_expMainCertJButtonActionPerformed

    // Search based on number of seats
    private void avaWithSeatsJBtnActionPerformed(java.awt.event.ActionEvent evt) {
        cc.flushSearchCatalog();
    
        
        try {
            int start = Integer.parseInt(initialSeatTextField.getText());
            int end = Integer.parseInt(finalSeatTextField.getText());
            
            
            if (!initialSeatTextField.getText().equals("") || !finalSeatTextField.getText().equals("")) {
                cc.searchCarBetweenSeatNumbers(start, end);
                
                ViewSearchJPanelFinal vp = new ViewSearchJPanelFinal(cc);

                setLayout(new BorderLayout());
                add(vp, BorderLayout.EAST, 1);
                setVisible(true);
                repaint();
                revalidate();
            } else {
                showErrorMessage("Tolong masukan jumlah kursi.");
            }
        } catch (NumberFormatException e) {
            showErrorMessage("Tolong hanya memasukan angka numerik.");
        }
    }//GEN-LAST:event_avaWithSeatsJBtnActionPerformed

    // Show Error Message
    private void showErrorMessage(String message) {
        setVisible(true);
        repaint();
        revalidate();
        JOptionPane.showMessageDialog(null, message);
    }

    private void ourCarManJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ourCarManJButtonActionPerformed
        // TODO add your handling code here:
        
        cc.flushSearchCatalog();
        
        CarManuJPanel vp= new CarManuJPanel(cc);

        setLayout(new BorderLayout());
        add(vp ,BorderLayout.EAST,1);//3rd argument is index
        setVisible(true);
        repaint();
        revalidate(); 
    }//GEN-LAST:event_ourCarManJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ManufacturerJRadioButton;
    private javax.swing.JButton avaWithSeatsJBtn;
    private javax.swing.JTextField avalCarsNumJTextField;
    private javax.swing.JRadioButton cityJRadioButton;
    private javax.swing.JButton expMainCertJButton;
    private javax.swing.JTextField finalSeatTextField;
    private javax.swing.JButton firstAvalJBtn;
    private javax.swing.JTextField initialSeatTextField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton manYearJRadioButton;
    private javax.swing.JRadioButton modNumJRadioButton;
    private javax.swing.JTextField numOfCarsJTextField;
    private javax.swing.JButton ourCarManJButton;
    private javax.swing.ButtonGroup searchButtonGroup;
    private javax.swing.JButton searchFinalJButton;
    private javax.swing.JTextField searchTxtField;
    private javax.swing.JToggleButton showAvalToggleBtn;
    private javax.swing.JTextField updatedDateTextField;
    // End of variables declaration//GEN-END:variables
}