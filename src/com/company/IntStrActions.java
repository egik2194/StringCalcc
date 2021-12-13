package com.company;

public class IntStrActions {
    public static String maindo (String res, String oper, int num){
        switch (oper) {
            case "*":
                String R = res.repeat(num);
                if (R.length() <= 40) return R;
                else return R.substring(0,40) + "...";
            case "/":
                int resb = res.length() / num;
                if (res.length() == num) {
                    String a = res.substring(0, 1);
                    return a;
                } else if (res.length() > num) {
                    String s = res.substring(0, resb);
                    return s;
                } else {
                    System.out.println("Делимое меньше делителя");
                    break;
                }
        }
        return res;
    }
}