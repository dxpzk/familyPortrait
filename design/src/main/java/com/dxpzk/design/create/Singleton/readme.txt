单例模式
避免序列化与反序列化

枚举类不能被反序列化，原因是其没有构造方法

实际使用中使用反射需要实现单例
private Object readResolve(){
    return instance;
}