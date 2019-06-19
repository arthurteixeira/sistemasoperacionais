/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import java.awt.CardLayout;

/**
 *
 * @author anderson
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
    }
    
    private mapeamentoHeap mp;
    private FilaCircular fila;
    private int tamHeap;
    private int limMax;
    private int nReq;
    private int valMin;
    private int valMax;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Base = new javax.swing.JPanel();
        Heap = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSLimMax = new javax.swing.JSpinner();
        jSTamHeap = new javax.swing.JSpinner();
        jLabel17 = new javax.swing.JLabel();
        btnAlocar = new javax.swing.JButton();
        Requisicoes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSnReq = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jSValMin = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jSValMax = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Resultados = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tHeap = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tReq = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtLogFila = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Base.setLayout(new java.awt.CardLayout());

        jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 48)); // NOI18N
        jLabel6.setText("Configurações da Heap");

        jLabel7.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jLabel7.setText("Tamanho da heap");

        jLabel8.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jLabel8.setText("%");

        jSLimMax.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jSLimMax.setModel(new javax.swing.SpinnerNumberModel(50, 50, 100, 5));
        jSLimMax.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSLimMaxStateChanged(evt);
            }
        });

        jSTamHeap.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jSTamHeap.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jSTamHeap.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSTamHeapStateChanged(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jLabel17.setText("Limiar Maximo");

        btnAlocar.setBackground(new java.awt.Color(51, 204, 255));
        btnAlocar.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        btnAlocar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlocar.setText("Alocar");
        btnAlocar.setBorder(null);
        btnAlocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlocarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HeapLayout = new javax.swing.GroupLayout(Heap);
        Heap.setLayout(HeapLayout);
        HeapLayout.setHorizontalGroup(
            HeapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeapLayout.createSequentialGroup()
                .addGroup(HeapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeapLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel6))
                    .addGroup(HeapLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addGroup(HeapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel17))
                        .addGap(165, 165, 165)
                        .addGroup(HeapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSLimMax, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSTamHeap, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addContainerGap(243, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeapLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAlocar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        HeapLayout.setVerticalGroup(
            HeapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeapLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel6)
                .addGap(54, 54, 54)
                .addGroup(HeapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jSTamHeap, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(HeapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jSLimMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(btnAlocar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        Base.add(Heap, "cHeap");

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 48)); // NOI18N
        jLabel1.setText("Configurações de Requisições");

        jSnReq.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jSnReq.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jSnReq.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSnReqStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jLabel3.setText("Valor minimo");

        jSValMin.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jSValMin.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSValMin.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSValMinStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jLabel4.setText("Valor maximo");

        jSValMax.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jSValMax.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSValMax.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSValMaxStateChanged(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jLabel9.setText("Número de requisições:");

        jButton1.setBackground(new java.awt.Color(51, 204, 255));
        jButton1.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RequisicoesLayout = new javax.swing.GroupLayout(Requisicoes);
        Requisicoes.setLayout(RequisicoesLayout);
        RequisicoesLayout.setHorizontalGroup(
            RequisicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RequisicoesLayout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addGroup(RequisicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RequisicoesLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(148, 148, 148))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RequisicoesLayout.createSequentialGroup()
                        .addGroup(RequisicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(156, 156, 156)
                        .addGroup(RequisicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSValMin)
                            .addComponent(jSValMax)
                            .addComponent(jSnReq, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addGap(230, 230, 230))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RequisicoesLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );
        RequisicoesLayout.setVerticalGroup(
            RequisicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RequisicoesLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(RequisicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSnReq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(RequisicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSValMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addGroup(RequisicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSValMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(42, 42, 42)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        Base.add(Requisicoes, "cRequisitos");

        tHeap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Posição", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tHeap);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jLabel15.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel15.setText("Heap");

        jLabel16.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel16.setText("Tabela de Controle da Heap");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Heap", jPanel3);

        tReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID da Requisição", "Tamanho"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tReq);

        txtLogFila.setColumns(20);
        txtLogFila.setRows(5);
        jScrollPane4.setViewportView(txtLogFila);

        jLabel13.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel13.setText("Log da fila circular");

        jLabel14.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel14.setText("Requisições");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Fila circular", jPanel5);

        jScrollPane5.setViewportView(jTextPane1);

        jScrollPane6.setViewportView(jTextPane2);

        jLabel11.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel11.setText("Log de alocação da Heap");

        jLabel12.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel12.setText("Log de alocação da Heap");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)
                        .addComponent(jScrollPane6)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Log da Heap", jPanel6);

        javax.swing.GroupLayout ResultadosLayout = new javax.swing.GroupLayout(Resultados);
        Resultados.setLayout(ResultadosLayout);
        ResultadosLayout.setHorizontalGroup(
            ResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        ResultadosLayout.setVerticalGroup(
            ResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResultadosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Base.add(Resultados, "cResultados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1023, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlocarActionPerformed
        this.mp = new mapeamentoHeap(this.limMax, this.tamHeap);
        CardLayout card = (CardLayout) Base.getLayout();
        card.show(Base, "cRequisitos");
    }//GEN-LAST:event_btnAlocarActionPerformed

    private void jSTamHeapStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSTamHeapStateChanged
        this.tamHeap = this.jSTamHeap.getValue().hashCode();
    }//GEN-LAST:event_jSTamHeapStateChanged

    private void jSLimMaxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSLimMaxStateChanged
        this.limMax = this.jSLimMax.getValue().hashCode();
    }//GEN-LAST:event_jSLimMaxStateChanged

    private void jSnReqStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSnReqStateChanged
        this.nReq = this.jSnReq.getValue().hashCode();
    }//GEN-LAST:event_jSnReqStateChanged

    private void jSValMinStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSValMinStateChanged
        this.valMin = this.jSValMin.getValue().hashCode();
        this.jSValMax.setValue(this.jSValMin.getValue().hashCode() + 1);
    }//GEN-LAST:event_jSValMinStateChanged

    private void jSValMaxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSValMaxStateChanged
        this.valMax = this.jSValMax.getValue().hashCode();
    }//GEN-LAST:event_jSValMaxStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(this.valMax > this.valMin){
            System.out.println(jSValMin.getValue().hashCode() + "," + jSValMax.getValue().hashCode());
            this.fila = new FilaCircular(this.nReq, this.valMin, this.valMax, mp, this);
            CardLayout card = (CardLayout) Base.getLayout();
            card.show(Base, "cResultados");
        }else{
            System.out.println("minimo maior que maximo");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Base;
    public javax.swing.JPanel Heap;
    public javax.swing.JPanel Requisicoes;
    public javax.swing.JPanel Resultados;
    public javax.swing.JButton btnAlocar;
    public javax.swing.JButton jButton1;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel5;
    public javax.swing.JPanel jPanel6;
    public javax.swing.JSpinner jSLimMax;
    public javax.swing.JSpinner jSTamHeap;
    public javax.swing.JSpinner jSValMax;
    public javax.swing.JSpinner jSValMin;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JScrollPane jScrollPane5;
    public javax.swing.JScrollPane jScrollPane6;
    public javax.swing.JSpinner jSnReq;
    public javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTable jTable2;
    public javax.swing.JTextPane jTextPane1;
    public javax.swing.JTextPane jTextPane2;
    public javax.swing.JTable tHeap;
    public javax.swing.JTable tReq;
    public javax.swing.JTextArea txtLogFila;
    // End of variables declaration//GEN-END:variables
}