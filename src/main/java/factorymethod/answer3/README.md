# 习题 4-3
```text
为了强制调用方向 Product 类的子类的构造函数中传入“产品名字”作为参数，我们采用了如下的定义方式。
但是在编译代码时却出现了编译错误，请问这是为什么呢？

    public  abstract class Product{
        public abstract Product(String name);
        public abstract void Use();
    }
```

这是因为在 Java 中**无法定义 abstract 的构造函数**。在 Java 中，构造函数是不会被继承的，因此定义 abstract 的
构造函数没有任何意义。