# 习题 4-1
```text
在示例程序中，IDCard 类的构造函数并不是 public，请问这是想表达什么意思呢？
public class IDCard extends Product {
    ...
    IDCard(String owner) {
        ...
        this.owner = owner
    }
    ...
}
```

IDCard 类的构造方法修饰符使用 default 而不是 public，这样的话，idcard 包外的类就无法 new 出 IDCard 类的实例。
这样就可以强迫外部必须通过 IDCardFactory 来生成 IDCard 的实例。

例如，在 Main 类（没有在 idcard 包 中）中，是无法像下面这样生成 IDCard 的实例的。在编译时，这行代码就会报错。
`IDCard idcard = new IDCard("小明")`

