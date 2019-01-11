package design.pattern.DaiLi代理.CGLIB;

/**
 * @author: yiqq
 * @date: 2019/1/11
 * @description:
 */
public class proxyTest {
    public static void main(String[] args) {
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(MyTarget.class);
//        enhancer.setCallback(new MyInterceptor());
//        MyTarget target = (MyTarget) enhancer.create();

        MyTarget target = new MyTarget();
        MyInterceptor interceptor = new MyInterceptor(target);
        target = (MyTarget)interceptor.getProxyInstance();
        target.printName();
        System.out.println("proxy class name:" + target.getClass().getName());
    }
}
