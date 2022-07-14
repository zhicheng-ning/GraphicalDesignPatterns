# 习题 6-1
```text
在示例程序中，MessageBox 类和 UnderlinePen 类中的 createClone 方法的处理完全相同。
从管理的角度来讲，在一个程序的多个地方出现完全相同的方法不太好，因此我们想让两个类共用该方法，请问应该如何做呢？
```

如果想要两个类共用某一个方法，我们首先会想到通过继承来实现共用方法。因此有以下两种方法。

- 将 Product 街交口修改为 Product 抽象类，在 Product 类中实现 createClone 方法（Template Method 模式）
- 定义一个 ConcreteProduct 类作为 UnderlinePen 类和 MessageBox 类的父类，让 ConcreteProduct 类实现 Product 接口，并实现 createClone 方法。