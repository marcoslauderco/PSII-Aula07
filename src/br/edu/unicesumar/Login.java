/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.unicesumar;

import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Lauder
 */
public class Login {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        
        JPanel painel = new JPanel();
        LayoutManager layoutManager = new BoxLayout(painel, BoxLayout.Y_AXIS);
        painel.setLayout(layoutManager);
        painel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        janela.add(painel);
        
        JLabel labelUsuario = new JLabel("Usuario");
        JTextField campoUsuario = new JTextField();
        JLabel labelSenha = new JLabel("Senha:");
        JPasswordField campoSenha = new JPasswordField();
        
        JButton botaoEntrar = new JButton("Entrar");
        botaoEntrar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUsuario.getText();
                char[] senhaChar = campoSenha.getPassword();
                String senha = String.valueOf(senhaChar);
                if(usuario.equals("unicesumar")
                        && senha.equals("123456")){
                    JOptionPane.showMessageDialog(janela, "Entrada Permitida");
                }else{
                    JOptionPane.showMessageDialog(janela, "Entrada Negada",
                            "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        
        });
        
        painel.add(labelUsuario);
        painel.add(campoUsuario);
        painel.add(labelSenha);
        painel.add(campoSenha);
        painel.add(botaoEntrar);
        
        janela.setSize(300, 200);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(janela.DISPOSE_ON_CLOSE);
    }
}
