package chapter06;

import java.util.ArrayList;

public class forTest {
    public static void main(String[] args) {
        String[] names = {"김나현", "김예진", "김재영", "김지혁", "김해민", "김호석", "도경진"};
        ArrayList<String> arrayList = new ArrayList<>();

       for(int i=0; i< names.length; i++){
           System.out.println("이름 = "+names[i]);
           //arrayList.add(names[i]);
        }

       //인헨스드 for문
        for(String name: names){ //arrayList로도 가능
            System.out.println(name);
        }
    }
}
