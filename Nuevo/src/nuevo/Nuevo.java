/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo;
import javax.swing.*;

/**
 * I have modified this!
 * @author usuario
 */
public class Nuevo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, "Hola", "Título", JOptionPane.INFORMATION_MESSAGE);
        Marco nuevoMarco = new Marco();
        nuevoMarco.setBounds(100, 100, 500, 250);
        nuevoMarco.setVisible(true);
        nuevoMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Comentarioo
    
    }
}


class Marco extends JFrame{
     public Marco(){
        
    }
}

   
