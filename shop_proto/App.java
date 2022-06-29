// import src.*;
// import src3.NewLaptop.*;

// import java.util.ArrayList;
// import java.util.Scanner;

import java.nio.file.WatchEvent;
import java.util.*;

import Star.EuckSam;
import Star.JicKakSam;
import Star.JungSam;
import Star.Malmo;
import Star.Nemo;
import overrriding.*;
import overrriding.Long;
import slimeLand.*;
public class App {
    public static void main(String[] args) {
        
    //     //인스턴스 생성
    //     Car myCar = new Car();
    //     Car anotherCar = new Car();

    //     //인스턴스의 내용 출력
    //     System.out.println(": " + myCar.company);
    //     System.out.println(": " + myCar.model);
    //     System.out.println(": " + myCar.color);
    //     System.out.println(": " + myCar.maxSpeed);
    //     System.out.println(": " + myCar.speed);

    //     //인스턴스의 값 출력
    //     myCar.speed = 60;
    //     System.out.println("myCar : " + myCar.speed);
    //     System.out.println("anoutherCar : " + anotherCar.speed);

    //     int check = myCar.speedCheck();
    //     System.out.println("this speed = "+check);
    //     System.out.println("calc speed = "+Calc.calcTest(check));

        // Scanner input = new Scanner(System.in);
        // // System.out.println("컴퓨터 이름은?");
        // // String inputCOM = input.nextLine();
        
        // // System.out.println("CPU 성능은?");
        // // String inputCPU = input.nextLine();

        // // System.out.println("RAM 성능은?");
        // // String inputRAM = input.nextLine();

        // // System.out.println("SSD 성능은?");
        // // String inputSSD = input.nextLine();

        // // System.out.println("컴퓨터 이름 : " + inputCOM+" // CPU 성능 : "+inputCPU+" // RAM 성능 : "+inputRAM+" // SSD 성능 : "+inputSSD);

        // // NewLaptop option = new NewLaptop();
        // // NewLaptop option_1 = new NewLaptop(inputCPU);
        // // NewLaptop option_2 = new NewLaptop(inputCPU, inputRAM);
        // // NewLaptop option_3 = new NewLaptop(inputCPU, inputRAM, inputSSD);

        // System.out.println("os타입을 입력하세요");
        // System.out.println("1. MAC OS 일 경우는 1을 입력하세요");
        // System.out.println("2. Windows OS 일 경우는 2를 입력하세요");

        // int osType = input.nextInt();
        // OsCheck.OsCheck(osType);

        // boolean checkComputerWile = true;
        // ArrayList<String> computerArray = new ArrayList<String>();

        // boolean branch = false;
        // String checkOK = "";
        // var computerInputData = "";

        // while(checkComputerWile) {
        //     System.out.println("컴퓨터사양을 입력해 주세요");
        //     System.out.println("ex) cpu:i7, ram:8g, ssd:128g..");

        //     computerInputData = input.nextLine();
        //     System.out.println("입력하신 내용이 다음과 같습니까? 맞으면 yes, 아니면 no를 입력해 주세요");

        //     System.out.println(computerInputData);
        //     checkOK = input.nextLine();

        //     branch = CheckYn.CheckYn(checkOK, "inputCheck");
        //     if(branch) {
        //         computerArray.add(computerInputData);
        //     } else {
        //         continue;
        //     };

        //     System.out.println("데이터를 계속 입력하시겠습니까? 맞으면 yes, 아니면 no를 입력해 주세요");
        //     checkOK = input.nextLine();
        //     branch = CheckYn.CheckYn(checkOK, "brakeCheck");

        //     if(branch) {
        //         continue;
        //     }else {
        //         break;
        //     }

        // }

         

        //슬라임 몬스터 생성(다수)
            monster slime_a = new monster("초록 슬라임",30, 3);
            monster slime_b = new monster("빨강 슬라임",100, 10);
            monster slime_c = new monster("파랑 슬라임",50, 5);
            monster slime_d = new monster("머쉬맘",300, 20);

            // monster fish_a = new monster("참돔", 30, 3);
            // monster fish_b = new monster("메기", 100, 10);
            // monster fish_c = new monster("장어", 300, 20);
            // monster fish_d = new monster("우럭", 50, 10);

            // monster mountain_1 = new monster("돌덩이",30,3);
            // monster mountain_2 = new monster("스톤즈",50,5);
            // monster mountain_3 = new monster("메가스톤즈",100,10);
            // monster mountain_4 = new monster("롱스톤",300,20);



            // //string 메모리를 적게 쓰는 법
            // String input = "";
            // int output;
            // Scanner scan = new Scanner(System.in);
            // bag inventory = new bag();


            // System.out.println("..눈.......");
            // System.out.println(".....눈을......");
            // System.out.println("..눈을...뜨...");
            // System.out.println("..눈을...세요..");
            // System.out.println("눈을 뜨세요!!");

            // System.out.println("안녕하세요. 당신의 이름은?");
            // System.out.println("%%% 용사의 이름을 정해주세요");
            // //키보드 입력값을 input 변수에 할당
            // input = scan.nextLine();

            // System.out.println("안녕하세요 "+input+" 님. 반갑습니다.");
            // System.out.println("세상을 구해주세요.");

            // Warrior Warrior = new Warrior(input, 5000, 100);
            // Warrior.info();           


            // System.out.println("앗! 야생의 "+slime_b.name+"이 나타났다!");
            // slime_b.info();
            
            
            // while(slime_b.hp>0) {
            //     System.out.println("어떻게 하시겠습니까?");
            //     System.out.println("1.공격 2.스킬 3.인벤토리");
            //     output = scan.nextInt();
            //     scan.nextLine();
                
                
                

            //     if(output == 3) {
            //         inventory.printInventory(2);
            //         inventory.InventoryChoose();
            //         } else {
            //         slime_b.monsterdmg(Warrior.att(Warrior.Choose(output)));
            //         }
            //     Warrior.info();
            //     slime_b.info();

            //     System.out.println("슬라임이 공격합니다");
            //     input = scan.nextLine();

            //     Warrior.warriordmg(slime_b.att());
            //     Warrior.info();
            //     slime_b.info();
            // }
            
            // monster Die = new monster();
            // Die.MonsterDie();
            // output = scan.nextInt();
            // scan.nextLine();
            // inventory.printInventory(output);

            
                // ChangeWeapon();

                // //사각형
                // Nemo Nemo = new Nemo();
                // Nemo.Nemo();
                
                //직각삼각형
                // JicKakSam JicKakSam = new JicKakSam();
                // JicKakSam.JicKakSam();

                //정삼각형
                // JungSam JungSam = new JungSam();
                // JungSam.JungSam();
                
                //역삼각형
                // EuckSam EuckSam = new EuckSam();
                // EuckSam.EuckSam();

                //마름모 삼각형
                Malmo Malmo = new Malmo();
                Malmo.Malmo();


        
        
        
        // bag.printInventory();

        //용사의 공격(1턴)
        // slime_b.dmg(5);

        //슬라임의 공격(1턴)    
        // slime_a.dmg(Warrior.att());
               
            
                    
                
                  
    // public static void ChangeWeapon() {
        
    //     Lance lance = new Lance();
    //     Long long1 = new Long();
    //     Basic onepunch = new Basic();

    //     lance.attAction();
    //     lance.destruction();

    //     long1.attAction();
    //     long1.destruction();

    //     onepunch.attAction();
    //     onepunch.destruction();
        
    // }

    
}}
