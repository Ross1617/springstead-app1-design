package baseline;
/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Ross Springstead
 */

import java.util.ArrayList;

public class TodoListModify {

    private ArrayList<String> listOfDescriptions = new ArrayList<>();
    private ArrayList<String> listOfDates = new ArrayList<>();
    //a 1 indicated completed and a 0 is non completed
    private ArrayList<Integer> listOfCompleted = new ArrayList<>();
    //create new instance of the javaFX file

    public String addTask(String date,String description, int completed ){
        //creates a new string
        String items= " ";
        //creates twos strings and one for integers for date, description, and completed
        // gets the information in the date field and saves it
        // gets the information in the description and saves it
        // gets the information in the completed and saves it
        //add all three to items
        //move the items in the list down one
        // add the three information into the gui
        // returns the string it added
        return items;
    }
    public String removeTask(int indexNumber){
        String removedInformation = "";
        //deletes the index for the arrayList of date and add information to string
        //deletes the index for the arrayList of description and add information to string
        //deletes the index for the arrayList of completed and add information to string
        //update the items in the gui
        return removedInformation;
    }
    public void openNewFile(String fileName) {
        //saves and closes the current file
        //goes into the directory and looks for the new file
        //opens the new file
    }
    public void saveFile(String fileName){
        //saves current file
    }
    public void showNonCompleted (){
        //looks through every index value of the arrayList
            //if the index is equal to 0 then add it to the display
        //show all the ones that are completed
    }
    public void showAll(){
        //goes through every index of arrayLists
            //displays all of them
    }
    public void showComplete(){
        //looks through every index value of the arrayList
            //if the index is equal to 1 then add it to the display
        //show all the ones that are completed
    }
    public String setTitle(String title){
        // takes the value of title and sets it to the variable of title
        return title;
    }
    public String editDate(String newDate ,int index){
        String newLine = "";
        //takes the newDate information and replaces the index of the arrayList for dates
        //updates the table in the gui
        // adds the three array lists to newLine string so it can be used for testing
        return newLine;
    }
    public String editDescription(String newDescription, int index){
        String newLine = "";
        //takes the newDescription information and replaces the index of the arrayList for descriptions
        //updates the table in the gui
        // adds the three array lists to newLine string so it can be used for testing
        return newLine;
    }
    public String editCompleted(int completed, int index){
        String newLine = "";
        //takes the completed information and replaces the index of the arrayList for completed
        //updates the table in the gui
        // adds the three array lists to newLine string so it can be used for testing
        return newLine;
    }



}
