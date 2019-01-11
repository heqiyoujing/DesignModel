package design.pattern.DaiLi代理.CGLIB;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: yiqq
 * @date: 2019/1/11
 * @description:
 */
public class MyInterceptor implements MethodInterceptor {
    private Object target;

    public MyInterceptor (Object target){
        this.target=target;
    }

    // 给目标对象创建一个代理对象
    public Object getProxyInstance() {
        Enhancer en = new Enhancer();
        en.setSuperclass(target.getClass());
        en.setCallback(this);
        return en.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] params, MethodProxy proxy) throws Throwable {
        System.err.println("=======before======");
        Object res = proxy.invokeSuper(obj, params);
        System.err.println("=======and======");
        return res;
    }
}
