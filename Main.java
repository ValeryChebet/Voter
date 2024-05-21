public class Main{
    public static void main (String[]args){
        String firstName = "Valery";
        String lastName = "Chebet";

        String fullName = firstName +" "+ lastName;

        int myAge = 23;

        int votingAge = 25;

        if (myAge<votingAge){
            System.out.println("We are sorry"+ " " + fullName + " " + "is not eligible to vote");
        }
        else{
            System.out.println(fullName + " " + "can proceed to vote.");
        }
    }
}