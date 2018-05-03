/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fullerton.ecs.leoyang;

import com.sun.javafx.font.FontFactory;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.beans.PropertyVetoException;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author 49876
 */
public class main{
           public static MainWindow a;
    public static void main(String[] args) throws PropertyVetoException, IOException {
            a= new MainWindow();
            
            a.setVisible(true);
            String title = "Awesome Quiz";
            
            a.setTitle(title);
           /*
            ImageIcon icon = new ImageIcon("quizIcon.png");
            Image myImg = icon.getImage();
            a.setIconImage(myImg);
            */        
            a.setResizable(false);
    }
}
/* it was
public class main{
            
    public static void main(String[] args) throws PropertyVetoException {
            MainWindow a= new MainWindow();
            a.setVisible(true);
            
    }
}
*/