package singleton.answer3;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Singleton
 * @author: nzcer
 * @creat: 2022/7/12 8:42
 */
public class Singleton {
    private static Singleton singleton = null;
    private Singleton() {
        System.out.println("生成了一个实例");
    }

    // 线程不安全的形式
    //public static Singleton getInstance() {
    //    if (singleton == null) {
    //        singleton = new Singleton();
    //    }
    //    return singleton;
    //}

    //线程安全的形式
    public synchronized static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
