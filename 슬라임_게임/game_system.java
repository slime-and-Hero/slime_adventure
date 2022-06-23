package 슬라임_게임;

import java.io.IOException;

public class game_system {

    //게임 스크립트 일시정지 시킴
    //엔터를 누르면 다시 실행
    public void pause() {
        try {
            System.in.read();
          }
        catch (IOException e) { }
    }
}

