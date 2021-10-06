package demo;

import java.util.ArrayList;
import java.util.List;

public class ListSize {
    public static void method1(List<Object> list) {
        System.out.println(list.size());
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("z");
        ListSize.method1(list);
    }
}

