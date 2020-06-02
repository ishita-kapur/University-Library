
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ishita kapur
 */
public class IssueBook extends javax.swing.JFrame {

    /**
     * Creates new form IssueBook
     */
    public IssueBook() {
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

        jPanel1 = new javax.swing.JPanel();
        labelSSN = new javax.swing.JLabel();
        textSSN = new javax.swing.JTextField();
        labelISBN = new javax.swing.JLabel();
        textISBN = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnBorrowBook = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Issue Book");

        labelSSN.setText("Member's SSN");

        textSSN.setEnabled(false);

        labelISBN.setText("ISBN");

        jButton1.setText("Check Availability");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnBorrowBook.setText("Borrow Book");
        btnBorrowBook.setEnabled(false);
        btnBorrowBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrowBookActionPerformed(evt);
            }
        });

        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSSN)
                            .addComponent(labelISBN)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textSSN)
                                    .addComponent(textISBN, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBorrowBook, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClear)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelISBN)
                    .addComponent(textISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jButton1)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSSN)
                    .addComponent(textSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btnBorrowBook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnClear))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "password");
            
            Statement stmt = conn.createStatement();
            String isbn = textISBN.getText();
            ResultSet rs = stmt.executeQuery("SELECT Num_Of_Copies FROM COPIES WHERE ISBN = "+isbn);
            Statement stmt_1 = conn.createStatement();
            ResultSet rs_1 = stmt_1.executeQuery("SELECT TYPE FROM BOOK WHERE ISBN = "+isbn);
            
            String copies = "0", book_type = "Subject";
            if(!rs_1.isBeforeFirst() && !rs.isBeforeFirst()){
                JOptionPane.showMessageDialog(null, "Book with ISBN : " + isbn + " not available.");
                textSSN.setEnabled(false);
                btnBorrowBook.setEnabled(false);
            }
            else {
                while ( rs_1.next() ) {
                book_type = rs_1.getString("TYPE");
                //System.out.println(book_type);
                }
                while ( rs.next() ) {
                copies = rs.getString("Num_Of_Copies");
                //System.out.println(copies);
                }
                if(copies.equals("0")){
                    JOptionPane.showMessageDialog(null, "No copies available.");
                }
                else if(book_type.equals("Subject")){
                    textSSN.setEnabled(true);
                    btnBorrowBook.setEnabled(true);
                    JOptionPane.showMessageDialog(null, copies + " copies available. Enter member's SSN to borrow a copy.");
                }
                else{
                    JOptionPane.showMessageDialog(null, copies + " copies available. " + book_type + " book cannot be borrowed.");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        UniversityLibrary u_lib = new UniversityLibrary();
        u_lib.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBorrowBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrowBookActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "password");
            
            String member_ssn = textSSN.getText();
            String isbn = textISBN.getText();
            Statement stmt_2 = conn.createStatement();
            ResultSet rs_2 = stmt_2.executeQuery("SELECT SSN, is_Faculty FROM MEMBER WHERE SSN = "+member_ssn);
            Statement stmt_5 = conn.createStatement();
            ResultSet rs_5 = stmt_5.executeQuery("SELECT ISSUE_DATE, RETURN_DATE FROM ISSUE_BOOK WHERE SSN = "+member_ssn+" and ISBN = "+isbn);
            if(!rs_2.isBeforeFirst()){
                JOptionPane.showMessageDialog(null, "Not a registered member.");
                textSSN.setText("");
            }
            else if(rs_5.next()){
                Date r_date = rs_5.getDate("RETURN_DATE");
                Date i_date = rs_5.getDate("ISSUE_DATE");
                if(r_date == null){
                    JOptionPane.showMessageDialog(null, "Member has issued the same book on " + i_date + " and not returned it.");
                    textISBN.setText("");
                    textSSN.setText("");
                    textSSN.setEnabled(false);
                    btnBorrowBook.setEnabled(false);
                }
                else{
                    String is_Faculty = "No";
                    while(rs_2.next()){
                        is_Faculty = rs_2.getString("is_Faculty");
                    }
                    Statement stmt_6 = conn.createStatement();
                    ResultSet rs_6 = stmt_6.executeQuery("SELECT SSN, COUNT(ISBN) as Num_Loaned FROM ISSUE_BOOK WHERE RETURN_DATE IS NULL AND SSN="+member_ssn);
                    while(rs_6.next()){
                        int count = rs_6.getInt("Num_Loaned");
                        if(count >= 5){
                            JOptionPane.showMessageDialog(null, "*** Member can only borrow 5 books. Maximum limit reached at this time. ***");
                            textSSN.setText("");
                            return;
                        }
                    }
                    String query_1 = "insert into issue_book(ssn, isbn, issue_date, due_date, return_date) values (?, ?, ?, ?, ?)";
                    PreparedStatement pstmt_1 = conn.prepareStatement(query_1);                
                    pstmt_1.setString(1, textSSN.getText());
                    pstmt_1.setString(2, textISBN.getText());
                    LocalDate today = LocalDate.now();
                    int year = today.getYear();
                    int month = today.getMonthValue();
                    int day = today.getDayOfMonth();
                    String issue_Date = Integer.toString(year) + '-' + Integer.toString(month) + '-' + Integer.toString(day);
                    pstmt_1.setString(3, issue_Date);
                    LocalDate returnvalue = today.plusDays(21);
                    if(is_Faculty.equalsIgnoreCase("Yes")){
                    returnvalue = today.plusDays(90);
                    }
                    int due_year = returnvalue.getYear();
                    int due_month = returnvalue.getMonthValue();
                    int due_day = returnvalue.getDayOfMonth();               
                    String due_Date = Integer.toString(due_year) + '-' + Integer.toString(due_month) + '-' + Integer.toString(due_day);
                    pstmt_1.setString(4, due_Date);
                    pstmt_1.setNull(5, Types.NVARCHAR);
                    
                    String copies = "0";
                    Statement stmt_3 = conn.createStatement();
                    ResultSet rs = stmt_3.executeQuery("SELECT Num_Of_Copies FROM COPIES WHERE ISBN = "+isbn);
                    String query_2 = "update copies set Num_Of_Copies=? where isbn=" + isbn;
                    PreparedStatement pstmt_2 = conn.prepareStatement(query_2);
                    while ( rs.next() ) {
                    copies = rs.getString("Num_Of_Copies");
                    //System.out.println(copies);
                    }
                    int num_copies = Integer.parseInt(copies) - 1;
                    pstmt_2.setInt(1, num_copies);
                    pstmt_1.executeUpdate();
                    pstmt_2.executeUpdate();
                
                    Statement stmt_4 = conn.createStatement();
                    ResultSet rs_3 = stmt_4.executeQuery("SELECT Name FROM MEMBER WHERE SSN = "+member_ssn);
                    String member_name = "";
                    while ( rs_3.next() ) {
                    member_name = rs_3.getString("Name");
                    }
                    JOptionPane.showMessageDialog(null, "Book borrowed by " + member_name + ".\nDue date: " + due_Date);
                    UniversityLibrary u_lib = new UniversityLibrary();
                    u_lib.setVisible(true);
                    dispose();
                }
            }
            else {
                String is_Faculty = "No";
                while(rs_2.next()){
                    is_Faculty = rs_2.getString("is_Faculty");
                }
                Statement stmt_6 = conn.createStatement();
                ResultSet rs_6 = stmt_6.executeQuery("SELECT SSN, COUNT(ISBN) as Num_Loaned FROM ISSUE_BOOK WHERE RETURN_DATE IS NULL AND SSN="+member_ssn);
                while(rs_6.next()){
                    int count = rs_6.getInt("Num_Loaned");
                    if(count >= 5){
                        JOptionPane.showMessageDialog(null, "*** Member can only borrow 5 books. Maximum limit reached at this time. ***");
                        textSSN.setText("");
                        return;
                    }
                }
                String query_1 = "insert into issue_book(ssn, isbn, issue_date, due_date, return_date) values (?, ?, ?, ?, ?)";
                PreparedStatement pstmt_1 = conn.prepareStatement(query_1);                
                pstmt_1.setString(1, textSSN.getText());
                pstmt_1.setString(2, textISBN.getText());
                LocalDate today = LocalDate.now();
                int year = today.getYear();
                int month = today.getMonthValue();
                int day = today.getDayOfMonth();
                String issue_Date = Integer.toString(year) + '-' + Integer.toString(month) + '-' + Integer.toString(day);
                pstmt_1.setString(3, issue_Date);
                LocalDate returnvalue = today.plusDays(21);
                if(is_Faculty.equalsIgnoreCase("Yes")){
                returnvalue = today.plusDays(90);
                }
                int due_year = returnvalue.getYear();
                int due_month = returnvalue.getMonthValue();
                int due_day = returnvalue.getDayOfMonth();               
                String due_Date = Integer.toString(due_year) + '-' + Integer.toString(due_month) + '-' + Integer.toString(due_day);
                pstmt_1.setString(4, due_Date);
                pstmt_1.setNull(5, Types.NVARCHAR);
                
                String copies = "0";
                Statement stmt_3 = conn.createStatement();
                ResultSet rs = stmt_3.executeQuery("SELECT Num_Of_Copies FROM COPIES WHERE ISBN = "+isbn);
                String query_2 = "update copies set Num_Of_Copies=? where isbn=" + isbn;
                PreparedStatement pstmt_2 = conn.prepareStatement(query_2);
                while ( rs.next() ) {
                copies = rs.getString("Num_Of_Copies");
                //System.out.println(copies);
                }
                int num_copies = Integer.parseInt(copies) - 1;
                pstmt_2.setInt(1, num_copies);
                pstmt_1.executeUpdate();
                pstmt_2.executeUpdate();
                
                Statement stmt_4 = conn.createStatement();
                ResultSet rs_3 = stmt_4.executeQuery("SELECT Name FROM MEMBER WHERE SSN = "+member_ssn);
                String member_name = "";
                while ( rs_3.next() ) {
                member_name = rs_3.getString("Name");
                }
                JOptionPane.showMessageDialog(null, "Book borrowed by " + member_name + ".\nDue date: " + due_Date);
                UniversityLibrary u_lib = new UniversityLibrary();
                u_lib.setVisible(true);
                dispose();
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnBorrowBookActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        textISBN.setText("");
        textSSN.setText("");
        textSSN.setEnabled(false);
        btnBorrowBook.setEnabled(false);
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBorrowBook;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelISBN;
    private javax.swing.JLabel labelSSN;
    private javax.swing.JTextField textISBN;
    private javax.swing.JTextField textSSN;
    // End of variables declaration//GEN-END:variables
}