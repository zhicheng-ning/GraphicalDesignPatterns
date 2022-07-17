# 习题 8-3
```text
ListLink 类的构造函数如下所示
    public ListLink(String caption, String url) {
        super(caption, url);
    }
也就是说，它只是调用了父类的构造函数。如果不需要其他处理，为什么还要特意定义 ListLink 类的构造函数呢？
```

这是因为在 Java 中无法继承构造函数。
即使在父类中有 `Link（String caption, String url）` 的构造函数，如果在 ListLink 类中不定义 `ListLink（String caption, 
String url）` 构造函数，就无法像下面这样生成实例，还会在编译代码时出错。
`new ListLink("Yahoo！"，"http://www.yahoo.com/")`

