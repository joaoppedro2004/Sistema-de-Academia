package com.academiaGenerica.academia.View.Planos.Treino;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroTreinos extends JPanel {

    private JTextField txtNomeTreino;
    private JTextField txtDescricaoTreino;
    private JTextField txtDuracaoTreino;

    public CadastroTreinos() {
        initComponents();
    }

    private void initComponents() {
        setLayout(new GridLayout(4, 2, 20, 20));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        setBackground(Color.WHITE);

        JLabel labelNomeTreino = new JLabel("Nome do Treino:");
        labelNomeTreino.setFont(new Font("Arial", Font.PLAIN, 36));
        labelNomeTreino.setForeground(Color.BLACK);
        txtNomeTreino = new JTextField();
        txtNomeTreino.setFont(new Font("Arial", Font.PLAIN, 36));

        JLabel labelDescricaoTreino = new JLabel("Descrição:");
        labelDescricaoTreino.setFont(new Font("Arial", Font.PLAIN, 36));
        labelDescricaoTreino.setForeground(Color.BLACK);
        txtDescricaoTreino = new JTextField();
        txtDescricaoTreino.setFont(new Font("Arial", Font.PLAIN, 36));

        JLabel labelDuracaoTreino = new JLabel("Duração (minutos):");
        labelDuracaoTreino.setFont(new Font("Arial", Font.PLAIN, 36));
        labelDuracaoTreino.setForeground(Color.BLACK);
        txtDuracaoTreino = new JTextField();
        txtDuracaoTreino.setFont(new Font("Arial", Font.PLAIN, 36));

        add(labelNomeTreino);
        add(txtNomeTreino);
        add(labelDescricaoTreino);
        add(txtDescricaoTreino);
        add(labelDuracaoTreino);
        add(txtDuracaoTreino);

        JButton btnCadastrarTreino = new JButton("Cadastrar");
        btnCadastrarTreino.setBackground(new Color(0x4CAF50));
        btnCadastrarTreino.setForeground(Color.WHITE);
        btnCadastrarTreino.setFont(new Font("Arial", Font.BOLD, 36));
        btnCadastrarTreino.setFocusPainted(false);
        btnCadastrarTreino.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarTreino();
            }
        });

        add(new JLabel());  // Espaço vazio
        add(btnCadastrarTreino);
    }

    private void cadastrarTreino() {
        String nomeTreino = txtNomeTreino.getText();
        String descricaoTreino = txtDescricaoTreino.getText();
        String duracaoTreino = txtDuracaoTreino.getText();

        JOptionPane.showMessageDialog(this,
                "Treino cadastrado:\n" +
                        "Nome: " + nomeTreino + "\n" +
                        "Descrição: " + descricaoTreino + "\n" +
                        "Duração: " + duracaoTreino + " minutos");
    }

    public JPanel getPanel() {
        return this;
    }
}
