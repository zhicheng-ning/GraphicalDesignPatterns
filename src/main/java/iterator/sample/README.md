# Iterator 模式中的登场角色
```text
1、Iterator（迭代器）
该角色负责定义按顺序逐个遍历元素的接口（API）。在本例中，由 Iterator 接口扮演这个角色，它
定义了 hasNext 和 next 两个方法。其中，hasNext 方法用于判断是否存在下一个元素，next 方
法用于获取该元素

2、ConcreteIterator（具体的迭代器）
该角色负责实现 Iterator 角色所定义的接口（API）。在本例中，由 BookShelfIterator 类扮演
这个角色。该角色中包含了遍历集合所必需的信息。在本例中，BookShelf 类的实例保存在 bookShelf
这个字段中，被指向的书的下标保存在 index 字段中。

3、Aggregate（集合）
该角色负责定义创建 Iterator 角色的接口（API）。这个接口（API）是一个方法，会创建出“按顺序
访问保存在我内部元素的人“。在本例中，由 Aggregate 接口扮演这个角色，它里面的另一了 iterator方法

4、ConcreteAggregate（具体的集合）
该角色负责实现 Aggregate 角色所定义的接口（API)。它会创建出具体的 Iterator 角色，即 ConcreteIterator
角色。在本例中，由 BookShelf 类扮演这个角色，它实现了 iterator 方法。
```

# 扩展思路的要点

- 不管实现如何变化，都可以使用 Iterator

或许我们会有疑问，为什么要考虑引入 Iterator 这种复杂的设计模式？如果是数组，直接使用 for 循环
进行遍历处理不就可以了吗？为什么要在集合之外引入 Iterator 这个角色呢？
**一个重要的理由是，引入 Iterator 后可以将遍历与实现分离开**。请看下面的代码
```text
while (it.hasNext()) {
    Book book = (Book) it.next();
    System.out.println(book)
}
```
这里只使用了 Iterator 的 hasNext 方法和 next 方法，并没有调用 BookShelf 的方法，也就是说
**这里的 While 循环并不依赖于 BookShelf 的实现**。那这有什么好处呢？打个比方，如果编写 BookShelf
的开发人员决定放弃用数组来管理书本，而是用 java.util.ArrayList 取而代之，那么不管 BookShelf 如何
变化，只要 BookShelf 的 iterator 方法能够正确地返回 Iterator 的实例（也就是说，返回的 Iterator
实例没有问题，hasNext 和 next 方法都能正常工作），即使不对上面的 while 循环做任何修改，代码都可以正常
工作。**设计模式的作用就是帮助我们编写可复用的类。所谓“可复用”，就是指将类实现为“组件”，当一个组件发送改变
时，不需要对其他的组件进行修改或是只需要很小的修改即可应对。**

- 难以理解抽象类和接口

难以理解抽象类和接口的人尝尝使用 ConcreteAggregate 角色和 ConcreteIterator 角色编程，而不使用
Aggregate 接口和 Iterator 接口，他们总想用具体的类来解决所有的问题（说的就是以前的我hhh）。但是
如果只使用具体的类来解决问题，很容易导致类之间的强耦合，这些类；也难以作为组件再次利用。为了弱化类之间
的耦合。我们需要引入抽象类和接口。**这也是贯穿所有设计模式的思想，请牢记“不要使用具体类来编程，要优先使用
抽象类和接口来编程”**

- 容易弄错“下一个”和“最后一个”

需要谨记，在 Iterator 模式的实现中，next 方法是“返回当前的元素，并指向下一个元素”，hasNext 方法是
“确认接下来是否可以调用 next 方法”。

- 多个 iterator

“将遍历功能置于 Aggregate 角色之外”是 Iterator 模式的一个特征。根据这个特征，可以针对一个 ConcreteAggregate
角色编写多个 ConcreteIterator 角色。本例中的 ConcreteIterator 是 BookShelfIterator，它只是简单地从前往后
遍历，其实可以编写其他的 ConcreteIterator 来实现不同的遍历方式。

- 不需要 deleteIterator

在 Java 中，没有被使用的对象实例将会自动被删除（垃圾回收，GC）。因此，在 iterator 中不需要与其对应的
deleteIterator 方法。

# 相关的设计模式

- Visitor 模式

Iterator 模式是从集合中一个一个取出元素进行遍历，但是并没有在 Iterator 接口中声明对取出的元素进行何种
处理。 Visitor 模式则是在遍历集合的过程中，对元素进行相同的处理。在遍历集合的过程中，对元素进行固定的处理
是常有的需求。Visitor 模式正是为了应对这种需求而出现的。在访问元素集合的过程中对元素进行相同的处理，这种
模式就是 Visitor 模式

- Composite 模式

Compsite 模式是具有递归结构的模式，在其中使用 Iterator 模式比较困难

- Factory Method 模式

在 iterator 方法中生成 Iterator 的实例时可能会用到 Factory Method 模式
