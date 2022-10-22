package cafemanagementsystem;

import java.awt.geom.*;
import model.User;
import Dao.UserDao;
import javax.swing.*;

public class Login extends javax.swing.JFrame {

    private String DbAnswer = null;
    private String username = null;

    //constructor
    Login() {
        initComponents();
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 35, 35));
    }//Login

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JPanel();
        LeftPanel = new rojerusan.RSPanelImage();
        btnExit = new javax.swing.JLabel();
        btnMax = new javax.swing.JLabel();
        btn_min = new javax.swing.JLabel();
        Container = new javax.swing.JPanel();
        panelSignIn = new rojerusan.RSPanelImage();
        btn_SignIn = new javax.swing.JLabel();
        txt_UnameLogin = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txt_PwdLogin = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        cb_ShowPw = new javax.swing.JCheckBox();
        OR = new rojerusan.RSPanelImage();
        btn_Gosignup = new javax.swing.JLabel();
        btnForgotPw = new javax.swing.JLabel();
        panelSignUp = new rojerusan.RSPanelImage();
        cmdSuSq = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_SuPwd = new javax.swing.JTextField();
        txt_SuAdd = new javax.swing.JTextField();
        txt_SuName = new javax.swing.JTextField();
        txt_SuMobile = new javax.swing.JTextField();
        txt_SuUname = new javax.swing.JTextField();
        btn_Clear = new javax.swing.JLabel();
        btn_BackLogin = new javax.swing.JLabel();
        btn_Signup = new javax.swing.JLabel();
        txt_SuAns = new javax.swing.JTextField();
        panelResetPw = new rojerusan.RSPanelImage();
        txt_RPwUName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_RPwSq = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_RPwAns = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_reset = new javax.swing.JLabel();
        btnClearReset = new javax.swing.JLabel();
        btnBLoginReset = new javax.swing.JLabel();
        txtResetpwReset = new javax.swing.JPasswordField();
        btnSearchResetPw = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Login.setPreferredSize(new java.awt.Dimension(850, 515));

        LeftPanel.setImagen(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/BgLogin_left.png"))); // NOI18N

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/btn_Exit.png"))); // NOI18N
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });

        btnMax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/btn_maximize.png"))); // NOI18N
        btnMax.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btn_min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/btn_Minimize.png"))); // NOI18N
        btn_min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_minMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LeftPanelLayout = new javax.swing.GroupLayout(LeftPanel);
        LeftPanel.setLayout(LeftPanelLayout);
        LeftPanelLayout.setHorizontalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMax)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_min)
                .addContainerGap(300, Short.MAX_VALUE))
        );
        LeftPanelLayout.setVerticalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_min)
                    .addComponent(btnExit)
                    .addComponent(btnMax))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Container.setLayout(new java.awt.CardLayout());

        panelSignIn.setImagen(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/Login.png"))); // NOI18N
        panelSignIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_SignIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/SignIn.png"))); // NOI18N
        btn_SignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_SignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SignInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SignInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SignInMouseExited(evt);
            }
        });
        panelSignIn.add(btn_SignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 390, -1, -1));

        txt_UnameLogin.setBackground(new java.awt.Color(5, 19, 64));
        txt_UnameLogin.setFont(new java.awt.Font("Century Gothic", 2, 13)); // NOI18N
        txt_UnameLogin.setForeground(new java.awt.Color(204, 204, 204));
        txt_UnameLogin.setText("Username");
        txt_UnameLogin.setBorder(null);
        txt_UnameLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_UnameLoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_UnameLoginFocusLost(evt);
            }
        });
        panelSignIn.add(txt_UnameLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 204, 299, 35));
        panelSignIn.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 299, 299, -1));

        txt_PwdLogin.setBackground(new java.awt.Color(5, 19, 64));
        txt_PwdLogin.setForeground(new java.awt.Color(204, 204, 204));
        txt_PwdLogin.setText("Password");
        txt_PwdLogin.setBorder(null);
        txt_PwdLogin.setPreferredSize(new java.awt.Dimension(64, 17));
        txt_PwdLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_PwdLoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_PwdLoginFocusLost(evt);
            }
        });
        panelSignIn.add(txt_PwdLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 268, 299, 31));
        panelSignIn.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 239, 299, -1));

        cb_ShowPw.setBackground(new java.awt.Color(5, 19, 64));
        cb_ShowPw.setForeground(new java.awt.Color(204, 204, 204));
        cb_ShowPw.setText("Show Password");
        cb_ShowPw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ShowPwActionPerformed(evt);
            }
        });
        panelSignIn.add(cb_ShowPw, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 319, -1, -1));

        OR.setImagen(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/or.png"))); // NOI18N

        javax.swing.GroupLayout ORLayout = new javax.swing.GroupLayout(OR);
        OR.setLayout(ORLayout);
        ORLayout.setHorizontalGroup(
            ORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 299, Short.MAX_VALUE)
        );
        ORLayout.setVerticalGroup(
            ORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        panelSignIn.add(OR, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, -1, -1));

        btn_Gosignup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/Sign Up here.png"))); // NOI18N
        btn_Gosignup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Gosignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_GosignupMouseClicked(evt);
            }
        });
        panelSignIn.add(btn_Gosignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, -1, -1));

        btnForgotPw.setFont(new java.awt.Font("Georgia", 1, 13)); // NOI18N
        btnForgotPw.setForeground(new java.awt.Color(255, 0, 0));
        btnForgotPw.setText("Forget Passoword ?");
        btnForgotPw.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnForgotPw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnForgotPwMouseClicked(evt);
            }
        });
        panelSignIn.add(btnForgotPw, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 355, 140, -1));

        Container.add(panelSignIn, "card2");

        panelSignUp.setImagen(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/SignInBg.png"))); // NOI18N
        panelSignUp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdSuSq.setBackground(new java.awt.Color(5, 19, 84));
        cmdSuSq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your grand mothers name?", "Which hospital You were born?", "What was your Pre school name?", "Who was your first best friend?", "what was your first School?" }));
        panelSignUp.add(cmdSuSq, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 342, 256, -1));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        panelSignUp.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 117, -1, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");
        panelSignUp.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 164, -1, -1));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mobile Number");
        panelSignUp.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 208, -1, -1));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Adress");
        panelSignUp.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");
        panelSignUp.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Security Question");
        panelSignUp.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 344, -1, -1));

        jLabel8.setFont(new java.awt.Font("Georgia", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Answer");
        panelSignUp.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 382, -1, -1));

        txt_SuPwd.setBackground(new java.awt.Color(5, 19, 84));
        txt_SuPwd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_SuPwd.setForeground(new java.awt.Color(255, 255, 255));
        txt_SuPwd.setBorder(null);
        panelSignUp.add(txt_SuPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 296, 256, 26));

        txt_SuAdd.setBackground(new java.awt.Color(5, 19, 84));
        txt_SuAdd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_SuAdd.setForeground(new java.awt.Color(255, 255, 255));
        txt_SuAdd.setBorder(null);
        panelSignUp.add(txt_SuAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 252, 256, 26));

        txt_SuName.setBackground(new java.awt.Color(5, 19, 84));
        txt_SuName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_SuName.setForeground(new java.awt.Color(255, 255, 255));
        txt_SuName.setBorder(null);
        panelSignUp.add(txt_SuName, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 117, 256, 26));

        txt_SuMobile.setBackground(new java.awt.Color(5, 19, 84));
        txt_SuMobile.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_SuMobile.setForeground(new java.awt.Color(255, 255, 255));
        txt_SuMobile.setBorder(null);
        panelSignUp.add(txt_SuMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 208, 256, 26));

        txt_SuUname.setBackground(new java.awt.Color(5, 19, 84));
        txt_SuUname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_SuUname.setForeground(new java.awt.Color(255, 255, 255));
        txt_SuUname.setBorder(null);
        panelSignUp.add(txt_SuUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 164, 256, 26));

        btn_Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/btn_clear.png"))); // NOI18N
        btn_Clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ClearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ClearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ClearMouseExited(evt);
            }
        });
        panelSignUp.add(btn_Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 441, -1, -1));

        btn_BackLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/btn_backSignIn.png"))); // NOI18N
        btn_BackLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_BackLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_BackLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_BackLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_BackLoginMouseExited(evt);
            }
        });
        panelSignUp.add(btn_BackLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 441, -1, -1));

        btn_Signup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/btn_signUp.png"))); // NOI18N
        btn_Signup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SignupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SignupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SignupMouseExited(evt);
            }
        });
        panelSignUp.add(btn_Signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 441, -1, -1));

        txt_SuAns.setBackground(new java.awt.Color(5, 19, 84));
        txt_SuAns.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_SuAns.setForeground(new java.awt.Color(255, 255, 255));
        txt_SuAns.setBorder(null);
        panelSignUp.add(txt_SuAns, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 382, 256, 26));

        Container.add(panelSignUp, "card2");

        panelResetPw.setForeground(new java.awt.Color(255, 255, 255));
        panelResetPw.setImagen(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/ResetPw.png"))); // NOI18N

        txt_RPwUName.setBackground(new java.awt.Color(5, 19, 84));
        txt_RPwUName.setForeground(new java.awt.Color(255, 255, 255));
        txt_RPwUName.setBorder(null);

        jLabel9.setFont(new java.awt.Font("Georgia", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Username");

        txt_RPwSq.setEditable(false);
        txt_RPwSq.setBackground(new java.awt.Color(5, 19, 84));
        txt_RPwSq.setForeground(new java.awt.Color(255, 255, 255));
        txt_RPwSq.setBorder(null);

        jLabel10.setFont(new java.awt.Font("Georgia", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Security Question");

        txt_RPwAns.setBackground(new java.awt.Color(5, 19, 84));
        txt_RPwAns.setForeground(new java.awt.Color(255, 255, 255));
        txt_RPwAns.setBorder(null);

        jLabel11.setFont(new java.awt.Font("Georgia", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Your Answer");

        jLabel12.setFont(new java.awt.Font("Georgia", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Reset Password");

        btn_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/Resetbtn.png"))); // NOI18N
        btn_reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_resetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_resetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_resetMouseExited(evt);
            }
        });

        btnClearReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/btn_clear.png"))); // NOI18N
        btnClearReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClearReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearResetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClearResetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClearResetMouseExited(evt);
            }
        });

        btnBLoginReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/btn_backSignIn.png"))); // NOI18N
        btnBLoginReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBLoginReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBLoginResetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBLoginResetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBLoginResetMouseExited(evt);
            }
        });

        txtResetpwReset.setBackground(new java.awt.Color(5, 19, 84));
        txtResetpwReset.setForeground(new java.awt.Color(255, 255, 255));
        txtResetpwReset.setBorder(null);

        btnSearchResetPw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/icons8_search_32.png"))); // NOI18N
        btnSearchResetPw.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchResetPw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchResetPwMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelResetPwLayout = new javax.swing.GroupLayout(panelResetPw);
        panelResetPw.setLayout(panelResetPwLayout);
        panelResetPwLayout.setHorizontalGroup(
            panelResetPwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResetPwLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelResetPwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelResetPwLayout.createSequentialGroup()
                        .addGroup(panelResetPwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(37, 37, 37)
                        .addGroup(panelResetPwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_RPwSq, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelResetPwLayout.createSequentialGroup()
                                .addComponent(txt_RPwUName, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearchResetPw)))
                        .addGap(14, 14, 14))
                    .addGroup(panelResetPwLayout.createSequentialGroup()
                        .addGroup(panelResetPwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelResetPwLayout.createSequentialGroup()
                                .addGroup(panelResetPwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(53, 53, 53)
                                .addGroup(panelResetPwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_RPwAns, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtResetpwReset, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelResetPwLayout.createSequentialGroup()
                                .addComponent(btn_reset)
                                .addGap(18, 18, 18)
                                .addComponent(btnClearReset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBLoginReset)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelResetPwLayout.setVerticalGroup(
            panelResetPwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResetPwLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(panelResetPwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelResetPwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_RPwUName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(btnSearchResetPw, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(panelResetPwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_RPwSq, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(34, 34, 34)
                .addGroup(panelResetPwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_RPwAns, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(36, 36, 36)
                .addGroup(panelResetPwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtResetpwReset, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(panelResetPwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_reset)
                    .addComponent(btnClearReset)
                    .addComponent(btnBLoginReset))
                .addGap(61, 61, 61))
        );

        Container.add(panelResetPw, "card4");

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addComponent(LeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //clear function for reset password
    public void ResetPwClear() {
        txt_RPwUName.setText("");
        txt_RPwSq.setText("");
        txt_RPwAns.setText("");
        txtResetpwReset.setText("");
    }//ResetPwClear

    //clear button for signup
    public void clear() {
        txt_SuName.setText("");
        txt_SuUname.setText("");
        txt_SuMobile.setText("");
        txt_SuAdd.setText("");
        txt_SuPwd.setText("");
        txt_SuAns.setText("");
    }//Clear

    //checkBox for show password
    private void cb_ShowPwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ShowPwActionPerformed
        if (cb_ShowPw.isSelected()) {
            txt_PwdLogin.setEchoChar((char) 0);
        }//if
        else {
            txt_PwdLogin.setEchoChar('*');
        }//else
    }//GEN-LAST:event_cb_ShowPwActionPerformed

    //Exit Button
    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    //Minimized button
    private void btn_minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_btn_minMouseClicked

    //signIn button
    private void btn_SignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SignInMouseClicked
        String username = txt_UnameLogin.getText();
        String password = txt_PwdLogin.getText();
        User user = null;

        if (txt_UnameLogin.getText().equals("Admin") && txt_PwdLogin.getText().equals("Admin")) {
            this.dispose();
            new Home(username).setVisible(true);
        } else {
            user = UserDao.login(username, password);
            if (user == null) {
                JOptionPane.showMessageDialog(null, "Invalid Credentials", "Message", JOptionPane.ERROR_MESSAGE);
            }//if1
            else {
                //check status and giving permissions for get logged in
                if (user.getStatus().equals("false")) {
                    JOptionPane.showMessageDialog(null, "Wait For Admin Apporval", "Message", JOptionPane.INFORMATION_MESSAGE);
                    txt_UnameLogin.setText("Username");
                    txt_PwdLogin.setText("Password");
                }//if2

                if (user.getStatus().equals("true")) {
                    setVisible(false);
                    new Home(username).setVisible(true);
                }//if3
            }//else
        }
    }//GEN-LAST:event_btn_SignInMouseClicked

    //back to login button
    private void btn_BackLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BackLoginMouseClicked
        panelSignIn.setVisible(true);
        panelSignUp.setVisible(false);
        panelResetPw.setVisible(false);
    }//GEN-LAST:event_btn_BackLoginMouseClicked

    private void txt_UnameLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_UnameLoginFocusGained
        if (txt_UnameLogin.getText().equals("Username")) {
            txt_UnameLogin.setText("");
        }

    }//GEN-LAST:event_txt_UnameLoginFocusGained

    private void txt_UnameLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_UnameLoginFocusLost
        if (txt_UnameLogin.getText().equals("")) {
            txt_UnameLogin.setText("Username");
        }
    }//GEN-LAST:event_txt_UnameLoginFocusLost

    private void txt_PwdLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_PwdLoginFocusGained
        if (txt_PwdLogin.getText().equals("Password")) {
            txt_PwdLogin.setText("");
        }
    }//GEN-LAST:event_txt_PwdLoginFocusGained

    private void txt_PwdLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_PwdLoginFocusLost
        if (txt_PwdLogin.getText().equals("")) {
            txt_PwdLogin.setText("Password");
        }
    }//GEN-LAST:event_txt_PwdLoginFocusLost

    private void btn_SignInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SignInMouseEntered
        btn_SignIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/SignIn2.png"))); // Change Button Bg

    }//GEN-LAST:event_btn_SignInMouseEntered

    private void btn_SignInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SignInMouseExited
        btn_SignIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/SignIn.png"))); // Change Button Bg

    }//GEN-LAST:event_btn_SignInMouseExited

    private void btn_ClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ClearMouseEntered
        btn_Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/btn_clear2.png"))); // Change Button Bg
    }//GEN-LAST:event_btn_ClearMouseEntered

    private void btn_ClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ClearMouseExited
        btn_Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/btn_clear.png"))); // Change Button Bg
    }//GEN-LAST:event_btn_ClearMouseExited

    private void btn_BackLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BackLoginMouseEntered
        btn_BackLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/btn_backLogin2.png"))); // Change Button Bg
    }//GEN-LAST:event_btn_BackLoginMouseEntered

    private void btn_BackLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BackLoginMouseExited
        btn_BackLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/btn_backSignIn.png"))); // Change Button Bg
    }//GEN-LAST:event_btn_BackLoginMouseExited

    private void btn_SignupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SignupMouseEntered
        btn_Signup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/btn_signUp2.png"))); // Change Button Bg

    }//GEN-LAST:event_btn_SignupMouseEntered

    private void btn_SignupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SignupMouseExited
        btn_Signup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/btn_signUp.png"))); // Change Button Bg
    }//GEN-LAST:event_btn_SignupMouseExited

    //Go to Signup Button Event
    private void btn_GosignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GosignupMouseClicked
        panelSignIn.setVisible(false);
        panelSignUp.setVisible(true);
        panelResetPw.setVisible(false);
    }//GEN-LAST:event_btn_GosignupMouseClicked

    //Signup button function
    private void btn_SignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SignupMouseClicked
        User user = new User();

        if (txt_SuName.getText().equals("") || txt_SuUname.getText().equals("") || txt_SuMobile.getText().equals("") || txt_SuAdd.getText().equals("") || txt_SuPwd.getText().equals("") || txt_SuAns.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Check the Missing Fields", "Empty Fields", JOptionPane.WARNING_MESSAGE);

        }//if
        else {
            user.setName(txt_SuName.getText());
            user.setUsername(txt_SuUname.getText());
            user.setMobile(txt_SuMobile.getText());
            user.setAddress(txt_SuAdd.getText());
            user.setPassword(txt_SuPwd.getText());
            user.setSecurityQuestion((String) cmdSuSq.getSelectedItem());
            user.setAnswer(txt_SuAns.getText());
            UserDao.save(user);
            clear();
        }//else
    }//GEN-LAST:event_btn_SignupMouseClicked

    private void btn_ClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ClearMouseClicked
        clear();
    }//GEN-LAST:event_btn_ClearMouseClicked

    private void btnBLoginResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBLoginResetMouseEntered
        btnBLoginReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/btn_backLogin2.png")));// Change Button Bg
    }//GEN-LAST:event_btnBLoginResetMouseEntered

    private void btnBLoginResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBLoginResetMouseExited
        btnBLoginReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/btn_backSignIn.png")));// Change Button Bg
    }//GEN-LAST:event_btnBLoginResetMouseExited

    private void btnBLoginResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBLoginResetMouseClicked
        panelSignIn.setVisible(true);
        panelSignUp.setVisible(false);
        panelResetPw.setVisible(false);
    }//GEN-LAST:event_btnBLoginResetMouseClicked

    private void btnForgotPwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnForgotPwMouseClicked
        panelSignIn.setVisible(false);
        panelSignUp.setVisible(false);
        panelResetPw.setVisible(true);
    }//GEN-LAST:event_btnForgotPwMouseClicked

    private void btnClearResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearResetMouseEntered
        btnClearReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/btn_clear2.png"))); // Change Button Bg 
    }//GEN-LAST:event_btnClearResetMouseEntered

    private void btnClearResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearResetMouseExited
        btnClearReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/btn_clear.png")));// Change Button Bg
    }//GEN-LAST:event_btnClearResetMouseExited

    private void btn_resetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_resetMouseEntered
        btn_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/Resetbtn2.png")));// Change Button Bg
    }//GEN-LAST:event_btn_resetMouseEntered

    private void btn_resetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_resetMouseExited
        btn_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/Resetbtn.png")));// Change Button Bg
    }//GEN-LAST:event_btn_resetMouseExited

    private void btnClearResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearResetMouseClicked
        ResetPwClear();

    }//GEN-LAST:event_btnClearResetMouseClicked

    private void btn_resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_resetMouseClicked
        String answer = txt_RPwAns.getText();
        String newPassword = txtResetpwReset.getText();

        if (txt_RPwUName.getText().equals("") || txt_RPwSq.getText().equals("") || txt_RPwAns.getText().equals("") || txtResetpwReset.getText().equals("")) { // check all fields

            JOptionPane.showMessageDialog(null, "Check the missing fields", "Empty Fields", JOptionPane.WARNING_MESSAGE);
        }//if1
        else {
            if (answer.equals(DbAnswer)) {
                UserDao.update(username, newPassword);
                ResetPwClear();
            }//if2
            else {
                JOptionPane.showMessageDialog(null, "Answer Does not match", "Message", JOptionPane.ERROR_MESSAGE);
                ResetPwClear();
            }//else2
        }//else1
    }//GEN-LAST:event_btn_resetMouseClicked

    private void btnSearchResetPwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchResetPwMouseClicked
        if (txt_RPwUName.equals("") && txt_RPwSq.equals("") && txt_RPwAns.equals("") && txtResetpwReset.equals("")) {
            JOptionPane.showMessageDialog(null, "Check the missing fields", "Empty Fields", JOptionPane.WARNING_MESSAGE);
        }//if1
        else {
            username = txt_RPwUName.getText();
            User user = null;
            user = UserDao.getSecuiryQuestion(username);
            if (user == null) {
                JOptionPane.showMessageDialog(null, "Username Does not Exists", "Message", JOptionPane.ERROR_MESSAGE);
            }//if2
            else {
                DbAnswer = user.getAnswer();
                txt_RPwSq.setText(user.getSecurityQuestion());
            }//else1
        }//else2
    }//GEN-LAST:event_btnSearchResetPwMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private rojerusan.RSPanelImage LeftPanel;
    private javax.swing.JPanel Login;
    private rojerusan.RSPanelImage OR;
    private javax.swing.JLabel btnBLoginReset;
    private javax.swing.JLabel btnClearReset;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnForgotPw;
    private javax.swing.JLabel btnMax;
    private javax.swing.JLabel btnSearchResetPw;
    private javax.swing.JLabel btn_BackLogin;
    private javax.swing.JLabel btn_Clear;
    private javax.swing.JLabel btn_Gosignup;
    private javax.swing.JLabel btn_SignIn;
    private javax.swing.JLabel btn_Signup;
    private javax.swing.JLabel btn_min;
    private javax.swing.JLabel btn_reset;
    private javax.swing.JCheckBox cb_ShowPw;
    private javax.swing.JComboBox<String> cmdSuSq;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private rojerusan.RSPanelImage panelResetPw;
    private rojerusan.RSPanelImage panelSignIn;
    private rojerusan.RSPanelImage panelSignUp;
    private javax.swing.JPasswordField txtResetpwReset;
    private javax.swing.JPasswordField txt_PwdLogin;
    private javax.swing.JTextField txt_RPwAns;
    private javax.swing.JTextField txt_RPwSq;
    private javax.swing.JTextField txt_RPwUName;
    private javax.swing.JTextField txt_SuAdd;
    private javax.swing.JTextField txt_SuAns;
    private javax.swing.JTextField txt_SuMobile;
    private javax.swing.JTextField txt_SuName;
    private javax.swing.JTextField txt_SuPwd;
    private javax.swing.JTextField txt_SuUname;
    private javax.swing.JTextField txt_UnameLogin;
    // End of variables declaration//GEN-END:variables
}
