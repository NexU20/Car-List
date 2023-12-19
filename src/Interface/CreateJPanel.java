/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Car;
import Business.CarList;
import Business.ExcelRead;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.apache.poi.hssf.usermodel.HSSFCell;

/**
 *
 * @author ankit
 */
public class CreateJPanel extends javax.swing.JPanel {
    CarList cc;
    public CreateJPanel(CarList cc) {
        initComponents();
        this.cc=cc;
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        avalButtonGroup = new javax.swing.ButtonGroup();
        manCertButtonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        createBtn = new javax.swing.JButton();
        selectFileBtn = new javax.swing.JButton();
        uploadFileTxtField = new javax.swing.JTextField();
        manTxtField = new javax.swing.JTextField();
        serNumTxtField = new javax.swing.JTextField();
        modTxtField = new javax.swing.JTextField();
        manYearTxtField = new javax.swing.JTextField();
        noOfSeatsTxtField = new javax.swing.JTextField();
        cityTxtField = new javax.swing.JTextField();
        uploadJButton = new javax.swing.JButton();
        yesRadioBtn = new javax.swing.JRadioButton();
        noRadioBtn = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(18, 18, 18));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(18, 18, 18));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buat Katalog");

        jLabel2.setBackground(new java.awt.Color(18, 18, 18));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pabrikan");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nomor Seri");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nomor Model");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tahun Produksi");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Jumlah Penumpang");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Kota");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tersedia");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sertifikat");

        createBtn.setBackground(new java.awt.Color(2, 132, 199));
        createBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        createBtn.setForeground(new java.awt.Color(255, 255, 255));
        createBtn.setText("Buat");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        selectFileBtn.setText("Select File");
        selectFileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFileBtnActionPerformed(evt);
            }
        });

        manTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manTxtFieldActionPerformed(evt);
            }
        });

        uploadJButton.setBackground(new java.awt.Color(132, 204, 22));
        uploadJButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        uploadJButton.setText("Upload");
        uploadJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadJButtonActionPerformed(evt);
            }
        });

        avalButtonGroup.add(yesRadioBtn);
        yesRadioBtn.setForeground(new java.awt.Color(255, 255, 255));
        yesRadioBtn.setSelected(true);
        yesRadioBtn.setText("Yes");

        avalButtonGroup.add(noRadioBtn);
        noRadioBtn.setForeground(new java.awt.Color(255, 255, 255));
        noRadioBtn.setText("No");

        manCertButtonGroup.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Valid");

        manCertButtonGroup.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Expired");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cityTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noOfSeatsTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manYearTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(serNumTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(yesRadioBtn)
                                    .addComponent(jRadioButton1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton2)
                                    .addComponent(noRadioBtn))
                                .addGap(5, 5, 5)))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uploadFileTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(uploadJButton)))
                        .addGap(18, 18, 18)
                        .addComponent(selectFileBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(createBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(jLabel1)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(manTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uploadFileTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectFileBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(serNumTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(uploadJButton)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manYearTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(noOfSeatsTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cityTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(yesRadioBtn)
                    .addComponent(noRadioBtn))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(47, 47, 47)
                .addComponent(createBtn)
                .addContainerGap(281, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manTxtFieldActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {
        int countError = validateInputFields();

        if (countError == 0) {
            Car c = createCarObject();
            cc.setUpdateTime(new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date()));

            // Display success message
            JOptionPane.showMessageDialog(null, "Berhasil menambahkan Mobil !!!");

            // Reset input fields
            resetInputFields();
        }
    }//GEN-LAST:event_createBtnActionPerformed

    // validate input fields
    private int validateInputFields() {
        int countError = 0;

        if (isEmptyField(cityTxtField) || isEmptyField(modTxtField) || isEmptyField(manTxtField) ||
            isEmptyField(serNumTxtField) || isEmptyField(manYearTxtField) || isEmptyField(noOfSeatsTxtField)) {
            JOptionPane.showMessageDialog(null, "Tolong Masukan Semua Field.");
            countError++;
        } else {
            countError += validateNumericField(manYearTxtField, "Tolong Masukan Angka Numerik Unuk Tahunnya.");
            countError += validateNumericField(noOfSeatsTxtField, "Jumlah Penumpang Harus Numerik.");
        }

        return countError;
    }

    // check if the input field is empty
    private boolean isEmptyField(JTextField textField) {
        return textField.getText().trim().isEmpty();
    }

    // validate if the input is numeric
    private int validateNumericField(JTextField textField, String errorMessage) {
        try {
            Integer.parseInt(textField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, errorMessage);
            return 1;
        }
        return 0;
    }

    // Tambah Katalog
    private Car createCarObject() {
        String manufacturer = manTxtField.getText();
        int manYear = Integer.parseInt(manYearTxtField.getText());
        String serialNum = serNumTxtField.getText();
        int noOfSeats = Integer.parseInt(noOfSeatsTxtField.getText());
        String modelNumber = modTxtField.getText();
        String city = cityTxtField.getText();
        String mainCert = getSelectedButtonText(manCertButtonGroup);
        boolean isAvailable = "YES".equalsIgnoreCase(getSelectedButtonText(avalButtonGroup));

        Car c = cc.addCar();
        c.setCity(city);
        c.setIsAvailable(isAvailable);
        c.setMainCert(mainCert);
        c.setManYear(manYear);
        c.setManufacturer(manufacturer);
        c.setModelNumber(modelNumber);
        c.setNoOfSeats(noOfSeats);
        c.setSerialNum(serialNum);

        return c;
    }

    // get the selected radio button text
    private String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                return button.getText();
            }
        }
        return null;
    }

    // reset input fields
    private void resetInputFields() {
        manTxtField.setText("");
        manYearTxtField.setText("");
        serNumTxtField.setText("");
        noOfSeatsTxtField.setText("");
        modTxtField.setText("");
        cityTxtField.setText("");
    }

    private void uploadJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadJButtonActionPerformed
        String fileName = uploadFileTxtField.getText();
    
        if (fileName.isEmpty()) {
            showErrorMessage("Please select a file first and then click on upload");
        } else if (!fileName.endsWith(".xls")) {
            showErrorMessage("Please select an XLS file with correct data");
        } else {
            processExcelFile(fileName);
        }
    }//GEN-LAST:event_uploadJButtonActionPerformed
    
    private void processExcelFile(String fileName) {
        try {
            ExcelRead excelReader = new ExcelRead();
            List<List<HSSFCell>> list = excelReader.mainRead(fileName);
    
            for (List<HSSFCell> cell : list) {
                Car car = createCarFromExcelCell(cell);
                // cc.addCar(car);
            }
    
            cc.setUpdateTime(new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date()));
            showSuccessMessage("Car details SUCCESSFULLY saved !!!");
        } catch (Exception ex) {
            Logger.getLogger(CreateJPanel.class.getName()).log(Level.SEVERE, null, ex);
            showErrorMessage("Error processing the Excel file");
        }
    }
    
    // create catalog based on excell file
    private Car createCarFromExcelCell(List<HSSFCell> cell) {
        Car car = cc.addCar();
        car.setManufacturer(cell.get(0).getRichStringCellValue().getString());
    
        int manYear = (int) (cell.get(1).getNumericCellValue());
        car.setManYear(manYear);
    
        car.setSerialNum(cell.get(2).getRichStringCellValue().getString());
    
        int noOfSeats = (int) (cell.get(3).getNumericCellValue());
        car.setNoOfSeats(noOfSeats);
    
        car.setModelNumber(cell.get(4).getRichStringCellValue().getString());
        car.setCity(cell.get(5).getRichStringCellValue().getString());
        car.setMainCert(cell.get(6).getRichStringCellValue().getString());
    
        String isAval = (cell.get(7).getRichStringCellValue().getString());
        boolean isAvailable = isAval.equalsIgnoreCase("YES");
        car.setIsAvailable(isAvailable);
    
        return car;
    }
    
    private void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
    private void showSuccessMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    private void selectFileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFileBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f= chooser.getSelectedFile();
        String fileName= f.getAbsolutePath();
        uploadFileTxtField.setText(fileName);
    }//GEN-LAST:event_selectFileBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup avalButtonGroup;
    private javax.swing.JTextField cityTxtField;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.ButtonGroup manCertButtonGroup;
    private javax.swing.JTextField manTxtField;
    private javax.swing.JTextField manYearTxtField;
    private javax.swing.JTextField modTxtField;
    private javax.swing.JTextField noOfSeatsTxtField;
    private javax.swing.JRadioButton noRadioBtn;
    private javax.swing.JButton selectFileBtn;
    private javax.swing.JTextField serNumTxtField;
    private javax.swing.JTextField uploadFileTxtField;
    private javax.swing.JButton uploadJButton;
    private javax.swing.JRadioButton yesRadioBtn;
    // End of variables declaration//GEN-END:variables
}
