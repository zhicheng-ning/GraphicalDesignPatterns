package singleton.sample1;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Main
 * @author: nzcer
 * @creat: 2022/7/11 21:19
 */
public class Main {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        String res = instance1 == instance2 ? "instance1 与 instance2 是同一个对象" : "instance1 与 instance2 不是同一个对象";
        System.out.println(res);
    }
}
