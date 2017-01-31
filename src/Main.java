import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        float lengthClassroom = 0;
        float widthClassroom = 0;
        float areaClassroom = 0;
        float perimeterClassroom = 0;
        float heightClassroom = 0;
        float volumeClassroom = 0;
        //String answer = "";

        Scanner scnr = new Scanner(System.in);

        System.out.print("Grand Circus Room Detail Generator. Do you wanto to continue? Enter Y or N");
        String answer = scnr.nextLine();
        System.out.println("answer = " + answer);

        if (answer.equalsIgnoreCase("Y")) {

            System.out.println("Enter Length: ");
            lengthClassroom = scnr.nextFloat();

            System.out.println("Enter Width: ");
            widthClassroom = scnr.nextFloat();

            System.out.println("Enter Height: ");
            heightClassroom = scnr.nextFloat();

            areaClassroom = lengthClassroom * widthClassroom;
            perimeterClassroom = (2 * lengthClassroom) + (2 * widthClassroom);
            volumeClassroom = lengthClassroom * widthClassroom * heightClassroom;

            System.out.println("Classroom Length = " + lengthClassroom);
            System.out.println("Classroom Width = " + widthClassroom);
            System.out.println("Classroom Area = " + areaClassroom);
            System.out.println("Classroom Perimeter = " + perimeterClassroom);
            System.out.println("Classroom Volume = " + volumeClassroom);

        }
    }
}