适配器模式
    将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作

角色
    目标（Target）接口：当前系统业务所期待的接口，它可以是抽象类或接口。
    适配者（Adaptee）类：它是被访问和适配的现存组件库中的组件接口。
    适配器（Adapter）类：它是一个转换器，通过继承或引用适配者的对象，把适配者接口转换成目标接口，让客户按目标接口的格式访问适配者。


分类
    类适配器：
        Adapter需要继承Adaptee类，
        Target必须是接口，
        且Adaptee类的方法在Adapter中都会暴露出来，
        由于其继承了Adaptee类，所以它可以根据需求重写Adaptee类的方法，使得Adapter的灵活性增强了

    对象适配器：
        Adapter持有Adaptee对象

    接口适配器：
        Target必须是抽象类
        Target需要实现Adaptee的方法
        Adapter继承Target，重写需要的方法

