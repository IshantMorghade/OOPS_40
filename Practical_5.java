/*
Aim: Practical No.5   
Author: Ishant Morghade 
Version: 5.8    
Date: 27 Feb,2024
*/
class Emerging_Technologie 
{
    String president;
    String vicePresident;
    String secretary;
    String jointSecretary;
    String treasurer;
    
    Emerging_Technologie(String president, String vicePresident, String secretary, String jointSecretary, String treasurer) 
    {
        this.president = president;
        this.vicePresident = vicePresident;
        this.secretary = secretary;
        this.jointSecretary = jointSecretary;
        this.treasurer = treasurer;
    }

    void forum()
    {
        System.out.println("President: " + president);
        System.out.println("Vice President: " + vicePresident);
        System.out.println("Secretary: " + secretary);
        System.out.println("Joint Secretary: " + jointSecretary);
        System.out.println("Treasurer: " + treasurer);
    }
}
class AIML extends Emerging_Technologie 
{
    AIML(String president, String vicePresident, String secretary, String jointSecretary, String treasurer) 
    {
        super(president, vicePresident, secretary, jointSecretary, treasurer);
    }
}

class AIDS extends Emerging_Technologie
{
    AIDS(String president, String vicePresident, String secretary, String jointSecretary, String treasurer) {
        super(president, vicePresident, secretary, jointSecretary, treasurer);
    }
}

class CSE extends Emerging_Technologie
{
    CSE(String president, String vicePresident, String secretary, String jointSecretary, String treasurer) {
        super(president, vicePresident, secretary, jointSecretary, treasurer);
    }
}

public class Practical_5 
{
    public static void main(String[] args) 
    {
        // Creating objects for each child class
        AIML aiml = new AIML("Ishant Morghade", "Vedant Shende", "Peeyush Kaware", "Bhavesh More", "Samarth Sharma");
        AIDS aids = new AIDS("Ishant Morghade", "Abhi Barai", "Nupur Khuite", "Bhavesh More", "Samarth Sharma");
        CSE cse = new CSE("Ishant Morghade", "Kunal Bhelwa", "Harsh Meshram", "Bhavesh More", "Samarth Sharma");

        // Calling forum function for each object
        System.out.println("AIML Forum:");
        aiml.forum();
        System.out.println("\nAIDS Forum:");
        aids.forum();
        System.out.println("\nCSE Forum:");
        cse.forum();
    }
}
