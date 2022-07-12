package singleton.answer3;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Main
 * @author: nzcer
 * @creat: 2022/7/12 8:42
 */
public class Main extends Thread{
    public static void main(String[] args) {
        System.out.println("Start");
        new Main("A").start();
        new Main("B").start();
        new Main("C").start();
        System.out.println("end");
        // 线程不安全的时候，多个线程调用 Singleton.getInstance() 可能会生成多个实例
        //Start
        //生成了一个实例
        //end
        //生成了一个实例
        //生成了一个实例
        //B: obj = singleton.answer3.Singleton@517f906c
        //C: obj = singleton.answer3.Singleton@8dde312
        //A: obj = singleton.answer3.Singleton@61b96f1a
    }

    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance();
        System.out.println(getName() + ": obj = " + singleton);
    }

    public Main(String name) {
        super(name);
    }

}
