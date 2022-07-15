# 习题 7-4
```text
在示例程序中的 TextBuilder 类中，编写的文档被保存在了 buffer 字段中，但 buffer 字段并非是 String 类型的，而是
StringBuilder 类型的，请问是为什么呢？如果使用了 String 类型会有什么问题呢？
```

也可以使用 String 类型的变量作为参数，然后将 append 修改为 += 即可。
不过当需要频繁地改变和连接字符串时，使用 StringBuffer 的效率比使用 String 更高，这是因为，在使用 String 修改和连接字符串时，
每次都会生成一个新的 String 类的实例，产生额外的开销。

