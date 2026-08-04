
package com.mycompany.lu1.arraylist_demo;
 //step1: import statement for the ArrayList Class
import java.util.ArrayList; 
public class LU1ArrayList_Demo {
   
    public static void main(String[] args) {
        //Syntax: ArrayList<Type> arrayListName = new ArrayList();
        
        //Create an Int Type ArrayList
        ArrayList<Integer> prices = new ArrayList();
        
        //Create a String Type ArrayList
        ArrayList<String> languages = new ArrayList();
        
        //arrayName[index] = element; [used to fill an array]
        
        //add in elements to the Arraylist: arrayListName.add(element);
        languages.add("Java"); //subscript [0]
        languages.add("C#");//subscript [1]
        languages.add("C++");//subscript [2]
        languages.add("Swift");//subscript [3]
        
        System.out.println("Initial List of Languages: " + languages);
        //System.out.println(Arrays.toString(arrayName)); 
    
        //Add an item at a specific index
        languages.add(1, "JavaScript");
        System.out.println("After inserting an item " + languages);
        
        //Retrieve an item at an index
        System.out.println("Element at index 2: " + languages.get(2));
        
        //Update an element at an index
        languages.set(3, "Python");
        System.out.println("After set(): " + languages);

        //Remove by value
        languages.remove("Swift");
        System.out.println("After remove(): " + languages);
        
        //Boolean ArrayList: Store only true & false values
        
        ArrayList<Boolean> attendance = new ArrayList(); 
        attendance.add(true);
        attendance.add(false);
        attendance.add(true);
        attendance.add(false);
        attendance.add(true);
        attendance.add(true);
        
        System.out.println("Attendance List: " + attendance);
        System.out.println("Student 2 Present? " + attendance.get(1));
       
        System.out.println("Number of languages: " + languages.size());
        
        //count the number of students that are present
        int present = 0; //accumulator variable
        for(Boolean status : attendance)
        {
            if(status)
            {
                present++; 
            }
        }
        System.out.println("Students Present: " + present);
        System.out.println("Students Absent: " + (attendance.size() - present));
        
        
    
    
    }
}




/*
Recap:
/*
 * ARRAY
 * ---------------------------------------------------------
 * An array stores a fixed number of items.
 *
 * Example:
 * String[] languages = {"Java", "C#", "Python"};
 *
 * The size cannot change after the array has been created.
 *
 *
 * ARRAYS CLASS
 * ---------------------------------------------------------
 * The Arrays class provides useful static methods for arrays.
 *
 * Import:
 * import java.util.Arrays;
 *
 * Common methods:
 * Arrays.sort(array);
 * Arrays.fill(array, value);
 * Arrays.copyOf(array, newLength);
 * Arrays.binarySearch(array, value);
 *
 * Note:
 * The Arrays class does not have a remove() method.
 *
 *
 * ARRAYLIST
 * ---------------------------------------------------------
 * An ArrayList stores a dynamic collection of objects.
 *
 * Import:
 * import java.util.ArrayList;
 *
 * Syntax:
 * ArrayList<DataType> listName = new ArrayList<>();
 *
 * Examples:
 * ArrayList<String> names = new ArrayList<>();
 * ArrayList<Integer> marks = new ArrayList<>();
 * ArrayList<Double> prices = new ArrayList<>();
 * ArrayList<Character> grades = new ArrayList<>();
 * ArrayList<Boolean> attendance = new ArrayList<>();
 *
 * Common methods:
 * add()       - adds an item
 * get()       - retrieves an item
 * set()       - updates an item
 * remove()    - removes an item
 * contains()  - checks whether an item exists
 * size()      - returns the number of items
 * clear()     - removes all items
 *
 *
 * PRIMITIVE TYPES AND WRAPPER CLASSES
 * ---------------------------------------------------------
 * ArrayLists store objects, not primitive data types.
 *
 * Primitive type       Wrapper class
 * int                  Integer
 * double               Double
 * char                 Character
 * boolean              Boolean
 *
 * Correct:
 * ArrayList<Integer> marks = new ArrayList<>();
 *
 * Incorrect:
 * ArrayList<int> marks = new ArrayList<>();

| Wrapper Class          | Stores                                                        |
| ---------------------- | ------------------------------------------------------------- |
| `ArrayList<String>`    | Text (names, cities, languages)                               |
| `ArrayList<Integer>`   | Whole numbers (marks, ages, quantities)                       |
| `ArrayList<Double>`    | Decimal numbers (prices, temperatures)                        |
| `ArrayList<Character>` | Single characters (grades, initials)                          |
| `ArrayList<Boolean>`   | `true` / `false` values (attendance, pass/fail, login status) |

 */    
             