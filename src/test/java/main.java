
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class main {
    public static void main(String[] args) {
        List<TestClass> l =new ArrayList<>();
        l.add(new TestClass(1,"A"));
        l.add(new TestClass(2,"B"));
        l.add(new TestClass(3,"C"));
        l.add(new TestClass(4,"D"));
        System.out.println(l.indexOf("A"));
    }
}
