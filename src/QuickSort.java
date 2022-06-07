/*
ClassName: QuickSort
Author: Evan Leacock
Purpose: 
Start Date: May 26, 2022
Last Edit: May 26, 2022
*/

//========================================================================================//
//                                     LIBRARIES                                          //
//========================================================================================//
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.ArrayList;


public class QuickSort extends JFrame implements ActionListener
{
    //========================================================================================//
    //                                    DATA MEMBERS                                        //
    //========================================================================================//
    private JButton scrambleButton;

    private ArrayList<Integer> numArr;

    private JTextArea numText;
    
    
    public static void main(String[] args)
    {
        new QuickSort();
    }// main


    //========================================================================================//
    //                                    CONSTRUCTOR                                         //
    //========================================================================================//
    public QuickSort()
    {
        setLayout(new FlowLayout());
        setSize(500, 400);
        setTitle("Quicksort");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        centerFrame(this);

        scrambleButton = new JButton("Scramble");

        numArr = new ArrayList<Integer>();

        numText = new JTextArea();
        
        setVisible(true);
        
        for (int i = 0; i < 10; i++) 
        {
            numArr.add(i);
        }

        
        for(int i = 0; i < numArr.size(); i++)
        {
            
        }
        
        //========================================================================================//
        //                                  ADDING COMPONENTS                                     //
        //========================================================================================//
        
        add(numText);
        add(scrambleButton);
    
        //========================================================================================//
        //                                ADDING ACTION LISTENERS                                 //
        //========================================================================================//
    
    
    }// QuickSort

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
    
    private void scramble()
    {

    }
    
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

}// QuickSort
