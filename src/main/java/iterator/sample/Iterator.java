package iterator.sample;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Iterator
 * @author: nzcer
 * @creat: 2022/6/26 11:50
 * @description：Iterator 接口用于遍历集合中的元素，其作用相当于循环语句中的循环变量，下面定义的是一个最简单的 Itetator 接口
 */
public interface Iterator {
    /**
     * 是否存在下一个元素
     * @return
     */
    boolean hasNext();

    /**
     * 获取下一个元素，为了能够在下次调用 next 方法时正确地返回下一个元素，该方法中还隐含着将迭代器移动至下一个元素的处理。
     * 说“隐含”，是因为 Iterator 接口只知道方法名。想要知道 next 方法中到底进行了什么样的处理，还需要看一下实现了 Iterator
     * 接口的类（本例中就是 BookShelfIterator）
     * @return
     */
    Object next();
}
