package 슬라임_게임;

import java.util.Scanner;

public class map {
    static Warrior hero;
    static Scanner scan = new Scanner(System.in);
    static String[] village = {"시작 마을", "중간 마을", "끝 마을"};

    //시작 마을
    public static void village(int i, Warrior input_hero) {
        hero = input_hero;
        String village_name = village[i];

        //마을 진입. 마을 밖으로 이동하기 전까지 루프
        while(true) {
            System.out.println("\n\n이곳은 " + village_name);
            System.out.println("\n이제 무엇을 할까?\n");
            System.out.println("1. 마을 밖 / 2. 상점 / 3. 가방 / 4. 설정");
            int select = scan.nextInt();

            //마을 밖으로 이동
            if(select == 1) {
                System.out.println("마을 밖으로 나가자...");
                scan.nextLine();
                scan.nextLine();
                break;
            }

            //상점
            else if(select == 2) {

            }

            //용사 정보 불러오기
            else if(select == 3) {

            }

            //설정 시스템 불러오기
            else if(select == 4) {

            }

            //잘못된 키 입력
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
