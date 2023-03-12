public class Player {
    protected int id;
    protected String name;
    protected int streinght;

    public Player(int id, String name, int streinght) {
        this.id = id;
        this.name = name;
        this.streinght = streinght;
    }

    public String getName() {
        return name;
    }

    public int getStreinght() {
        return streinght;
    }
}
