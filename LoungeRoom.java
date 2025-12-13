import java.util.Stack;

public class LoungeRoom extends Room {
    private Stack<String> roomInv = new Stack<>();

    public LoungeRoom() {
        roomInv.push("TV");
        roomInv.push("WII");
        roomInv.push("Jackson's Couch");
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

    public void sleep() {
        if (inv.contains("Jackson's Couch")) {
            sleepy = false;
            System.out.println("You unstick yourself from the couch... Fruitful Nap");
        } else {
            System.out.println("No sleeping on the floor, imbecil");
        }
    }

    public void watchTV() {
        if (inv.contains("TV")) {
            if (inv.contains("WII")) {
                System.out.println("You played eight hours of WII Sports Resort, you are now sleepy");
                sleepy = true;
            } else {
                System.out.println("You watch three episodes of Seinfeld");
            }
        } else {
            System.out.println("Try finding the tv maybe?...");
        }
    }

    public void move(String direction) {
        if (direction.equals ("east")) {
            location = "Kitchen Room";
        } else {
            System.out.println("Where are you trying to go?");
        }
    }
    
}
