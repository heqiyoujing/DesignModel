package design.pattern.Factory工厂.Abstract;

/**
 * @author: yiqq
 * @date: 2019/1/10
 * @description:
 */
public class SmsSender implements Sender{
    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}
