package com.academiaGenerica.academia.View.Transações;

import javax.swing.*;
import java.awt.*;

public class CadastroTransacoes extends JPanel {

    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JScrollPane jScrollPane1;
    private JTable jTable1;

    public CadastroTransacoes() {
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout(20, 20));
        setBackground(Color.WHITE);

        // Configuração da tabela
        jTable1 = new JTable();
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {"2024-06-19", "Pagamento Mensalidade", "100", "Cartão de Crédito", "Concluída", "Mensalidade referente ao mês de junho"},
                        {"2024-06-18", "Taxa de Inscrição", "50", "Débito Automático", "Concluída", "Nova inscrição de membro"},
                        {"2024-06-15", "Compra de Produtos", "30", "Dinheiro", "Concluída", "Compra de suplementos"},
                        {"2024-06-10", "Ajuste de Mensalidade", "-20", "Crédito Interno", "Concluída", "Ajuste de desconto por fidelidade"},
                        {"2024-06-05", "Mensalidade em Atraso", "100", "Boleto Bancário", "Pendente", "Aguardando pagamento do cliente"},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                },
                new String[]{
                        "Data Transação", "Descrição", "Valor", "Método de Pagamento", "Status", "Observação"
                }
        ));
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setFont(new Font("Arial", Font.PLAIN, 24));
        jTable1.setRowHeight(30);

        jScrollPane1 = new JScrollPane(jTable1);
        jScrollPane1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jScrollPane1.getViewport().setBackground(Color.WHITE);

        // Configuração do título
        jLabel2 = new JLabel("Transações");
        jLabel2.setFont(new Font("Arial", Font.BOLD, 36));
        jLabel2.setForeground(Color.BLACK);
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);

        // Configuração do botão
        jButton1 = new JButton("Atualizar");
        jButton1.setFont(new Font("Arial", Font.BOLD, 36));
        jButton1.setBackground(new Color(0x4CAF50));
        jButton1.setForeground(Color.WHITE);
        jButton1.setFocusPainted(false);

        // Adicionando componentes ao painel
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(Color.WHITE);
        topPanel.add(jLabel2, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.setBackground(Color.WHITE);
        centerPanel.add(jScrollPane1, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(Color.WHITE);
        bottomPanel.add(jButton1);

        add(topPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    public JPanel getPanel() {
        return this;
    }
}
