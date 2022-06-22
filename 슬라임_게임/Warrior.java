package 슬라임_게임;

public class Warrior {
    public String name;
    public int hp;
    public int mp;
    
    public Warrior(String input_name, int input_hp, int input_mp) {
        this.name = input_name;
        this.hp = input_hp;
        this.mp = input_mp;
    }

    public int att() {
        System.out.println(this.name + " 은(는) " + 10 + " 공격을 했습니다!");
        return 10;
    }

    public int att_a() {
        this.mp =  this.mp - 10;
        System.out.println(this.name + " 은(는) " + 30 + " 종단 공격을 했습니다!");
        return 30;
    }

    public int att_b() {
        this.mp = this.mp - 20;
        System.out.println(this.name + " 은(는) " + 50 + " 상단 공격을 했습니다!");
        return 50;
    }

    public void dmg(int input_dmg) {
        this.hp = this.hp - input_dmg;
        System.out.println(this.name + " 은(는) " + input_dmg + " 공격을 받았습니다.");
    }

    public void info() {
        System.out.println("_____________" + name + "_____________");
        System.out.println("hp = " + hp);
        System.out.println("mp = " + mp);
    }

    public void death() {
        System.out.println(this.name + " 은(는) 쓰러졌다!");
    }

}
