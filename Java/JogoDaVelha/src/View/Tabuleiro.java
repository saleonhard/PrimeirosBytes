/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import static View.CPU.*; 

import javax.swing.ImageIcon;



/**
 *
 * @author LSA
 */
public class Tabuleiro extends javax.swing.JFrame {

      
     
    
    
    
   

    

   
    
    public Tabuleiro() {
        
 
        initComponents();
        this.setIconImage( new ImageIcon(getClass().getResource("/Imagem/logo.png")).getImage());
        vp.setText(Cpartida.nome.toUpperCase() + "(" +CPU.jXO+")" + " contra VELHA"+ "(" +CPU.vXO+")" );   
    }

            
                
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Botao2 = new javax.swing.JToggleButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Botao1 = new javax.swing.JToggleButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Botao4 = new javax.swing.JToggleButton();
        Botao7 = new javax.swing.JToggleButton();
        Botao3 = new javax.swing.JToggleButton();
        Botao6 = new javax.swing.JToggleButton();
        Botao8 = new javax.swing.JToggleButton();
        Botao9 = new javax.swing.JToggleButton();
        Botao5 = new javax.swing.JToggleButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        vp = new javax.swing.JLabel();
        B1 = new javax.swing.JToggleButton();
        B2 = new javax.swing.JToggleButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jToggleButton1.setText("jToggleButton1");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/barra_1.png"))); // NOI18N

        Botao2.setBackground(new java.awt.Color(255, 255, 255));
        Botao2.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        Botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao2ActionPerformed(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/barra - Copia.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/barra_1.png"))); // NOI18N

        Botao1.setBackground(new java.awt.Color(255, 255, 255));
        Botao1.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        Botao1.setFocusCycleRoot(true);
        Botao1.setName(""); // NOI18N
        Botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao1ActionPerformed(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/barra - Copia.png"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/barra - Copia.png"))); // NOI18N

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/barra - Copia.png"))); // NOI18N

        Botao4.setBackground(new java.awt.Color(255, 255, 255));
        Botao4.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        Botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao4ActionPerformed(evt);
            }
        });

        Botao7.setBackground(new java.awt.Color(255, 255, 255));
        Botao7.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        Botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao7ActionPerformed(evt);
            }
        });

        Botao3.setBackground(new java.awt.Color(255, 255, 255));
        Botao3.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        Botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao3ActionPerformed(evt);
            }
        });

        Botao6.setBackground(new java.awt.Color(255, 255, 255));
        Botao6.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        Botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao6ActionPerformed(evt);
            }
        });

        Botao8.setBackground(new java.awt.Color(255, 255, 255));
        Botao8.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        Botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao8ActionPerformed(evt);
            }
        });

        Botao9.setBackground(new java.awt.Color(255, 255, 255));
        Botao9.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        Botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao9ActionPerformed(evt);
            }
        });

        Botao5.setBackground(new java.awt.Color(255, 255, 255));
        Botao5.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        Botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao5ActionPerformed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/barra - Copia.png"))); // NOI18N

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/barra - Copia.png"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/process_1.png"))); // NOI18N
        jButton1.setText("Reconfigurar Partida");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        vp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        vp.setText("...");

        B1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/back.png"))); // NOI18N
        B1.setText("Volta para Tela Inicial");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/refresh_1.png"))); // NOI18N
        B2.setText("Reiniciar");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(B1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botao4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botao1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel7)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(vp))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(vp)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(Botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jLabel19)
                                    .addGap(0, 0, 0)
                                    .addComponent(Botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jLabel20)
                                    .addGap(0, 0, 0)
                                    .addComponent(Botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(Botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel16)
                                        .addGap(0, 0, 0)
                                        .addComponent(Botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel17)
                                        .addGap(0, 0, 0)
                                        .addComponent(Botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(Botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jLabel18)
                            .addGap(0, 0, 0)
                            .addComponent(Botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jLabel15)
                            .addGap(0, 0, 0)
                            .addComponent(Botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     


   
    private void Botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao2ActionPerformed
       if(CPU.getpJog().equals(CPU.getjXO())){
               
          if (Botao2.isSelected()) {
               Botao2.setEnabled(false);
               Botao2.setText(CPU.getjXO());
           
               jogadorJoga(getjXO(),"nome",2);
               CPU.mostraTabuleiro();
               CPU.jdas++;
               System.out.print("\n JJ: ");
               System.out.println(jdas);
               CPU.empataGanha(CPU.getjXO());
           
               System.out.print("\n");
           
               System.out.println(CPU.ganhou(CPU.getjXO()));
            
               System.out.print("\n");
               mostraTabuleiro();      
            }
        }
           velhaJogaD();
           CPU.empataGanha(CPU.getvXO());
    }//GEN-LAST:event_Botao2ActionPerformed

    
    
    
    
    private void Botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao1ActionPerformed
      if(CPU.getpJog().equals(CPU.getjXO())){
    
        if (Botao1.isSelected()) {
            Botao1.setEnabled(false);
            Botao1.setText(CPU.getjXO());
            
            CPU.jogadorJoga(CPU.getjXO(),"nome",1);
            CPU.mostraTabuleiro();
            CPU.jdas++;
            System.out.print("\n JJ: ");
            System.out.println(jdas);
            System.out.print("\n");
            CPU.empataGanha(CPU.getjXO());
               
            
            
            
            System.out.println(CPU.ganhou(CPU.getjXO()));
            
            System.out.print("\n");
            CPU.mostraTabuleiro();
            
           
        }
      } 
      velhaJogaD();
      CPU.empataGanha(CPU.getvXO());
    }//GEN-LAST:event_Botao1ActionPerformed
    
    private void Botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao4ActionPerformed
          if(CPU.getpJog().equals(CPU.getjXO())){
            
        if (Botao4.isSelected()) {
            Botao4.setEnabled(false);
            Botao4.setText(CPU.getjXO());
            
            CPU.jogadorJoga(CPU.getjXO(),"nome",4);
            CPU.mostraTabuleiro();
            CPU.jdas++;
            System.out.print("\n JJ: ");
            System.out.println(jdas);
            System.out.print("\n");
            CPU.empataGanha(getjXO());
            
           
            
            System.out.println(CPU.ganhou(CPU.getjXO()));
            
            System.out.print("\n");
            CPU.mostraTabuleiro();
            //ClasseVelha.mostraTabuleiro();
        }
      }
          velhaJogaD();
          CPU.empataGanha(CPU.getvXO());
    }//GEN-LAST:event_Botao4ActionPerformed

    private void Botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao7ActionPerformed
          if(CPU.getpJog().equals(CPU.getjXO())){
              
        if (Botao7.isSelected()) {
            Botao7.setEnabled(false);
            Botao7.setText(CPU.getjXO());
            
            CPU.jogadorJoga(CPU.getjXO(),"nome",7);
            CPU.mostraTabuleiro();
            CPU.jdas++;
            System.out.print("\n JJ: ");
            System.out.println(jdas);
            System.out.print("\n"); 
            CPU.empataGanha(CPU.getjXO());
            
            
            
            
            System.out.println(CPU.ganhou(CPU.getjXO()));
            
            System.out.print("\n");
            CPU.mostraTabuleiro();
        }
      }
          velhaJogaD();
          CPU.empataGanha(CPU.getvXO());
    }//GEN-LAST:event_Botao7ActionPerformed

    private void Botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao3ActionPerformed
           if(CPU.getpJog().equalsIgnoreCase(CPU.getjXO())){
              
        if (Botao3.isSelected()) {
            Botao3.setEnabled(false);
            Botao3.setText(CPU.getjXO());
            
            CPU.jogadorJoga(CPU.getjXO(),"nome",3);
            CPU.mostraTabuleiro();
            CPU.jdas++;
            System.out.print("\n JJ: ");
            System.out.println(jdas);
            System.out.print("\n");
            CPU.empataGanha(CPU.getjXO());
           
            
           
            
            System.out.println(CPU.ganhou(CPU.getjXO()));
            
            System.out.print("\n");
            CPU.mostraTabuleiro();
           // CPU.empataGanha(jXO);
        }
      }
           velhaJogaD();
           CPU.empataGanha(CPU.getvXO());
    }//GEN-LAST:event_Botao3ActionPerformed

    private void Botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao6ActionPerformed
           if(CPU.getpJog().equals(CPU.getjXO())){
               
        if (Botao6.isSelected()) {
            Botao6.setEnabled(false);
            Botao6.setText(CPU.getjXO());
            
            CPU.jogadorJoga(CPU.getjXO(),"nome",6);
            CPU.mostraTabuleiro();
            CPU.jdas++;
            System.out.print("\n JJ: ");
            System.out.println(jdas);
            System.out.print("\n");
            CPU.empataGanha(CPU.getjXO());
            
            
            
           
            
            
            System.out.print("\n");
            CPU.mostraTabuleiro();
        }
      }
           velhaJogaD();
           CPU.empataGanha(CPU.getvXO());
    }//GEN-LAST:event_Botao6ActionPerformed

    private void Botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao8ActionPerformed
           if(CPU.getpJog().equals(CPU.getjXO())){
               
        if (Botao8.isSelected()) {
            Botao8.setEnabled(false);
            Botao8.setText(CPU.getjXO());
           
            CPU.jogadorJoga(CPU.getjXO(),"nome",8);
            CPU.mostraTabuleiro();
            CPU.jdas++;
            System.out.print("\n JJ: ");
            System.out.println(jdas);
            System.out.print("\n");
            CPU.empataGanha(CPU.getjXO());
            
            
            
            
            
            System.out.println(CPU.ganhou(CPU.getjXO()));
            
            System.out.print("\n");
            CPU.mostraTabuleiro();
        }
      }
           velhaJogaD();
           CPU.empataGanha(CPU.getvXO());
    }//GEN-LAST:event_Botao8ActionPerformed

    private void Botao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao9ActionPerformed
           if(CPU.getpJog().equals(CPU.getjXO())){
               
        if (Botao9.isSelected()) {
            Botao9.setEnabled(false);
            Botao9.setText(CPU.getjXO());
           
            CPU.jogadorJoga(CPU.getjXO(),"nome",9);
            CPU.mostraTabuleiro();
            jdas++;
            System.out.print("\n JJ: ");
            System.out.println(jdas);
            System.out.print("\n");
            CPU.empataGanha(CPU.getjXO());
            
            
           
            
            
            System.out.print("\n");
            CPU.mostraTabuleiro();
        }
      }
           velhaJogaD();
           CPU.empataGanha(CPU.getvXO());
    }//GEN-LAST:event_Botao9ActionPerformed

    private void Botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao5ActionPerformed
           if(CPU.getpJog().equals(CPU.getjXO())){
               
        if (Botao5.isSelected()) {
            Botao5.setEnabled(false);
            Botao5.setText(CPU.getjXO());
            
            CPU.jogadorJoga(CPU.getjXO(),"nome",5);
            CPU.mostraTabuleiro();
            CPU.jdas++;
            System.out.print("\n JJ: ");
            System.out.println(jdas);
            
            System.out.print("\n");
            CPU.empataGanha(CPU.getjXO());
            
        }
      }
           velhaJogaD();
           CPU.empataGanha(CPU.getvXO());
    }//GEN-LAST:event_Botao5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
       CPU.setJdas(0);
       Cpartida n = new Cpartida();
       this.dispose();
       n.setVisible(true);
       n.cNome.setText(n.nome);
       
        switch (n.s1) {
            case 1:
                n.VXJO.setSelected(true);
                break;
            case 2:
                n.VOJX.setSelected(true);
                break;
            default:
                n.VE1.setSelected(true);
                break;
        }
       
        switch (n.s2) {
            case 1:
                n.PV.setSelected(true);
                break;
            case 2:
                n.PVc.setSelected(true);
                break;
            default:
                n.VE.setSelected(true);
                break;
        }
      n.s2=0;
      n.s1=0;
      
      
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        TInicial t = new TInicial();
        t.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        this.dispose();
        Tabuleiro t = new Tabuleiro();
       
        CPU.setJdas(0);
        this.dispose();
        CPU.setjXO(jXO);
        CPU.setvXO(vXO);
        CPU.iniciarTabuleiro();
       
        System.out.println("JOGADOR: "+getjXO());
        System.out.println("VELHA: "+getvXO());
        System.out.println("pJog: "+getpJog());
        System.out.println("p: "+getP());
        
        if(CPU.p.equals(CPU.vXO)){
           CPU.velhaJoga();
           System.out.println(CPU.p);
        }
         t.setVisible(true);
    }//GEN-LAST:event_B2ActionPerformed

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
            java.util.logging.Logger.getLogger(Tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabuleiro().setVisible(true);
                
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton B1;
    private javax.swing.JToggleButton B2;
    public static javax.swing.JToggleButton Botao1;
    public static javax.swing.JToggleButton Botao2;
    public static javax.swing.JToggleButton Botao3;
    public static javax.swing.JToggleButton Botao4;
    public static javax.swing.JToggleButton Botao5;
    public static javax.swing.JToggleButton Botao6;
    public static javax.swing.JToggleButton Botao7;
    public static javax.swing.JToggleButton Botao8;
    public static javax.swing.JToggleButton Botao9;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel vp;
    // End of variables declaration//GEN-END:variables


        
        
        


}
