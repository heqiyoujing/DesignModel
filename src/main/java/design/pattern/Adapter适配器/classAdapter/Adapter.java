package design.pattern.Adapter适配器.classAdapter;

/**
 * @author: yiqq
 * @date: 2019/1/11
 * @description:
 */
public class Adapter  extends Source implements Targetable{
    @Override
    public void method2() {
        System.out.println("This is the targetable method...");
    }
}
