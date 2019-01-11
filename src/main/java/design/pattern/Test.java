package design.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: yiqq
 * @date: 2019/1/7
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        method(a, b);
        System.out.println("a***"+a);
        System.out.println("b***"+b);
    }
    public static void method(int a,int b) {
        a = a*100;
        b = b*100;
        System.out.println("a***"+a);
        System.out.println("b***"+b);
        System.exit(0);//退出虚拟机
    }

}
