/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pokemonsimulator;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author Lucas
 */
public class JFramePokemon extends javax.swing.JFrame {
    
    String gymName;
    /**
     * Creates new form JFramePokemon
     * @param gymName
     */
    public JFramePokemon(String gymName) {
        
        initComponents();
        this.gymName = gymName;
        ImageIcon imgBackground = new ImageIcon(getClass().getResource("/fotos/" + this.gymName + ".png"));
        
        this.setSize(650, 450);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        cbx1.setFocusable(false);
        cbx2.setFocusable(false);
        btnBatalhar.setFocusable(false);
        lblBackground.setIcon(new ImageIcon(imgBackground.getImage().getScaledInstance(lblBackground.getWidth(),lblBackground.getHeight(), Image.SCALE_DEFAULT)));

        
        
    }
    
    public JFramePokemon() {}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbx1 = new javax.swing.JComboBox<>();
        cbx2 = new javax.swing.JComboBox<>();
        lblImage1 = new javax.swing.JLabel();
        lblImage2 = new javax.swing.JLabel();
        lblLogoPokemon = new javax.swing.JLabel();
        btnBatalhar = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        cbx1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione seu Pokémon>", "Braixen", "Dewott", "Ivysaur", "Ninetales", "Poliwrath", "Quilava", "Rampardos", "Rockruff", "Roserade", "Starmie", "Sudowoodo", "Treecko" }));
        cbx1.setToolTipText("");
        cbx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx1ActionPerformed(evt);
            }
        });
        jPanel1.add(cbx1);
        cbx1.setBounds(50, 50, 210, 30);

        cbx2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione o Pokémon inimigo>", "Braixen", "Dewott", "Ivysaur", "Ninetales", "Poliwrath", "Quilava", "Rampardos", "Rockruff", "Roserade", "Starmie", "Sudowoodo", "Treecko" }));
        cbx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx2ActionPerformed(evt);
            }
        });
        jPanel1.add(cbx2);
        cbx2.setBounds(380, 50, 210, 30);

        lblImage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblImage1);
        lblImage1.setBounds(75, 90, 210, 210);

        lblImage2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblImage2);
        lblImage2.setBounds(350, 90, 210, 210);
        jPanel1.add(lblLogoPokemon);
        lblLogoPokemon.setBounds(0, 1690, 107, 73);

        btnBatalhar.setText("Batalhar!");
        btnBatalhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalharActionPerformed(evt);
            }
        });
        jPanel1.add(btnBatalhar);
        btnBatalhar.setBounds(270, 310, 110, 40);
        jPanel1.add(lblBackground);
        lblBackground.setBounds(2, 0, 660, 430);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBatalharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalharActionPerformed

        if (cbx1.getSelectedIndex() == 0 && cbx2.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecione os Pokémons!");
        } else if (cbx1.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecione seu Pokémon!");
        } else if (cbx2.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecione o Pokémon adversário!");
        }

        else {
            JFrameVencedor jFrameVencedor = new JFrameVencedor(chamadaDeBatalha(), this.gymName);
            jFrameVencedor.setVisible(true);
            jFrameVencedor.setLocationRelativeTo(null);

            dispose();
        }
    }//GEN-LAST:event_btnBatalharActionPerformed

    private void cbx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx2ActionPerformed
        ImageIcon image2 = null;
        switch (cbx2.getSelectedIndex()) {
            case 0 -> image2 = new ImageIcon(getClass().getResource(""));
            case 1 -> image2 = new ImageIcon(getClass().getResource("/fotos/braixen.png"));
            case 2 -> image2 = new ImageIcon(getClass().getResource("/fotos/dewott.png"));
            case 3 -> image2 = new ImageIcon(getClass().getResource("/fotos/ivysaur.png"));
            case 4 -> image2 = new ImageIcon(getClass().getResource("/fotos/ninetales.png"));
            case 5 -> image2 = new ImageIcon(getClass().getResource("/fotos/poliwrath.png"));
            case 6 -> image2 = new ImageIcon(getClass().getResource("/fotos/quilava.png"));
            case 7 -> image2 = new ImageIcon(getClass().getResource("/fotos/rampardos.png"));
            case 8 -> image2 = new ImageIcon(getClass().getResource("/fotos/rockruff.png"));
            case 9 -> image2 = new ImageIcon(getClass().getResource("/fotos/roserade.png"));
            case 10 -> image2 = new ImageIcon(getClass().getResource("/fotos/starmie.png"));
            case 11 -> image2 = new ImageIcon(getClass().getResource("/fotos/sudowoodo.png"));
            case 12 -> image2 = new ImageIcon(getClass().getResource("/fotos/treecko.png"));
            default -> {
            }
        }

        if (image2 == null) {
        }
        else {
            lblImage2.setIcon(new ImageIcon(image2.getImage().getScaledInstance(lblImage2.getWidth(),lblImage2.getHeight(), Image.SCALE_DEFAULT)));
        }
    }//GEN-LAST:event_cbx2ActionPerformed

    private void cbx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx1ActionPerformed
        ImageIcon image1 = null;
        switch (cbx1.getSelectedIndex()) {
            case 0 -> image1 = new ImageIcon(getClass().getResource(""));
            case 1 -> image1 = new ImageIcon(getClass().getResource("/fotos/braixen.png"));
            case 2 -> image1 = new ImageIcon(getClass().getResource("/fotos/dewott.png"));
            case 3 -> image1 = new ImageIcon(getClass().getResource("/fotos/ivysaur.png"));
            case 4 -> image1 = new ImageIcon(getClass().getResource("/fotos/ninetales.png"));
            case 5 -> image1 = new ImageIcon(getClass().getResource("/fotos/poliwrath.png"));
            case 6 -> image1 = new ImageIcon(getClass().getResource("/fotos/quilava.png"));
            case 7 -> image1 = new ImageIcon(getClass().getResource("/fotos/rampardos.png"));
            case 8 -> image1 = new ImageIcon(getClass().getResource("/fotos/rockruff.png"));
            case 9 -> image1 = new ImageIcon(getClass().getResource("/fotos/roserade.png"));
            case 10 -> image1 = new ImageIcon(getClass().getResource("/fotos/starmie.png"));
            case 11 -> image1 = new ImageIcon(getClass().getResource("/fotos/sudowoodo.png"));
            case 12 -> image1 = new ImageIcon(getClass().getResource("/fotos/treecko.png"));
            default -> {
            }
        }

        if (image1 == null) {
        }
        else {
            lblImage1.setIcon(new ImageIcon(image1.getImage().getScaledInstance(lblImage1.getWidth(),lblImage1.getHeight(), Image.SCALE_DEFAULT)));
        }
    }//GEN-LAST:event_cbx1ActionPerformed

    private String chamadaDeBatalha() {
        
        int index1 = cbx1.getSelectedIndex() - 1;
        int index2 = cbx2.getSelectedIndex() - 1;

        String[] vetorPokemon = {"Braixen", "Dewott", "Ivysaur", "Ninetales", 
            "Poliwrath", "Quivala", "Rampardos", "Rockruff", "Roserade", 
            "Starmie", "Sudowoodo", "Treecko"};
        
        String[] vetorTipo = {"Fogo", "Água", "Planta", "Fogo", "Água", "Fogo", 
            "Pedra", "Pedra", "Planta", "Água", "Pedra", "Planta"};
        
        int[] vetorLevel = {20, 10, 20, 30, 30, 20, 30, 10, 30, 20, 20, 10};
        
        Pokemon pokemon1 = new Pokemon(vetorPokemon[index1], vetorTipo[index1], vetorLevel[index1]);
        Pokemon pokemon2 = new Pokemon(vetorPokemon[index2], vetorTipo[index2], vetorLevel[index2]);
        Batalha battle = new Batalha();
        battle.meuPokemon(pokemon1.getNome(), pokemon1.getVida());
        battle.outroPokemon(pokemon2.getNome(), pokemon2.getVida());
        
        return battle.startBattle();
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatalhar;
    private javax.swing.JComboBox<String> cbx1;
    private javax.swing.JComboBox<String> cbx2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblImage1;
    private javax.swing.JLabel lblImage2;
    private javax.swing.JLabel lblLogoPokemon;
    // End of variables declaration//GEN-END:variables
}