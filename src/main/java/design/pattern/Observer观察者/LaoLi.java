package design.pattern.Observer观察者;

/**
 * @author: yiqq
 * @date: 2019/1/11
 * @description:
 */
public class LaoLi implements Person {

    private String name = "老李";

    public LaoLi() {
    }

    @Override
    public void getMessage(String s) {
        System.out.println(name + "接到了小美打过来的电话，电话内容是：->" + s);
    }

}
