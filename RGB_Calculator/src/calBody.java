/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class calBody extends javax.swing.JFrame {

    /**
     * Creates new form calBody
     */
    
    double first;
    double second;
    double result;
    String operation;
    String answer;
    
    public calBody() {
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
        textField = new javax.swing.JTextField();
        btnDel = new javax.swing.JButton();
        btnClr = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnMin = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPoint = new javax.swing.JButton();
        btnRes = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        textField.setBackground(new java.awt.Color(255, 191, 0));
        textField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldActionPerformed(evt);
            }
        });

        btnDel.setBackground(new java.awt.Color(220, 53, 53));
        btnDel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnDel.setForeground(new java.awt.Color(255, 255, 255));
        btnDel.setText("<--");
        btnDel.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnClr.setBackground(new java.awt.Color(146, 180, 236));
        btnClr.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnClr.setText("CLEAR");
        btnClr.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnClr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClrActionPerformed(evt);
            }
        });

        btnMod.setBackground(new java.awt.Color(33, 146, 255));
        btnMod.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMod.setForeground(new java.awt.Color(255, 255, 255));
        btnMod.setText("%");
        btnMod.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(33, 146, 255));
        btnAdd.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("+");
        btnAdd.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(255, 112, 0));
        btn9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn9.setText("9");
        btn9.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(255, 112, 0));
        btn8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn8.setText("8");
        btn8.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(255, 112, 0));
        btn7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn7.setText("7");
        btn7.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(255, 112, 0));
        btn4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn4.setText("4");
        btn4.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(255, 112, 0));
        btn5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn5.setText("5");
        btn5.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(255, 112, 0));
        btn6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn6.setText("6");
        btn6.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btnMin.setBackground(new java.awt.Color(33, 146, 255));
        btnMin.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMin.setForeground(new java.awt.Color(255, 255, 255));
        btnMin.setText("-");
        btnMin.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinActionPerformed(evt);
            }
        });

        btnMulti.setBackground(new java.awt.Color(33, 146, 255));
        btnMulti.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMulti.setForeground(new java.awt.Color(255, 255, 255));
        btnMulti.setText("x");
        btnMulti.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(255, 112, 0));
        btn3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn3.setText("3");
        btn3.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(255, 112, 0));
        btn2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn2.setText("2");
        btn2.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(255, 112, 0));
        btn1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn1.setText("1");
        btn1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(255, 112, 0));
        btn0.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn0.setText("0");
        btn0.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnPoint.setBackground(new java.awt.Color(255, 112, 0));
        btnPoint.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnPoint.setText(".");
        btnPoint.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPointActionPerformed(evt);
            }
        });

        btnRes.setBackground(new java.awt.Color(56, 229, 77));
        btnRes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRes.setText("=");
        btnRes.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResActionPerformed(evt);
            }
        });

        btnDiv.setBackground(new java.awt.Color(33, 146, 255));
        btnDiv.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnDiv.setForeground(new java.awt.Color(255, 255, 255));
        btnDiv.setText("/");
        btnDiv.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(160, 160, 160)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnRes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(btnClr, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(textField)
                        .addGap(60, 60, 60))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        String del = null;
        if(textField.getText().length()>0){
            StringBuilder str = new StringBuilder(textField.getText());
            str.deleteCharAt(textField.getText().length()-1);
            del = str.toString();
            textField.setText(del);
        }
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnClrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClrActionPerformed
        textField.setText(null);
    }//GEN-LAST:event_btnClrActionPerformed

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
        first = Double.parseDouble(textField.getText());
        textField.setText("");
        operation = "%";
    }//GEN-LAST:event_btnModActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        first = Double.parseDouble(textField.getText());
        textField.setText("");
        operation = "+";
    }//GEN-LAST:event_btnAddActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        String number = textField.getText()+btn9.getText();
        textField.setText(number);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        String number = textField.getText()+btn8.getText();
        textField.setText(number);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        String number = textField.getText()+btn7.getText();
        textField.setText(number);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        String number = textField.getText()+btn4.getText();
        textField.setText(number);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        String number = textField.getText()+btn5.getText();
        textField.setText(number);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        String number = textField.getText()+btn6.getText();
        textField.setText(number);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btnMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinActionPerformed
        first = Double.parseDouble(textField.getText());
        textField.setText("");
        operation = "-";
    }//GEN-LAST:event_btnMinActionPerformed

    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiActionPerformed
        first = Double.parseDouble(textField.getText());
        textField.setText("");
        operation = "*";
    }//GEN-LAST:event_btnMultiActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        String number = textField.getText()+btn3.getText();
        textField.setText(number);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        String number = textField.getText()+btn2.getText();
        textField.setText(number);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        String number = textField.getText()+btn1.getText();
        textField.setText(number);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        String number = textField.getText()+btn0.getText();
        textField.setText(number);
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPointActionPerformed
        if(!textField.getText().contains(".")){
            String number = textField.getText()+btnPoint.getText();
            textField.setText(number);
        }
    }//GEN-LAST:event_btnPointActionPerformed

    private void btnResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResActionPerformed

        second = Double.parseDouble(textField.getText());
        if(operation == "+"){
            result = first + second;
            answer = String.format("%.2f", result);
            textField.setText(answer);
        }else if(operation == "-"){
            result = first - second;
            answer = String.format("%.2f", result);
            textField.setText(answer);
        }else if(operation == "*"){
            result = first * second;
            answer = String.format("%.2f", result);
            textField.setText(answer);
        }else if(operation == "/"){
            result = first / second;
            answer = String.format("%.2f", result);
            textField.setText(answer);
        }else if(operation == "%"){
            result = first % second;
            answer = String.format("%.2f", result);
            textField.setText(answer);
        }
    }//GEN-LAST:event_btnResActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        first = Double.parseDouble(textField.getText());
        textField.setText("");
        operation = "/";
    }//GEN-LAST:event_btnDivActionPerformed

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
            java.util.logging.Logger.getLogger(calBody.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calBody.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calBody.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calBody.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calBody().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClr;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnMin;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnPoint;
    private javax.swing.JButton btnRes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textField;
    // End of variables declaration//GEN-END:variables
}
