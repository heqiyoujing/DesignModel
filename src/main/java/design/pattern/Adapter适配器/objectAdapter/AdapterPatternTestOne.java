package design.pattern.Adapter适配器.objectAdapter;

/**
 * @author: yiqq
 * @date: 2019/1/11
 * @description:
 */
public class AdapterPatternTestOne {
    public static void main(String[] args) {
        Source source = new Source();
        Targetable targetable = new Wrapper(source);
        targetable.method1();
        targetable.method2();
    }
}
