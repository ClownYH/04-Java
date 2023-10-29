package main.java.com.ohgiraffers.room_escape;

import java.util.Scanner;

public class MainGame {
    Scanner scanner = new Scanner(System.in);

    public void mainKim() {
        Sheet[] character = new Sheet[1];
        character[0] = new Sheet("김철수", "학생", 2, 3, 4, 3);

        System.out.println("당신은 학생으로 학원에 다녀오는 중 갑자기 뒤통수에 큰 충격을 받고 기절했습니다.");

        boolean game = true;

        while (game) {

            System.out.println("당신 앞에는 커다란 문이 있었습니다.");
            System.out.println("1. 문을 살펴본다. | 2. 주위를 살펴본다." + "(앞으로 선택지 외 입력은 당신의 상태를 보여줍니다.)");
            String ans1 = scanner.next();

            if (ans1.equals("1")) {

                System.out.println("문에는 비밀번호를 입력하는 장치가 있고, -북-이란 글자와 2라는 숫자가 써있습니다.");
                System.out.println("비밀번호를 입력하는 장치 바로 위에는 마작에서 쓰이는 풍패가 붙어있습니다.");

                if(character[0].getJob().equals("학생") || character[0].getJob().equals("공무원")){
                    System.out.println("평소에 마작을 좋아하던 당신은 이 순서가 동-남-서-북 이라는 것을 깨달았습니다.");
                }

                System.out.println("1. 비밀번호를 입력한다. | 2. 문을 부순다.");
                String ans2 = scanner.next();

                if (ans2.equals("1")) {

                    System.out.println("당신은 비밀번호를 입력합니다.");
                    System.out.println("비밀번호를 입력해주세요.");
                    String ans3 = scanner.next();

                    if (ans3.equals("5842")) {

                        System.out.println("당신은 비밀번호를 입력했고 이는 정답이었습니다.");
                        System.out.println("축하합니다! 탈출하셨습니다!");
                        game = false;

                    } else {

                        System.out.println("비밀번호를 틀렸습니다! 문에서 독가스가 살포되었습니다.");

                        if(character[0].getluk() > 3){

                            System.out.println("독가스가 살포되었지만 당신은 재빠른 몸놀림으로 회피했습니다.");

                        }else {

                            character[0].setHp(character[0].getHp() - 2);
                            System.out.println("독가스에 당신은 끔찍한 고통을 느낍니다.");

                            if (character[0].getHp() <= 0) {

                                System.out.println("당신은 더 이상 버티지 못했습니다. 사망하셨습니다.");
                                game = false;
                            }

                        }

                    }

                } else if (ans2.equals("2")) {

                    System.out.println("당신은 문을 부수기로 했습니다. 강하게 문에 몸을 부딫칩니다.");

                    if (character[0].getStr() > 3) {

                        System.out.println("당신은 기어코 문을 부셨습니다! 당신은 힘으로 탈출에 성공하셨습니다!");
                        game = false;

                    }else {

                        System.out.println("당신은 문을 부수기에는 너무 약했습니다.");
                        character[0].setHp(character[0].getHp() - 1);
                        System.out.println("당신의 체력은 " + character[0].getHp() + "입니다.");

                        if (character[0].getHp() <= 0) {

                            System.out.println("당신은 더 이상 버티지 못했습니다. 사망하셨습니다.");
                            game = false;
                        }
                    }

                }else {

                    System.out.println(character[0].getInfo());
                }
            } else if (ans1.equals("2")) {

                System.out.println("당신은 주위를 살펴보기로 했습니다.");
                System.out.println("어디를 주위를 둘러보니 다른 벽에는 -동-, -서-, -남-이라고 적혀있습니다.");
                System.out.println("1. 동 | 2. 서 | 3. 남");
                String ans3 = scanner.next();

                if (ans3.equals("1")) {

                    System.out.println("당신은 -동-을 살펴보기로 합니다.");
                    System.out.println("이 벽은 무지개 색으로 칠해져 있고 초록색 곰 인형이 한 마리, 흰색 고양이 다섯 마리, 보라색 두 마리가 붙어있습니다.");
                    System.out.println("1. 인형을 만져본다. | 2. 벽을 살펴본다.");
                    String ans4 = scanner.next();

                    if (ans4.equals("1")) {

                        System.out.println("인형을 만져봅니다. 인형에는 독침이 붙어있었습니다!");

                        if (character[0].getluk() > 3) {

                            System.out.println("당신은 운이 좋군요. 다행히 찔리지 않고 넘어갔습니다.");

                        } else {

                            character[0].setHp(character[0].getHp() - 1);
                            character[0].setDex(character[0].getDex() - 1);
                            character[0].setStr(character[0].getStr() - 1);
                            System.out.println("당신은 독에 고통을 느낍니다. 당신이 약해지는 것을 느낍니다.");

                            if (character[0].getHp() <= 0) {

                                System.out.println("당신은 더 이상 버티지 못했습니다. 사망하셨습니다.");
                                game = false;

                            }
                        }

                    } else if (ans4.equals("2")) {

                        if(character[0].getJob().equals("공무원")){

                            System.out.println("당신은 어젯밤 우연히 본 공고문에서 읽었던 약의 냄새에 같은 냄새가 벽에서 나는 것을 알고 벽에 손을 댔습니다.");

                            if(character[0].getHp() < 2){
                                character[0].setHp(character[0].getHp() + 1);
                                System.out.println("당신은 체력이 조금 회복됨을 느꼈습니다.");
                            }

                        }
                        System.out.println("당신은 벽을 살펴봅니다.");
                        System.out.println("벽은 무지개색으로 칠해져 있고 한 문장이 써있습니다.");
                        System.out.println("----오직 7 빛깔 무지개만 존재할 수 있다.----");
                    } else {
                        System.out.println(character[0].getInfo());
                    }
                } else if (ans3.equals("2")) {
                    System.out.println("당신은 -서-를 살펴보기로 합니다.");
                    System.out.println("이 벽은 누군가 무거운 무언가로 긁어낸 흔적이 있습니다. 잘 살펴보니 벽 근처에는 칼과 망치가 자리하고 있습니다.");
                    System.out.println("1. 벽을 살펴본다. | 2. 도구들을 살펴본다.");
                    String ans4 = scanner.next();

                    if(ans4.equals("1")){
                        System.out.println("당신은 벽을 살펴봅니다. 벽에는 칼로 파낸 곳이 4군데, 망치로 두들긴 흔적이 2군데가 있습니다.");
                        System.out.println("어째선지 칼로 파낸 곳은 피가 발라져 있습니다.");
                    }else if(ans4.equals("2")){
                        System.out.println("칼과 망치가 있습니다. 칼은 녹이 슬었고, 망치는 굉장히 무거워 보입니다.");
                        if(character[0].getDex() < 3){
                            System.out.println("당신은 칼을 들어보다가 손에서 떨어트리며 발등을 베었습니다!");
                            character[0].setHp(character[0].getHp() - 1);
                            if (character[0].getHp() <= 0) {
                                System.out.println("당신은 더 이상 버티지 못했습니다. 사망하셨습니다.");
                                game = false;
                            }
                        }

                        if(character[0].getStr() > 2){
                            System.out.println("당신은 부족한 근력으로 망치를 들기 위해 노력했습니다.");
                            System.out.println("근력이 상승했습니다.");
                            character[0].setStr(character[0].getStr() + 1);
                        }

                        if(character[0].getJob().equals("공무원")){
                            System.out.println("당신은 굳이 이런 위험한 것을 만지고 싶지 않아 합니다.");
                        }

                    }else{
                        System.out.println(character[0].getInfo());
                    }
                } else if (ans3.equals("3")) {

                    System.out.println("당신은 -남-을 살펴보기로 합니다.");
                    System.out.println("이 벽에는 무한을 의미하는 기호(∞)가 큼직하게 써있을 뿐입니다.");
                    System.out.println("기호 아래에는 무언가 써있는 것처럼 보입니다..");

                    if(character[0].getJob().equals("학생")){

                        System.out.println("흐릿하게 -세워-라고 써있는 것이 보입니다.");

                    }else if(character[0].equals("군인")){

                        System.out.println("당신은 직감적으로 벽에 있는 것이 8이라고 느꼈습니다.");

                    }else if(character[0].equals("공무원")){

                        System.out.println("당신은 눈이 나빠져 써있는 것을 읽을 수 없습니다.");
                    }

                }
            }else {

                System.out.println(character[0].getInfo());

            }
        }

    }


    public void mainPark() {
        Sheet[] character1 = new Sheet[1];
        character1[0] = new Sheet("박순희", "공무원", 3, 3, 2, 4);

        System.out.println("당신은 공무원으로 퇴근 중 갑자기 튀통수에 큰 충격을 받고 기절했습니다.");

        boolean game = true;

        while (game) {

            System.out.println("당신 앞에는 커다란 문이 있었습니다.");
            System.out.println("1. 문을 살펴본다. | 2. 주위를 살펴본다." + "(앞으로 선택지 외 입력은 당신의 상태를 보여줍니다.)");
            String ans1 = scanner.next();

            if (ans1.equals("1")) {

                System.out.println("문에는 비밀번호를 입력하는 장치가 있고, -북-이란 글자와 2라는 숫자가 써있습니다.");
                System.out.println("비밀번호를 입력하는 장치 바로 위에는 마작에서 쓰이는 풍패가 붙어있습니다.");

                if(character1[0].getJob().equals("학생") || character1[0].getJob().equals("공무원")){
                    System.out.println("평소에 마작을 좋아하던 당신은 이 순서가 동-남-서-북 이라는 것을 깨달았습니다.");
                }

                System.out.println("1. 비밀번호를 입력한다. | 2. 문을 부순다.");
                String ans2 = scanner.next();

                if (ans2.equals("1")) {

                    System.out.println("당신은 비밀번호를 입력합니다.");
                    System.out.println("비밀번호를 입력해주세요.");
                    String ans3 = scanner.next();

                    if (ans3.equals("5842")) {

                        System.out.println("당신은 비밀번호를 입력했고 이는 정답이었습니다.");
                        System.out.println("축하합니다! 탈출하셨습니다!");
                        game = false;

                    } else {

                        System.out.println("비밀번호를 틀렸습니다! 문에서 독가스가 살포되었습니다.");

                        if(character1[0].getluk() > 3){

                            System.out.println("독가스가 살포되었지만 당신은 재빠른 몸놀림으로 회피했습니다.");

                        }else {

                            character1[0].setHp(character1[0].getHp() - 2);
                            System.out.println("독가스에 당신은 끔찍한 고통을 느낍니다.");

                            if (character1[0].getHp() <= 0) {

                                System.out.println("당신은 더 이상 버티지 못했습니다. 사망하셨습니다.");
                                game = false;
                            }

                        }

                    }

                } else if (ans2.equals("2")) {

                    System.out.println("당신은 문을 부수기로 했습니다. 강하게 문에 몸을 부딫칩니다.");

                    if (character1[0].getStr() > 3) {

                        System.out.println("당신은 기어코 문을 부셨습니다! 당신은 힘으로 탈출에 성공하셨습니다!");
                        game = false;

                    }else {

                        System.out.println("당신은 문을 부수기에는 너무 약했습니다.");
                        character1[0].setHp(character1[0].getHp() - 1);
                        System.out.println("당신의 체력은 " + character1[0].getHp() + "입니다.");

                        if (character1[0].getHp() <= 0) {

                            System.out.println("당신은 더 이상 버티지 못했습니다. 사망하셨습니다.");
                            game = false;
                        }
                    }

                }else {

                    System.out.println(character1[0].getInfo());
                }
            } else if (ans1.equals("2")) {

                System.out.println("당신은 주위를 살펴보기로 했습니다.");
                System.out.println("어디를 주위를 둘러보니 다른 벽에는 -동-, -서-, -남-이라고 적혀있습니다.");
                System.out.println("1. 동 | 2. 서 | 3. 남");
                String ans3 = scanner.next();

                if (ans3.equals("1")) {

                    System.out.println("당신은 -동-을 살펴보기로 합니다.");
                    System.out.println("이 벽은 무지개 색으로 칠해져 있고 초록색 곰 인형이 한 마리, 흰색 고양이 다섯 마리, 보라색 두 마리가 붙어있습니다.");
                    System.out.println("1. 인형을 만져본다. | 2. 벽을 살펴본다.");
                    String ans4 = scanner.next();

                    if (ans4.equals("1")) {

                        System.out.println("인형을 만져봅니다. 인형에는 독침이 붙어있었습니다!");

                        if (character1[0].getluk() > 3) {

                            System.out.println("당신은 운이 좋군요. 다행히 찔리지 않고 넘어갔습니다.");

                        } else {

                            character1[0].setHp(character1[0].getHp() - 1);
                            character1[0].setDex(character1[0].getDex() - 1);
                            character1[0].setStr(character1[0].getStr() - 1);
                            System.out.println("당신은 독에 고통을 느낍니다. 당신이 약해지는 것을 느낍니다.");

                            if (character1[0].getHp() <= 0) {

                                System.out.println("당신은 더 이상 버티지 못했습니다. 사망하셨습니다.");
                                game = false;

                            }
                        }

                    } else if (ans4.equals("2")) {

                        if(character1[0].getJob().equals("공무원")){

                            System.out.println("당신은 어젯밤 우연히 본 공고문에서 읽었던 약의 냄새에 같은 냄새가 벽에서 나는 것을 알고 벽에 손을 댔습니다.");

                            if(character1[0].getHp() < 2){
                                character1[0].setHp(character1[0].getHp() + 1);
                                System.out.println("당신은 체력이 조금 회복됨을 느꼈습니다.");
                            }

                        }
                        System.out.println("당신은 벽을 살펴봅니다.");
                        System.out.println("벽은 무지개색으로 칠해져 있고 한 문장이 써있습니다.");
                        System.out.println("----오직 7 빛깔 무지개만 존재할 수 있다.----");
                    } else {
                        System.out.println(character1[0].getInfo());
                    }
                } else if (ans3.equals("2")) {
                    System.out.println("당신은 -서-를 살펴보기로 합니다.");
                    System.out.println("이 벽은 누군가 무거운 무언가로 긁어낸 흔적이 있습니다. 잘 살펴보니 벽 근처에는 칼과 망치가 자리하고 있습니다.");
                    System.out.println("1. 벽을 살펴본다. | 2. 도구들을 살펴본다.");
                    String ans4 = scanner.next();

                    if(ans4.equals("1")){
                        System.out.println("당신은 벽을 살펴봅니다. 벽에는 칼로 파낸 곳이 4군데, 망치로 두들긴 흔적이 2군데가 있습니다.");
                        System.out.println("어째선지 칼로 파낸 곳은 피가 발라져 있습니다.");
                    }else if(ans4.equals("2")){
                        System.out.println("칼과 망치가 있습니다. 칼은 녹이 슬었고, 망치는 굉장히 무거워 보입니다.");
                        if(character1[0].getDex() < 3){
                            System.out.println("당신은 칼을 들어보다가 손에서 떨어트리며 발등을 베었습니다!");
                            character1[0].setHp(character1[0].getHp() - 1);
                            if (character1[0].getHp() <= 0) {
                                System.out.println("당신은 더 이상 버티지 못했습니다. 사망하셨습니다.");
                                game = false;
                            }
                        }

                        if(character1[0].getStr() > 2){
                            System.out.println("당신은 부족한 근력으로 망치를 들기 위해 노력했습니다.");
                            System.out.println("근력이 상승했습니다.");
                            character1[0].setStr(character1[0].getStr() + 1);
                        }

                        if(character1[0].getJob().equals("공무원")){
                            System.out.println("당신은 굳이 이런 위험한 것을 만지고 싶지 않아 합니다.");
                        }

                    }else{
                        System.out.println(character1[0].getInfo());
                    }
                } else if (ans3.equals("3")) {

                    System.out.println("당신은 -남-을 살펴보기로 합니다.");
                    System.out.println("이 벽에는 무한을 의미하는 기호(∞)가 큼직하게 써있을 뿐입니다.");
                    System.out.println("기호 아래에는 무언가 써있는 것처럼 보입니다..");

                    if(character1[0].getJob().equals("학생")){

                        System.out.println("흐릿하게 -세워-라고 써있는 것이 보입니다.");

                    }else if(character1[0].equals("군인")){

                        System.out.println("당신은 직감적으로 벽에 있는 것이 8이라고 느꼈습니다.");

                    }else if(character1[0].equals("공무원")){

                        System.out.println("당신은 눈이 나빠져 써있는 것을 읽을 수 없습니다.");
                    }

                }
            }else {

                System.out.println(character1[0].getInfo());

            }
        }
    }

    public void mainOh() {
        Sheet[] character2 = new Sheet[1];
        character2[0] = new Sheet("오달구", "군인", 3, 4, 3, 2);

        System.out.println("당신은 군인으로 휴가중 갑자기 봉고차로 납치당해 기절했습니다.");

        boolean game = true;

        while (game) {

            System.out.println("당신 앞에는 커다란 문이 있었습니다.");
            System.out.println("1. 문을 살펴본다. | 2. 주위를 살펴본다." + "(앞으로 선택지 외 입력은 당신의 상태를 보여줍니다.)");
            String ans1 = scanner.next();

            if (ans1.equals("1")) {

                System.out.println("문에는 비밀번호를 입력하는 장치가 있고, -북-이란 글자와 2라는 숫자가 써있습니다.");
                System.out.println("비밀번호를 입력하는 장치 바로 위에는 마작에서 쓰이는 풍패가 붙어있습니다.");

                if(character2[0].getJob().equals("학생") || character2[0].getJob().equals("공무원")){
                    System.out.println("평소에 마작을 좋아하던 당신은 이 순서가 동-남-서-북 이라는 것을 깨달았습니다.");
                }

                System.out.println("1. 비밀번호를 입력한다. | 2. 문을 부순다.");
                String ans2 = scanner.next();

                if (ans2.equals("1")) {

                    System.out.println("당신은 비밀번호를 입력합니다.");
                    System.out.println("비밀번호를 입력해주세요.");
                    String ans3 = scanner.next();

                    if (ans3.equals("5842")) {

                        System.out.println("당신은 비밀번호를 입력했고 이는 정답이었습니다.");
                        System.out.println("축하합니다! 탈출하셨습니다!");
                        game = false;

                    } else {

                        System.out.println("비밀번호를 틀렸습니다! 문에서 독가스가 살포되었습니다.");

                        if(character2[0].getluk() > 3){

                            System.out.println("독가스가 살포되었지만 당신은 재빠른 몸놀림으로 회피했습니다.");

                        }else {

                            character2[0].setHp(character2[0].getHp() - 2);
                            System.out.println("독가스에 당신은 끔찍한 고통을 느낍니다.");

                            if (character2[0].getHp() <= 0) {

                                System.out.println("당신은 더 이상 버티지 못했습니다. 사망하셨습니다.");
                                game = false;
                            }

                        }

                    }

                } else if (ans2.equals("2")) {

                    System.out.println("당신은 문을 부수기로 했습니다. 강하게 문에 몸을 부딫칩니다.");

                    if (character2[0].getStr() > 3) {

                        System.out.println("당신은 기어코 문을 부셨습니다! 당신은 힘으로 탈출에 성공하셨습니다!");
                        game = false;

                    }else {

                        System.out.println("당신은 문을 부수기에는 너무 약했습니다.");
                        character2[0].setHp(character2[0].getHp() - 1);
                        System.out.println("당신의 체력은 " + character2[0].getHp() + "입니다.");

                        if (character2[0].getHp() <= 0) {

                            System.out.println("당신은 더 이상 버티지 못했습니다. 사망하셨습니다.");
                            game = false;
                        }
                    }

                }else {

                    System.out.println(character2[0].getInfo());
                }
            } else if (ans1.equals("2")) {

                System.out.println("당신은 주위를 살펴보기로 했습니다.");
                System.out.println("어디를 주위를 둘러보니 다른 벽에는 -동-, -서-, -남-이라고 적혀있습니다.");
                System.out.println("1. 동 | 2. 서 | 3. 남");
                String ans3 = scanner.next();

                if (ans3.equals("1")) {

                    System.out.println("당신은 -동-을 살펴보기로 합니다.");
                    System.out.println("이 벽은 무지개 색으로 칠해져 있고 초록색 곰 인형이 한 마리, 흰색 고양이 다섯 마리, 보라색 두 마리가 붙어있습니다.");
                    System.out.println("1. 인형을 만져본다. | 2. 벽을 살펴본다.");
                    String ans4 = scanner.next();

                    if (ans4.equals("1")) {

                        System.out.println("인형을 만져봅니다. 인형에는 독침이 붙어있었습니다!");

                        if (character2[0].getluk() > 3) {

                            System.out.println("당신은 운이 좋군요. 다행히 찔리지 않고 넘어갔습니다.");

                        } else {

                            character2[0].setHp(character2[0].getHp() - 1);
                            character2[0].setDex(character2[0].getDex() - 1);
                            character2[0].setStr(character2[0].getStr() - 1);
                            System.out.println("당신은 독에 고통을 느낍니다. 당신이 약해지는 것을 느낍니다.");

                            if (character2[0].getHp() <= 0) {

                                System.out.println("당신은 더 이상 버티지 못했습니다. 사망하셨습니다.");
                                game = false;

                            }
                        }

                    } else if (ans4.equals("2")) {

                        if(character2[0].getJob().equals("공무원")){

                            System.out.println("당신은 어젯밤 우연히 본 공고문에서 읽었던 약의 냄새에 같은 냄새가 벽에서 나는 것을 알고 벽에 손을 댔습니다.");

                            if(character2[0].getHp() < 2){
                                character2[0].setHp(character2[0].getHp() + 1);
                                System.out.println("당신은 체력이 조금 회복됨을 느꼈습니다.");
                            }

                        }
                        System.out.println("당신은 벽을 살펴봅니다.");
                        System.out.println("벽은 무지개색으로 칠해져 있고 한 문장이 써있습니다.");
                        System.out.println("----오직 7 빛깔 무지개만 존재할 수 있다.----");
                    } else {
                        System.out.println(character2[0].getInfo());
                    }
                } else if (ans3.equals("2")) {
                    System.out.println("당신은 -서-를 살펴보기로 합니다.");
                    System.out.println("이 벽은 누군가 무거운 무언가로 긁어낸 흔적이 있습니다. 잘 살펴보니 벽 근처에는 칼과 망치가 자리하고 있습니다.");
                    System.out.println("1. 벽을 살펴본다. | 2. 도구들을 살펴본다.");
                    String ans4 = scanner.next();

                    if(ans4.equals("1")){
                        System.out.println("당신은 벽을 살펴봅니다. 벽에는 칼로 파낸 곳이 4군데, 망치로 두들긴 흔적이 2군데가 있습니다.");
                        System.out.println("어째선지 칼로 파낸 곳은 피가 발라져 있습니다.");
                    }else if(ans4.equals("2")){
                        System.out.println("칼과 망치가 있습니다. 칼은 녹이 슬었고, 망치는 굉장히 무거워 보입니다.");
                        if(character2[0].getDex() < 3){
                            System.out.println("당신은 칼을 들어보다가 손에서 떨어트리며 발등을 베었습니다!");
                            character2[0].setHp(character2[0].getHp() - 1);
                            if (character2[0].getHp() <= 0) {
                                System.out.println("당신은 더 이상 버티지 못했습니다. 사망하셨습니다.");
                                game = false;
                            }
                        }

                        if(character2[0].getStr() > 2){
                            System.out.println("당신은 부족한 근력으로 망치를 들기 위해 노력했습니다.");
                            System.out.println("근력이 상승했습니다.");
                            character2[0].setStr(character2[0].getStr() + 1);
                        }

                        if(character2[0].getJob().equals("공무원")){
                            System.out.println("당신은 굳이 이런 위험한 것을 만지고 싶지 않아 합니다.");
                        }

                    }else{
                        System.out.println(character2[0].getInfo());
                    }
                } else if (ans3.equals("3")) {

                    System.out.println("당신은 -남-을 살펴보기로 합니다.");
                    System.out.println("이 벽에는 무한을 의미하는 기호(∞)가 큼직하게 써있을 뿐입니다.");
                    System.out.println("기호 아래에는 무언가 써있는 것처럼 보입니다..");

                    if(character2[0].getJob().equals("학생")){

                        System.out.println("흐릿하게 -세워-라고 써있는 것이 보입니다.");

                    }else if(character2[0].equals("군인")){

                        System.out.println("당신은 직감적으로 벽에 있는 것이 8이라고 느꼈습니다.");

                    }else if(character2[0].equals("공무원")){

                        System.out.println("당신은 눈이 나빠져 써있는 것을 읽을 수 없습니다.");
                    }

                }
            }else {

                System.out.println(character2[0].getInfo());

            }
        }

    }
}
