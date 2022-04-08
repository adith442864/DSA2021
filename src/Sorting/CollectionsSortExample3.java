package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Point class which does not implement
//Comparable interface. Thus the objects
//of this class are not comparable.
class Point1
{
 int x, y;
 Point1(int x, int y)
 {
     this.x = x;
     this.y = y;
 }
}

//This class implements 
//Comparator interface
class MyCmp implements Comparator<Point1>
{
 // Sorts the Point objects according
 // to x-coordinates in natural order
 public int compare(Point1 p1, Point1 p2)
 {
     return p1.x - p2.x;
 }
}


public class CollectionsSortExample3 {

	public static void main(String[] args) 
	 { 
	     // Create a list of Integers 
	     List<Point1> list = new ArrayList<Point1>(); 
	     list.add(new Point1(5, 10)); 
	     list.add(new Point1(2, 20));  
	     list.add(new Point1(10, 30)); 
	     
	     // List is sorted in natural order
	     // Passing the list and MyCmp object
	     Collections.sort(list, new MyCmp());
	     
	     // Displaying the points
	     for (Point1 p: list)
	         System.out.println(p.x + " " + p.y);
	 } 

}
