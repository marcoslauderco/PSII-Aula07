/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.unicesumar;

import javax.swing.JOptionPane;

/**
 *
 * @author Lauder
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nomeDoUsuario = JOptionPane.showInputDialog(null, 
                "Informe o nome do usuário:",
                "Bem Vindo!",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Olá "+nomeDoUsuario+" Seja Bem Vindo!");
        int opcao = JOptionPane.showConfirmDialog(null, "Escolha uma opção.");
        if(opcao == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "A Escolha foi Sim");
        }else if(opcao == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "A Escolha foi Não");
        }else if(opcao == JOptionPane.CANCEL_OPTION){
            JOptionPane.showMessageDialog(null, "Cancelado");
        }else{
            JOptionPane.showMessageDialog(null, "Outra");
        }
       String[] opcoes = {"A","B","AB","C","D","E"};
       int selecionado = JOptionPane.showOptionDialog(null, 
               "Qual a categoria da sua CNH", "CNH", 
               JOptionPane.DEFAULT_OPTION, 
               JOptionPane.WARNING_MESSAGE, null, opcoes, null);
       JOptionPane.showMessageDialog(null, "Sua CNH é " + opcoes[selecionado]);
        
    }
    
}
