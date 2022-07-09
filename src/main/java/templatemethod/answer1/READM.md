# 习题 3-1
```text
java.io.InputStream 类使用了 Template Method 模式。请阅读官方文档（JDK 的 API 参考资料），
从中找出需要用 java.io.InputStream 的子类去实现的方法。
```

查看 java.io.InputStream 类的源码后发现其只有一个抽象方法 read()，因此子类需要实现的方法是 read() 方法。
read() 方法会被 java.io.InputStream 的模板方法 read(byte[] b, int off, int len) 循环调用。

也就是说，程序中是子类负责实现具体的“读取 1 个字节”的处理，而在 java.io.InputStream 中只定义了 “将指定数量的字节
读取到数组中的指定位置”这个模板方法。