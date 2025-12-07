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
        roomInv.push(temp);
        return temp;
    }

    public void pickUp(){
        inv.add (roomInv.pop());
    }

    public void eat(String item){
        if (checker.contains (item)){
            inv.remove(item);
            if (item.equals("extra sour pickles")) {
                System.out.println ("Hungry Hungry Hippo");
            } else {
                hungry = false;
            }
            
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
