package kadai2;

public class Character {
    String name;
    public Character(String name) {
        this.name = name;
    }

    public void attack(){
        System.out.println(this.name + "の攻撃！");

    }

    public void run() {
        System.out.println(this.name + "は逃げ出した！");
    }

    public Character(){}
}
