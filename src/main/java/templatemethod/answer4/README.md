# 习题 3-4
```text
Java 中的接口和抽象类很相似。接口同样也是抽象方法的集合，但是在 Template Method 模式中，我们却
无法使用接口来扮演 AbstractClass 角色，请问这是为什么呢？
```
**因为 AbstractClass 角色中的模板方法不能是抽象的，它需要来实现处理的流程。在抽象类中可以实现一部分方法
(例如 AbstractDisplay 类中的 display 方法)，但是在接口中是无法实现方法的**。因此，在 TemplateMethod 模式中，无法接口替代抽象类。