/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.unicesumar;

import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.LayoutManager;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Lauder
 */
public class JanelaPadrao extends JFrame{
    
    private JPanel painel;
    
    public JanelaPadrao() throws HeadlessException {
        painel = new JPanel();
        LayoutManager layoutManager = new BoxLayout(painel, BoxLayout.Y_AXIS);
        painel.setLayout(layoutManager);
        painel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        super.add(painel);
        
        this.setSize(300, 200);
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
    }

    public Component add(Component comp) {
        return this.painel.add(comp);
    }
    
    public Component addCampo(String label, Component comp){
        this.painel.add(new JLabel(label));
        return this.painel.add(comp);
    }
    
}
