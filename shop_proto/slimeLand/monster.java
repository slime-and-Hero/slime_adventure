package slimeLand;

import java.util.Random;
import java.util.Scanner;

public class monster {
    //필드값
    
    public String name;
    public int hp;
    public int mp;
    public static String input_name;
    int a = ((int)(Math.random() * 100)+10);
    static String[] ItemList = {"레드 포션", "블루 포션", "파워 포션", "풀 포션"};
    static Random random = new Random();
    static String b = ItemList[random.nextInt(5)];
    

    //생성자 (슬라임 클래스를 인스턴스로 만들 때 매개변수를 받아서 객체 만들기)
    public monster() {
        name = "평범한 슬라임";
        hp = 10;
        mp = 0;
    }
    public monster(String input_name, int input_hp, int input_mp) {
        name = input_name;
        hp = input_hp;
        mp = input_mp;
    }

    public int monsterdmg(int dmg) {
        this.hp = this.hp - dmg;
        System.out.println(this.name+"은 "+dmg+" 공격을 받았습니다!!");
        return dmg;
             }

    public int att() {
        System.out.println(this.name+"은 "+a+" 공격을 했습니다!!");
        return a;
        //자바 랜덤함수 사용
    }

    public void MonsterDie() {
        System.out.println(this.name+"(을)를 처치 했습니다!!");
        System.out.println(this.name+"에게서 "+b+" 가 나왔습니다");
        System.out.println("획득 하시겠습니까?");
        System.out.println("1. 획득한다  2. 버린다");
    }

    
    public void info() {
        System.out.println("_________"+name+"_________");
        System.out.println("HP = "+this.hp);
        System.out.println("MP = "+this.mp);
    }
    public void dmg(Object att) {
    }
}
