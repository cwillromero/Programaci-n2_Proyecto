/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez_carlosromero;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Will
 */
public class Icono {
    Icon a=new ImageIcon(getClass().getResource("/ajedrez_carlosromero/JaqueMateNegro.png"));
    Icon b=new ImageIcon(getClass().getResource("/ajedrez_carlosromero/JaqueMateBlanco.png"));
    Icon c=new ImageIcon(getClass().getResource("/ajedrez_carlosromero/Fin.png"));
    Icon d=new ImageIcon(getClass().getResource("/ajedrez_carlosromero/Bienvenido.png"));
    Icon e=new ImageIcon(getClass().getResource("/ajedrez_carlosromero/Corona.jpg"));
    Icon f=new ImageIcon(getClass().getResource("/ajedrez_carlosromero/Jaque.png"));
    public void JaqueMateNegro(){
        JOptionPane.showMessageDialog(null, "Jugador de Piezas Negras Gana! ", "Jaque Mate", 1,a);
    }
    
    public void JaqueMateBlanco(){
         JOptionPane.showMessageDialog(null, "Jugador de Piezas Blancas Gana! ", "Jaque Mate", 1,b);
    }
    
    public void Fin(){
        JOptionPane.showMessageDialog(null, "Fin del Juego! ","Gracias Por Jugar.", 3,c);
    }
    
    public void Bienvenido(){
        JOptionPane.showMessageDialog(null, "Bienvenido al Juego! ","Carlos Wilfredo Romero Maradiaga", 3,d);
    }
    
    public void Corona(){
        JOptionPane.showMessageDialog(null, "Corona! ","Peón en Extremos", 3,e);
    }
    
    public void Jaque(){
        JOptionPane.showMessageDialog(null, "Jaque! ","Rey en Peligro", 3,f);
    }
}
