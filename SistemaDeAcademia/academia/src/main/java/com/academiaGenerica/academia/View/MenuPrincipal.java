package com.academiaGenerica.academia.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.academiaGenerica.academia.View.Planos.Treino.CadastroTreinos;
import com.academiaGenerica.academia.View.Transações.CadastroTransacoes;
import com.academiaGenerica.academia.View.User.Cliente.CadastroCliente;
import com.academiaGenerica.academia.View.User.Funcionario.CadastroFuncionario;

public class MenuPrincipal extends JFrame {

    private JPanel cardPanel;
    private CardLayout cardLayout;

    public MenuPrincipal() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Menu Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 800);
        setLocationRelativeTo(null);

        // Configuração do CardLayout para alternar entre os painéis
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Painéis de cada cadastro
        CadastroFuncionario cadastroFuncionario = new CadastroFuncionario();
        cardPanel.add(cadastroFuncionario.getPanel(), "funcionario");

        CadastroCliente cadastroCliente = new CadastroCliente();
        cardPanel.add(cadastroCliente.getPanel(), "cliente");

        CadastroTransacoes cadastroTransacoes = new CadastroTransacoes();
        cardPanel.add(cadastroTransacoes.getPanel(), "transacoes");

        CadastroTreinos cadastroTreinos = new CadastroTreinos();
        cardPanel.add(cadastroTreinos.getPanel(), "treinos");

        // Botões para alternar entre os painéis
        JButton btnCadastroFuncionario = new JButton("Cadastrar Funcionário");
        btnCadastroFuncionario.setFont(new Font("Arial", Font.BOLD, 30));
        btnCadastroFuncionario.setForeground(Color.BLACK);
        btnCadastroFuncionario.setBackground(Color.WHITE);
        btnCadastroFuncionario.setFocusPainted(false);
        btnCadastroFuncionario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "funcionario");
            }
        });

        JButton btnCadastroCliente = new JButton("Cadastar Cliente");
        btnCadastroCliente.setFont(new Font("Arial", Font.BOLD, 30));
        btnCadastroCliente.setForeground(Color.BLACK);
        btnCadastroCliente.setBackground(Color.WHITE);
        btnCadastroCliente.setFocusPainted(false);
        btnCadastroCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "cliente");
            }
        });

        JButton btnCadastroTransacoes = new JButton("Cadastrar Transações");
        btnCadastroTransacoes.setFont(new Font("Arial", Font.BOLD, 30));
        btnCadastroTransacoes.setForeground(Color.BLACK);
        btnCadastroTransacoes.setBackground(Color.WHITE);
        btnCadastroTransacoes.setFocusPainted(false);
        btnCadastroTransacoes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "transacoes");
            }
        });

        JButton btnCadastroTreinos = new JButton("Cadastrar Treinos");
        btnCadastroTreinos.setFont(new Font("Arial", Font.BOLD, 30));
        btnCadastroTreinos.setForeground(Color.BLACK);
        btnCadastroTreinos.setBackground(Color.WHITE);
        btnCadastroTreinos.setFocusPainted(false);
        btnCadastroTreinos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "treinos");
            }
        });

        // Layout do Menu Principal
        JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 20, 20));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        buttonPanel.add(btnCadastroFuncionario);
        buttonPanel.add(btnCadastroCliente);
        buttonPanel.add(btnCadastroTransacoes);
        buttonPanel.add(btnCadastroTreinos);
        buttonPanel.setBackground(Color.RED);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(buttonPanel, BorderLayout.NORTH);
        getContentPane().add(cardPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MenuPrincipal());
    }
}
