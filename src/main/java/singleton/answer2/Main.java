package singleton.answer2;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Main
 * @author: nzcer
 * @creat: 2022/7/11 22:35
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            System.out.println(Triple.getInstance(i % 3));
        }
    }
}
