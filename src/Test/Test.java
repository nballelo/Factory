package Test;

import dsa.Factory;


/**
 * Created by Ignacio on 08/03/2017.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(Factory.getInstance().getComand("C1").doSomething());
        System.out.println(Factory.getInstance().getComand("C1").doSomething());
        System.out.println(Factory.getInstance().getComand("C1").doSomething());
        System.out.println(Factory.getInstance().getComand("C1").doSomething());
    }

}
