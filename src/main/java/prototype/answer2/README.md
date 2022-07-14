# 习题 6-2
```text
在 java.lang.Object 中定义了 clone 方法，那么请问 java.lang.Object 类实现了 java.lang.Cloneable 接口了吗？
```

没有实现，假如 Object 类实现了 Cloneable 接口，那么无论哪个类的实例调用 clone 方法，都不会抛出 CloneNotSupportException 异常了，
显然这是不可能的。