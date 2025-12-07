public abstract class Room {
    protected Inventory inv;
    protected String location = "Control Room";

    public Inventory getInventory() {
        return inv;
    }

    public String location() {
        return location;
    }

    public abstract String searchObject();

    public abstract void pickUp();

    public abstract void move(String direction);
}
