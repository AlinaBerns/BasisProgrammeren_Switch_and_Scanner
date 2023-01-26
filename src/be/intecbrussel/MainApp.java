package be.intecbrussel;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner in = new java.util.Scanner(System.in);

        System.out.println("Naar welke muziek wil je luisteren? ");
        System.out.println("Voer een getal in van 1 tot 5:");

        int song = in.nextInt();

        switch (song) {
            case 1:
                System.out.println("playing song (1).mp3");
                break;

            case 2:
                System.out.println("playing song (2).mp3");
                break;

            case 3:
                System.out.println("playing song (3).mp3");
                break;

            case 4:
                System.out.println("playing song (4).mp3");
                break;

            case 5:
                System.out.println("playing song (5).mp3");
                break;

            default:
                System.out.println("Er bestaat geen liedje op deze plaats.");
                break;

        }


    }

}
