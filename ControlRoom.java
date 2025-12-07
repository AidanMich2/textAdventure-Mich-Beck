import java.util.Stack;

public class ControlRoom extends Room {
    private Stack<String> roomInv = new Stack<>();

    public ControlRoom() {
        roomInv.push("computer");
        roomInv.push("pencil");
        roomInv.push("calculator");
        roomInv.push("Kitchen Key");
    }

    public String searchObject() {
        String temp = roomInv.pop();
        roomInv.push(temp);
        return temp;
    }

    public void pickUp(){
        inv.add (roomInv.pop());
    }

    public void move(String direction) {
        if (direction.equals("north")) {
            if (inv.contains("Engine Key")){
                location = "Engine Room";
            } else {
                System.out.println("Locked Door");
            }
        } else if (direction.equals("east")) {
            location = "Bunk Room";
        } else if (direction.equals("south")) {
            if (inv.contains("Kitchen Key")){
                location = "Kitcehn Room";
            } else {
                System.out.println("Locked Door");
            }
        } else {
            System.out.println("Where are you trying to go?");
        }
    }
    
}
