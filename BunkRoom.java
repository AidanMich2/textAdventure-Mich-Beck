import java.util.Stack;

public class BunkRoom extends Room {
    private Stack<String> roomInv = new Stack<>();

    public BunkRoom() {
        roomInv.push ("sleep mask");
        roomInv.push ("pillow");
        roomInv.push ("diary");
        roomInv.push ("Engine Key");
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

    public void pillowFight() {
        if (inv.contains("pillow")) {
            System.out.println("*Scream* Jackson ATTACK!!");
        } else {
            System.out.println("Jackson beats you hard.");
        }
    }

    public void readDiary() {
        if (inv.contains("diary")) {
            System.out.println("Reads 'Gosh I am such a chud' ");
            System.out.println("'Does my mullet look good?'");
            System.out.println("'Do I wear my chain.. YES!'");
        } else {
            System.out.println("You're seeing things again aren't you?");
        }
    }

    public void move(String direction) {
        if (direction.equals ("west")) {
            location = "Control Room";
        } else {
            System.out.println("Where are you trying to go?");
        }
    }
    
}
