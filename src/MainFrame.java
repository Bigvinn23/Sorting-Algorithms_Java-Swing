/*
ClassName: MainFrame
Author: Jamaine Drakes
Purpose: 
Start Date: May 01, 2022
Last Edit: May 01, 2022
*/

//========================================================================================//
//                                     LIBRARIES                                          //
//========================================================================================//
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MainFrame extends JFrame implements ActionListener
{
    //========================================================================================//
    //                                    DATA MEMBERS                                        //
    //========================================================================================//
    
    
    public static void main(String[] args)
    {
        new MainFrame();
    }// main


    //========================================================================================//
    //                                    CONSTRUCTOR                                         //
    //========================================================================================//
    public MainFrame()
    {
        setLayout(new FlowLayout());
        setSize(500, 400);
        setTitle("Title Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        centerFrame(this);
        setVisible(true);
        
        
        //========================================================================================//
        //                                  ADDING COMPONENTS                                     //
        //========================================================================================//
    
    
        //========================================================================================//
        //                                ADDING ACTION LISTENERS                                 //
        //========================================================================================//
    
    
    }// MainFrame

    //========================================================================================//
    //                                ACTION PERFORMED METHOD                                 //
    //========================================================================================//
    public void actionPerformed(ActionEvent e)
    {
        // Event Handlers
        
    }// actionPerformed


    //========================================================================================//
    //                                    OTHER METHODS                                       //
    //========================================================================================//
    
    
    // This method will center the frame on the screen
    private static void centerFrame(JFrame fr)
    {
        // Get the size of the screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        // Determine the new location of the window
        int w = fr.getSize().width;
        int h = fr.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;
        // Move the window
        fr.setLocation(x, y);

    }// centerFrame

}// MainFrame