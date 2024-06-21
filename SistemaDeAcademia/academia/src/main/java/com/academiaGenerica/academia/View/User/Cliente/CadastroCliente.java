package com.academiaGenerica.academia.View.User.Cliente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroCliente extends JPanel {

    private JTextField txtNomeCliente;
    private JTextField txtCpfCliente;
    private JTextField txtEnderecoCliente;
    private JTextField txtTelefoneCliente;
    private JTextField txtEmailCliente;

    public CadastroCliente() {
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout(20, 20));
        setBackground(Color.WHITE);

        JPanel formPanel = new JPanel(new GridLayout(5, 2, 20, 20));
        formPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                "Cadastro de Cliente",
                0,
                0,
                new Font("Arial", Font.BOLD, 36),
                Color.BLACK));
        formPanel.setBackground(Color.WHITE);

        JLabel labelNomeCliente = new JLabel("Nome:");
        labelNomeCliente.setFont(new Font("Arial", Font.PLAIN, 36));
        labelNomeCliente.setForeground(Color.BLACK);
        txtNomeCliente = new JTextField();
        txtNomeCliente.setFont(new Font("Arial", Font.PLAIN, 36));

        JLabel labelCpfCliente = new JLabel("CPF:");
        labelCpfCliente.setFont(new Font("Arial", Font.PLAIN, 36));
        labelCpfCliente.setForeground(Color.BLACK);
        txtCpfCliente = new JTextField();
        txtCpfCliente.setFont(new Font("Arial", Font.PLAIN, 36));

        JLabel labelEnderecoCliente = new JLabel("Endereço:");
        labelEnderecoCliente.setFont(new Font("Arial", Font.PLAIN, 36));
        labelEnderecoCliente.setForeground(Color.BLACK);
        txtEnderecoCliente = new JTextField();
        txtEnderecoCliente.setFont(new Font("Arial", Font.PLAIN, 36));

        JLabel labelTelefoneCliente = new JLabel("Telefone:");
        labelTelefoneCliente.setFont(new Font("Arial", Font.PLAIN, 36));
        labelTelefoneCliente.setForeground(Color.BLACK);
        txtTelefoneCliente = new JTextField();
        txtTelefoneCliente.setFont(new Font("Arial", Font.PLAIN, 36));

        JLabel labelEmailCliente = new JLabel("Email:");
        labelEmailCliente.setFont(new Font("Arial", Font.PLAIN, 36));
        labelEmailCliente.setForeground(Color.BLACK);
        txtEmailCliente = new JTextField();
        txtEmailCliente.setFont(new Font("Arial", Font.PLAIN, 36));

        formPanel.add(labelNomeCliente);
        formPanel.add(txtNomeCliente);
        formPanel.add(labelCpfCliente);
        formPanel.add(txtCpfCliente);
        formPanel.add(labelEnderecoCliente);
        formPanel.add(txtEnderecoCliente);
        formPanel.add(labelTelefoneCliente);
        formPanel.add(txtTelefoneCliente);
        formPanel.add(labelEmailCliente);
        formPanel.add(txtEmailCliente);

        JButton btnCadastrarCliente = new JButton("Cadastrar");
        btnCadastrarCliente.setBackground(new Color(0x4CAF50));
        btnCadastrarCliente.setForeground(Color.WHITE);
        btnCadastrarCliente.setFont(new Font("Arial", Font.BOLD, 36));
        btnCadastrarCliente.setFocusPainted(false);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.WHITE);
        buttonPanel.add(btnCadastrarCliente);

        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        btnCadastrarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeCliente = txtNomeCliente.getText();
                String cpfCliente = txtCpfCliente.getText();
                String enderecoCliente = txtEnderecoCliente.getText();
                String telefoneCliente = txtTelefoneCliente.getText();
                String emailCliente = txtEmailCliente.getText();

                JOptionPane.showMessageDialog(CadastroCliente.this,
                        "Cliente cadastrado:\n" +
                                "Nome: " + nomeCliente + "\n" +
                                "CPF: " + cpfCliente + "\n" +
                                "Endereço: " + enderecoCliente + "\n" +
                                "Telefone: " + telefoneCliente + "\n" +
                                "Email: " + emailCliente);
            }
        });
    }

    public JPanel getPanel() {
        return this;
    }

    public void limparCampos() {
        txtNomeCliente.setText("");
        txtCpfCliente.setText("");
        txtEnderecoCliente.setText("");
        txtTelefoneCliente.setText("");
        txtEmailCliente.setText("");
    }

    public void preencherCampos(String nome, String cpf, String endereco, String telefone, String email) {
        txtNomeCliente.setText(nome);
        txtCpfCliente.setText(cpf);
        txtEnderecoCliente.setText(endereco);
        txtTelefoneCliente.setText(telefone);
        txtEmailCliente.setText(email);
    }
}
