package slimeLand;

import java.util.Scanner;

public class Warrior {

    public static String name;
    public static int hp;
    public static int mp;
    public static int getput;
    int a = (int)(Math.random() * 100);
    Scanner scan = new Scanner(System.in);
    
    public int att(int att) {
        
        System.out.println(this.name+"은 "+att+" 공격을 했습니다!!");
        return att;
        
        //자바 랜덤함수 사용
    }
    public int warriordmg(int dmg) {
        this.hp = this.hp - dmg;
        System.out.println(this.name+"은 "+dmg+" 공격을 받았습니다!!");
        return dmg;
    }

    public Warrior(String input_name, int input_hp, int input_mp) {
        this.name = input_name;
        this.hp = input_hp;
        this.mp = input_mp;
    }

    public int fireball() {
        this.mp-=150;
        return 20;
    }

    public int iceball() {
        this.mp-=100;
        return 15;
    }

    public int reapcuter() {
        this.mp-=100;
        return 15;
    }

    public void info() {
        System.out.println("_________"+name+"_________");
        System.out.println("HP = "+this.hp);
        System.out.println("MP = "+this.mp);
    }
    bag inventory = new bag();
    public int Choose(int output) {
        
        boolean checkWhile = true;
        while(checkWhile) {
            
            if(output == 1) {
                System.out.println(this.name+"은 기본공격을 사용했습니다");
                return 50;
            } else if(output ==2 && this.mp>0) {
                checkWhile = false;
            } else{
                System.out.println("mp가 부족합니다. 다시 선택해주세요");
                output = scan.nextInt();
                scan.nextLine();
            }
        }
        
        
        
        
        
        // while(checkWhile) {
            
            // int answer = 0;
        // switch (getput) {
        //     case 1 : if (this.mp>=150) {
        //         System.out.println(this.name+"은 파이어볼을 사용했습니다");
        //         answer = fireball();
        //         break;
        //     } else {
        //         System.out.println("mp가 부족합니다. 다시 선택해주세요");
        //             getput = scan.nextInt();
        //             scan.nextLine();
        //             continue;
        //     }

        //     case 2 : if (this.mp>=100) {
        //         System.out.println(this.name+"은 아이스볼을 사용했습니다");
        //         answer = iceball();
        //         break;
        //     } else {
        //         System.out.println("mp가 부족합니다. 다시 선택해주세요");
        //             getput = scan.nextInt();
        //             scan.nextLine();
        //             continue;
        //     }

        //     case 3 : if (this.mp>=100) {
        //         System.out.println(this.name+"은 리프커터를 사용했습니다");
        //         answer = reapcuter();
        //         break;
        //     } else {
        //         System.out.println("mp가 부족합니다. 다시 선택해주세요");
        //             getput = scan.nextInt();
        //             scan.nextLine();
        //             continue;
        //     }

        System.out.println("어떤 스킬을 사용하시겠습니까?");
        System.out.println("1. 파이어볼 2. 아이스볼 3. 리프커터");
        getput = scan.nextInt();
            int answer=0;
        if( getput == 1 && this.mp>=150 ) {
            System.out.println(this.name+"은 파이어볼을 사용했습니다");
            answer = fireball();
            checkWhile = false;
        } else if( getput==2 && this.mp>=100) {
            System.out.println(this.name+"은 아이스볼을 사용했습니다");
            answer = iceball();
            checkWhile = false;
        } else if( getput==3 && this.mp>=100) {
            System.out.println(this.name+"은 리프커터를 사용했습니다");
            answer = reapcuter();
            checkWhile = false;
        } else {
            System.out.println("mp가 부족합니다. 다시 선택해주세요");
                output = scan.nextInt();
                scan.nextLine();
                if( output==2 && this.mp>=100) {
                    System.out.println(this.name+"은 아이스볼을 사용했습니다");
                    answer = iceball();
                    checkWhile = false;
                } else if( output==3 && this.mp>=100) {
                    System.out.println(this.name+"은 리프커터를 사용했습니다");
                    answer = reapcuter();
                    checkWhile = false;
                }
        
            }
        return answer;
        }
    
    }


    
       
    
        
    

