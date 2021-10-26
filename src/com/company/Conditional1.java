package com.company;

public class Conditional1 {
    public static boolean chimpTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }

    public static boolean negPos(int x, int y, boolean negative) {
        if (negative == true) {
            if (x < 0 && y < 0) {
                return true;
            } else {
                return false;
            }
        } else {
            if (x < 0 && y >= 0) {
                return true;
            } else if (x >= 0 && y < 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep == true) {
            return false;
        } else if
             (isMom == true) {
                return true;
            } else if
                (isMorning == true) {
                    return false;
            } else {
            return true;
        }
    }

    public static String setAlarm(int day, boolean vacation){
        if(vacation==true){
            if(day < 6 && day > 0) {
                return ("10:00");
            } else {
                    return ("off");
                }
        }else {
            if (day < 6 && day > 0) {
                return ("7:00");
            } else {
                    return ("10:00");
                }

            }
    }

    public static boolean onesDigitSame(int a, int b, int c){
       int rightA = a % 10;
       int rightB = b % 10;
       int rightC = c % 10;
            if(rightA==rightB){
                return true;
            }else if
                (rightB==rightC){
                return true;
            }else if
                (rightA==rightC){
                return true;
            } else{
                return false;
       }
    }

    public static int blackjack(int a, int b){
        if(a>21 && b<21) {
            return b;
        }
        if (b>21 && a<21) {
            return a;
        }
        if(a>21 && b>21){
            return 0;
        }
        if(a>=b){
            return a;
            } else{
                return b;
            }
    }

    public static void main(String[] args) {
        System.out.println(chimpTrouble(true, true));
        System.out.println(chimpTrouble(false, false));
        System.out.println(chimpTrouble(true, false));
        System.out.println(chimpTrouble(false, true));

        System.out.println(" ");

        System.out.println(negPos(1, -1, false));
        System.out.println(negPos(-1, 1, false));
        System.out.println(negPos(1, 1, false));
        System.out.println(negPos(-1, -1, false));
        System.out.println(negPos(-4, -5, true));
        System.out.println(negPos(-4, 5, true));
        System.out.println(negPos(4, 5, true));
        System.out.println(negPos(4, -5, true));

        System.out.println(" ");

        System.out.println(pickUpPhone (false, false, true));
        System.out.println(pickUpPhone (true, true, true));
        System.out.println(pickUpPhone (true, true, false));
        System.out.println(pickUpPhone (false, true, false));
        System.out.println(pickUpPhone (true, false, false));
        System.out.println(pickUpPhone (false, false, false));

        System.out.println(" ");

        System.out.println(setAlarm(1, false));
        System.out.println(setAlarm(5, false));
        System.out.println(setAlarm(0, false));
        System.out.println(setAlarm(2, true));
        System.out.println(setAlarm(4, true));
        System.out.println(setAlarm(6, true));

        System.out.println(" ");

        System.out.println(onesDigitSame(23, 19, 13));
        System.out.println(onesDigitSame(23, 19, 12));
        System.out.println(onesDigitSame(23, 19, 3));
        System.out.println(onesDigitSame(423, 13, 3));
        System.out.println(onesDigitSame(23, 29, 25));

        System.out.println(blackjack(19, 21));
        System.out.println(blackjack(21, 19));
        System.out.println(blackjack(19, 22));
        System.out.println(blackjack(8, 8));
        System.out.println(blackjack(25, 24));
    }
}
/*
true
true
false
false

true
true
false
false
true
false
false
false

false
false
true
true
false
true

7:00
7:00
10:00
10:00
10:00
off

true
false
true
true
false
21
21
19
8
0
 */