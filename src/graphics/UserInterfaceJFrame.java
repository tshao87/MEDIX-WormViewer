package graphics;

/**
 *
 * @author MSHAO1
 */
public class UserInterfaceJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public UserInterfaceJFrame() {
        initComponents();
        jPanel1.add(new FeatureViewPanel());
        jPanel2.add(new DataVisualizationPanel());
        jPanel3.add(new DataParserPanel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(820, 540));
        jPanel1.setMinimumSize(new java.awt.Dimension(820, 540));
        jPanel1.setPreferredSize(new java.awt.Dimension(820, 540));
        jPanel1.setLayout(new java.awt.BorderLayout());
        jTabbedPane1.addTab("Static Data Visualization", jPanel1);

        jPanel2.setMaximumSize(new java.awt.Dimension(820, 540));
        jPanel2.setMinimumSize(new java.awt.Dimension(820, 540));
        jPanel2.setPreferredSize(new java.awt.Dimension(820, 540));
        jPanel2.setLayout(new java.awt.BorderLayout());
        jTabbedPane1.addTab("Time Based Data Visualization", jPanel2);

        jPanel3.setMaximumSize(new java.awt.Dimension(820, 540));
        jPanel3.setMinimumSize(new java.awt.Dimension(820, 540));
        jPanel3.setPreferredSize(new java.awt.Dimension(820, 540));
        jPanel3.setLayout(new java.awt.BorderLayout());
        jTabbedPane1.addTab("Data Management", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
