import java.util.*;
import java.util.Scanner;



public class Parser {

    public static boolean running = true;

    public static void setRunning() {
        running = false;
    }

    public static void redundancy(Room room, String str) {
        if(str.substring(0,2).equals("Go")) {
            if(str.length() > 3) {
                room.move(str.substring(3));
            }
        } else if (str.equals("Pick up")) {
            room.pickUp();
        } else if (str.equals("Search")) {
            room.searchObject();
        }
    }


    public static void main (String [] args) {
        Inventory inv = new Inventory();
        Scanner scan = new Scanner(System.in);
        String str = "";
        ControlRoom cr = new ControlRoom();
        KitchenRoom ki = new KitchenRoom();
        LoungeRoom lo = new LoungeRoom();
        BunkRoom bu = new BunkRoom();
        EngineRoom en = new EngineRoom();

        int iterations = 0;
        System.out.println("Welcome to Jackson's spaceship");
        System.out.println("You are in for a good time!");
        System.out.println("To escape you must turn the engine on!");
        System.out.println("Good Luck!");

        while(running) {
            System.out.println(iterations + "===");
            str = scan.nextLine();
            System.out.println ("You entered: " + str);
            if (str.equals("Where am I?")){
                
                System.out.println("You are in the " + Room.location());
            } else if (str.equals("Inventory")){
                System.out.println("Your inventory contains: " + Room.getInventory().toString());

            } else if (Room.location().equals ("Control Room")) {
                redundancy(cr, str);

            } else if (Room.location().equals ("Kitchen Room")) {
                 redundancy(ki, str);   
                    if(str.substring(0,3).equals("Eat")){
                        if(str.length() > 4){
                            ki.eat(str.substring(4));
                        }
                }

            } else if (Room.location().equals ("Lounge Room")) {
                redundancy(lo, str);
                    if (str.equals ("Sleep")) {
                    lo.sleep();
                } else if (str.equals ("Watch TV")) {
                    lo.watchTV();
                } 

            } else if (Room.location().equals ("Bunk Room")) {
                redundancy(bu, str);    
                    if (str.equals ("Read Diary")) {
                    bu.readDiary();
                } else if (str.equals ("Pillow Fight")) {
                    bu.pillowFight();
                } 

            } else if (Room.location().equals ("Engine Room")) {
                redundancy(en, str);
                    if (str.equals ("Fix Engine")) {
                    en.fixEngine();
                } 
            }

            iterations++;
        }
        System.out.println("Game Over");
    }
}