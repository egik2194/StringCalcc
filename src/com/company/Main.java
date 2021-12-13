package com.company;

import java.util.Scanner;
import com.company.Check;
import com.company.StrActions;
import com.company.IntStrActions;

public class Main{

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String it = sc.nextLine(), s1 = "", oper = "", s2 = "";
        int KolichestvoKavichek = 0;
        boolean AllIsOk = true;
        if (it.charAt(0) != '\"') {
            System.out.println("throws Exception: Первая - не строка");
            AllIsOk = false;
        } else {
            KolichestvoKavichek = it.length() - it.replace("\"", "").length();
            if (KolichestvoKavichek == 2) {//если 2 кавычки то одно - число
                String bezPervoyKavichki = it.substring(1, it.length() - 1);
                s1 = bezPervoyKavichki.substring(0, bezPervoyKavichki.indexOf("\""));

                String bezVtoroyKavichki = bezPervoyKavichki.substring(bezPervoyKavichki.indexOf("\"") + 1);
                oper = bezVtoroyKavichki.substring(1, 2);

                s2 = bezVtoroyKavichki.substring(3) + it.substring(it.length() - 1);

            } else if (KolichestvoKavichek == 4) {
                String bezPervoyKavichki = it.substring(1, it.length() - 1);
                s1 = bezPervoyKavichki.substring(0, bezPervoyKavichki.indexOf("\""));

                String bezVtoroyKavichki = bezPervoyKavichki.substring(bezPervoyKavichki.indexOf("\"") + 1);
                oper = bezVtoroyKavichki.substring(1, 2);

                s2 = bezVtoroyKavichki.substring(bezVtoroyKavichki.indexOf("\"") + 1);
            } else{
                System.out.println("throws Exception: Неверное количество строк");
                AllIsOk = false;
            }
        }

        int num = 5;

        if (KolichestvoKavichek == 2)
            num = Integer.parseInt(s2);

        if ((s1.length() > 10 || s2.length() > 10 || num < 1 || num > 10) && (AllIsOk)){
            System.out.println("throws Exception: Данные слишком велики");
            AllIsOk = false;
        }
        if (AllIsOk) {
            if (KolichestvoKavichek == 2) System.out.println(IntStrActions.maindo(s1,oper,Integer.parseInt(s2)));
            else
                System.out.println(StrActions.maindo2(s1,oper,s2));
           /* System.out.println("Oper = " + oper);
            if (oper == "+" || oper == "-"){ System.out.println(StrActions.maindo2(s1,oper,s2));}
            else if (KolichestvoKavichek == 2){ System.out.println(IntStrActions.maindo(s1,oper,Integer.parseInt(s2)));
        }*/}
    }
}

//if (Invalid) System.out.println("throws Exception: invalid input");}}
//Tests:
//2 + "d hd"
//"ed r" + "W grtW"
//" A " * 4
//"5 2" + "100"

//if res.len > 40 -> res[0:40]+"..."