/*
ClassName: QSortTest
Author: Evan Leacock
Purpose: 
Start Date: May 26, 2022
Last Edit: May 26, 2022
*/

//========================================================================================//
//                                     LIBRARIES                                          //
//========================================================================================//
import java.util.ArrayList;

public class QSortTest
{
    public static void main(String[] args)
    {
        new QSortTest();
    }// main

    public QSortTest()
    {
        ArrayList<Integer> numArray = new ArrayList<Integer>();
        int arraySize = 10;
        
        for(int i = 0; i < arraySize; i++)
        {
            numArray.add(i);
        }

        display(numArray);

        scramble(numArray);

        display(numArray);

        QSort(0, numArray.size() - 1, numArray);
    }

    public void swap(int pos1, int pos2, ArrayList<Integer> array)
    {
        if((pos1 >= 0) && (pos2 >= 0) && (pos1 < array.size()) && (pos2 < array.size()))
        {
            int tempNum = array.get(pos1).intValue();
            array.set(pos1, array.get(pos2).intValue());
            array.set(pos2, tempNum);
        }
    }// swap

    public void scramble(ArrayList<Integer> array)
    {
        int arrSize = array.size();
        int randomNum;

        for(int i = 0; i < arrSize; i++)
        {
            randomNum = (int)(Math.random() * arrSize);

            swap(i, randomNum, array);
        }
    }
    
    public void QSort(int start, int end, ArrayList<Integer> array)
    {
        if(Math.abs(start - end) > 1)
        {
            int pivot = start;
            boolean pivoted = true;

            do 
            {
                pivoted  = true;
                for (int i = start; i <= end; i++) 
                {
                    //display(array);
                    if(((array.get(i).intValue() < array.get(pivot).intValue()) ^ (i < pivot)) && (i != pivot))
                    {
                        swap(i, pivot, array);

                        //display(array);

                        pivot = i;
                        pivoted = false;
                        break;
                    }
                }
            } 
            while(!pivoted);

            display(array);

            QSort(start, pivot - 1, array);
            QSort(pivot + 1, end, array);
        }
    }
    
    public void display(ArrayList<Integer> array)
    {
        for(int i = 0; i < array.size(); i++)
        {
            System.out.print(array.get(i) + "  ");
        }

        System.out.print("\n\n");
    }// display

}// QSortTest