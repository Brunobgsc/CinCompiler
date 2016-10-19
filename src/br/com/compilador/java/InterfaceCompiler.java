package br.com.compilador.java;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

/**
 *
 * @author Bruno
 */
public class InterfaceCompiler extends javax.swing.JFrame {

    public InterfaceCompiler ic;

    public InterfaceCompiler() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        btanalisar = new javax.swing.JButton();
        btnovo = new javax.swing.JButton();
        jbsair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CIn Compiler - UFPE");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Console"));

        area.setColumns(20);
        area.setRows(5);
        area.setName(""); // NOI18N
        jScrollPane1.setViewportView(area);
        area.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Código-Fonte"));

        texto.setColumns(20);
        texto.setRows(5);
        jScrollPane2.setViewportView(texto);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));

        btanalisar.setText("Compilar");
        btanalisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btanalisarActionPerformed(evt);
            }
        });

        btnovo.setText("Limpar");
        btnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnovoActionPerformed(evt);
            }
        });

        jbsair.setText("Sair");
        jbsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btanalisar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbsair, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(483, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btanalisar)
                    .addComponent(btnovo)
                    .addComponent(jbsair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    // Botão Compilar
    private void btanalisarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btanalisarActionPerformed
        
          if (evt.getSource() == btanalisar) {
              
            // Tabela sintática
            String padrao = ("(^inicio|saida|fim$)|([+|*|/|-]+)|([0-9]+)|([}|)]+)|([^\\s]+)|($)|(;)");
           
            // Buffer
            String text = texto.getText();

            // Tokeniza
            String[] tokens = texto.getText()
                    .split("(^inicio|saida|fim$)|([+|*|/|-]+)|([0-9]+)|([}|)]+)|([^\\s]+)|($)|(;)");
            
            // Empilha os dados analizados
            Pilha p = new Pilha(tokens.length);

            // Programa de Analise Sintática Preditiva (Inicio do programa)
            Pattern c = Pattern.compile(padrao);
            Matcher matcher = c.matcher(text);

            while (matcher.find()) {

                String token1 = matcher.group(1);
                if (token1 != null) {

                    // Insere e imprimi na pilha
                    p.insereToken((token1));
                    p.imprimiPilha();
                    area.append("Palavra Reservada --->> " + token1 + "\n");
                    
                    // Substitui token pela letra X na pilha
                    //String a = "X";
                    //p.removeNome();
                    //p.insereNome((a));
                    //p.imprimiPilha();

                }

                String token2 = matcher.group(2);
                if (token2 != null) {

                    p.insereToken((token2));
                    p.imprimiPilha();
                    area.append("Operador --->> " + token2 + "\n");

                    //String a = "X";
                    //p.removeNome();
                    //p.insereNome((a));
                    //p.imprimiPilha();
                }

                String token3 = matcher.group(3);
                if (token3 != null) {

                    p.insereToken((token3));
                    p.imprimiPilha();
                    area.append("Digito --->> " + token3 + "\n");

                    //String a = "X";
                    //p.removeNome();
                    //p.insereNome((a));
                    //p.imprimiPilha();
                }

                String token4 = matcher.group(4);
                if (token4 != null) {

                    p.insereToken((token4));
                    p.imprimiPilha();

                    area.append("Digito --->> " + token4 + "\n");

                    //String a = "X";
                    //p.removeNome();
                    //p.insereNome((a));
                    //p.imprimiPilha();
                    //p.pesquisaPilha("X");
                }
                DoisMetodos md = new DoisMetodos();
                
                // Exceção para palavras incorretas da gramática
                String token5 = matcher.group(5);
                if (token5 != null) {

                    area.append("Linha Erro \n");

                    md.Erro();

                }
                
                // Fim da execução da analise léxica e da pilha
                String token6 = matcher.group(6);
                if (token6 != null) {

                    md.Compilar();

                    // Verifica se os tokens fazem sentido
                    Scanner scanner = new Scanner(text);

                    String inicio = scanner.nextLine();
                    String[] str = {inicio};
                    for (int i = 0; i < str.length; i++) {
                        if (str[i].matches("inicio")) {
                            System.out.println(str[i]);
                        } else if (str[i] != "inicio") {
                            System.err.println("Invalido inicio");
                            //area.append("Invalido inicio");
                        }
                        String exp = scanner.nextLine();
                        String[] str1 = {exp};
                        for (int a = 0; a < str1.length; a++) {
                            if (str1[a].matches("[0-9]+([+|*|/|-])+[0-9]+")) {
                                System.out.println(str1[a]);
                            } else if (str1[a] != "[0-9]+[+|*|-]+[0-9]+") {
                                System.err.println("Invalido expressão");
                            }
                            String saida = scanner.nextLine();
                            String[] str2 = {saida};
                            for (int b = 0; b < str2.length; b++) {
                                if (str2[b].matches("saida")) {
                                    System.out.println(str2[b]);
                                } else if (str2[b] == saida) {
                                    System.err.println("Invalido saida");
                                }
                                String fim = scanner.nextLine();
                                String[] str3 = {fim};
                                for (int j = 0; j < str3.length; j++) {
                                    if (str3[j].matches("fim")) {
                                        System.out.println(str3[j]);
                                    } else if (str3[j] != "fim") {
                                        System.err.println("Invalido fim");
                                        
                                    }// Programa de Analise Sintática Preditiva (Fim do programa)
                               }
                            }
                        }
                    }
                }
            }
        }
     }

    private void btnovoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnovoActionPerformed
        // Botão Limpar
        texto.setText("");
        area.setText("");
        texto.requestFocus();

    }// GEN-LAST:event_btnovoActionPerformed

    private void jbsairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbsairActionPerformed
        // Botão sair
        String comp = "Deseja realmente sair do CIn Compiler - UFPE?";
        int opcao_escolhida = JOptionPane.showConfirmDialog(null, comp, " ", JOptionPane.YES_NO_OPTION);
        if (opcao_escolhida == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }// GEN-LAST:event_jbsairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceCompiler().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea area;
    private javax.swing.JButton btanalisar;
    private javax.swing.JButton btnovo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbsair;
    public javax.swing.JTextArea texto;
    // End of variables declaration//GEN-END:variables
}
