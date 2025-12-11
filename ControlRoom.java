import java.util.Stack;

public class ControlRoom extends Room {
    private Stack<String> roomInv = new Stack<>();
    public ControlRoom() {
        roomInv.push("computer");
        roomInv.push("pencil");
        roomInv.push("calculator");
        roomInv.push("Kitchen Key");
        // userInput(user);
    }

    // public void userInput(String str) {
    //     if (str.equals ("search")){
    //         searchObject();
    //     }
    // }

    public String searchObject() {
        String temp = roomInv.pop();
        System.out.println (temp);
        roomInv.push(temp);
        return temp;
    }

    public void pickUp() {
        if (!roomInv.isEmpty()) {
            String temp = roomInv.pop();
            System.out.println(temp);
            inv.add (temp);
        } else {
            System.out.println("There is nothing to pick up.");
        }
    }

    public void move(String direction) {
        if (direction.equals("north")) {
            if (inv.contains("Engine Key")){
                location = "Engine Room";
            } else {
                System.out.println("Locked Door");
            }
        } else if (direction.equals("east")) {
            if (!sleepy){
                location = "Bunk Room";
            } else {
                System.out.println("You are too sleepy to move.");
            }
            
        } else if (direction.equals("south")) {
            if (inv.contains("Kitchen Key")){
                location = "Kitchen Room";
            } else {
                System.out.println("Locked Door");
            }
        } else {
            System.out.println("Where are you trying to go?");
        }
    }
    
}
