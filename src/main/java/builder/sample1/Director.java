package builder.sample1;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Director
 * @author: nzcer
 * @creat: 2022/7/14 20:21
 */
public class Director {
    private Builder builder;

    /**
     * 因为接受的参数是 Builder 类的子类，所以可以将其保存在 builder 字段中
     * @param builder
     */
    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("从早上至下午");
        builder.makeItems(new String[]{
                "早上好",
                "下午好。"
        });
        builder.makeString("晚上");
        builder.makeItems(new String[]{
                "晚上好。",
                "晚安。",
                "再见。"
        });
        builder.close();
    }
}
