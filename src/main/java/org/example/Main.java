package org.example;

import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Map<String, String> userMap = new HashMap<>();
        userMap.put("仲林圭" , "パイレーツ所属。38歳です。");
        userMap.put("本田朋弘" ,"チーム雷電所属。40歳です");
        userMap.put("鈴木たろう", "ドリブンズ所属。50歳です");
        userMap.put("瑞原明奈", "パイレーツ所属。37歳です");


        System.out.println(userMap.get("小林剛" ));
        System.out.println(userMap.get("仲林圭"));
        System.out.println(userMap.get("本田朋弘"));
        System.out.println(userMap.get("鈴木たろう"));
        System.out.println(userMap.get("瑞原明奈"));
        System.out.println(userMap.get("小林剛" ));
    }
}
