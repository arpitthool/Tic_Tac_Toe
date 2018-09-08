import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arpit
 */
public class Tic_Tac_Toe extends javax.swing.JFrame {

    /**
     * Creates new form Tic_Tac_Toe
     */
    int turn;
    int[] board = new int[9];
    ImageIcon tick = new ImageIcon("Actions-dialog-ok-apply-icon.png");
    ImageIcon cross = new ImageIcon("delete-icon64.png");
    
    public Tic_Tac_Toe() {
        initComponents();
        int turn = 0;
    }

    private List get_neighbours( int[] board){
        List neighbours = new ArrayList();
        if( btn_0.isEnabled()){
            neighbours.add(0);
        }
        if( btn_1.isEnabled()){
            neighbours.add(1);
        }
        if( btn_2.isEnabled()){
            neighbours.add(2);
        }
        if( btn_3.isEnabled()){
            neighbours.add(3);
        }
        if( btn_4.isEnabled()){
            neighbours.add(4);
        }
        if( btn_5.isEnabled()){
            neighbours.add(5);
        }
        if( btn_6.isEnabled()){
            neighbours.add(6);
        }
        if( btn_7.isEnabled()){
            neighbours.add(7);
        }
        if( btn_8.isEnabled()){
            neighbours.add(8);
        }
        return neighbours;
    }
    
    private boolean check_draw( ){
        
        if( btn_0.isEnabled()){
            return false;
        }
        if( btn_1.isEnabled()){
            return false;
        }
        if( btn_2.isEnabled()){
            return false;
        }
        if( btn_3.isEnabled()){
            return false;
        }
        if( btn_4.isEnabled()){
            return false;
        }
        if( btn_5.isEnabled()){
            return false;
        }
        if( btn_6.isEnabled()){
            return false;
        }
        if( btn_7.isEnabled()){
            return false;
        }
        if( btn_8.isEnabled()){
            return false;
        }
        return true;
    }
    
    private void close(){
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));//better way
    }
    
    private int find_winner(int[] board){
        if(  board[0] + board[1] + board[2] == 3 ){
            btn_0.setEnabled(true);
            btn_1.setEnabled(true);
            btn_2.setEnabled(true);
            return 1;
        } 
        if( board[3] + board[4] + board[5] == 3 ){
            btn_3.setEnabled(true);
            btn_4.setEnabled(true);
            btn_5.setEnabled(true);
            return 1;
        }
        if( board[6] + board[7] + board[8] == 3 ){
            btn_6.setEnabled(true);
            btn_7.setEnabled(true);
            btn_8.setEnabled(true);
            return 1;
        }
        if( board[0] + board[3] + board[6] == 3 ){
            btn_0.setEnabled(true);
            btn_3.setEnabled(true);
            btn_6.setEnabled(true);
            return 1;
        } 
        if( board[1] + board[4] + board[7] == 3 ){
            btn_1.setEnabled(true);
            btn_4.setEnabled(true);
            btn_7.setEnabled(true);
            return 1;
        }
        if( board[2] + board[5] + board[8] == 3 ){
            btn_2.setEnabled(true);
            btn_5.setEnabled(true);
            btn_8.setEnabled(true);
            return 1;
        }
        if( board[0] + board[4] + board[8] == 3){
            btn_0.setEnabled(true);
            btn_4.setEnabled(true);
            btn_8.setEnabled(true);
            return 1;
        }
        if( board[2] + board[4] + board[6] == 3 ){
            btn_2.setEnabled(true);
            btn_4.setEnabled(true);
            btn_6.setEnabled(true);
            return 1;
        }
        if(  board[0] + board[1] + board[2] == -3){
            btn_0.setEnabled(true);
            btn_1.setEnabled(true);
            btn_2.setEnabled(true);
            return -1;
        } 
        if(  board[3] + board[4] + board[5] == -3){
            btn_3.setEnabled(true);
            btn_4.setEnabled(true);
            btn_5.setEnabled(true);
            return -1;
        }
        if(  board[6] + board[7] + board[8] == -3){
            btn_6.setEnabled(true);
            btn_7.setEnabled(true);
            btn_8.setEnabled(true);
            return -1;
        }
        if(  board[0] + board[3] + board[6] == -3){
            btn_0.setEnabled(true);
            btn_3.setEnabled(true);
            btn_6.setEnabled(true);
            return -1;
        } 
        if(  board[1] + board[4] + board[7] == -3){
            btn_1.setEnabled(true);
            btn_4.setEnabled(true);
            btn_7.setEnabled(true);
            return -1;
        }
        if( board[2] + board[5] + board[8] == -3){
            btn_2.setEnabled(true);
            btn_5.setEnabled(true);
            btn_8.setEnabled(true);
            return -1;
        }
        if(  board[0] + board[4] + board[8] == -3){
            btn_0.setEnabled(true);
            btn_4.setEnabled(true);
            btn_8.setEnabled(true);
            return -1;
        }
        if( board[2] + board[4] + board[6] == -3){
            btn_2.setEnabled(true);
            btn_4.setEnabled(true);
            btn_6.setEnabled(true);
            return -1;
        }       

        
        return 0;
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
        btn_8 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_8MouseClicked(evt);
            }
        });

        btn_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_5MouseClicked(evt);
            }
        });

        btn_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_6MouseClicked(evt);
            }
        });

        btn_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_1MouseClicked(evt);
            }
        });
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_0MouseClicked(evt);
            }
        });
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });

        btn_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_7MouseClicked(evt);
            }
        });

        btn_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_4MouseClicked(evt);
            }
        });
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_2MouseClicked(evt);
            }
        });
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_3MouseClicked(evt);
            }
        });
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setText("TIC TAC TOE");

        btn_refresh.setText("Refresh");
        btn_refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_refreshMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_refresh)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(btn_refresh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_0ActionPerformed
    
    private void refresh(){
        this.turn =0;
        this.board = new int[9];
        btn_0.setIcon(null);
        btn_1.setIcon(null);
        btn_2.setIcon(null);
        btn_3.setIcon(null);
        btn_4.setIcon(null);
        btn_5.setIcon(null);
        btn_6.setIcon(null);
        btn_7.setIcon(null);
        btn_8.setIcon(null);
        btn_0.setEnabled(true);
        btn_1.setEnabled(true);
        btn_2.setEnabled(true);
        btn_3.setEnabled(true);
        btn_4.setEnabled(true);
        btn_5.setEnabled(true);
        btn_6.setEnabled(true);
        btn_7.setEnabled(true);
        btn_8.setEnabled(true);
    }
    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_0MouseClicked
        if( !btn_0.isEnabled()){
            return;
        }
        
        if( this.turn++%2 == 0){
            btn_0.setIcon(tick);
            this.board[0] = 1;
        }
        else{
            btn_0.setIcon(cross);
            this.board[0] = -1;
        }
        btn_0.setEnabled(false);
        if(this.check_draw()){
             JOptionPane.showMessageDialog(null, "It's a Draw!");
             this.refresh();
         }
        if(this.find_winner(this.board) != 0){
            if(this.find_winner(this.board) == 1){
                JOptionPane.showMessageDialog(null, "Player One Wins!");
                this.refresh();
            }
            else{
                JOptionPane.showMessageDialog(null, "Player Two Wins!");
                this.refresh();
            }
        }
        
    }//GEN-LAST:event_btn_0MouseClicked

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MouseClicked
        if( !btn_1.isEnabled()){
            return;
        } 
        
        if( this.turn++%2 == 0){
            btn_1.setIcon(tick);
            this.board[1] = 1;
        }
        else{
            btn_1.setIcon(cross);
            this.board[1] = -1;
        }
        btn_1.setEnabled(false);
        if(this.check_draw()){
             JOptionPane.showMessageDialog(null, "It's a Draw!");
             this.refresh();
         }
        if(this.find_winner(this.board) != 0){
            if(this.find_winner(this.board) == 1){
                JOptionPane.showMessageDialog(null, "Player One Wins!");
                this.refresh();
            }
            else{
                JOptionPane.showMessageDialog(null, "Player Two Wins!");
                this.refresh();
            }
        }
        
    }//GEN-LAST:event_btn_1MouseClicked

    private void btn_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MouseClicked
        if( !btn_2.isEnabled()){
            return;
        } 
        
        if( this.turn++%2 == 0){
            btn_2.setIcon(tick);
            this.board[2] = 1;
        }
        else{
            btn_2.setIcon(cross);
            this.board[2] = -1;
        }
         btn_2.setEnabled(false);
         if(this.check_draw()){
             JOptionPane.showMessageDialog(null, "It's a Draw!");
             this.refresh();
         }
        if(this.find_winner(this.board) != 0){
            if(this.find_winner(this.board) == 1){
                JOptionPane.showMessageDialog(null, "Player One Wins!");
                this.refresh();
            }
            else{
                JOptionPane.showMessageDialog(null, "Player Two Wins!");
                this.refresh();
            }
        }
        
    }//GEN-LAST:event_btn_2MouseClicked

    private void btn_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MouseClicked
        if( !btn_3.isEnabled()){
            return;
        } 
        
        if( this.turn++%2 == 0){
            btn_3.setIcon(tick);
            this.board[3] = 1;
        }
        else{
            btn_3.setIcon(cross);
            this.board[3] = -1;
        }
         btn_3.setEnabled(false);
         if(this.check_draw()){
             JOptionPane.showMessageDialog(null, "It's a Draw!");
             this.refresh();
         }
        if(this.find_winner(this.board) != 0){
            if(this.find_winner(this.board) == 1){
                JOptionPane.showMessageDialog(null, "Player One Wins!");
                this.refresh();
            }
            else{
                JOptionPane.showMessageDialog(null, "Player Two Wins!");
                this.refresh();
            }
        }
        
    }//GEN-LAST:event_btn_3MouseClicked

    private void btn_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MouseClicked
        if( !btn_4.isEnabled()){
            return;
        } 
        
        if( this.turn++%2 == 0){
            btn_4.setIcon(tick);
            this.board[4] = 1;
        }
        else{
            btn_4.setIcon(cross);
            this.board[4] = -1;
        }
        
         btn_4.setEnabled(false);
         if(this.check_draw()){
             JOptionPane.showMessageDialog(null, "It's a Draw!");
             this.refresh();
         }
        if(this.find_winner(this.board) != 0){
            if(this.find_winner(this.board) == 1){
                JOptionPane.showMessageDialog(null, "Player One Wins!");
                this.refresh();
            }
            else{
                JOptionPane.showMessageDialog(null, "Player Two Wins!");
                this.refresh();
            }
        }
       
    }//GEN-LAST:event_btn_4MouseClicked

    private void btn_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_5MouseClicked
        if( !btn_5.isEnabled()){
            return;
        } 
        
        if( this.turn++%2 == 0){
            btn_5.setIcon(tick);
            this.board[5] = 1;
        }
        else{
            btn_5.setIcon(cross);
            this.board[5] = -1;
        }
         btn_5.setEnabled(false);
         if(this.check_draw()){
             JOptionPane.showMessageDialog(null, "It's a Draw!");
             this.refresh();
         }
        if(this.find_winner(this.board) != 0){
            if(this.find_winner(this.board) == 1){
                JOptionPane.showMessageDialog(null, "Player One Wins!");
                this.refresh();
            }
            else{
                JOptionPane.showMessageDialog(null, "Player Two Wins!");
                this.refresh();
            }
        }
         
    }//GEN-LAST:event_btn_5MouseClicked

    private void btn_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6MouseClicked
        if( !btn_6.isEnabled()){
            return;
        }
        
        if( this.turn++%2 == 0){
                btn_6.setIcon(tick);
                this.board[6] = 1;
            }
            else{
                btn_6.setIcon(cross);
                this.board[6] = -1;
            }
        btn_6.setEnabled(false);
        if(this.check_draw()){
             JOptionPane.showMessageDialog(null, "It's a Draw!");
             this.refresh();
         }
        if(this.find_winner(this.board) != 0){
                if(this.find_winner(this.board) == 1){
                    JOptionPane.showMessageDialog(null, "Player One Wins!");
                    this.refresh();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Player Two Wins!");
                    this.refresh();
                }
            }
        
    }//GEN-LAST:event_btn_6MouseClicked

    private void btn_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_7MouseClicked
        if( !btn_7.isEnabled()){
            return;
        }  
        
        if( this.turn++%2 == 0){
            btn_7.setIcon(tick);
            this.board[7] = 1;
        }
        else{
            btn_7.setIcon(cross);
            this.board[7] = -1;
        }
          btn_7.setEnabled(false);
          if(this.check_draw()){
             JOptionPane.showMessageDialog(null, "It's a Draw!");
             this.refresh();
         }
        if(this.find_winner(this.board) != 0){
            if(this.find_winner(this.board) == 1){
                JOptionPane.showMessageDialog(null, "Player One Wins!");
                this.refresh();
            }
            else{
                JOptionPane.showMessageDialog(null, "Player Two Wins!");
                this.refresh();
            }
        }
          
    }//GEN-LAST:event_btn_7MouseClicked

    private void btn_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_8MouseClicked
        if( !btn_8.isEnabled()){
            return;
        } 
        
        if( this.turn++%2 == 0){
            btn_8.setIcon(tick);
            this.board[8] = 1;
        }
        else{
            btn_8.setIcon(cross);
            this.board[8] = -1;
        }
         btn_8.setEnabled(false);
         if(this.check_draw()){
             JOptionPane.showMessageDialog(null, "It's a Draw!");
             this.refresh();
         }
        if(this.find_winner(this.board) != 0){
            if(this.find_winner(this.board) == 1){
                JOptionPane.showMessageDialog(null, "Player One Wins!");
                this.refresh();
            }
            else{
                JOptionPane.showMessageDialog(null, "Player Two Wins!");
                this.refresh(); 
            }
        }
         
    }//GEN-LAST:event_btn_8MouseClicked

    private void btn_refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_refreshMouseClicked
        
        this.turn =0;
        this.board = new int[9];
        btn_0.setIcon(null);
        btn_1.setIcon(null);
        btn_2.setIcon(null);
        btn_3.setIcon(null);
        btn_4.setIcon(null);
        btn_5.setIcon(null);
        btn_6.setIcon(null);
        btn_7.setIcon(null);
        btn_8.setIcon(null);
        btn_0.setEnabled(true);
        btn_1.setEnabled(true);
        btn_2.setEnabled(true);
        btn_3.setEnabled(true);
        btn_4.setEnabled(true);
        btn_5.setEnabled(true);
        btn_6.setEnabled(true);
        btn_7.setEnabled(true);
        btn_8.setEnabled(true);
       
    }//GEN-LAST:event_btn_refreshMouseClicked

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
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tic_Tac_Toe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
