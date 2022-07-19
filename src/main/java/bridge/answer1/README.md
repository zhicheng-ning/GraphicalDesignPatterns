# 习题 9-1
```text
请在本章的示例程序中增加一个类，实现 “显示字符串若干（随机）次”的功能。请注意此时应当扩展（继承）哪个类。
提示：用于显示的方法是 void randDisplay(int times)，它的作用是将字符串随机显示 0~times次
```

这里应该在 “类的功能层次结构” 中增加类。我们可以直接让 RandomDisplay 类继承 Display 类也可以，不过这里我们让它继承 
CountDisplay 类。