/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cwms;

import com.raven.swing.ScrollBar;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Dashboard extends javax.swing.JFrame {

    public void showrecord() {
        table1.repaint();
        Database bd = new Database();
        ResultSet rs = bd.getData();
        try {
            while (rs.next()) {
                String data[] = {rs.getString("Customer_Name"), rs.getString("Car_Number"), rs.getString("Car_Name"), rs.getString("Customer_Email")};
                DefaultTableModel tfd = (DefaultTableModel) table1.getModel();
                tfd.addRow(data);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void StaffInfo(){
        table4.repaint();
        Database bd = new Database();
        ResultSet rs = bd.getStaffInfo();
        try {
            while(rs.next()){
                 String data[] = {rs.getString("Staff_Name"), rs.getString("Staff_Number"), rs.getString("Staff_Email")};
                DefaultTableModel tfd = (DefaultTableModel) table4.getModel();
                tfd.addRow(data);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
     public void StaffInfoDetails(){
         table3.repaint();
        Database bd = new Database();
        ResultSet rs = bd.getStaffInfo();
        try {
            while(rs.next()){
                 String data[] = {rs.getString("Staff_Name"), rs.getString("Staff_Number"), rs.getString("Staff_Email")};
                DefaultTableModel tfd = (DefaultTableModel) table3.getModel();
                tfd.addRow(data);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
    public void updatetable() {
         table2.repaint();
        try {
           
            Database db = new Database();
            ResultSet rs = db.getDataForUpdate();

            while (rs.next()) {
                String data[] = {rs.getString("Customer_Name"), rs.getString("Car_Number"), rs.getString("Car_Name"), rs.getString("Customer_Email")};
                DefaultTableModel tfd = (DefaultTableModel) table2.getModel();
                tfd.addRow(data);

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    

    public Dashboard() {
        initComponents();
        showrecord();
        updatetable();
        StaffInfo();
        hide();
        StaffInfoDetails();
        scroll();
        setBackground(new Color(0, 0, 0, 0));
    }

    public void hide() {

        Menuuu.setVisible(false);
        Report.setVisible(false);
        AddCustomer.setVisible(false);
        SearchCustomer.setVisible(false);
        StaffDetails.setVisible(false);
        ManageStaff.setVisible(false);
        Custumer.setVisible(false);

    }
    
   

    public void scroll() {
        sptable1.setVerticalScrollBar(new ScrollBar());
        sptable1.getVerticalScrollBar().setBackground(Color.WHITE);
        sptable1.getViewport().setBackground(Color.WHITE);

        sptable2.setVerticalScrollBar(new ScrollBar());
        sptable2.getVerticalScrollBar().setBackground(Color.WHITE);
        sptable2.getViewport().setBackground(Color.WHITE);

        sptable3.setVerticalScrollBar(new ScrollBar());
        sptable3.getVerticalScrollBar().setBackground(Color.WHITE);
        sptable3.getViewport().setBackground(Color.WHITE);

        sptable4.setVerticalScrollBar(new ScrollBar());
        sptable4.getVerticalScrollBar().setBackground(Color.WHITE);
        sptable4.getViewport().setBackground(Color.WHITE);

        sptable5.setVerticalScrollBar(new ScrollBar());
        sptable5.getVerticalScrollBar().setBackground(Color.WHITE);
        sptable5.getViewport().setBackground(Color.WHITE);

        sptable7.setVerticalScrollBar(new ScrollBar());
        sptable7.getVerticalScrollBar().setBackground(Color.WHITE);
        sptable7.getViewport().setBackground(Color.WHITE);

        sptable8.setVerticalScrollBar(new ScrollBar());
        sptable8.getVerticalScrollBar().setBackground(Color.WHITE);
        sptable8.getViewport().setBackground(Color.WHITE);

        sptable9.setVerticalScrollBar(new ScrollBar());
        sptable9.getVerticalScrollBar().setBackground(Color.WHITE);
        sptable9.getViewport().setBackground(Color.WHITE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        close = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Min = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dashboard = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Add_cust = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Search_customer = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Staff_detail = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Manage_staff = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        customer = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        REport = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        Logout = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Dashboarrd = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        Report = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        Menuuu = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        sptable2 = new javax.swing.JScrollPane();
        jTable2 = new com.raven.swing.Table();
        sptable1 = new javax.swing.JScrollPane();
        jTable3 = new com.raven.swing.Table();
        payment = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        carName = new javax.swing.JTextField();
        jSeparator28 = new javax.swing.JSeparator();
        jLabel69 = new javax.swing.JLabel();
        balance = new javax.swing.JTextField();
        jSeparator29 = new javax.swing.JSeparator();
        jLabel56 = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        jLabel57 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel58 = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        jLabel62 = new javax.swing.JLabel();
        jSeparator26 = new javax.swing.JSeparator();
        panelBorder1 = new com.raven.swing.PanelBorder();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jSeparator31 = new javax.swing.JSeparator();
        polish = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jSeparator32 = new javax.swing.JSeparator();
        jSeparator33 = new javax.swing.JSeparator();
        jSeparator34 = new javax.swing.JSeparator();
        jSeparator35 = new javax.swing.JSeparator();
        total = new javax.swing.JTextField();
        carNo = new javax.swing.JTextField();
        customerName = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        bodywash = new javax.swing.JTextField();
        seat = new javax.swing.JTextField();
        full = new javax.swing.JTextField();
        buttonGradient10 = new swing.ButtonGradient();
        buttonGradient11 = new swing.ButtonGradient();
        buttonGradient7 = new swing.ButtonGradient();
        bw = new checkbox.JCheckBoxCustom();
        fs = new checkbox.JCheckBoxCustom();
        sr = new checkbox.JCheckBoxCustom();
        po = new checkbox.JCheckBoxCustom();
        AddCustomer = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        CustomerName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        CarNumber = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel31 = new javax.swing.JLabel();
        CarName = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel32 = new javax.swing.JLabel();
        CustomerEmail = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        sptable3 = new javax.swing.JScrollPane();
        table1 = new com.raven.swing.Table();
        panelBorder2 = new com.raven.swing.PanelBorder();
        jLabel53 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        buttonGradient12 = new swing.ButtonGradient();
        buttonGradient13 = new swing.ButtonGradient();
        buttonGradient14 = new swing.ButtonGradient();
        SearchCustomer = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        Customer_Name = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel36 = new javax.swing.JLabel();
        Car_Number = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel37 = new javax.swing.JLabel();
        Car_Name = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel38 = new javax.swing.JLabel();
        Customer_Email = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        sptable4 = new javax.swing.JScrollPane();
        table2 = new com.raven.swing.Table();
        S_No = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel40 = new javax.swing.JLabel();
        panelBorder3 = new com.raven.swing.PanelBorder();
        jLabel54 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        searchIcon = new javax.swing.JLabel();
        buttonGradient5 = new swing.ButtonGradient();
        StaffDetails = new javax.swing.JPanel();
        sptable5 = new javax.swing.JScrollPane();
        table3 = new com.raven.swing.Table();
        panelBorder4 = new com.raven.swing.PanelBorder();
        jLabel61 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        ManageStaff = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        Staff_Name = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel46 = new javax.swing.JLabel();
        Staff_Number = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel48 = new javax.swing.JLabel();
        Staff_Email = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        sptable9 = new javax.swing.JScrollPane();
        table4 = new com.raven.swing.Table();
        panelBorder5 = new com.raven.swing.PanelBorder();
        jLabel72 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        buttonGradient8 = new swing.ButtonGradient();
        buttonGradient6 = new swing.ButtonGradient();
        buttonGradient9 = new swing.ButtonGradient();
        Custumer = new javax.swing.JPanel();
        sptable7 = new javax.swing.JScrollPane();
        table7 = new com.raven.swing.Table();
        sptable8 = new javax.swing.JScrollPane();
        table8 = new com.raven.swing.Table();
        panelBorder6 = new com.raven.swing.PanelBorder();
        jLabel73 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel75 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setName(""); // NOI18N
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(5, 10, 46));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/LOGO.png"))); // NOI18N
        Header.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -2, 50, 50));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Denezone");
        Header.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 15, -1, -1));

        close.setBackground(new java.awt.Color(5, 10, 46));
        close.setToolTipText("");
        close.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/close.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        close.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 45));

        Header.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 0, 50, 45));

        Min.setBackground(new java.awt.Color(5, 10, 46));
        Min.setToolTipText("");
        Min.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/minimize.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        Min.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 45));

        Header.add(Min, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 0, 50, 45));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Denezone");
        Header.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 15, -1, -1));

        jPanel1.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 45));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Men1.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 71, -1, -1));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Admin");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 105, -1, -1));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("John Doe");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 78, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PIC.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 54, 300, 100));

        dashboard.setBackground(new java.awt.Color(5, 10, 46));
        dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Dashboard");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });
        dashboard.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 220, -1));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/dashboard.png"))); // NOI18N
        dashboard.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 0, -1, 40));

        jPanel1.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 190, 300, 40));

        Menu.setBackground(new java.awt.Color(5, 10, 46));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Menu");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });
        Menu.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 220, -1));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Menu.png"))); // NOI18N
        Menu.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 0, -1, 40));

        jPanel1.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 230, 300, 40));

        Add_cust.setBackground(new java.awt.Color(5, 10, 46));
        Add_cust.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                Add_custInputMethodTextChanged(evt);
            }
        });
        Add_cust.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Add Customer");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
        });
        Add_cust.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 220, -1));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Add customer.png"))); // NOI18N
        Add_cust.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 0, -1, 40));

        jPanel1.add(Add_cust, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 270, 300, 40));

        Search_customer.setBackground(new java.awt.Color(5, 10, 46));
        Search_customer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Search Customer");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel17MouseExited(evt);
            }
        });
        Search_customer.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 220, -1));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Search customer.png"))); // NOI18N
        Search_customer.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 0, -1, 40));

        jPanel1.add(Search_customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 310, 300, 40));

        Staff_detail.setBackground(new java.awt.Color(5, 10, 46));
        Staff_detail.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Staff Detail");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel19MouseExited(evt);
            }
        });
        Staff_detail.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 220, -1));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Staff Detail.png"))); // NOI18N
        Staff_detail.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 0, -1, 40));

        jPanel1.add(Staff_detail, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 350, 300, 40));

        Manage_staff.setBackground(new java.awt.Color(5, 10, 46));
        Manage_staff.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Manage Staff");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel21MouseExited(evt);
            }
        });
        Manage_staff.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 220, -1));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Mange staff.png"))); // NOI18N
        Manage_staff.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 0, -1, 40));

        jPanel1.add(Manage_staff, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 390, 300, 40));

        customer.setBackground(new java.awt.Color(5, 10, 46));
        customer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Customer");
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel23MouseExited(evt);
            }
        });
        customer.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 220, -1));

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/customer.png"))); // NOI18N
        customer.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 0, 30, 40));

        jPanel1.add(customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 430, 300, 40));

        REport.setBackground(new java.awt.Color(5, 10, 46));
        REport.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel33.setText("Report");
        jLabel33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel33MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel33MouseExited(evt);
            }
        });
        REport.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 220, -1));

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Report.png"))); // NOI18N
        REport.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 0, -1, 40));

        jPanel1.add(REport, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 470, 300, 40));

        Logout.setBackground(new java.awt.Color(5, 10, 46));
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutMouseExited(evt);
            }
        });
        Logout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Logout");
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel25MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel25MouseExited(evt);
            }
        });
        Logout.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Logout.png"))); // NOI18N
        Logout.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 0, 30, 40));

        jPanel1.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 610, 300, 40));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Rectangle.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 158, 300, 520));

        Dashboarrd.setBackground(new java.awt.Color(255, 255, 255));
        Dashboarrd.setMaximumSize(new java.awt.Dimension(890, 620));
        Dashboarrd.setMinimumSize(new java.awt.Dimension(890, 620));
        Dashboarrd.setPreferredSize(new java.awt.Dimension(890, 620));
        Dashboarrd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Dashboard");
        Dashboarrd.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, -1));

        jPanel1.add(Dashboarrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 880, 610));

        Report.setBackground(new java.awt.Color(255, 255, 255));
        Report.setMaximumSize(new java.awt.Dimension(890, 620));
        Report.setMinimumSize(new java.awt.Dimension(890, 620));
        Report.setPreferredSize(new java.awt.Dimension(890, 620));
        Report.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Report");
        Report.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, -1));

        jPanel1.add(Report, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 880, 610));

        Menuuu.setBackground(new java.awt.Color(255, 255, 255));
        Menuuu.setMaximumSize(new java.awt.Dimension(890, 620));
        Menuuu.setMinimumSize(new java.awt.Dimension(890, 620));
        Menuuu.setPreferredSize(new java.awt.Dimension(890, 620));
        Menuuu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel55.setBackground(new java.awt.Color(0, 0, 0));
        jLabel55.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        jLabel55.setText("Available Services");
        Menuuu.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 180, -1));

        jLabel63.setBackground(new java.awt.Color(0, 0, 0));
        jLabel63.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        jLabel63.setText("Customer Details");
        Menuuu.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Wash Type", "Price"
            }
        ));
        jTable2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jTable2.setRowHeight(30);
        sptable2.setViewportView(jTable2);

        Menuuu.add(sptable2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 490, 190));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Car No", "Car Name", "Customer Email"
            }
        ));
        jTable3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jTable3.setRowHeight(30);
        sptable1.setViewportView(jTable3);

        Menuuu.add(sptable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 490, 190));

        payment.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        payment.setBorder(null);
        Menuuu.add(payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 530, 100, -1));

        jLabel67.setBackground(new java.awt.Color(0, 0, 0));
        jLabel67.setFont(new java.awt.Font("Berlin Sans FB", 0, 17)); // NOI18N
        jLabel67.setText("Payment:");
        Menuuu.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 533, -1, -1));

        jLabel68.setBackground(new java.awt.Color(0, 0, 0));
        jLabel68.setFont(new java.awt.Font("Berlin Sans FB", 0, 17)); // NOI18N
        jLabel68.setText("Total:");
        Menuuu.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 533, -1, -1));

        carName.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        carName.setBorder(null);
        Menuuu.add(carName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 208, 190, -1));

        jSeparator28.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator28.setForeground(new java.awt.Color(0, 0, 0));
        Menuuu.add(jSeparator28, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 553, 100, 10));

        jLabel69.setBackground(new java.awt.Color(0, 0, 0));
        jLabel69.setFont(new java.awt.Font("Berlin Sans FB", 0, 17)); // NOI18N
        jLabel69.setText("Balance:");
        Menuuu.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 570, -1, -1));

        balance.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        balance.setBorder(null);
        Menuuu.add(balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 560, 100, -1));

        jSeparator29.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator29.setForeground(new java.awt.Color(0, 0, 0));
        Menuuu.add(jSeparator29, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 583, 100, 10));

        jLabel56.setFont(new java.awt.Font("Berlin Sans FB", 0, 17)); // NOI18N
        jLabel56.setText("Car Number:");
        Menuuu.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jSeparator19.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator19.setForeground(new java.awt.Color(255, 255, 255));
        Menuuu.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 195, 160, 10));

        jLabel57.setFont(new java.awt.Font("Berlin Sans FB", 0, 17)); // NOI18N
        jLabel57.setText("Car Name:");
        Menuuu.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 215, -1, -1));

        jSeparator20.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator20.setForeground(new java.awt.Color(255, 255, 255));
        Menuuu.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 190, 10));

        jLabel58.setFont(new java.awt.Font("Berlin Sans FB", 0, 17)); // NOI18N
        jLabel58.setText("Customer Email:");
        Menuuu.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jSeparator21.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator21.setForeground(new java.awt.Color(255, 255, 255));
        Menuuu.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 265, 190, 10));

        jLabel62.setFont(new java.awt.Font("Berlin Sans FB", 0, 17)); // NOI18N
        jLabel62.setText("Customer Name:");
        Menuuu.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 145, -1, -1));

        jSeparator26.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator26.setForeground(new java.awt.Color(255, 255, 255));
        Menuuu.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 190, 10));

        panelBorder1.setBackground(new java.awt.Color(5, 10, 46));
        panelBorder1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Menu");
        jLabel51.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel51MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel51MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel51MouseExited(evt);
            }
        });
        panelBorder1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 15, -1, -1));

        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Menu.png"))); // NOI18N
        panelBorder1.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 5, -1, 40));

        Menuuu.add(panelBorder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 860, 50));

        jLabel65.setFont(new java.awt.Font("Berlin Sans FB", 0, 17)); // NOI18N
        Menuuu.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 488, -1, -1));

        jLabel66.setFont(new java.awt.Font("Berlin Sans FB", 0, 17)); // NOI18N
        Menuuu.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 453, -1, -1));

        jLabel70.setFont(new java.awt.Font("Berlin Sans FB", 0, 17)); // NOI18N
        Menuuu.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 418, -1, -1));

        jLabel71.setFont(new java.awt.Font("Berlin Sans FB", 0, 17)); // NOI18N
        Menuuu.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 383, -1, -1));

        jSeparator31.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator31.setForeground(new java.awt.Color(255, 255, 255));
        Menuuu.add(jSeparator31, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 395, 190, 10));

        polish.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        polish.setBorder(null);
        Menuuu.add(polish, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 486, 190, -1));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/search2.png"))); // NOI18N
        jLabel39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel39MouseClicked(evt);
            }
        });
        Menuuu.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        jSeparator32.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator32.setForeground(new java.awt.Color(255, 255, 255));
        Menuuu.add(jSeparator32, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 432, 190, 10));

        jSeparator33.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator33.setForeground(new java.awt.Color(255, 255, 255));
        Menuuu.add(jSeparator33, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 190, 10));

        jSeparator34.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator34.setForeground(new java.awt.Color(255, 255, 255));
        Menuuu.add(jSeparator34, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 508, 190, 10));

        jSeparator35.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator35.setForeground(new java.awt.Color(0, 0, 0));
        Menuuu.add(jSeparator35, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, 100, 10));

        total.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        total.setBorder(null);
        Menuuu.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 527, 100, -1));

        carNo.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        carNo.setBorder(null);
        Menuuu.add(carNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 173, 160, -1));

        customerName.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        customerName.setBorder(null);
        Menuuu.add(customerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 138, 190, -1));

        email.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        email.setBorder(null);
        Menuuu.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 243, 190, -1));

        bodywash.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        bodywash.setBorder(null);
        Menuuu.add(bodywash, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 373, 190, -1));

        seat.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        seat.setBorder(null);
        Menuuu.add(seat, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 448, 190, -1));

        full.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        full.setBorder(null);
        Menuuu.add(full, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 190, -1));

        buttonGradient10.setText("Add");
        buttonGradient10.setColor1(new java.awt.Color(23, 25, 26));
        buttonGradient10.setColor2(new java.awt.Color(17, 16, 76));
        buttonGradient10.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        buttonGradient10.setMaximumSize(new java.awt.Dimension(80, 40));
        buttonGradient10.setMinimumSize(new java.awt.Dimension(80, 40));
        buttonGradient10.setPreferredSize(new java.awt.Dimension(80, 40));
        buttonGradient10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonGradient10MouseClicked(evt);
            }
        });
        buttonGradient10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGradient10ActionPerformed(evt);
            }
        });
        Menuuu.add(buttonGradient10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 105, 35));

        buttonGradient11.setText("Clear");
        buttonGradient11.setColor1(new java.awt.Color(23, 25, 26));
        buttonGradient11.setColor2(new java.awt.Color(17, 16, 76));
        buttonGradient11.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        buttonGradient11.setMaximumSize(new java.awt.Dimension(80, 40));
        buttonGradient11.setMinimumSize(new java.awt.Dimension(80, 40));
        buttonGradient11.setPreferredSize(new java.awt.Dimension(80, 40));
        buttonGradient11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGradient11ActionPerformed(evt);
            }
        });
        Menuuu.add(buttonGradient11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, 105, 35));

        buttonGradient7.setText("Total");
        buttonGradient7.setColor1(new java.awt.Color(23, 25, 26));
        buttonGradient7.setColor2(new java.awt.Color(17, 16, 76));
        buttonGradient7.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        buttonGradient7.setMaximumSize(new java.awt.Dimension(80, 40));
        buttonGradient7.setMinimumSize(new java.awt.Dimension(80, 40));
        buttonGradient7.setPreferredSize(new java.awt.Dimension(80, 40));
        buttonGradient7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGradient7ActionPerformed(evt);
            }
        });
        Menuuu.add(buttonGradient7, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 520, 100, 35));

        bw.setText("Body Wash");
        bw.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        bw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bwMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bwMousePressed(evt);
            }
        });
        bw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bwActionPerformed(evt);
            }
        });
        Menuuu.add(bw, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        fs.setBackground(new java.awt.Color(255, 0, 0));
        fs.setText("Full Wash");
        fs.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        fs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fsActionPerformed(evt);
            }
        });
        Menuuu.add(fs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        sr.setBackground(new java.awt.Color(51, 255, 51));
        sr.setText("Seat Remove");
        sr.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        sr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srActionPerformed(evt);
            }
        });
        Menuuu.add(sr, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        po.setBackground(new java.awt.Color(255, 0, 255));
        po.setText("Polish");
        po.setContentAreaFilled(false);
        po.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        po.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poActionPerformed(evt);
            }
        });
        Menuuu.add(po, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 495, -1, -1));

        jPanel1.add(Menuuu, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 880, 610));

        AddCustomer.setBackground(new java.awt.Color(255, 255, 255));
        AddCustomer.setMaximumSize(new java.awt.Dimension(890, 620));
        AddCustomer.setMinimumSize(new java.awt.Dimension(890, 620));
        AddCustomer.setPreferredSize(new java.awt.Dimension(890, 620));
        AddCustomer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel29.setText("Customer Name:");
        AddCustomer.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 165, -1, -1));

        CustomerName.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        CustomerName.setBorder(null);
        AddCustomer.add(CustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 180, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        AddCustomer.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 183, 180, 10));

        jLabel30.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel30.setText("Car Number:");
        AddCustomer.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 205, -1, -1));

        CarNumber.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        CarNumber.setBorder(null);
        AddCustomer.add(CarNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 180, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        AddCustomer.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 223, 180, 10));

        jLabel31.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel31.setText("Car Name:");
        AddCustomer.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 245, -1, -1));

        CarName.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        CarName.setBorder(null);
        AddCustomer.add(CarName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 180, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        AddCustomer.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 263, 180, 10));

        jLabel32.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel32.setText("Customer Email:");
        AddCustomer.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 285, -1, -1));

        CustomerEmail.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        CustomerEmail.setBorder(null);
        AddCustomer.add(CustomerEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 180, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        AddCustomer.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 303, 180, 10));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Car Number", "Car Name", "Customer Email"
            }
        ));
        table1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        table1.setRowHeight(30);
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        sptable3.setViewportView(table1);
        table1.getAccessibleContext().setAccessibleDescription("");

        AddCustomer.add(sptable3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 460, 350));

        panelBorder2.setBackground(new java.awt.Color(5, 10, 46));
        panelBorder2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel53.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Add Customer");
        jLabel53.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel53MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel53MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel53MouseExited(evt);
            }
        });
        panelBorder2.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 15, -1, -1));

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Add customer.png"))); // NOI18N
        panelBorder2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 30));

        AddCustomer.add(panelBorder2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 860, 50));

        buttonGradient12.setText("Add");
        buttonGradient12.setColor1(new java.awt.Color(23, 25, 26));
        buttonGradient12.setColor2(new java.awt.Color(17, 16, 76));
        buttonGradient12.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        buttonGradient12.setMaximumSize(new java.awt.Dimension(80, 40));
        buttonGradient12.setMinimumSize(new java.awt.Dimension(80, 40));
        buttonGradient12.setPreferredSize(new java.awt.Dimension(80, 40));
        buttonGradient12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGradient12ActionPerformed(evt);
            }
        });
        AddCustomer.add(buttonGradient12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 105, 35));

        buttonGradient13.setText("Delete");
        buttonGradient13.setColor1(new java.awt.Color(23, 25, 26));
        buttonGradient13.setColor2(new java.awt.Color(17, 16, 76));
        buttonGradient13.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        buttonGradient13.setMaximumSize(new java.awt.Dimension(80, 40));
        buttonGradient13.setMinimumSize(new java.awt.Dimension(80, 40));
        buttonGradient13.setPreferredSize(new java.awt.Dimension(80, 40));
        buttonGradient13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGradient13ActionPerformed(evt);
            }
        });
        AddCustomer.add(buttonGradient13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 105, 35));

        buttonGradient14.setText("Clear");
        buttonGradient14.setColor1(new java.awt.Color(23, 25, 26));
        buttonGradient14.setColor2(new java.awt.Color(17, 16, 76));
        buttonGradient14.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        buttonGradient14.setMaximumSize(new java.awt.Dimension(80, 40));
        buttonGradient14.setMinimumSize(new java.awt.Dimension(80, 40));
        buttonGradient14.setPreferredSize(new java.awt.Dimension(80, 40));
        buttonGradient14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGradient14ActionPerformed(evt);
            }
        });
        AddCustomer.add(buttonGradient14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 105, 35));

        jPanel1.add(AddCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 880, 610));

        SearchCustomer.setBackground(new java.awt.Color(255, 255, 255));
        SearchCustomer.setMaximumSize(new java.awt.Dimension(890, 620));
        SearchCustomer.setMinimumSize(new java.awt.Dimension(890, 620));
        SearchCustomer.setPreferredSize(new java.awt.Dimension(890, 620));
        SearchCustomer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Berlin Sans FB", 0, 17)); // NOI18N
        jLabel34.setText("Customer Name:");
        SearchCustomer.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        Customer_Name.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        Customer_Name.setBorder(null);
        SearchCustomer.add(Customer_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 190, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        SearchCustomer.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 190, 10));

        jLabel36.setFont(new java.awt.Font("Berlin Sans FB", 0, 17)); // NOI18N
        jLabel36.setText("Car Number:");
        SearchCustomer.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        Car_Number.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        Car_Number.setBorder(null);
        SearchCustomer.add(Car_Number, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 190, -1));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        SearchCustomer.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 190, 10));

        jLabel37.setFont(new java.awt.Font("Berlin Sans FB", 0, 17)); // NOI18N
        jLabel37.setText("Car Name:");
        SearchCustomer.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        Car_Name.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        Car_Name.setBorder(null);
        SearchCustomer.add(Car_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 190, -1));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        SearchCustomer.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 190, 10));

        jLabel38.setFont(new java.awt.Font("Berlin Sans FB", 0, 17)); // NOI18N
        jLabel38.setText("Customer Email:");
        SearchCustomer.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        Customer_Email.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        Customer_Email.setBorder(null);
        SearchCustomer.add(Customer_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 190, -1));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        SearchCustomer.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 190, 10));

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Car Number", "Car Name", "Customer Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        table2.setRowHeight(30);
        table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table2MouseClicked(evt);
            }
        });
        sptable4.setViewportView(table2);

        SearchCustomer.add(sptable4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 480, 290));

        S_No.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        S_No.setBorder(null);
        SearchCustomer.add(S_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 190, -1));

        jTextField10.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        jTextField10.setBorder(null);
        SearchCustomer.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 210, 20));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        SearchCustomer.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 183, 210, 10));

        jLabel40.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel40.setText("Search: ");
        SearchCustomer.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 70, -1));

        panelBorder3.setBackground(new java.awt.Color(5, 10, 46));
        panelBorder3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Search Customer");
        jLabel54.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel54MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel54MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel54MouseExited(evt);
            }
        });
        panelBorder3.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 15, -1, -1));

        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Search customer.png"))); // NOI18N
        panelBorder3.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 5, -1, 40));

        SearchCustomer.add(panelBorder3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 860, 50));

        searchIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/searcch.png"))); // NOI18N
        searchIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchIconMouseEntered(evt);
            }
        });
        SearchCustomer.add(searchIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 30, 30));

        buttonGradient5.setText("Update");
        buttonGradient5.setColor1(new java.awt.Color(23, 25, 26));
        buttonGradient5.setColor2(new java.awt.Color(17, 16, 76));
        buttonGradient5.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        buttonGradient5.setMaximumSize(new java.awt.Dimension(80, 40));
        buttonGradient5.setMinimumSize(new java.awt.Dimension(80, 40));
        buttonGradient5.setPreferredSize(new java.awt.Dimension(80, 40));
        buttonGradient5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGradient5ActionPerformed(evt);
            }
        });
        SearchCustomer.add(buttonGradient5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 130, -1));

        jPanel1.add(SearchCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 880, 610));

        StaffDetails.setBackground(new java.awt.Color(255, 255, 255));
        StaffDetails.setMaximumSize(new java.awt.Dimension(890, 620));
        StaffDetails.setMinimumSize(new java.awt.Dimension(890, 620));
        StaffDetails.setName(""); // NOI18N
        StaffDetails.setPreferredSize(new java.awt.Dimension(890, 620));
        StaffDetails.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Staff Name", "Staff Number", "Staff Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        table3.setRowHeight(30);
        sptable5.setViewportView(table3);

        StaffDetails.add(sptable5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 830, 410));

        panelBorder4.setBackground(new java.awt.Color(5, 10, 46));
        panelBorder4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel61.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("Staff Detail");
        jLabel61.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel61MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel61MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel61MouseExited(evt);
            }
        });
        panelBorder4.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 15, -1, -1));

        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Staff Detail.png"))); // NOI18N
        panelBorder4.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 5, -1, 40));

        StaffDetails.add(panelBorder4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 860, 50));

        jPanel1.add(StaffDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 880, 610));

        ManageStaff.setBackground(new java.awt.Color(255, 255, 255));
        ManageStaff.setMaximumSize(new java.awt.Dimension(890, 620));
        ManageStaff.setMinimumSize(new java.awt.Dimension(890, 620));
        ManageStaff.setPreferredSize(new java.awt.Dimension(890, 620));
        ManageStaff.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel45.setText("Staff Name:");
        ManageStaff.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        Staff_Name.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        Staff_Name.setBorder(null);
        ManageStaff.add(Staff_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 178, 210, -1));

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        ManageStaff.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 210, 10));

        jLabel46.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel46.setText("Staff Number:");
        ManageStaff.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        Staff_Number.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        Staff_Number.setBorder(null);
        ManageStaff.add(Staff_Number, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 228, 210, -1));

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        ManageStaff.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 210, 10));

        jLabel48.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel48.setText("Staff Email:");
        ManageStaff.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        Staff_Email.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        Staff_Email.setBorder(null);
        ManageStaff.add(Staff_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 278, 210, -1));

        jSeparator14.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        ManageStaff.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 210, 10));

        table4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Staff Name", "Staff Number", "Staff Email"
            }
        ));
        table4.setFont(new java.awt.Font("Berlin Sans FB", 0, 10)); // NOI18N
        table4.setRowHeight(30);
        table4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table4MouseClicked(evt);
            }
        });
        sptable9.setViewportView(table4);

        ManageStaff.add(sptable9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 165, 470, 350));

        panelBorder5.setBackground(new java.awt.Color(5, 10, 46));
        panelBorder5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel72.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText(" ManageStaff ");
        jLabel72.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel72MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel72MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel72MouseExited(evt);
            }
        });
        panelBorder5.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 15, -1, -1));

        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Mange staff.png"))); // NOI18N
        panelBorder5.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 5, -1, 40));

        ManageStaff.add(panelBorder5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 860, 50));

        buttonGradient8.setText("Add");
        buttonGradient8.setColor1(new java.awt.Color(23, 25, 26));
        buttonGradient8.setColor2(new java.awt.Color(17, 16, 76));
        buttonGradient8.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        buttonGradient8.setMaximumSize(new java.awt.Dimension(80, 40));
        buttonGradient8.setMinimumSize(new java.awt.Dimension(80, 40));
        buttonGradient8.setPreferredSize(new java.awt.Dimension(80, 40));
        buttonGradient8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGradient8ActionPerformed(evt);
            }
        });
        ManageStaff.add(buttonGradient8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 105, 35));

        buttonGradient6.setText("Delete");
        buttonGradient6.setColor1(new java.awt.Color(23, 25, 26));
        buttonGradient6.setColor2(new java.awt.Color(17, 16, 76));
        buttonGradient6.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        buttonGradient6.setMaximumSize(new java.awt.Dimension(80, 40));
        buttonGradient6.setMinimumSize(new java.awt.Dimension(80, 40));
        buttonGradient6.setPreferredSize(new java.awt.Dimension(80, 40));
        buttonGradient6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGradient6ActionPerformed(evt);
            }
        });
        ManageStaff.add(buttonGradient6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 105, 35));

        buttonGradient9.setText("Clear");
        buttonGradient9.setColor1(new java.awt.Color(23, 25, 26));
        buttonGradient9.setColor2(new java.awt.Color(17, 16, 76));
        buttonGradient9.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        buttonGradient9.setMaximumSize(new java.awt.Dimension(80, 40));
        buttonGradient9.setMinimumSize(new java.awt.Dimension(80, 40));
        buttonGradient9.setPreferredSize(new java.awt.Dimension(80, 40));
        buttonGradient9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGradient9ActionPerformed(evt);
            }
        });
        ManageStaff.add(buttonGradient9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 105, 35));

        jPanel1.add(ManageStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 880, 610));

        Custumer.setBackground(new java.awt.Color(255, 255, 255));
        Custumer.setMaximumSize(new java.awt.Dimension(890, 620));
        Custumer.setMinimumSize(new java.awt.Dimension(890, 620));
        Custumer.setPreferredSize(new java.awt.Dimension(890, 620));
        Custumer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table7.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        table7.setRowHeight(30);
        sptable7.setViewportView(table7);

        Custumer.add(sptable7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 830, 190));

        table8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table8.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        table8.setRowHeight(30);
        sptable8.setViewportView(table8);

        Custumer.add(sptable8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 830, 190));

        panelBorder6.setBackground(new java.awt.Color(5, 10, 46));
        panelBorder6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel73.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("Customer");
        jLabel73.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel73MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel73MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel73MouseExited(evt);
            }
        });
        panelBorder6.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 15, -1, -1));

        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/customer.png"))); // NOI18N
        panelBorder6.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 5, -1, 40));

        Custumer.add(panelBorder6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 860, 50));

        jLabel41.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel41.setText("Search: ");
        Custumer.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 70, -1));

        jTextField13.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        jTextField13.setBorder(null);
        Custumer.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 210, 20));

        jSeparator13.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        Custumer.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 382, 210, 10));

        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/searcch.png"))); // NOI18N
        Custumer.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 30, 30));

        jPanel1.add(Custumer, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 880, 610));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void changecolor(JPanel hover, Color rand) {
        hover.setBackground(rand);
    }

    public void clickmenu(JPanel h1, JPanel h2, int numberbool) {
        if (numberbool == 1) {
            h1.setBackground(new Color(25, 29, 74));
            h2.setBackground(new Color(5, 10, 46));
        } else {
            h1.setBackground(new Color(5, 10, 46));
            h2.setBackground(new Color(25, 29, 74));
        }
    }

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        changecolor(close, new Color(25, 29, 74));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        changecolor(close, new Color(5, 10, 46));
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        changecolor(Min, new Color(25, 29, 74));
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        changecolor(Min, new Color(5, 10, 46));
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        Dashboarrd.setVisible(true);
        Menuuu.setVisible(false);
        AddCustomer.setVisible(false);
        SearchCustomer.setVisible(false);
        StaffDetails.setVisible(false);
        ManageStaff.setVisible(false);
        Custumer.setVisible(false);
        Report.setVisible(false);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        changecolor(dashboard, new Color(25, 29, 74));
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        changecolor(dashboard, new Color(5, 10, 46));
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        Dashboarrd.setVisible(false);
        Menuuu.setVisible(true);
        AddCustomer.setVisible(false);
        SearchCustomer.setVisible(false);
        StaffDetails.setVisible(false);
        ManageStaff.setVisible(false);
        Custumer.setVisible(false);
        Report.setVisible(false);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        changecolor(Menu, new Color(25, 29, 74));    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        changecolor(Menu, new Color(5, 10, 46));
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        Dashboarrd.setVisible(false);
        Menuuu.setVisible(false);
        AddCustomer.setVisible(true);
        SearchCustomer.setVisible(false);
        StaffDetails.setVisible(false);
        ManageStaff.setVisible(false);
        Custumer.setVisible(false);
        Report.setVisible(false);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
        changecolor(Add_cust, new Color(25, 29, 74));
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        changecolor(Add_cust, new Color(5, 10, 46));
    }//GEN-LAST:event_jLabel15MouseExited

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        Dashboarrd.setVisible(false);
        Menuuu.setVisible(false);
        AddCustomer.setVisible(false);
        SearchCustomer.setVisible(true);
        StaffDetails.setVisible(false);
        ManageStaff.setVisible(false);
        Custumer.setVisible(false);
        Report.setVisible(false);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
        changecolor(Search_customer, new Color(25, 29, 74));
    }//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseExited
        changecolor(Search_customer, new Color(5, 10, 46));
    }//GEN-LAST:event_jLabel17MouseExited

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        Dashboarrd.setVisible(false);
        Menuuu.setVisible(false);
        AddCustomer.setVisible(false);
        SearchCustomer.setVisible(false);
        StaffDetails.setVisible(true);
        ManageStaff.setVisible(false);
        Custumer.setVisible(false);
        Report.setVisible(false);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseEntered
        changecolor(Staff_detail, new Color(25, 29, 74));
    }//GEN-LAST:event_jLabel19MouseEntered

    private void jLabel19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseExited
        changecolor(Staff_detail, new Color(5, 10, 46));
    }//GEN-LAST:event_jLabel19MouseExited

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        Dashboarrd.setVisible(false);
        Menuuu.setVisible(false);
        AddCustomer.setVisible(false);
        SearchCustomer.setVisible(false);
        StaffDetails.setVisible(false);
        ManageStaff.setVisible(true);
        Custumer.setVisible(false);
        Report.setVisible(false);
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseEntered
        changecolor(Manage_staff, new Color(25, 29, 74));
    }//GEN-LAST:event_jLabel21MouseEntered

    private void jLabel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseExited
        changecolor(Manage_staff, new Color(5, 10, 46));
    }//GEN-LAST:event_jLabel21MouseExited

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        Dashboarrd.setVisible(false);
        Menuuu.setVisible(false);
        AddCustomer.setVisible(false);
        SearchCustomer.setVisible(false);
        StaffDetails.setVisible(false);
        ManageStaff.setVisible(false);
        Custumer.setVisible(true);
        Report.setVisible(false);
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseEntered
        changecolor(customer, new Color(25, 29, 74));

    }//GEN-LAST:event_jLabel23MouseEntered

    private void jLabel23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseExited
        changecolor(customer, new Color(5, 10, 46));
    }//GEN-LAST:event_jLabel23MouseExited

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        Start ad = new Start();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseEntered
        changecolor(Logout, new Color(25, 29, 74));
    }//GEN-LAST:event_jLabel25MouseEntered

    private void jLabel25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseExited

    }//GEN-LAST:event_jLabel25MouseExited

    private void Add_custInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_Add_custInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_Add_custInputMethodTextChanged

    private void jLabel51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel51MouseClicked

    private void jLabel51MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel51MouseEntered

    private void jLabel51MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel51MouseExited

    private void jLabel53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel53MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel53MouseClicked

    private void jLabel53MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel53MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel53MouseEntered

    private void jLabel53MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel53MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel53MouseExited

    private void jLabel54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel54MouseClicked

    private void jLabel54MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel54MouseEntered

    private void jLabel54MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel54MouseExited

    private void jLabel61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel61MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel61MouseClicked

    private void jLabel61MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel61MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel61MouseEntered

    private void jLabel61MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel61MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel61MouseExited

    private void jLabel72MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel72MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel72MouseClicked

    private void jLabel72MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel72MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel72MouseEntered

    private void jLabel72MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel72MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel72MouseExited

    private void jLabel73MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel73MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel73MouseClicked

    private void jLabel73MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel73MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel73MouseEntered

    private void jLabel73MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel73MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel73MouseExited

    private void buttonGradient8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient8ActionPerformed
            DefaultTableModel tfd=(DefaultTableModel)table4.getModel();

        if(Staff_Name.getText().equals("")||Staff_Number.getText().equals("")||Staff_Email.getText().equals("")){
            JOptionPane.showMessageDialog(null,"All Fields Are Required!");
            
              }
        else{ 
        Database db=new Database();
        
       db.insertStaff(Staff_Name.getText(),Staff_Number.getText(),Staff_Email.getText());
       Staff_Name.setText(null);
       Staff_Number.setText(null);
       Staff_Email.setText(null);
      
         JOptionPane.showMessageDialog(null,"Added Successfully!!!!!!");
         
        
        tfd.setRowCount(0);
         
       ResultSet rs=db.getStaffInfo();

       try{
            while(rs.next()){
            String data[]={rs.getString("Staff_Name"),rs.getString("Staff_Number"), rs.getString("Staff_Email")};
            tfd.addRow(data);
        }
       }
       catch(Exception e){
           System.out.println(e);
       }
                }
    }//GEN-LAST:event_buttonGradient8ActionPerformed

    private void buttonGradient6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient6ActionPerformed
       
        Database db=new Database();
         db.deletestaff(Staff_Number.getText());
       
        DefaultTableModel tfd=(DefaultTableModel)table4.getModel();
        tfd.setRowCount(0);
        StaffInfo();
        
        JOptionPane.showMessageDialog(null,"Deleted Successfully!!!!!!");
        
        
        Staff_Name.setText("");
        Staff_Number.setText("");
        Staff_Email.setText("");
        
        
        
        
    }//GEN-LAST:event_buttonGradient6ActionPerformed

    private void buttonGradient9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient9ActionPerformed
        Staff_Name.setText("");
        Staff_Number.setText("");
        Staff_Email.setText("");
        
//         DefaultTableModel dtb = (DefaultTableModel) table4.getModel();
//        dtb.setRowCount(0);
        
    }//GEN-LAST:event_buttonGradient9ActionPerformed

    private void buttonGradient5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient5ActionPerformed

//         if(jTextField10.getText().equals("")){
//         JOptionPane.showMessageDialog(null,"Enter The Data First");
//      }
//     else{
        Database db=new Database(); 
        db.updatecustomer(Customer_Name.getText(),Car_Number.getText(),Car_Name.getText(),Customer_Email.getText());
        DefaultTableModel dtb = (DefaultTableModel) table2.getModel();
        dtb.setRowCount(0);
        updatetable();
//        JOptionPane.showMessageDialog(null,"Updated Successfully!!!!!!");
        S_No.setText("");
        Customer_Name.setText("");
        Car_Number.setText("");
        Car_Name.setText("");
        Customer_Email.setText("");
        searchIcon.setText("");
//         }
    }//GEN-LAST:event_buttonGradient5ActionPerformed

    private void buttonGradient10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient10ActionPerformed
        Database db=new Database();                                 
                db.deleteFromReservation(carNo.getText());
            
           
       
    }//GEN-LAST:event_buttonGradient10ActionPerformed

    private void buttonGradient11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient11ActionPerformed

        customerName.setText("");
        carNo.setText("");
        carName.setText("");
        email.setText("");
        bodywash.setText("");
        full.setText("");
        seat.setText("");
        polish.setText("");
        total.setText("");
        payment.setText("");
        balance.setText("");

        bw.setSelected(false);
        fs.setSelected(false);
        sr.setSelected(false);
        po.setSelected(false);

//        DefaultTableModel dtb = (DefaultTableModel) jTable2.getModel();
//        dtb.setRowCount(0);
//        DefaultTableModel db = (DefaultTableModel) jTable3.getModel();
//        db.setRowCount(0);
    }//GEN-LAST:event_buttonGradient11ActionPerformed

    private void buttonGradient7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient7ActionPerformed

       

        Database db = new Database();
        db.CustomerTotal(customerName.getText(), carNo.getText(), carName.getText(), email.getText(), Integer.parseInt(total.getText()));
        
        int pay = Integer.parseInt(payment.getText());
        int tot = Integer.parseInt(total.getText());
        
       

        int balan = pay - tot;
       
        balance.setText(String.valueOf(balan));
        
//        customerName.setText("");
//        carNo.setText("");
//        carName.setText("");
//        email.setText("");
//        bodywash.setText("");
//        full.setText("");
//        seat.setText("");
//        polish.setText("");
//        
//
//        bw.setSelected(false);
//        fs.setSelected(false);
//        sr.setSelected(false);
//        po.setSelected(false);
        
//        total.setText("");
//        payment.setText("");
//        balance.setText("");
        

    }//GEN-LAST:event_buttonGradient7ActionPerformed

    private void buttonGradient12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient12ActionPerformed

        if (CustomerName.getText().equals("") || CarNumber.getText().equals("") || CarName.getText().equals("") || CustomerEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "All Fields Are Required!");
        } else {
            Database db = new Database();
            db.addCustomer(CustomerName.getText(), CarNumber.getText(), CarName.getText(), CustomerEmail.getText());
            CustomerName.setText("");
            CarNumber.setText("");
            CarName.setText("");
            CustomerEmail.setText("");
            JOptionPane.showMessageDialog(null, "Added Successfully!!!!!!");
            DefaultTableModel dtb = (DefaultTableModel) table1.getModel();
            dtb.setRowCount(0);
            ResultSet rs = db.getData();

            try {
                while (rs.next()) {
                    String data[] = {rs.getString("Customer_Name"), rs.getString("Car_Number"), rs.getString("Car_Name"), rs.getString("Customer_Email")};
                    DefaultTableModel tfd = (DefaultTableModel) table1.getModel();
                    tfd.addRow(data);
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }//GEN-LAST:event_buttonGradient12ActionPerformed

    private void buttonGradient13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient13ActionPerformed
        Database db = new Database();
        db.deleteCostumer(CustomerName.getText());

        DefaultTableModel tfd = (DefaultTableModel) table1.getModel();
        tfd.setRowCount(0);
        showrecord();

        JOptionPane.showMessageDialog(null, "Deleted Successfully!!!!!!");

        CustomerName.setText("");
        CarNumber.setText("");
        CarName.setText("");
        CustomerEmail.setText("");
        DefaultTableModel dtb = (DefaultTableModel) table1.getModel();
        dtb.setRowCount(0);

    }//GEN-LAST:event_buttonGradient13ActionPerformed

    private void buttonGradient14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient14ActionPerformed

        CustomerName.setText("");
        CarNumber.setText("");
        CarName.setText("");
        CustomerEmail.setText("");
        DefaultTableModel dtb = (DefaultTableModel) table1.getModel();
        dtb.setRowCount(0);


    }//GEN-LAST:event_buttonGradient14ActionPerformed

    private void buttonGradient10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGradient10MouseClicked

        String CustomerInfo[] = {customerName.getText(), carNo.getText(), carName.getText(), email.getText()};
        DefaultTableModel tm = (DefaultTableModel) jTable3.getModel();
        tm.addRow(CustomerInfo);

        int sum = 0;
        DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();

        if (bw.isSelected()) {
            String dash = bw.getText();
            dtm.addRow(new Object[]{dash, bodywash.getText()});
        }

        if (fs.isSelected()) {
            String dash1 = fs.getText();
            dtm.addRow(new Object[]{dash1, full.getText()});
        }

        if (sr.isSelected()) {
            String dash2 = sr.getText();
            dtm.addRow(new Object[]{dash2, seat.getText()});
        }

        if (po.isSelected()) {
            String dash3 = po.getText();
            dtm.addRow(new Object[]{dash3, polish.getText()});
        }

        for (int i = 0; i < jTable2.getRowCount(); i++) {
            sum = sum + Integer.parseInt(jTable2.getValueAt(i, 1).toString());
        }
        total.setText(String.valueOf(sum));
        
        
        

    }//GEN-LAST:event_buttonGradient10MouseClicked

    private void bwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bwMouseClicked
    }//GEN-LAST:event_bwMouseClicked

    private void bwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bwActionPerformed
    }//GEN-LAST:event_bwActionPerformed

    private void bwMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bwMousePressed
        if (bw.isSelected()) {
            bodywash.setText("");

        } else {
            bodywash.setText("1500");

        }
    }//GEN-LAST:event_bwMousePressed

    private void fsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fsActionPerformed
        if (fs.isSelected()) {
            full.setText("2500");

        } else {
            full.setText("");

        }
    }//GEN-LAST:event_fsActionPerformed

    private void srActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srActionPerformed
        if (sr.isSelected()) {
            seat.setText("1000");

        } else {
            seat.setText("");

        }
    }//GEN-LAST:event_srActionPerformed

    private void poActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poActionPerformed
        if (po.isSelected()) {
            polish.setText("3000");

        } else {
            polish.setText("");

        }

    }//GEN-LAST:event_poActionPerformed

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        Dashboarrd.setVisible(false);
        Menuuu.setVisible(false);
        AddCustomer.setVisible(false);
        SearchCustomer.setVisible(false);
        StaffDetails.setVisible(false);
        ManageStaff.setVisible(false);
        Custumer.setVisible(false);
        Report.setVisible(true);

    }//GEN-LAST:event_jLabel33MouseClicked

    private void jLabel33MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseEntered
        changecolor(REport, new Color(25, 29, 74));

    }//GEN-LAST:event_jLabel33MouseEntered

    private void jLabel33MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseExited
        changecolor(REport, new Color(5, 10, 46));
    }//GEN-LAST:event_jLabel33MouseExited

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked

        int index = table1.getSelectedRow();
        DefaultTableModel dbt = (DefaultTableModel) table1.getModel();
        CustomerName.setText(dbt.getValueAt(index, 0).toString());
        CarNumber.setText(dbt.getValueAt(index, 1).toString());
        CarName.setText(dbt.getValueAt(index, 2).toString());
        CustomerEmail.setText(dbt.getValueAt(index, 3).toString());


    }//GEN-LAST:event_table1MouseClicked

    private void searchIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchIconMouseClicked
         if(jTextField10.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Enter The Data First");
      }
     else{
         Database db=new Database();                                 
         ResultSet rs=db.searchRecord(jTextField10.getText());
//         DefaultTableModel dtb = (DefaultTableModel) table2.getModel();
//        dtb.setRowCount(0);
         try{
             if(rs.next()==(false)){
            JOptionPane.showMessageDialog(null,"Data Not Found");
            }
         
         else{
                 DefaultTableModel dtb = (DefaultTableModel) table2.getModel();
        dtb.setRowCount(0);

            updatetable();
            Customer_Name.setText(rs.getString("Customer_Name"));
            Car_Number.setText(rs.getString("Car_Number"));
            Car_Name.setText(rs.getString("Car_Name"));
            Customer_Email.setText(rs.getString("Customer_Email"));
         }            
     }
         catch(Exception e){
             System.out.println(e);
         
             
     }
         
     }
    }//GEN-LAST:event_searchIconMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        Start ad = new Start();
        ad.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutMouseClicked

    private void LogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseEntered
        changecolor(Logout, new Color(25, 29, 74));        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutMouseEntered

    private void LogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseExited
        changecolor(Logout, new Color(5, 10, 46));        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutMouseExited

    private void table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table2MouseClicked
        int index = table2.getSelectedRow();
        DefaultTableModel dbt = (DefaultTableModel) table2.getModel();
       
        Customer_Name.setText(dbt.getValueAt(index, 0).toString());
        Car_Number.setText(dbt.getValueAt(index, 1).toString());
        Car_Name.setText(dbt.getValueAt(index, 2).toString());
        Customer_Email.setText(dbt.getValueAt(index, 3).toString());
    }//GEN-LAST:event_table2MouseClicked

    private void table4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table4MouseClicked
        
         int index = table4.getSelectedRow();
        DefaultTableModel dbt = (DefaultTableModel) table4.getModel();
       
        Staff_Name.setText(dbt.getValueAt(index, 0).toString());
        Staff_Number.setText(dbt.getValueAt(index, 1).toString());
        Staff_Email.setText(dbt.getValueAt(index, 2).toString());
     
        
    }//GEN-LAST:event_table4MouseClicked

    private void searchIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchIconMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_searchIconMouseEntered

    private void jLabel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseClicked
        
         if(carNo.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Enter The Data First");
      }
     else{
         Database db=new Database();                                 
         ResultSet rs=db.searchForMenu(carNo.getText());

         try{
             if(rs.next()==(false)){
            JOptionPane.showMessageDialog(null,"Data Not Found");
            }
         
         else{
                

//            updatetable();
            customerName.setText(rs.getString("Customer_Name"));
            carNo.setText(rs.getString("Car_Number"));
            carName.setText(rs.getString("Car_Name"));
            email.setText(rs.getString("Customer_Email"));
         }            
     }
         catch(Exception e){
             System.out.println(e);
         
             
     }
         
     }
        
        
        
        
    }//GEN-LAST:event_jLabel39MouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddCustomer;
    private javax.swing.JPanel Add_cust;
    private javax.swing.JTextField CarName;
    private javax.swing.JTextField CarNumber;
    private javax.swing.JTextField Car_Name;
    private javax.swing.JTextField Car_Number;
    private javax.swing.JTextField CustomerEmail;
    private javax.swing.JTextField CustomerName;
    private javax.swing.JTextField Customer_Email;
    private javax.swing.JTextField Customer_Name;
    private javax.swing.JPanel Custumer;
    private javax.swing.JPanel Dashboarrd;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Logout;
    private javax.swing.JPanel ManageStaff;
    private javax.swing.JPanel Manage_staff;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Menuuu;
    private javax.swing.JPanel Min;
    private javax.swing.JPanel REport;
    private javax.swing.JPanel Report;
    private javax.swing.JTextField S_No;
    private javax.swing.JPanel SearchCustomer;
    private javax.swing.JPanel Search_customer;
    private javax.swing.JPanel StaffDetails;
    private javax.swing.JTextField Staff_Email;
    private javax.swing.JTextField Staff_Name;
    private javax.swing.JTextField Staff_Number;
    private javax.swing.JPanel Staff_detail;
    private javax.swing.JTextField balance;
    private javax.swing.JTextField bodywash;
    private swing.ButtonGradient buttonGradient10;
    private swing.ButtonGradient buttonGradient11;
    private swing.ButtonGradient buttonGradient12;
    private swing.ButtonGradient buttonGradient13;
    private swing.ButtonGradient buttonGradient14;
    private swing.ButtonGradient buttonGradient5;
    private swing.ButtonGradient buttonGradient6;
    private swing.ButtonGradient buttonGradient7;
    private swing.ButtonGradient buttonGradient8;
    private swing.ButtonGradient buttonGradient9;
    private checkbox.JCheckBoxCustom bw;
    private javax.swing.JTextField carName;
    private javax.swing.JTextField carNo;
    private javax.swing.JPanel close;
    private javax.swing.JPanel customer;
    private javax.swing.JTextField customerName;
    private javax.swing.JPanel dashboard;
    private javax.swing.JTextField email;
    private checkbox.JCheckBoxCustom fs;
    private javax.swing.JTextField full;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
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
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JSeparator jSeparator35;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private com.raven.swing.Table jTable2;
    private com.raven.swing.Table jTable3;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField13;
    private com.raven.swing.PanelBorder panelBorder1;
    private com.raven.swing.PanelBorder panelBorder2;
    private com.raven.swing.PanelBorder panelBorder3;
    private com.raven.swing.PanelBorder panelBorder4;
    private com.raven.swing.PanelBorder panelBorder5;
    private com.raven.swing.PanelBorder panelBorder6;
    private javax.swing.JTextField payment;
    private checkbox.JCheckBoxCustom po;
    private javax.swing.JTextField polish;
    private javax.swing.JLabel searchIcon;
    private javax.swing.JTextField seat;
    private javax.swing.JScrollPane sptable1;
    private javax.swing.JScrollPane sptable2;
    private javax.swing.JScrollPane sptable3;
    private javax.swing.JScrollPane sptable4;
    private javax.swing.JScrollPane sptable5;
    private javax.swing.JScrollPane sptable7;
    private javax.swing.JScrollPane sptable8;
    private javax.swing.JScrollPane sptable9;
    private checkbox.JCheckBoxCustom sr;
    private com.raven.swing.Table table1;
    private com.raven.swing.Table table2;
    private com.raven.swing.Table table3;
    private com.raven.swing.Table table4;
    private com.raven.swing.Table table7;
    private com.raven.swing.Table table8;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
