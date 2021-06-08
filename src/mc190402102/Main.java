package mc190402102; 
/**
 *
 * @author MOHAMMAD
 */
public class Main extends javax.swing.JFrame {
    
    public Main() {
        // TODO code application logic here
        String stdID = "MC190402102";
        initComponents();
        setTitle("Assignment No. 2 of "+stdID);   
    }
    
    @SuppressWarnings("unchecked")
    
    private void initComponents(){
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();        
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        DbHelper db = new DbHelper();
        String id = jTextField1.getText();
        String name = jTextField2.getText();
        String address = jTextField3.getText();
        String effected = jTextField4.getText();
        
        Patient patient = new Patient(id, name, address, effected);
        db.savePatient(patient);
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        DbHelper db = new DbHelper();
        String id = jTextField9.getText();
        
        Patient patient = db.searchPatient(id);
        jTextField5.setText(patient.getID());
        jTextField6.setText(patient.getName());
        jTextField7.setText(patient.getAddress());
        jTextField8.setText(patient.getEffected());     
    }
    
    public static void main(String args[]){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration

}
    
   

