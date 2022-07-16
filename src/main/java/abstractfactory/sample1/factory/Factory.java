package abstractfactory.sample1.factory;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Factory
 * @author: nzcer
 * @creat: 2022/7/16 15:06
 */
public abstract class Factory {
    /**
     * getFactory 方法通过调用 Class 类的 forName 方法来动态地读取类信息，接着
     * 使用 newInstance 方法生成该类的实例，并将其作为返回值返回给调用者。需要注意的是
     * 虽然 getFactory 方法的生成的是具体工厂的实例，但是返回值的类型是抽象工厂类型。
     */
    public static Factory getFactory(String className) {
        Factory factory;
        try {
            factory = (Factory)Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            System.err.println("没有找到 " + className + " 类");
            throw new RuntimeException(e);
        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);
}
