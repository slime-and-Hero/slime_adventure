import java.util.Scanner;

import 슬라임_게임.*;

public class slime_game_main {
    public static void main(String[] arg) {

        Scanner scan = new Scanner(System.in);

        //게임 시작 종료 루프
        while(true) {
            System.out.print("\n\n@@@용사와 슬라임@@@\n\n");
            System.out.println("1. 새 게임 / 2. 불러오기 / 3. 종료하기");
            int main_select = scan.nextInt();

            //새 게임의 시작
            if(main_select == 1) {

                System.out.println("새 게임을 시작합니다\n'Enter 키를 눌러주세요'");
                scan.nextLine();
                scan.nextLine();
                System.out.println("용사의 이름을 정해주세요");
                //키보드 입력값을 input 변수에 할당
                String input = scan.nextLine();

                //용사를 만들자 //용사 객체 생성(1명)
                Warrior warrior = new Warrior(input, 50, 30);
                warrior.info();
                scan.nextLine();

                //마을 진입
                map.village(0, warrior);

                System.out.print("용사 " + warrior.name + " 은(는) 길을 걷고 있다....");
                scan.nextLine();
                System.out.println("용사 " + warrior.name + " 은(는) 몬스터를 만났다!");
                scan.nextLine();

                String input_name_1 = "노란 슬라임";
                int input_hp = 30;
                int input_mp = 3;

                slime slime_a = new slime(input_name_1, input_hp, input_mp);

                //슬라임과 대치하는 용사 상황을 코드로 구현

                battle.battle_field(slime_a,warrior);
            }
            //불러오기
            else if(main_select == 2) {
                System.out.println("아직 구현 못했다~");
                continue;
            }
            //종료 선택지
            else if(main_select == 3) {
                System.out.println("종료하시겠습니까?");
                System.out.println("1. 네 / 2. 아니요");
                int on_off = scan.nextInt();
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
