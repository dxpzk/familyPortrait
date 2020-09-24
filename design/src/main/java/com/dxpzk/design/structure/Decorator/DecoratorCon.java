package com.dxpzk.design.structure.Decorator;

/**
 * @author zk
 * @since 2020-08-21
 * 具体装饰（ConcreteDecorator）角色
 */
public class DecoratorCon extends Decorator{
    public DecoratorCon(Human human) {
        super(human);
    }

    public void before(){
        System.out.println("拖衣服");
    }

    public void after(){
        System.out.println("打呼噜");
    }

    public void doSomething(){
        before();
        super.doSoimething();
        after();
    }

    public static void main(String[] args) {
        Human human = new Person();
        DecoratorCon decoratorCon = new DecoratorCon(human);
    }
}

