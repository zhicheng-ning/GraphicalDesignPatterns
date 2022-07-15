package builder.answer2;


import java.util.Scanner;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Main
 * @author: nzcer
 * @creat: 2022/7/15 21:57
 */
public class Main {
    public static void main(String[] args) {
        usage();
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        if ("plain".equals(choice)) {
            TextBuilder textBuilder = new TextBuilder();
           Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getResult();
            System.out.println(result);
        } else if ("html".equals(choice)) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String fileName = htmlBuilder.getResult();
            System.out.println(fileName + " 文件编写完成");
        } else {
            usage();
            System.exit(0);
        }
    }
    public static void usage() {
        System.out.println("编写纯文本文档请输入： plain ");
        System.out.println("编写 HTML 文档请输入：html ");
    }
}
