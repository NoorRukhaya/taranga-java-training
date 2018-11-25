package com.tharanga.datatypes;


class BooleanDemo2
{
	static void display(boolean console) {
        // Display a message if boolean argument is true.
        if (console) {
            System.out.println("The cat is cute.");
        }
        else
        {
        	System.out.println("The dog is cute");
        }
    }

    public static void main(String[] args) {

        // A message is displayed.
        display(true);
        
        display(false);
        
    }
}