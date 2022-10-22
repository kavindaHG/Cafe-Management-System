package cafemanagementsystem;

import java.awt.geom.*;
import javax.swing.*;
import java.util.*;
import model.*;
import Dao.*;
import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

final class Home extends javax.swing.JFrame {

    public int BillID = 1;
    public int productTotal = 0;
    public int productPrice = 0;

    public void disableTableEdit() {
        tblBillProduct.setDefaultEditor(Object.class, null);
        tblBillBill.setDefaultEditor(Object.class, null);
        tableUser.setDefaultEditor(Object.class, null);
        tableProduct.setDefaultEditor(Object.class, null);
        jTable1.setDefaultEditor(Object.class, null);
    }

    //Update all tables without refreshing
    public void genTableCat() {
        DBOperation.gen_table("select * from category", jTable1);
    }//GenTableCat

    public void genTableProduct() {
        DBOperation.gen_table("select * from product", tableProduct);
    }//GenTableProduct

    public void genTableProductPos() {
        DBOperation.gen_table("select productname from product", tblBillProduct);
    }

    public void genTableUser() {
        DBOperation.gen_table("select id,name,username,mobileNumber,status FROM user", tableUser);
    }//GenTableUSer

    //Update all ComboBoxes & SearchBoxes without refreshing
    public void ComboCategory() { //Update combo box without refreshing
        ArrayList<Category> list = CategoryDao.getAllRecords();
        Iterator<Category> itr = list.iterator();
        CmbProductCat.removeAllItems();
        cmbBillCat.removeAllItems();
        while (itr.hasNext()) {
            Category categoryObj = itr.next();
            CmbProductCat.addItem(categoryObj.getName() + "");
            cmbBillCat.addItem(categoryObj.getName() + "");
        }//whie
    }//GetComboNewP

    //generate combo products
    public void ComboProuct() {
        ArrayList<Product> list = ProductDao.getAllRecords();
        Iterator<Product> itr = list.iterator();
        cmbManPrSearch.removeAllItems();
        while (itr.hasNext()) {
            Product productObj = itr.next();
            cmbManPrSearch.addItem(productObj.getName() + "");
        }//while
    }//getComboSearch

    //fitler products using category name
    public void FilterProductByCategory_Bill(String category) {
        DefaultTableModel dtm = (DefaultTableModel) tblBillProduct.getModel();
        dtm.setRowCount(0);
        ArrayList<Product> list = ProductDao.filterAllRecordsByCategory(category);
        Iterator<Product> itr = list.iterator();
        while (itr.hasNext()) {
            Product productObj = itr.next();
            dtm.addRow(new Object[]{productObj.getName()});
        }
    }//FilterProductByCategory_Bill

    //filter products using product name
    public void FilterProductBName_Bill(String name, String category) {
        DefaultTableModel dtm = (DefaultTableModel) tblBillProduct.getModel();
        dtm.setRowCount(0);
        ArrayList<Product> list = ProductDao.FilterProductByName(name, category);
        Iterator<Product> itr = list.iterator();
        while (itr.hasNext()) {
            Product productObj = itr.next();
            dtm.addRow(new Object[]{productObj.getName()});
        }
    }//FilterProductBName

    //comboFliters
    //constructorNasic
    public Home() {
        initComponents();
    }

    //Consturctor with Accesed Username
    public Home(String username) {

        initComponents();
        btnViewOrder.disable();
        String Username = username;
        JFormattedTextField tf = ((JSpinner.DefaultEditor) SinnerQuantity.getEditor()).getTextField();
        tf.setEnabled(false);

        if (!Username.equals("Admin")) {
            btn_VerifyUser.disable();

        } else {
            btn_VerifyUser.isEnabled();
        }
        //change Curves
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 35, 35));

        //Invoke methods for Update Tables and comboBoxes
        genTableCat();
        genTableUser();
        genTableProduct();
        ComboCategory();
        ComboProuct();
        genTableProductPos();
        disableTableEdit();
        AutoCompleteDecorator.decorate(cmbManPrSearch);
        cmbManPrSearch.setSelectedItem("");
    }//Home2

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Header = new rojerusan.RSPanelImage();
        btnExit = new javax.swing.JLabel();
        btnMin = new javax.swing.JLabel();
        btnMax = new javax.swing.JLabel();
        Nav = new rojerusan.RSPanelImage();
        btnViewOrder = new javax.swing.JLabel();
        btnPlaceOrder = new javax.swing.JLabel();
        btnNewProduct = new javax.swing.JLabel();
        btnProducts = new javax.swing.JLabel();
        btnCategory = new javax.swing.JLabel();
        btn_VerifyUser = new javax.swing.JLabel();
        btnSignOut = new javax.swing.JLabel();
        Container = new javax.swing.JPanel();
        panelHome = new rojerusan.RSPanelImage();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtCustName = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        txtCustMobile = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblBillProduct = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        txtBillPName = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtUnitPrice = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        txtTotalPrice = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblBillBill = new javax.swing.JTable();
        btnProceed = new javax.swing.JLabel();
        btnClearOrder = new javax.swing.JLabel();
        btnPrint = new javax.swing.JLabel();
        SinnerQuantity = new javax.swing.JSpinner();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        lblTotalG = new javax.swing.JLabel();
        cmbBillCat = new javax.swing.JComboBox<>();
        txtSearchPro = new javax.swing.JTextField();
        panelVerifyUser = new rojerusan.RSPanelImage();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableUser = new javax.swing.JTable();
        btnDeleteUser = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        panelNewProduct = new rojerusan.RSPanelImage();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNewPPrice = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtNewPName = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        CmbProductCat = new javax.swing.JComboBox<>();
        btnSaveNewP = new javax.swing.JLabel();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        rSPanelImage3 = new rojerusan.RSPanelImage();
        rSPanelImage5 = new rojerusan.RSPanelImage();
        rSPanelImage6 = new rojerusan.RSPanelImage();
        jLabel10 = new javax.swing.JLabel();
        ManageProducts = new rojerusan.RSPanelImage();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtPManName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        CmbPManCat = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        txtPManPrice = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        btnManPrlear = new javax.swing.JLabel();
        btnPMUpdate = new javax.swing.JLabel();
        btnManPrDlt = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableProduct = new javax.swing.JTable();
        cmbManPrSearch = new javax.swing.JComboBox<>();
        lblPID = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        panelCategory = new rojerusan.RSPanelImage();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNewCat = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btn_CatDlt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btn_CatSave = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setImagen(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/Heading.png"))); // NOI18N
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/btn_Exit.png"))); // NOI18N
        btnExit.setToolTipText("");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        Header.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 13, -1, -1));

        btnMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/btn_Minimize.png"))); // NOI18N
        btnMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinMouseClicked(evt);
            }
        });
        Header.add(btnMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 13, -1, -1));

        btnMax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/btn_maximize.png"))); // NOI18N
        btnMax.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Header.add(btnMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 13, -1, -1));

        jPanel1.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 90));

        Nav.setImagen(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/Leftmain.png"))); // NOI18N
        Nav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnViewOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/ViewOrder.png"))); // NOI18N
        btnViewOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnViewOrderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnViewOrderMouseExited(evt);
            }
        });
        Nav.add(btnViewOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        btnPlaceOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/placeOrder1.png"))); // NOI18N
        btnPlaceOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlaceOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPlaceOrderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPlaceOrderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPlaceOrderMouseExited(evt);
            }
        });
        Nav.add(btnPlaceOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        btnNewProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/NewProduct.png"))); // NOI18N
        btnNewProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNewProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewProductMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNewProductMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNewProductMouseExited(evt);
            }
        });
        Nav.add(btnNewProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, -1, -1));

        btnProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/products.png"))); // NOI18N
        btnProducts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProductsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProductsMouseExited(evt);
            }
        });
        Nav.add(btnProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, -1));

        btnCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/category1.png"))); // NOI18N
        btnCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCategoryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCategoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCategoryMouseExited(evt);
            }
        });
        Nav.add(btnCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, -1, -1));

        btn_VerifyUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/VerifyU.png"))); // NOI18N
        btn_VerifyUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_VerifyUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_VerifyUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_VerifyUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_VerifyUserMouseExited(evt);
            }
        });
        Nav.add(btn_VerifyUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, -1, -1));

        btnSignOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/SignOut.png"))); // NOI18N
        btnSignOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSignOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSignOutMouseExited(evt);
            }
        });
        Nav.add(btnSignOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, -1, -1));

        jPanel1.add(Nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 240, 670));

        Container.setLayout(new java.awt.CardLayout());

        panelHome.setImagen(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/PanelBg1.png"))); // NOI18N
        panelHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Garamond", 1, 48)); // NOI18N
        jLabel22.setText("Place Order");
        panelHome.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 24, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/Porder_64.png"))); // NOI18N
        panelHome.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 15, -1, -1));

        jLabel24.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel24.setText("Quantity");
        panelHome.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));

        jLabel25.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel25.setText("Mobile Number");
        panelHome.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabel26.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel26.setText("Product");
        panelHome.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 372, -1, -1));

        jLabel27.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel27.setText("Category");
        panelHome.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        txtCustName.setBackground(new java.awt.Color(204, 204, 204));
        txtCustName.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        txtCustName.setToolTipText("");
        panelHome.add(txtCustName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 300, 30));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        panelHome.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 300, 15));

        txtCustMobile.setBackground(new java.awt.Color(204, 204, 204));
        txtCustMobile.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        txtCustMobile.setToolTipText("");
        panelHome.add(txtCustMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 300, 30));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        panelHome.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 300, 15));

        tblBillProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product"
            }
        ));
        tblBillProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBillProductMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblBillProduct);

        panelHome.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 300, 250));

        jLabel30.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel30.setText("Customer Name");
        panelHome.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        txtBillPName.setEditable(false);
        txtBillPName.setBackground(new java.awt.Color(204, 204, 204));
        txtBillPName.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        txtBillPName.setToolTipText("");
        panelHome.add(txtBillPName, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 220, 30));

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        panelHome.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 220, 15));

        jLabel31.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel31.setText("Unit Price");
        panelHome.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, -1, -1));

        jLabel32.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel32.setText("Product Name");
        panelHome.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, -1));

        txtUnitPrice.setEditable(false);
        txtUnitPrice.setBackground(new java.awt.Color(204, 204, 204));
        txtUnitPrice.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        txtUnitPrice.setToolTipText("");
        panelHome.add(txtUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, 220, 30));

        jSeparator13.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        panelHome.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, 220, 15));

        txtTotalPrice.setEditable(false);
        txtTotalPrice.setBackground(new java.awt.Color(204, 204, 204));
        txtTotalPrice.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        txtTotalPrice.setToolTipText("");
        panelHome.add(txtTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 220, 30));

        jSeparator14.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        panelHome.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 310, 220, 15));

        tblBillBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Unity Price", "Quantity", "Total"
            }
        ));
        tblBillBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBillBillMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblBillBill);

        panelHome.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 490, 200));

        btnProceed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/btnProceed.png"))); // NOI18N
        btnProceed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProceed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProceedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProceedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProceedMouseExited(evt);
            }
        });
        panelHome.add(btnProceed, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, -1, -1));

        btnClearOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/btn_clear.png"))); // NOI18N
        btnClearOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClearOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearOrderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClearOrderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClearOrderMouseExited(evt);
            }
        });
        panelHome.add(btnClearOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 360, -1, -1));

        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/print.png"))); // NOI18N
        btnPrint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrintMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrintMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPrintMouseExited(evt);
            }
        });
        panelHome.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 620, -1, -1));

        SinnerQuantity.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        SinnerQuantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SinnerQuantityStateChanged(evt);
            }
        });
        panelHome.add(SinnerQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 220, 30));

        jLabel34.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel34.setText("Total Price");
        panelHome.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, -1, -1));

        jLabel35.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel35.setText("Total Ptice Rs. ");
        panelHome.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 630, -1, -1));

        lblTotalG.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        lblTotalG.setText("00");
        panelHome.add(lblTotalG, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 630, -1, -1));

        cmbBillCat.setEditable(true);
        cmbBillCat.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        cmbBillCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBillCatActionPerformed(evt);
            }
        });
        panelHome.add(cmbBillCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 180, 30));

        txtSearchPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchProKeyReleased(evt);
            }
        });
        panelHome.add(txtSearchPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 180, 30));

        Container.add(panelHome, "card2");

        panelVerifyUser.setImagen(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/PanelBg1.png"))); // NOI18N
        panelVerifyUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/verifyP.png"))); // NOI18N
        panelVerifyUser.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 15, -1, -1));

        jLabel11.setFont(new java.awt.Font("Garamond", 1, 48)); // NOI18N
        jLabel11.setText("Verify Users");
        panelVerifyUser.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 24, -1, -1));

        tableUser.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        tableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Username", "Mobile", "Status"
            }
        ));
        tableUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUserMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableUser);

        panelVerifyUser.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 870, 410));

        btnDeleteUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/DeleteU.png"))); // NOI18N
        btnDeleteUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteUserMouseExited(evt);
            }
        });
        panelVerifyUser.add(btnDeleteUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 580, -1, -1));

        jLabel20.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 0, 0));
        jLabel20.setText("Click on a Rown to Change Status");
        panelVerifyUser.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        Container.add(panelVerifyUser, "card5");

        panelNewProduct.setImagen(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/PanelBg1.png"))); // NOI18N
        panelNewProduct.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Garamond", 1, 48)); // NOI18N
        jLabel6.setText("New Product");
        panelNewProduct.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 24, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/NewPr.png"))); // NOI18N
        panelNewProduct.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 15, -1, -1));

        jLabel5.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel5.setText("Price");
        panelNewProduct.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        txtNewPPrice.setBackground(new java.awt.Color(204, 204, 204));
        txtNewPPrice.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        txtNewPPrice.setText("Enter Price in LKR");
        txtNewPPrice.setToolTipText("");
        txtNewPPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNewPPriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNewPPriceFocusLost(evt);
            }
        });
        panelNewProduct.add(txtNewPPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 289, 39));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        panelNewProduct.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 289, 15));

        jLabel8.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel8.setText("Product Name");
        panelNewProduct.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        txtNewPName.setBackground(new java.awt.Color(204, 204, 204));
        txtNewPName.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        txtNewPName.setText("Type Product name here");
        txtNewPName.setToolTipText("");
        txtNewPName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNewPNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNewPNameFocusLost(evt);
            }
        });
        panelNewProduct.add(txtNewPName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 289, 39));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        panelNewProduct.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 289, 15));

        jLabel9.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel9.setText("Product Category");
        panelNewProduct.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        CmbProductCat.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        panelNewProduct.add(CmbProductCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 289, 30));

        btnSaveNewP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/Add.png"))); // NOI18N
        btnSaveNewP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSaveNewP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveNewPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveNewPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveNewPMouseExited(evt);
            }
        });
        panelNewProduct.add(btnSaveNewP, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, -1, -1));

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/teacup.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        panelNewProduct.add(rSPanelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, -1, -1));

        rSPanelImage3.setImagen(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/dairy.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage3Layout = new javax.swing.GroupLayout(rSPanelImage3);
        rSPanelImage3.setLayout(rSPanelImage3Layout);
        rSPanelImage3Layout.setHorizontalGroup(
            rSPanelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        rSPanelImage3Layout.setVerticalGroup(
            rSPanelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        panelNewProduct.add(rSPanelImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, -1, -1));

        rSPanelImage5.setImagen(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/soda.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage5Layout = new javax.swing.GroupLayout(rSPanelImage5);
        rSPanelImage5.setLayout(rSPanelImage5Layout);
        rSPanelImage5Layout.setHorizontalGroup(
            rSPanelImage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        rSPanelImage5Layout.setVerticalGroup(
            rSPanelImage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        panelNewProduct.add(rSPanelImage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 140, -1, -1));

        rSPanelImage6.setImagen(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/ricebowl.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage6Layout = new javax.swing.GroupLayout(rSPanelImage6);
        rSPanelImage6.setLayout(rSPanelImage6Layout);
        rSPanelImage6Layout.setHorizontalGroup(
            rSPanelImage6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        rSPanelImage6Layout.setVerticalGroup(
            rSPanelImage6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        panelNewProduct.add(rSPanelImage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 300, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/btn_clear.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        panelNewProduct.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, -1, -1));

        Container.add(panelNewProduct, "card4");

        ManageProducts.setImagen(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/PanelBg1.png"))); // NOI18N
        ManageProducts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/manage_64.png"))); // NOI18N
        ManageProducts.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 15, -1, -1));

        jLabel14.setFont(new java.awt.Font("Garamond", 1, 48)); // NOI18N
        jLabel14.setText("Manage Products");
        ManageProducts.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 24, -1, -1));

        txtPManName.setBackground(new java.awt.Color(204, 204, 204));
        ManageProducts.add(txtPManName, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 300, 340, 39));

        jLabel15.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel15.setText("Price");
        ManageProducts.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 480, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        ManageProducts.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 340, 340, 15));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        ManageProducts.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 217, 100, 15));

        jLabel16.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel16.setText("Product ID");
        ManageProducts.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 144, -1, -1));

        jLabel17.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel17.setText("Product Name");
        ManageProducts.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 260, -1, -1));

        CmbPManCat.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        ManageProducts.add(CmbPManCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 420, 340, 30));

        jLabel18.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel18.setText("Product Category");
        ManageProducts.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 380, -1, -1));

        txtPManPrice.setBackground(new java.awt.Color(204, 204, 204));
        ManageProducts.add(txtPManPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 510, 340, 39));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        ManageProducts.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 550, 340, 15));

        btnManPrlear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/btn_clear2.png"))); // NOI18N
        btnManPrlear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManPrlear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnManPrlearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManPrlearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManPrlearMouseExited(evt);
            }
        });
        ManageProducts.add(btnManPrlear, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, -1, -1));

        btnPMUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/Update.png"))); // NOI18N
        btnPMUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPMUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPMUpdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPMUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPMUpdateMouseExited(evt);
            }
        });
        ManageProducts.add(btnPMUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, -1, -1));

        btnManPrDlt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/delete.png"))); // NOI18N
        btnManPrDlt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManPrDlt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnManPrDltMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManPrDltMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManPrDltMouseExited(evt);
            }
        });
        ManageProducts.add(btnManPrDlt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 580, -1, -1));

        tableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Name", "Category", "Price"
            }
        ));
        tableProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableProduct);

        ManageProducts.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 140, 520, 480));

        cmbManPrSearch.setEditable(true);
        cmbManPrSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbManPrSearchActionPerformed(evt);
            }
        });
        ManageProducts.add(cmbManPrSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, 190, -1));

        lblPID.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        lblPID.setText("00");
        ManageProducts.add(lblPID, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 180, 100, 40));

        jLabel21.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel21.setText("Search by User's Name");
        ManageProducts.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(762, 90, -1, -1));

        Container.add(ManageProducts, "card6");

        panelCategory.setImagen(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/PanelBg1.png"))); // NOI18N
        panelCategory.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Garamond", 1, 48)); // NOI18N
        jLabel1.setText("Category");
        panelCategory.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 24, 193, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/Category.png"))); // NOI18N
        panelCategory.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 15, -1, -1));

        txtNewCat.setBackground(new java.awt.Color(204, 204, 204));
        txtNewCat.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        txtNewCat.setText("Type category name here");
        txtNewCat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNewCatFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNewCatFocusLost(evt);
            }
        });
        panelCategory.add(txtNewCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 178, 289, 39));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        panelCategory.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 217, 289, 15));

        btn_CatDlt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/delete.png"))); // NOI18N
        btn_CatDlt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_CatDlt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CatDltMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CatDltMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CatDltMouseExited(evt);
            }
        });
        panelCategory.add(btn_CatDlt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 610, -1, -1));

        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category ID", "Category Name"
            }
        ));
        jTable1.setOpaque(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(400);
        }

        panelCategory.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 880, 240));

        jLabel4.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel4.setText("Add New Category");
        panelCategory.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 144, -1, -1));

        btn_CatSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/Add.png"))); // NOI18N
        btn_CatSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_CatSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CatSaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CatSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CatSaveMouseExited(evt);
            }
        });
        panelCategory.add(btn_CatSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel33.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel33.setText("Availabe Categories");
        panelCategory.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        Container.add(panelCategory, "card3");

        jPanel1.add(Container, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 980, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_btnMinMouseClicked

    private void btnPlaceOrderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlaceOrderMouseEntered
        btnPlaceOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/placeOrder2.png")));
    }//GEN-LAST:event_btnPlaceOrderMouseEntered

    private void btnPlaceOrderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlaceOrderMouseExited
        btnPlaceOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/placeOrder1.png")));
    }//GEN-LAST:event_btnPlaceOrderMouseExited

    private void btnProductsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductsMouseEntered
        btnProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/products2.png")));
    }//GEN-LAST:event_btnProductsMouseEntered

    private void btnProductsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductsMouseExited
        btnProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/products.png")));
    }//GEN-LAST:event_btnProductsMouseExited

    private void btnCategoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoryMouseEntered
        btnCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/category2.png")));
    }//GEN-LAST:event_btnCategoryMouseEntered

    private void btnCategoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoryMouseExited
        btnCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/category1.png")));
    }//GEN-LAST:event_btnCategoryMouseExited

    private void btn_VerifyUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VerifyUserMouseEntered
        btn_VerifyUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/VerifyU2.png")));
    }//GEN-LAST:event_btn_VerifyUserMouseEntered

    private void btn_VerifyUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VerifyUserMouseExited
        btn_VerifyUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/VerifyU.png")));
    }//GEN-LAST:event_btn_VerifyUserMouseExited

    private void btnSignOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignOutMouseEntered
        btnSignOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/SignOut2.png")));
    }//GEN-LAST:event_btnSignOutMouseEntered

    private void btnSignOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignOutMouseExited
        btnSignOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/SignOut.png")));
    }//GEN-LAST:event_btnSignOutMouseExited

    private void btnSignOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignOutMouseClicked
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btnSignOutMouseClicked

    private void btnCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoryMouseClicked
        panelHome.setVisible(false);
        panelCategory.setVisible(true);
        panelNewProduct.setVisible(false);
        ManageProducts.setVisible(false);
        panelVerifyUser.setVisible(false);
    }//GEN-LAST:event_btnCategoryMouseClicked

    private void btn_CatSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CatSaveMouseEntered
        btn_CatSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/Add2.png")));
    }//GEN-LAST:event_btn_CatSaveMouseEntered

    private void btn_CatSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CatSaveMouseExited
        btn_CatSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/Add.png")));
    }//GEN-LAST:event_btn_CatSaveMouseExited

    private void btn_CatDltMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CatDltMouseEntered
        btn_CatDlt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/delete2.png")));
    }//GEN-LAST:event_btn_CatDltMouseEntered

    private void btn_CatDltMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CatDltMouseExited
        btn_CatDlt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/delete.png")));
    }//GEN-LAST:event_btn_CatDltMouseExited

    private void btnNewProductMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewProductMouseExited
        btnNewProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/NewProduct.png")));
    }//GEN-LAST:event_btnNewProductMouseExited

    private void btnNewProductMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewProductMouseEntered
        btnNewProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/NewProduct2.png")));
    }//GEN-LAST:event_btnNewProductMouseEntered

    private void btnViewOrderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewOrderMouseEntered
        btnViewOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/View.png")));
    }//GEN-LAST:event_btnViewOrderMouseEntered

    private void btnViewOrderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewOrderMouseExited
        btnViewOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/ViewOrder.png")));
    }//GEN-LAST:event_btnViewOrderMouseExited

    private void btn_CatSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CatSaveMouseClicked
        if (txtNewCat.getText().equals("") || txtNewCat.getText().equals("Type category name here")) {
            JOptionPane.showMessageDialog(null, "Check the missing fields", "Empty Fields", JOptionPane.WARNING_MESSAGE);
        }//if 
        else {
            Category category = new Category();
            category.setName(txtNewCat.getText());
            CategoryDao.save(category);
            genTableCat();
            ComboCategory();

            txtNewCat.setText("");
        }//else
    }//GEN-LAST:event_btn_CatSaveMouseClicked

    private void btn_CatDltMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CatDltMouseClicked
        int x = JOptionPane.showConfirmDialog(null, "Do You Want to delete this Category", "Select", JOptionPane.YES_NO_OPTION);
        if (x == 0) {
            CategoryDao.Delete(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            genTableCat();
            ComboCategory();
        }//if
    }//GEN-LAST:event_btn_CatDltMouseClicked

    private void btnSaveNewPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveNewPMouseEntered
        btnSaveNewP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/Add2.png")));

    }//GEN-LAST:event_btnSaveNewPMouseEntered

    private void btnSaveNewPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveNewPMouseExited
        btnSaveNewP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/Add.png")));

    }//GEN-LAST:event_btnSaveNewPMouseExited

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/btn_clear2.png")));

    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/btn_clear.png")));

    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        txtNewPName.setText("Type Product name here");
        txtNewPPrice.setText("Enter Price in LKR");
    }//GEN-LAST:event_jLabel10MouseClicked

    private void btnDeleteUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteUserMouseEntered
        btnDeleteUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/DeleteU2.png"))); // NOI18N

    }//GEN-LAST:event_btnDeleteUserMouseEntered

    private void btnDeleteUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteUserMouseExited
        btnDeleteUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/DeleteU.png"))); // NOI18N

    }//GEN-LAST:event_btnDeleteUserMouseExited

    private void btn_VerifyUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VerifyUserMouseClicked
        panelHome.setVisible(false);
        panelCategory.setVisible(false);
        panelNewProduct.setVisible(false);
        ManageProducts.setVisible(false);
        panelVerifyUser.setVisible(true);
    }//GEN-LAST:event_btn_VerifyUserMouseClicked

    private void btnPMUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPMUpdateMouseEntered
        btnPMUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/Update2.png"))); // NOI18N

    }//GEN-LAST:event_btnPMUpdateMouseEntered

    private void btnPMUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPMUpdateMouseExited
        btnPMUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/Update.png"))); // NOI18N

    }//GEN-LAST:event_btnPMUpdateMouseExited

    private void btnManPrDltMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManPrDltMouseEntered
        btnManPrDlt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/delete2.png"))); // NOI18N
    }//GEN-LAST:event_btnManPrDltMouseEntered

    private void btnManPrDltMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManPrDltMouseExited
        btnManPrDlt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/delete.png"))); // NOI18N
    }//GEN-LAST:event_btnManPrDltMouseExited

    private void btnManPrlearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManPrlearMouseEntered
        btnManPrlear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/btn_clear.png"))); // NOI18N

    }//GEN-LAST:event_btnManPrlearMouseEntered

    private void btnManPrlearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManPrlearMouseExited
        btnManPrlear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/btn_clear2.png"))); // NOI18N

    }//GEN-LAST:event_btnManPrlearMouseExited

    private void btnProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductsMouseClicked
        panelHome.setVisible(false);
        panelCategory.setVisible(false);
        panelNewProduct.setVisible(false);
        ManageProducts.setVisible(true);
        panelVerifyUser.setVisible(false);

    }//GEN-LAST:event_btnProductsMouseClicked

    private void btnPlaceOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlaceOrderMouseClicked
        panelHome.setVisible(true);
        panelCategory.setVisible(false);
        panelNewProduct.setVisible(false);
        ManageProducts.setVisible(false);
        panelVerifyUser.setVisible(false);
    }//GEN-LAST:event_btnPlaceOrderMouseClicked

    private void btnNewProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewProductMouseClicked
        panelHome.setVisible(false);
        panelCategory.setVisible(false);
        panelNewProduct.setVisible(true);
        ManageProducts.setVisible(false);
        panelVerifyUser.setVisible(false);
    }//GEN-LAST:event_btnNewProductMouseClicked

    private void btnDeleteUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteUserMouseClicked
        int x = JOptionPane.showConfirmDialog(null, "Do You Want to delete this User", "Select", JOptionPane.YES_NO_OPTION);
        if (x == 0) {
            UserDao.Delete(tableUser.getValueAt(tableUser.getSelectedRow(), 0).toString());
            genTableUser();
        }//if
    }//GEN-LAST:event_btnDeleteUserMouseClicked

    private void txtNewPNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNewPNameFocusGained
        if (txtNewPName.getText().equals("Type Product name here")) {
            txtNewPName.setText("");
        }
    }//GEN-LAST:event_txtNewPNameFocusGained

    private void txtNewPNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNewPNameFocusLost
        if (txtNewPName.getText().equals("")) {
            txtNewPName.setText("Type Product name here");
        }
    }//GEN-LAST:event_txtNewPNameFocusLost

    private void txtNewPPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNewPPriceFocusGained
        if (txtNewPPrice.getText().equals("Enter Price in LKR")) {
            txtNewPPrice.setText("");
        }
    }//GEN-LAST:event_txtNewPPriceFocusGained

    private void txtNewPPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNewPPriceFocusLost
        if (txtNewPPrice.getText().equals("")) {
            txtNewPPrice.setText("Enter Price in LKR");
        }
    }//GEN-LAST:event_txtNewPPriceFocusLost

    private void txtNewCatFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNewCatFocusGained
        if (txtNewCat.getText().equals("Type category name here")) {
            txtNewCat.setText("");
        }
    }//GEN-LAST:event_txtNewCatFocusGained

    private void txtNewCatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNewCatFocusLost
        if (txtNewCat.getText().equals("")) {
            txtNewCat.setText("Type category name here");
        }
    }//GEN-LAST:event_txtNewCatFocusLost

    private void btnSaveNewPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveNewPMouseClicked
        if (txtNewPName.getText().equals("Type Product name here") || txtNewPPrice.getText().equals("Enter Price in LKR") || txtNewPName.getText().equals("") || txtNewPPrice.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Check the missing fields", "Empty Fields", JOptionPane.WARNING_MESSAGE);
        }//if
        else {
            Product product = new Product();
            product.setName(txtNewPName.getText());
            product.setCategory((String) CmbProductCat.getSelectedItem());
            product.setPrice(txtNewPPrice.getText());
            ProductDao.save(product);
            genTableProduct();
            genTableCat();
            genTableProductPos();
            ComboProuct();
            txtNewPName.setText("Type Product name here");
            txtNewPPrice.setText("Enter Price in LKR");
        }//else
    }//GEN-LAST:event_btnSaveNewPMouseClicked

    private void btnManPrlearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManPrlearMouseClicked
        lblPID.setText("");
        txtPManName.setText("");
        txtPManPrice.setText("");
    }//GEN-LAST:event_btnManPrlearMouseClicked

    private void btnPMUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPMUpdateMouseClicked
        if (txtPManName.getText().equals("") || txtPManPrice.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Check the missing fields", "Empty Fields", JOptionPane.WARNING_MESSAGE);
        }//if
        else {
            Product product = new Product();
            int id = Integer.parseInt(lblPID.getText());
            product.setId(id);
            product.setName(txtPManName.getText());
            product.setCategory((String) CmbPManCat.getSelectedItem());
            product.setPrice(txtPManPrice.getText());
            ProductDao.Update(product);
            genTableProduct();
            genTableCat();
            genTableProductPos();
            ComboProuct();
            lblPID.setText("");
            txtPManName.setText("");
            txtPManPrice.setText("");
        }//else
    }//GEN-LAST:event_btnPMUpdateMouseClicked

    private void tableProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductMouseClicked
        int index = tableProduct.getSelectedRow();
        TableModel model = tableProduct.getModel();
        String id = model.getValueAt(index, 0).toString();
        lblPID.setText(id);
        String name = model.getValueAt(index, 1).toString();
        txtPManName.setText(name);
        String category = model.getValueAt(index, 2).toString();

        String price = model.getValueAt(index, 3).toString();
        txtPManPrice.setText(price);

        CmbPManCat.removeAllItems();
        CmbPManCat.addItem(category);
        ArrayList<Category> categoryList = CategoryDao.getAllRecords();
        Iterator<Category> categoryItr = categoryList.iterator();
        while (categoryItr.hasNext()) {
            Category categoryObj = categoryItr.next();
            if (!categoryObj.getName().equals(category)) {
                CmbPManCat.addItem(categoryObj.getName());
            }//if
        }//while
        cmbManPrSearch.setSelectedItem("");
    }//GEN-LAST:event_tableProductMouseClicked

    private void btnManPrDltMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManPrDltMouseClicked
        if (lblPID.getText().equals("") || txtPManName.getText().equals("") || txtPManPrice.getText().equals("")) { // check all fields

            JOptionPane.showMessageDialog(null, "Check the missing fields", "Empty Fields", JOptionPane.WARNING_MESSAGE);
        }//if
        else {
            String id = lblPID.getText();
            int a = JOptionPane.showConfirmDialog(null, "Do you want to delete this Product ?", "Select", JOptionPane.YES_NO_OPTION);
            if (a == 0) {
                ProductDao.delete(id);
                lblPID.setText("");
                txtPManName.setText("");
                txtPManPrice.setText("");
                ComboProuct();
                genTableProduct();
                genTableCat();
                genTableProductPos();
            }//if
        }//else
    }//GEN-LAST:event_btnManPrDltMouseClicked

    //change user status
    private void tableUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUserMouseClicked
        int index = tableUser.getSelectedRow();
        TableModel model = tableUser.getModel();
        String username = model.getValueAt(index, 2).toString();
        String status = model.getValueAt(index, 4).toString();
        if (status.equals("true")) {
            status = "false";
        }//if
        else {
            status = "true";
        }//else

        int s = JOptionPane.showConfirmDialog(null, "Do you want to change the status of this User ? ", "Select", JOptionPane.YES_NO_OPTION);
        if (s == 0) {
            UserDao.changeStatus(username, status);
            genTableUser();
        }//ifConfirmDialog
    }//GEN-LAST:event_tableUserMouseClicked

    private void btnProceedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProceedMouseEntered
        btnProceed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/btnProceed2.png"))); // NOI18N

    }//GEN-LAST:event_btnProceedMouseEntered

    private void btnProceedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProceedMouseExited
        btnProceed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/btnProceed.png"))); // NOI18N

    }//GEN-LAST:event_btnProceedMouseExited

    private void btnClearOrderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearOrderMouseEntered
        btnClearOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/btn_clear2.png"))); // NOI18N

    }//GEN-LAST:event_btnClearOrderMouseEntered

    private void btnClearOrderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearOrderMouseExited
        btnClearOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/btn_clear.png"))); // NOI18N

    }//GEN-LAST:event_btnClearOrderMouseExited

    private void btnPrintMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseEntered
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/print2.png"))); // NOI18N

    }//GEN-LAST:event_btnPrintMouseEntered

    private void btnPrintMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseExited
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/print.png"))); // NOI18N

    }//GEN-LAST:event_btnPrintMouseExited

    private void tblBillProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBillProductMouseClicked
        int index = tblBillProduct.getSelectedRow();
        TableModel model = tblBillProduct.getModel();
        String productname = model.getValueAt(index, 0).toString();
        Product product = ProductDao.getProductByName(productname);
        txtBillPName.setText(product.getName());
        txtUnitPrice.setText(product.getPrice());
        SinnerQuantity.setValue(1);
        txtTotalPrice.setText(product.getPrice());
        productPrice = Integer.parseInt(product.getPrice());
        productTotal = Integer.parseInt(product.getPrice());
        txtSearchPro.setText("");

    }//GEN-LAST:event_tblBillProductMouseClicked
    //change totalprice
    private void SinnerQuantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SinnerQuantityStateChanged
        int quantity = (Integer) SinnerQuantity.getValue();
        if (quantity <= 1) {
            SinnerQuantity.setValue(1);
            quantity = 1;
        }
        productTotal = productPrice * quantity;
        txtTotalPrice.setText(String.valueOf(productTotal));

    }//GEN-LAST:event_SinnerQuantityStateChanged

    //filterbycategory
    private void cmbBillCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBillCatActionPerformed
        String category = (String) cmbBillCat.getSelectedItem();
        FilterProductByCategory_Bill(category);
    }//GEN-LAST:event_cmbBillCatActionPerformed

    private void btnProceedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProceedMouseClicked
        if (txtCustName.getText().equals("") || txtCustMobile.getText().equals("") || txtBillPName.getText().equals("") || txtUnitPrice.getText().equals("") || txtTotalPrice.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Check the missing fields", "Empty Fields", JOptionPane.WARNING_MESSAGE);
        } else {

            String name = txtBillPName.getText();
            String price = txtUnitPrice.getText();
            String quantity = String.valueOf(SinnerQuantity.getValue());
            DefaultTableModel dtm = (DefaultTableModel) tblBillBill.getModel();
            dtm.addRow(new Object[]{name, price, quantity, productTotal});
            txtBillPName.setText("");
            txtUnitPrice.setText("");
            txtTotalPrice.setText("");
            SinnerQuantity.setValue(1);
        }
        double sum = 0;
        System.out.println("count " + tblBillBill.getRowCount());
        for (int i = 0; i < tblBillBill.getRowCount(); i++) {
            sum = sum + Integer.parseInt(tblBillBill.getValueAt(i, 3).toString());
            String ans = String.valueOf(sum);
            lblTotalG.setText(ans);
        }
    }//GEN-LAST:event_btnProceedMouseClicked

    private void btnClearOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearOrderMouseClicked
        txtCustName.setText("");
        txtCustMobile.setText("");
        txtBillPName.setText("");
        SinnerQuantity.setValue(1);
        txtUnitPrice.setText("");
        txtTotalPrice.setText("");
        SinnerQuantity.setValue(1);
        tblBillBill.removeAll();
        txtSearchPro.setText("");
        lblTotalG.setText("");
    }//GEN-LAST:event_btnClearOrderMouseClicked

    private void tblBillBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBillBillMouseClicked

        try {
            DefaultTableModel model = (DefaultTableModel) tblBillBill.getModel();
            int SelectedRowIndex = tblBillBill.getSelectedRow();
            int x = JOptionPane.showConfirmDialog(null, "Delete this Item?", "Delete", JOptionPane.YES_NO_OPTION);
            if (x == 0) {
                model.removeRow(SelectedRowIndex);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tblBillBillMouseClicked

    private void txtSearchProKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchProKeyReleased
        String name = txtSearchPro.getText();
        String category = (String) cmbBillCat.getSelectedItem();
        FilterProductBName_Bill(name, category);
    }//GEN-LAST:event_txtSearchProKeyReleased

    private void btnPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseClicked
        try {
            tblBillBill.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPrintMouseClicked

    private void cmbManPrSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbManPrSearchActionPerformed
        DBOperation.gen_table("select * from product where productname like '%" + cmbManPrSearch.getSelectedItem() + "%'", tableProduct);
    }//GEN-LAST:event_cmbManPrSearchActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmbPManCat;
    private javax.swing.JComboBox<String> CmbProductCat;
    private javax.swing.JPanel Container;
    private rojerusan.RSPanelImage Header;
    private rojerusan.RSPanelImage ManageProducts;
    private rojerusan.RSPanelImage Nav;
    private javax.swing.JSpinner SinnerQuantity;
    private javax.swing.JLabel btnCategory;
    private javax.swing.JLabel btnClearOrder;
    private javax.swing.JLabel btnDeleteUser;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnManPrDlt;
    private javax.swing.JLabel btnManPrlear;
    private javax.swing.JLabel btnMax;
    private javax.swing.JLabel btnMin;
    private javax.swing.JLabel btnNewProduct;
    private javax.swing.JLabel btnPMUpdate;
    private javax.swing.JLabel btnPlaceOrder;
    private javax.swing.JLabel btnPrint;
    private javax.swing.JLabel btnProceed;
    private javax.swing.JLabel btnProducts;
    private javax.swing.JLabel btnSaveNewP;
    private javax.swing.JLabel btnSignOut;
    private javax.swing.JLabel btnViewOrder;
    private javax.swing.JLabel btn_CatDlt;
    private javax.swing.JLabel btn_CatSave;
    private javax.swing.JLabel btn_VerifyUser;
    private javax.swing.JComboBox<String> cmbBillCat;
    private javax.swing.JComboBox<String> cmbManPrSearch;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblPID;
    private javax.swing.JLabel lblTotalG;
    private rojerusan.RSPanelImage panelCategory;
    private rojerusan.RSPanelImage panelHome;
    private rojerusan.RSPanelImage panelNewProduct;
    private rojerusan.RSPanelImage panelVerifyUser;
    private rojerusan.RSPanelImage rSPanelImage1;
    private rojerusan.RSPanelImage rSPanelImage3;
    private rojerusan.RSPanelImage rSPanelImage5;
    private rojerusan.RSPanelImage rSPanelImage6;
    private javax.swing.JTable tableProduct;
    private javax.swing.JTable tableUser;
    private javax.swing.JTable tblBillBill;
    private javax.swing.JTable tblBillProduct;
    private javax.swing.JTextField txtBillPName;
    private javax.swing.JTextField txtCustMobile;
    private javax.swing.JTextField txtCustName;
    private javax.swing.JTextField txtNewCat;
    private javax.swing.JTextField txtNewPName;
    private javax.swing.JTextField txtNewPPrice;
    private javax.swing.JTextField txtPManName;
    private javax.swing.JTextField txtPManPrice;
    private javax.swing.JTextField txtSearchPro;
    private javax.swing.JTextField txtTotalPrice;
    private javax.swing.JTextField txtUnitPrice;
    // End of variables declaration//GEN-END:variables
}
