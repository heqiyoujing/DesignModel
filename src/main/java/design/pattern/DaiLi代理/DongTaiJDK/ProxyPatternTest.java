package design.pattern.DaiLi代理.DongTaiJDK;

import java.lang.reflect.Proxy;

/**
 * @author: yiqq
 * @date: 2019/1/10
 * @description:
 */

/**
 * 创建动态代理对象的步骤：
 1. 指明一系列的接口来创建一个代理对象
 2. 创建一个调用处理器（InvocationHandler）对象
 3. 将这个代理指定为某个其他对象的代理对象
 4. 在调用处理器的invoke（）方法中采取代理，一方面将调用传递给真实对象，另一方面执行各种需要的操作
 */
public class ProxyPatternTest {
    public static void main(String[] args) {
        IService service = new Service();
        Class<? extends IService> clazz = service.getClass();

        IService proxyService = (IService) Proxy.newProxyInstance(clazz.getClassLoader(),
                clazz.getInterfaces(), new ServiceInvocationHandler(service));
        proxyService.service();
    }
}
