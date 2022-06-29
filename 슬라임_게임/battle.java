package 슬라임_게임;

import java.util.Scanner;

public class battle {
    static slime monster;
    static Warrior hero;
    static Scanner scan = new Scanner(System.in);
    
    public static void battle_field(slime input_monster, Warrior input_hero) {
        
        monster = input_monster;
        hero = input_hero;

        //둘 중하나가 쓰러질 때까지 턴제 배틀을 반복
        while(true) {
            if(monster.hp > 0) {
                //마주친 몬스터와 용사
                monster.info();
                hero.info();

                System.out.println("\n무엇을 하시겠습니까?\n");
                System.out.println("1. 공격 / 2. 가방 / 3. 몬스터 바꾸기 / 4. 도망가기");
                int select = scan.nextInt();

                //공격 할지말지 선택
                if(select == 1) {
                    System.out.println("\n공격을 하시겠습니까?\n");
                    System.out.println("1 = Yes  /  2 = No");
                    select = scan.nextInt();

                    //공격 선택
                    if(select == 1) {
                        System.out.println("\n공격 스킬을 선택해주세요\n");
                        System.out.println("=======================");
                        System.out.println("1 : 기본 공격");
                        System.out.println("2 : 상단 베기 mp 10 소모");
                        System.out.println("3 : 종단 베기 mp 20 소모");
                        System.out.println("=======================");
                        int skill = scan.nextInt();
                        if(skill == 1) {
                            System.out.println("용사 " + hero.name + " 은(는) 공격을 했다!");
                            monster.dmg(hero.att());
                            scan.nextLine();        
                            scan.nextLine();        
                        }
                        else if(skill == 2) {
                            System.out.println("용사 " + hero.name + " 은(는) 공격을 했다!");
                            monster.dmg(hero.att_a());
                            scan.nextLine();        
                            scan.nextLine();        
                        }
                        else if(skill == 3) {
                            System.out.println("용사 " + hero.name + " 은(는) 공격을 했다!");
                            monster.dmg(hero.att_b());
                            scan.nextLine();        
                            scan.nextLine();        
                        }
                        //다른 키 입력
                        else {
                            System.out.println("잘못된 입력입니다");
                            System.out.println("Enter 키를 누르면 돌아갑니다");
                            scan.nextLine();
                            scan.nextLine();
                            continue;
                        }
                        //몬스터가 쓰러졌을 때
                        if(monster.hp <= 0) {
                            monster.death();
                            System.out.println(monster.name + " 을(를) 무찔렀다"); 
                            scan.nextLine();
                            break;  
                        }      
                    }
                    //공격을 하지 않으면 배틀 처음 선택지로 돌아감
                    else if(select == 2) {
                        continue;
                    }
                    
                    //몬스터의 공격
                    //몬스터가 쓰러지거나 도망가기를 선택했을 때 실행되지 않게
                    hero.dmg(monster.att());
            
                    //용사가 쓰러졌을 때
                    if(hero.hp <= 0) {
                        hero.death();
                        System.out.println("game over");
                        scan.nextLine();
                        break;
                    } 
                }
                //가방 선택
                else if(select == 2) {

                }
                //몬스터 바꾸기
                else if(select == 3) {

                }
                //도망가기
                else if(select == 4) {
                    System.out.println("도망쳤다...");
                    scan.nextLine();
                    scan.nextLine();
                    break;
                }
                //다른 키 입력
                else {
                    System.out.println("잘못된 입력입니다");
                    System.out.println("Enter 키를 누르면 돌아갑니다");
                    scan.nextLine();
                    scan.nextLine();
                    continue;
                } 

            }
                
        }
    }


}
