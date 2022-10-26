package test;

import java.util.ArrayList;
import java.util.HashMap;

public class run {
    public static void main(String[] args) {
    ArrayList<HashMap<String,String>> a=new ArrayList<>();
    HashMap<String,String> b =new HashMap<>();
    b.put("key","1234");
    a.add(b);
        System.out.println(a);
    }
}
