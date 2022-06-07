/*
ClassName: DataBar
Author: Evan Leacock
Purpose: Serves as a vertical data bar for line graphs. Has customizable height (pixels) and color (RGB).
Start Date: May 01, 2022
Last Edit: May 01, 2022
*/

//========================================================================================//
//                                     LIBRARIES                                          //
//========================================================================================//
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;


public class DataBar extends JPanel
{
    //========================================================================================//
    //                                    DATA MEMBERS                                        //
    //========================================================================================//
    private int height; // the height of this data bar
    private Color color; // the color of this data bar

    //========================================================================================//
    //                                    CONSTRUCTOR                                         //
    //========================================================================================//
    public DataBar(int newHeight)
    {
        height = newHeight; // Set the DataBar's height

        setLayout(new FlowLayout());
        //setSize(500, height);

        color = new Color(0, 0, 0);

        setBackground(color); // Default color
        
        
        //========================================================================================//
        //                                  ADDING COMPONENTS                                     //
        //========================================================================================//

    
    }// DataBar

    public DataBar(int newHeight, Color newColor)
    {
        this(newHeight); // reuse other constructor
        color = newColor;

        setBackground(color); // set bg to specific color

        //========================================================================================//
        //                                  ADDING COMPONENTS                                     //
        //========================================================================================//


    } // DataBar

    //========================================================================================//
    //                                    OTHER METHODS                                       //
    //========================================================================================//
    @Override

    // sets the DataBar's preferred height only; the width remains unchanged from the super's
    public Dimension getPreferredSize() 
    {
        // TODO Auto-generated method stub
        int width = super.getPreferredSize().width;

        return new Dimension(width, height);
    } // getPreferredSize

    public void setHeight(int newHeight)
    {
        height = newHeight;
    }

}// DataBar