package singleton.sample1;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Singleton
 * @author: nzcer
 * @creat: 2022/7/11 21:13
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("生成了一个实例");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
