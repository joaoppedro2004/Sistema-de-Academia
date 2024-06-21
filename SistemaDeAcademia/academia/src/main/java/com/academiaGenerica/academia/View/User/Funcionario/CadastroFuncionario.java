package com.academiaGenerica.academia.View.User.Funcionario;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CadastroFuncionario extends JPanel {

    private JTextField txtNomeFuncionario;
    private JTextField txtCargoFuncionario;
    private JTextField txtSalarioFuncionario;
    private JTextField txtEnderecoFuncionario;
    private JTextField txtTelefoneFuncionario;
    private JTextField txtEmailFuncionario;
    private JTextField txtDataContratacaoFuncionario;

    public CadastroFuncionario() {
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout(20, 20));
        setBackground(Color.WHITE);

        JPanel formPanel = new JPanel(new GridLayout(7, 2, 20, 20));
        formPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                "Cadastro de Funcionário",
                0,
                0,
                new Font("Arial", Font.BOLD, 36),
                Color.BLACK));
        formPanel.setBackground(Color.WHITE);

        JLabel labelNomeFuncionario = new JLabel("Nome:");
        labelNomeFuncionario.setFont(new Font("Arial", Font.PLAIN, 36));
        labelNomeFuncionario.setForeground(Color.BLACK);
        txtNomeFuncionario = new JTextField();
        txtNomeFuncionario.setFont(new Font("Arial", Font.PLAIN, 36));

        JLabel labelCargoFuncionario = new JLabel("Cargo:");
        labelCargoFuncionario.setFont(new Font("Arial", Font.PLAIN, 36));
        labelCargoFuncionario.setForeground(Color.BLACK);
        txtCargoFuncionario = new JTextField();
        txtCargoFuncionario.setFont(new Font("Arial", Font.PLAIN, 36));

        JLabel labelSalarioFuncionario = new JLabel("Salário:");
        labelSalarioFuncionario.setFont(new Font("Arial", Font.PLAIN, 36));
        labelSalarioFuncionario.setForeground(Color.BLACK);
        txtSalarioFuncionario = new JTextField();
        txtSalarioFuncionario.setFont(new Font("Arial", Font.PLAIN, 36));

        JLabel labelEnderecoFuncionario = new JLabel("Endereço:");
        labelEnderecoFuncionario.setFont(new Font("Arial", Font.PLAIN, 36));
        labelEnderecoFuncionario.setForeground(Color.BLACK);
        txtEnderecoFuncionario = new JTextField();
        txtEnderecoFuncionario.setFont(new Font("Arial", Font.PLAIN, 36));

        JLabel labelTelefoneFuncionario = new JLabel("Telefone:");
        labelTelefoneFuncionario.setFont(new Font("Arial", Font.PLAIN, 36));
        labelTelefoneFuncionario.setForeground(Color.BLACK);
        txtTelefoneFuncionario = new JTextField();
        txtTelefoneFuncionario.setFont(new Font("Arial", Font.PLAIN, 36));

        JLabel labelEmailFuncionario = new JLabel("Email:");
        labelEmailFuncionario.setFont(new Font("Arial", Font.PLAIN, 36));
        labelEmailFuncionario.setForeground(Color.BLACK);
        txtEmailFuncionario = new JTextField();
        txtEmailFuncionario.setFont(new Font("Arial", Font.PLAIN, 36));

        JLabel labelDataContratacaoFuncionario = new JLabel("Data de Contratação:");
        labelDataContratacaoFuncionario.setFont(new Font("Arial", Font.PLAIN, 36));
        labelDataContratacaoFuncionario.setForeground(Color.BLACK);
        txtDataContratacaoFuncionario = new JTextField();
        txtDataContratacaoFuncionario.setFont(new Font("Arial", Font.PLAIN, 36));

        formPanel.add(labelNomeFuncionario);
        formPanel.add(txtNomeFuncionario);
        formPanel.add(labelCargoFuncionario);
        formPanel.add(txtCargoFuncionario);
        formPanel.add(labelSalarioFuncionario);
        formPanel.add(txtSalarioFuncionario);
        formPanel.add(labelEnderecoFuncionario);
        formPanel.add(txtEnderecoFuncionario);
        formPanel.add(labelTelefoneFuncionario);
        formPanel.add(txtTelefoneFuncionario);
        formPanel.add(labelEmailFuncionario);
        formPanel.add(txtEmailFuncionario);
        formPanel.add(labelDataContratacaoFuncionario);
        formPanel.add(txtDataContratacaoFuncionario);

        JButton btnCadastrarFuncionario = new JButton("Cadastrar");
        btnCadastrarFuncionario.setBackground(new Color(0x4CAF50));
        btnCadastrarFuncionario.setForeground(Color.WHITE);
        btnCadastrarFuncionario.setFont(new Font("Arial", Font.BOLD, 36));
        btnCadastrarFuncionario.setFocusPainted(false);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.WHITE);
        buttonPanel.add(btnCadastrarFuncionario);

        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        btnCadastrarFuncionario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarFuncionario();
            }
        });
    }

    private void cadastrarFuncionario() {
        String nomeFuncionario = txtNomeFuncionario.getText();
        String cargoFuncionario = txtCargoFuncionario.getText();
        String salarioFuncionario = txtSalarioFuncionario.getText();
        String enderecoFuncionario = txtEnderecoFuncionario.getText();
        String telefoneFuncionario = txtTelefoneFuncionario.getText();
        String emailFuncionario = txtEmailFuncionario.getText();
        String dataContratacaoFuncionario = txtDataContratacaoFuncionario.getText();

        JOptionPane.showMessageDialog(this,
                "Funcionário cadastrado:\n" +
                        "Nome: " + nomeFuncionario + "\n" +
                        "Cargo: " + cargoFuncionario + "\n" +
                        "Salário: " + salarioFuncionario + "\n" +
                        "Endereço: " + enderecoFuncionario + "\n" +
                        "Telefone: " + telefoneFuncionario + "\n" +
                        "Email: " + emailFuncionario + "\n" +
                        "Data de Contratação: " + dataContratacaoFuncionario);
    }

    public JPanel getPanel() {
        return this;
    }
}
