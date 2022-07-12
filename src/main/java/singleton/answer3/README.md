# 习题 5-3
```text
某位开发人员编写了如下的 Singleton 类，但这并非严格的 Singleton 模式，请问是为什么呢？

    public class Singleton {
        private static Singleton singleton = null;
        private Singleton() {
            System.out.println("生成了一个实例");
        }
        public static Singleton getInstance() {
            if (singleton == null) {
                singleton = new Singleton();
            }
            return singleton;
        }
    }
```

解答：
```text
在上面代码中，如下条件判断是线程不安全的
    if(singleton == null) {
        singleton = new Singleton()
    }
在使用 singleton == null 判断第一个实例是否为 null 后，执行了下面的语句。
    singleton = new Singleton()
但是，在赋值之前，其他线程可能会进入 singleton == null 判断。
因此，严格的 Singleton 模式，应该在定义 getInstance 方法为 synchronized 。
```
