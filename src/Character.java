public abstract class Character {
    String name;
    public Character(String name) {
        this.name = name;
    }

    public abstract void attack(Matango m);

    public abstract void run();

}
