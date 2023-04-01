package org.study.oj;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

//静态扫描
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer baogaoMoney = Integer.parseInt(sc.nextLine());//01
        Integer[] fileBiaoshi = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).toArray(Integer[]::new);
        Integer[] fileAndSize = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).toArray(Integer[]::new);
        System.out.println(getResult(baogaoMoney, fileBiaoshi, fileAndSize));
    }

    public static int getResult(Integer baogaoMoney,
                                Integer[] fileBiaoshi,
                                Integer[] fileAndSize) {
        HashMap<Integer, Integer> allNumberCount = new HashMap<>();
        HashMap<Integer, Integer> allSizeCount = new HashMap<>();
        for (int i = 0; i < fileBiaoshi.length; i++) {
            Integer tmp = fileBiaoshi[i];
            if (allSizeCount.containsKey(tmp)) {
                int x = allNumberCount.get(tmp) + 1;
                allNumberCount.put(tmp, x);
            } else {
                allNumberCount.put(tmp, 1);
            }
            // allNumberCount.put(tmp, allSizeCount.getOrDefault(tmp, 0) + 1);
            allSizeCount.putIfAbsent(tmp, fileAndSize[i]);
        }
        int lastNum = 0;
        for (Integer tmp : allNumberCount.keySet()) {
            lastNum += Math.min(allNumberCount.get(tmp) * allSizeCount.get(tmp),
                    allSizeCount.get(tmp) + baogaoMoney);
        }
        return lastNum;
    }
}