import java.util.Stack;

public class EngineRoom extends Room {
    private Stack<String> roomInv = new Stack<>();

    public EngineRoom() {
        roomInv.push("motor");
        roomInv.push("generator");
        roomInv.push("jet engine");
        roomInv.push("fire place");
    }

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

    public void fixEngine(){
        Parser.setRunning();
    }

    public void move(String direction) {
        if (direction.equals("south")) {
            location = "Control Room";
        } else {
            System.out.println("Where are you trying to go?");
        }
    }
    
}

