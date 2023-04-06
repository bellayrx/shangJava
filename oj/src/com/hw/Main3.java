package com.hw;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static List<String[]> listBeginInit() {//26个字母
        List<String[]> arrList = new ArrayList<>();
//        arrList.add(new String[]{""});
        arrList.add(new String[]{"a", "b", "c"});
        arrList.add(new String[]{"d", "e", "f"});
        arrList.add(new String[]{"g", "h", "i"});
        arrList.add(new String[]{"j", "k", "l"});
        arrList.add(new String[]{"m", "n", "0"});
        arrList.add(new String[]{"p", "q", "r"});
        arrList.add(new String[]{"u", "v"});
        arrList.add(new String[]{"w", "x"});
        arrList.add(new String[]{"y", "z"});
        return arrList;
    }

    public static List<String> MainCreate(List<String> strings, String[] arrays) {
        List<String> return_result = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            for (int j = 0; j < arrays.length; j++) {
                return_result.add(strings.get(i) + arrays[j]);
            }
        }
        return return_result;
    }

    public static List<String> MainCreate2(List<String> strings, String[] arrays) {
        List<String> return_result = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            for (int j = 0; j < arrays.length; j++) {
                return_result.add(strings.get(i) + arrays[j]);
            }
        }
        return return_result;
    }

    public static boolean isMyResult(String string, String targetString) {
        for (int i = 0; i < targetString.length(); i++) {
            if (!string.contains(targetString.substring(i, i + 1))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();//第一行的字符串
        String string2 = scanner.nextLine();//第二行的字符串
        List<String[]> stringList = listBeginInit();
        List<String[]> string2List = new ArrayList<>();//起到索引的效果
        int string1Len = string1.length();
        for (int i = 0; i < string1Len; i++) {
            int tmp = Integer.parseInt(string1.
                    substring(i, i + 1));
            string2List.add(stringList.get(tmp));
        }
        List<String> localArrayList =
                Arrays.asList(string2List.get(0));


        List<String> strings = Arrays.asList(string2List.get(0));
        for (int i = 0; i < string2List.size(); i++) {
            localArrayList = MainCreate(strings, string2List.get(i));
        }

        List<String> wkmList = Arrays.asList(string2List.get(0));

        for (int i = 0; i < string2List.size(); i++) {
            localArrayList = MainCreate2(localArrayList, string2List.get(i));

        }

        for (String string : localArrayList) {
            char[] chars = string.toCharArray();
            StringBuilder sb = new StringBuilder();
            List<Character> set = new ArrayList();
            for (int i = 0; i < chars.length; i++) {
                if (set.contains(chars[i])) {
                    continue;
                } else {
                    set.add(chars[i]);
                }
            }
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < set.size(); i++) {
                sb2.append(set.get(i));
            }
            if (isMyResult(sb2.toString(), string2)) {
                System.out.print(string + ",");
            }

        }


    }
}
