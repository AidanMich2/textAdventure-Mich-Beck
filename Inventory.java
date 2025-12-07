import java.util.ArrayList;


public class Inventory {
    private ArrayList<String> data = new ArrayList<>();

    public String toString() {
        return data.toString();
    }

    public String getItem(String item) {
        if (data.contains(item)){
            return item;
        }
        return "Item not in your backpack";
    }

    public void add(String item) {
        data.add(item);
    }

    public void remove(String item) {
        data.remove(item);
    }

    public boolean contains(String item) {
        return data.contains(item);
    }
}
