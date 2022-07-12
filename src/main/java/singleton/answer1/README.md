# 习题 5-1
```text
在下面的 TicketMaker 类中，每次调用 getNextTicketNumber 方法都会返回 1000,1001,1002...的数列。
我们可以用它生成票的编号或是其他序列号。在该类的实现方式下，我们可以生成多个该类的实例。请修改代码，运行 Singleton
模式确保只能生成一个该类的实例。
    public class TicketMaker {
        private int ticket = 1000;
        public int getNextTicketNumber() {
            return ticket++;
        }
    }
```

