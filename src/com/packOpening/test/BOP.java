package com.packOpening.test;

import java.util.Scanner;

public class BOP {
    private static final Scanner myScanner = new Scanner(System.in);

    public static void Go() {

        while (true) {

            int Legendary = 0;
            int goldenLegendary = 0;

            System.out.println("请输入你要开的卡包数量(0退出)：");


            int packNum;
            for (; ; ) {
                String str = readKeyBoard(5);
                try {
                    packNum = Integer.parseInt(str);
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("数字输入错误，请重新输入：" + "\n");
                }
            }
            if (packNum == 0) {
                break;
            }
            int cardNum = packNum * 5;


            for (int i = 0; i < cardNum; i++) {
                int count = (int) (Math.random() * 1000);

                if (count >= 1 && count <= 11) {
                    Legendary++;
                }

                if (count == 0) {
                    goldenLegendary++;
                }
            }
            System.out.println("恭喜你获得 " + Legendary + " 张传说和 " + goldenLegendary + " 张金色传说！" + "\n");

        }


    }


    private static String readKeyBoard(int limit) {
        String line = "";
        while (myScanner.hasNextLine()) {
            line = myScanner.nextLine();
            if (line.length() < 1 || line.length() > limit) {
                System.out.print("输入长度（不能大于" + limit + "）或空输入 错误，请重新输入：" + "\n");
                continue;
            }
            break;
        }
        return line;
    }
}





