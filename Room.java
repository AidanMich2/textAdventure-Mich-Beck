public abstract class Room {
    protected static Inventory inv = new Inventory();
    protected static String location = "Control Room";
    protected static boolean sleepy = true;

    public static Inventory getInventory() {
        return inv;
    }

    public static String location() {
        return location;
    }

    // public static String sleepy() {
    //     return sleepy;
    // }

    public abstract String searchObject();

    public abstract void pickUp();

    public abstract void move(String direction);
}
