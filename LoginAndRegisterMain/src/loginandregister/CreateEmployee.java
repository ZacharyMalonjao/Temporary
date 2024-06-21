/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginandregister;

import javax.swing.JOptionPane;

/**
 *
 * @author Claire
 */
public class CreateEmployee extends javax.swing.JFrame {
    private EmployeeCSVReader reader;
    /**
     * Creates new form EmployeeDisplayInformation
     */
    public CreateEmployee() {
        initComponents();
        
       //Create employee here 
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
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldPhoneNum = new javax.swing.JTextField();
        jTextFieldLastName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldAddress = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextFieldFirstName = new javax.swing.JTextField();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonExit = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jTextField10 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jTextField18 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jTextField19 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldPhoneAllowance = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextFieldClothingAllowance = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldRiceSubsidy = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldHourlyRate = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextFieldBasicSalary = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextFieldGrossSemiMonthly = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jTextField23 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jTextField26 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jTextField27 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jComboBoxPosition = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextFieldEmpNum = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jTextFieldPhilHealthNum = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jTextField32 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jTextFieldSSSNum = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jTextFieldTINNum = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jTextField35 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jTextField36 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jTextField37 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jTextField38 = new javax.swing.JTextField();
        jTextFieldPagibigNum = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButtonSave = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Address");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 50, 20));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Phone Number");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 90, 20));
        jPanel2.add(jTextFieldPhoneNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 210, -1));
        jPanel2.add(jTextFieldLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 210, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Employee Information");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 20));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Last Name");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 60, 20));
        jPanel2.add(jTextFieldAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 210, 20));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Birth Day");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 80, 20));

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("First Name");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 60, 20));
        jPanel2.add(jTextFieldFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 210, -1));
        jPanel2.add(jCalendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 210, 110));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 380, 300));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Employee Number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 110, 20));

        jPanel3.setBackground(new java.awt.Color(153, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MotorPH");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 160, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Payroll System");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        jButtonExit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(255, 0, 51));
        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 70));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 160, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Government Records");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Name");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 40, 20));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 370, 420));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 160, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Government Records");
        jPanel7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Pag-IBIG Number");
        jPanel7.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 100, 20));

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 160, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Government Records");
        jPanel8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Name");
        jPanel8.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 40, 20));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 370, 420));

        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("SSS Number");
        jPanel7.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 70, 20));
        jPanel7.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 160, -1));

        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("TIN Number");
        jPanel7.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 70, 20));
        jPanel7.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 160, -1));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 370, 200));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Salary Details");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 20));
        jPanel4.add(jTextFieldPhoneAllowance, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 110, -1));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Phone Allowance");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 20));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Clothing Allowance");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, 20));
        jPanel4.add(jTextFieldClothingAllowance, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 110, -1));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Rice Subsidy");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 20));
        jPanel4.add(jTextFieldRiceSubsidy, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 110, -1));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Hourly Rate");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 20));
        jPanel4.add(jTextFieldHourlyRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 110, -1));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Gross Semi-Monthly");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 120, 20));
        jPanel4.add(jTextFieldBasicSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 110, -1));

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Basic Salary");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 70, 20));
        jPanel4.add(jTextFieldGrossSemiMonthly, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 110, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 370, 260));

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Employment Details");
        jPanel9.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel10.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 160, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Government Records");
        jPanel10.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Name");
        jPanel10.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 40, 20));

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 370, 420));

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Position");
        jPanel9.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 70, 20));

        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Status");
        jPanel9.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 70, 20));

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel11.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 160, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Government Records");
        jPanel11.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Pag-IBIG Number");
        jPanel11.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 100, 20));

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel12.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 160, -1));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Government Records");
        jPanel12.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Name");
        jPanel12.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 40, 20));

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 370, 420));

        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("SSS Number");
        jPanel11.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 70, 20));
        jPanel11.add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 160, -1));

        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("TIN Number");
        jPanel11.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 70, 20));
        jPanel11.add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 160, -1));

        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 370, 200));

        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Supervisor");
        jPanel9.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 100, 20));

        jComboBoxPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chief Executive Officer", "Chief Operating Officer", "Chief Finance Officer", "Chief Marketing Officer", "Account Manager", "IT Operations and Systems", "HR Manager", "Accounting Head", "Sales & Marketing", "Supply Chain and Logistics", "Customer Service and Relations", "Payroll Manager", "HR Team Leader", "Account Team Leader", "Payroll Team Leader", "Account Rank and File", "Payroll Rank and File", "HR Rank and File" }));
        jPanel9.add(jComboBoxPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 200, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular", "Probationary", " " }));
        jPanel9.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 200, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Garcia, Manuel III", "Lim, Antonio", "Aquino, Bianca Sofia", "Reyes, Isabella", "Alvaro, Roderick", "Villanueva, Andrea Mae", "Romualdez, Fredrick", "Salcedo, Anthony", "De Leon, Selena", "Mata, Christian", "San, Jose Brad" }));
        jPanel9.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 200, -1));

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 380, 230));
        getContentPane().add(jTextFieldEmpNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 60, -1));

        jPanel13.setBackground(new java.awt.Color(51, 51, 51));
        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel13.add(jTextFieldPhilHealthNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 160, -1));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Government Identifiers");
        jPanel13.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("PhilHealth");
        jPanel13.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 100, 20));

        jPanel14.setBackground(new java.awt.Color(51, 51, 51));
        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel14.add(jTextField32, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 160, -1));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Government Records");
        jPanel14.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Name");
        jPanel14.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 40, 20));

        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 370, 420));

        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("SSS Number");
        jPanel13.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 70, 20));
        jPanel13.add(jTextFieldSSSNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 160, -1));

        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("TIN Number");
        jPanel13.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 70, 20));
        jPanel13.add(jTextFieldTINNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 160, -1));

        jPanel15.setBackground(new java.awt.Color(51, 51, 51));
        jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel15.add(jTextField35, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 160, -1));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Government Records");
        jPanel15.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Pag-IBIG Number");
        jPanel15.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 100, 20));

        jPanel16.setBackground(new java.awt.Color(51, 51, 51));
        jPanel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel16.add(jTextField36, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 160, -1));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Government Records");
        jPanel16.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Name");
        jPanel16.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 40, 20));

        jPanel15.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 370, 420));

        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("SSS Number");
        jPanel15.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 70, 20));
        jPanel15.add(jTextField37, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 160, -1));

        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("TIN Number");
        jPanel15.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 70, 20));
        jPanel15.add(jTextField38, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 160, -1));

        jPanel13.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 370, 200));
        jPanel13.add(jTextFieldPagibigNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 160, -1));

        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Pag-IBIG Number");
        jPanel13.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 100, 20));

        getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 370, 210));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 620, 370, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // TODO add your handling code here:
      

    }//GEN-LAST:event_jButtonSaveActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new EditEmployee().setVisible(true);
//            }
//        });
//    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonSave;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBoxPosition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldBasicSalary;
    private javax.swing.JTextField jTextFieldClothingAllowance;
    private javax.swing.JTextField jTextFieldEmpNum;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldGrossSemiMonthly;
    private javax.swing.JTextField jTextFieldHourlyRate;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldPagibigNum;
    private javax.swing.JTextField jTextFieldPhilHealthNum;
    private javax.swing.JTextField jTextFieldPhoneAllowance;
    private javax.swing.JTextField jTextFieldPhoneNum;
    private javax.swing.JTextField jTextFieldRiceSubsidy;
    private javax.swing.JTextField jTextFieldSSSNum;
    private javax.swing.JTextField jTextFieldTINNum;
    // End of variables declaration//GEN-END:variables
}
