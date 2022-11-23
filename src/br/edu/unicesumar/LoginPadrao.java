/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.unicesumar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Lauder
 */
public class LoginPadrao {
    public static void main(String[] args) {
        JanelaPadrao janela = new JanelaPadrao();
        
        JTextField campoUsuario = new JTextField();
        JPasswordField campoSenha = new JPasswordField();
        
        janela.addCampo("Usuário",campoUsuario);
        janela.addCampo("Senha",campoSenha);
        
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
        janela.add(botaoEntrar);
        
        janela.setVisible(true);
       
    }
}
