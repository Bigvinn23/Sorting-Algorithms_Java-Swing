/*
ClassName: MainFrame
Author: Evan Leacock
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
import javax.xml.crypto.Data;

import java.util.ArrayList;
import java.util.Scanner;


public class MainFrame extends JFrame implements ActionListener
{
    //========================================================================================//
    //                                    DATA MEMBERS                                        //
    //========================================================================================//
    private int maxHeight;
    private int minHeight;
    private int numDataBars;

    private ArrayList<DataBar> dataBar;

    private JPanel midPanel;
    private JPanel topPanel;
    private JPanel botPanel;

    private JButton scrambleButton;
    
    public static void main(String[] args)
    {
        new MainFrame();
    }// main


    //========================================================================================//
    //                                    CONSTRUCTOR                                         //
    //========================================================================================//
    public MainFrame()
    {
        setLayout(new BorderLayout());
        setSize(500, 400);
        setTitle("Title Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        centerFrame(this);

        maxHeight = 500; //this.getHeight();
        minHeight = 50;
        numDataBars = 30;

        dataBar = new ArrayList<DataBar>();

        topPanel = new JPanel();
        midPanel = new JPanel();
        botPanel = new JPanel();

        scrambleButton = new JButton("Scramble");
        
        int currentHeight;
        int heightRange;

        heightRange = maxHeight - minHeight;
        currentHeight = minHeight;

        int heightDiff;

        heightDiff = heightRange / numDataBars;
        
        //========================================================================================//
        //                                  ADDING COMPONENTS                                     //
        //========================================================================================//

        for(int i = 0; i < numDataBars; i++)
        {
            dataBar.add(new DataBar(currentHeight));

            currentHeight += heightDiff;
        }

        for(int i = 0; i < dataBar.size(); i++)
        {
            midPanel.add(dataBar.get(i));

            currentHeight += heightDiff;
        }

        add("Center", midPanel);


        botPanel.add(scrambleButton);

        add("South", botPanel);
    
        //========================================================================================//
        //                                ADDING ACTION LISTENERS                                 //
        //========================================================================================//

        scrambleButton.addActionListener(this);
    
        setVisible(true);
    }// MainFrame

    //========================================================================================//
    //                                ACTION PERFORMED METHOD                                 //
    //========================================================================================//
    public void actionPerformed(ActionEvent e)
    {
        // Event Handlers
        if(e.getSource() == scrambleButton)
        {
            swap(1, 7, dataBar);

            //midPanel.validate();
        }

    }// actionPerformed


    //========================================================================================//
    //                                    OTHER METHODS                                       //
    //========================================================================================//
    
    private void swap(int pos1, int pos2, ArrayList<DataBar> dataBars)
    {
        if((pos1 >= 0) && (pos2 >= 0) && (pos1 < dataBars.size()) && (pos2 < dataBars.size()))
        {
            DataBar tempDataBar = new DataBar(dataBars.get(pos1).getHeight());

            dataBars.get(pos1).setHeight(dataBars.get(pos2).getPreferredSize().height);

            dataBars.get(pos2).setHeight(tempDataBar.getPreferredSize().height);
        }
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

}// MainFrame