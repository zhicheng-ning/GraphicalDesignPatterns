# 习题 2-1
```text
在示例程序中生成 PrintBanner 类的实例时，我们采用了如下方法，即使用 Print 类型的变量来保存 PrintBanner 实例。
    Print p = new PrintBanner("Hello");
请问我们为什么不像下面这样使用 PrintBanner 类型的变量来保存 PrintBanner 的实例呢？
    PrintBanner p = new PrintBanner("Hello")
```

因为这里是想强调 “只使用了 Print 接口的方法”。虽然在本例中，PrintBanner 类和 Print 接口对外提供的
方法是相同的，但是在实际情况下， PrintBanner 类中的方法可能会比 Print 接口中的方法多得多。通过将对象
保存在 Print 类型的变量中并使用该变量，可以明确地表明**程序的意图**，即 **“并不是使用 PrintBanner 类中的方法
，而是使用 Print 接口中的方法”**。

补充：即使将对象保存在 Print 类型的变量中，如果对象的实际类型是 PrintBanner 类型，那么依然可以使用下面
的这种类型转换来调用 PrintBanner 类中独有的方法。
```text
(PrintBanner p).methodWhichExistsOnlyInPrintBanner(); 
```
但是需要注意，如果变量 p 保存的不是 PrintBanner 类以及它的子类，那么程序会在运行时出错（抛出 java.
lang.ClassCastException异常）