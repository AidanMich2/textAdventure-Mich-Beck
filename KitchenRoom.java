import java.util.Stack;

public class KitchenRoom extends Room{
    private Stack<String> roomInv = new Stack<>();
    private Stack<String> checker = new Stack<>();

    private boolean hungry = true;

    public KitchenRoom() {
        roomInv.push("corn beef on rye");
        roomInv.push("extra sour pickles");
        roomInv.push("latkes with apple sauce");
        roomInv.push("chocolate babka");
        roomInv.push("Al Abbas Chicken");

        checker.push("corn beef on rye");
        checker.push("extra sour pickles");
        checker.push("latkes with apple sauce");
        checker.push("chocolate babka");
        checker.push("Al Abbas Chicken");
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

    public void eat(String item){
        if (checker.contains (item)){
            inv.remove(item);
            if (item.equals("extra sour pickles")) {
                System.out.println ("Hungry Hungry Hippo");
            } else {
                hungry = false;
            }
            
        } else {
            System.out.println("Invalid food");
        }
    }

    public void move(String direction) {
        if (direction.equals("north")) {
            location = "Control Room";
        } else if (direction.equals("west")) {
            if (!hungry){
                location = "Lounge Room";
            } else {
                System.out.println("EAT UP");
            }
        } else {
            System.out.println("Where are you trying to go?");
        }
    }
}
