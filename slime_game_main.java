import java.util.Scanner;

import 슬라임_게임.*;

public class slime_game_main {
    public static void main(String[] arg) {

        Scanner scan = new Scanner(System.in);
        int on_off = 0;

        //게임 시작 종료 루프
        while(on_off != 3) {
            System.out.println("@@@용사와 슬라임@@@");
            System.out.println("1. 새 게임 / 2. 불러오기 / 3. 종료하기");
            on_off = scan.nextInt();

            //새 게임의 시작
            if(on_off == 1) {

                System.out.println("새 게임을 시작합니다\n'Enter 키를 눌러주세요'");
                scan.nextLine();
                scan.nextLine();
                System.out.println("용사의 이름을 정해주세요");
                //키보드 입력값을 input 변수에 할당
                String input = scan.nextLine();

                //용사를 만들자 //용사 객체 생성(1명)
                Warrior warrior = new Warrior(input, 1000, 5000);
                warrior.info();
                scan.nextLine();

                System.out.println("용사 " + warrior.name + " 은(는) 길을 걷고 있다....");
                scan.nextLine();
                System.out.println("용사 " + warrior.name + " 은(는) 몬스터를 만났다!");
                scan.nextLine();

                String input_name_1 = "노란 슬라임";
                int input_hp = 30;
                int input_mp = 3;

                slime slime_a = new slime(input_name_1, input_hp, input_mp);

                //슬라임과 대치하는 용사 상황을 코드로 구현

                //while문 (슬라임과 용사가 열심히 반복적으로 싸우는 구역)
                while(slime_a.hp > 0) {

                    slime_a.info();
                    scan.nextLine();

                    warrior.info();
                    scan.nextLine();

                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("1. 공격 / 2. 가방 / 3. 몬스터 바꾸기 / 4. 도망가기");
                    int select = scan.nextInt();

                    //공격 할지말지 선택
                    if(select == 1) {
                        System.out.println("공격을 하시겠습니까?");
                        System.out.println("1 = Yes  /  2 = No");
                        select = scan.nextInt();
                        //공격 선택
                        if(select == 1) {
                            System.out.println("");
                            System.out.println("공격 스킬을 선택해주세요");
                            System.out.println("");
                            System.out.println("=======================");
                            System.out.println("1 : 기본 공격");
                            System.out.println("2 : 상단 베기 mp 10 소모");
                            System.out.println("3 : 종단 베기 mp 20 소모");
                            System.out.println("=======================");
                            int skill = scan.nextInt();
                            if(skill == 1) {
                                System.out.println("용사 " + warrior.name + " 은(는) 공격을 했다!");
                                slime_a.dmg(warrior.att());
                                scan.nextLine();        
                                scan.nextLine();        
                            }
                            else if(skill == 2) {
                                System.out.println("용사 " + warrior.name + " 은(는) 공격을 했다!");
                                slime_a.dmg(warrior.att_a());
                                scan.nextLine();        
                                scan.nextLine();        
                            }
                            else if(skill == 3) {
                                System.out.println("용사 " + warrior.name + " 은(는) 공격을 했다!");
                                slime_a.dmg(warrior.att_b());
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
                        }
                        else if(select == 2) {
                            continue;
                        }       
                        warrior.dmg(slime_a.att());
                    }
                    //가방 선택
                    else if(select == 2) {

                    }
                    //몬스터 바꾸기
                    else if(select == 3) {

                    }
                    //도망가기
                    else if(select == 4) {
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
                    slime_a.death(); 
                    scan.nextLine();      
                }
            }
            //불러오기
            else if(on_off == 2) {
                System.out.println("아직 구현 못했다~");
                continue;
            }
            //종료 선택지
            else if(on_off == 3) {
                System.out.println("종료하시겠습니까?");
                System.out.println("1. 네 / 2. 아니요");
                on_off = scan.nextInt();
                if(on_off == 1) {
                    break;
                }
                else if(on_off == 2) {
                    continue;
                }
                else {
                    System.out.println("잘못된 입력입니다");
                    System.out.println("Enter 키를 누르면 돌아갑니다");
                    scan.nextLine();
                    scan.nextLine();
                    continue;
                }
            }
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
