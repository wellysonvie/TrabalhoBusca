
package Main;

import Buscas.Solucao;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class TelaResultado extends javax.swing.JFrame {
    
    private ArrayList<int[]> passos;
    private int passo;
    Solucao s = null;

    public TelaResultado(int[] entrada, String tipoBusca) {
        initComponents();
        this.setTitle("Resultado - Estado inicial");
        this.passo = 0;
        
        if(tipoBusca.equals("Profundidade")){
            s = Solucionador.profundidade(entrada);
            this.passos = s.solucao;
        }else if(tipoBusca.equals("Largura")){
            s = Solucionador.largura(entrada);
            this.passos = s.solucao;
        }else if(tipoBusca.equals("Gulosa")){
            s = Solucionador.gulosa(entrada);
            this.passos = s.solucao;
        }else if(tipoBusca.equals("A*")){
            s = Solucionador.aEstrela(entrada);
            this.passos = s.solucao;
        }
        
        System.out.println("Nível da solução: "+s.qNiveis);
        System.out.println("Quantidade de nós gerados: "+s.qNos);
        System.out.println("Tempo de execução: "+s.tempo+" ms");
        
        exibir(this.passos.get(0));
    }
    
    public void exibir(int[] estado){
        label1.setText((estado[0] == 0) ? "" : Integer.toString(estado[0]));
        label2.setText((estado[1] == 0) ? "" : Integer.toString(estado[1]));
        label3.setText((estado[2] == 0) ? "" : Integer.toString(estado[2]));
        label4.setText((estado[3] == 0) ? "" : Integer.toString(estado[3]));
        label5.setText((estado[4] == 0) ? "" : Integer.toString(estado[4]));
        label6.setText((estado[5] == 0) ? "" : Integer.toString(estado[5]));
        label7.setText((estado[6] == 0) ? "" : Integer.toString(estado[6]));
        label8.setText((estado[7] == 0) ? "" : Integer.toString(estado[7]));
        label9.setText((estado[8] == 0) ? "" : Integer.toString(estado[8]));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label9 = new javax.swing.JLabel();
        label8 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label2.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        label3.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        label1.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        label6.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        label6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        label5.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        label5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        label4.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        label9.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        label9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        label8.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        label8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        label7.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        label7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setText("Próximo >");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("< Anterior");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Direto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if((this.passos.size()-1) != passo){
            this.passo++;
            exibir(this.passos.get(passo));
            this.setTitle("Resultado - Passo "+this.passo);
        }else{
            JOptionPane.showMessageDialog(this, "Nível da solução: "+s.qNiveis+"\n"+
                                                "Quantidade de nós gerados: "+s.qNos+"\n"+
                                                "Tempo de execução: "+s.tempo+" ms", "Resumo da busca", 1);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(this.passo != 0){
            this.passo--;
            exibir(this.passos.get(this.passo));
            this.setTitle("Resultado - Passo "+this.passo);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        exibir(this.passos.get(this.passos.size()-1));
        this.passo = this.passos.size()-1;
        this.setTitle("Resultado - Passo "+this.passo);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    // End of variables declaration//GEN-END:variables
}
