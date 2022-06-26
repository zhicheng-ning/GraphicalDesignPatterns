package iterator.sample;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Aggregate
 * @author: nzcer
 * @creat: 2022/6/26 11:49
 * @description: Aggregate 接口时所要遍历的集合的接口。实现了该接口的类将成为
 * 一个可以保存多个元素的集合，就像数组一样。Aggregate 有”使聚合“，”集合“的意思
 */
public interface Aggregate {
    Iterator iterator();
}
