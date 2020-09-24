package com.dxpzk.design.behavior.TemplateMethod;

/**
 * @author zk
 * @since 2020-08-24
 */
public class ConcreteClass extends AbstractClass {
    @Override
    public void step2() {

    }

    @Override
    public void step3() {

    }

    public static void main(String[] args) {
        AbstractClass css = new ConcreteClass();
        css.TemplateMethod();
    }
}
