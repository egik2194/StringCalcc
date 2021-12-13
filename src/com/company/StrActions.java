package com.company;

import com.company.Main;
public class StrActions {
    public static String maindo2 (String s1, String oper, String s2){
        switch (oper) {
            case "+": {
                String q = s1 + s2;
                return q;
            }
            case "-": {
                int ar = s1.indexOf(s2);
                if (ar != -1) {
                    if (s1.length() == s2.length()) {
                        String w = "0";
                        return w;
                    } else {
                        String c = s1.substring(0, s1.indexOf(s2)) + s1.substring(s1.indexOf(s2) + s2.length());
                        return c;
                    }
                } else {
                    return s1;
                }
            }
        }
        return s1;
    }}

