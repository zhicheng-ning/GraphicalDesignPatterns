package adapter.sample1;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Banner
 * @author: nzcer
 * @creat: 2022/6/26 17:12
 */
public class Banner {
    private String slogan;

    public Banner(String slogan) {
        this.slogan = slogan;
    }

    public void showWithParen() {
        System.out.println("(" + slogan + ")");
    }

    public void showWithAster() {
        System.out.println("*" + slogan + "*");
    }
}
