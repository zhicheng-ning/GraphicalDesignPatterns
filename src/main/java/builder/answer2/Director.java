package builder.answer2;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Director
 * @author: nzcer
 * @creat: 2022/7/15 21:57
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        //builder.makeTitle("Greeting");
        builder.makeString("从早上至下午");
        builder.makeTitle("Greeting");
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
