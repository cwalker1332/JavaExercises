package CodecademyProjects;

public class MadLib {

    /*
    This program generates a ad-lib story. Can be improved by making it a scanner that accepts Strings.
    Author: Courtney
    Date: 10/14/2020
    */

    public static void main(String[] args){
        // initialize variables to be placed in story
        String name1 = "Courtney";
        String adjective1 = "rainy";
        String adjective2 = "sad";
        String adjective3 = "yellow";
        String verb1 = "run";
        String noun1 = "dog";
        String noun2 = "cat";
        String noun3 = "burger";
        String noun4 = "fries";
        String noun5 = "chicken";
        String noun6 = "shoe";
        String name2 = "Brad";
        int number = 13;
        String place1 = "New York";


        //The template for the story
        String story = "This morning "+ name1 +" woke up feeling " + adjective1 +
                ". 'It is going to be a " + adjective2 + " day!' Outside, a bunch of " +
                noun1 + "s were protesting to keep " + noun2 + " in stores. They began to " +
                verb1 + " to the rhythm of the " + noun3 + ", which made all the " +
                noun4 + "s very " + adjective3 + ". Concerned, " + name1 + " texted " +
                name2 + ", who flew " + name1 + " to " + place1 + " and dropped " + name1 +
                " in a puddle of frozen " + noun5 + ". " + name1 + " woke up in the year " +
                number + ", in a world where " + noun6 + "s ruled the world.";

        System.out.println(story);
    }
}