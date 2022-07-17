package abstractfactory.sample1;

import abstractfactory.sample1.factory.Factory;
import abstractfactory.sample1.factory.Link;
import abstractfactory.sample1.factory.Page;
import abstractfactory.sample1.factory.Tray;

import java.util.Scanner;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Main
 * @author: nzcer
 * @creat: 2022/7/16 14:25
 */
public class Main {
    public static void main(String[] args) {
        usage();
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        Factory factory = Factory.getFactory(choice);
        Link people = factory.createLink("人民日报", "http://www.people.com.cn/");
        Link gmw = factory.createLink("光明日报", "http://www.gmw.cn/");

        Link us_yahoo = factory.createLink("Yahoo！", "http://www.yahoo.com/");
        Link jp_yahoo = factory.createLink("Yahoo！Japan", "http://www.yahoo.co.jp");
        Link baidu = factory.createLink("Baidu", "http://www.baidu.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");

        Tray trayNews = factory.createTray("日报");
        trayNews.add(people);
        trayNews.add(gmw);

        Tray trayYahoo = factory.createTray("Yahoo！");
        trayYahoo.add(us_yahoo);
        trayYahoo.add(jp_yahoo);

        Tray traySearch = factory.createTray("搜索引擎");
        traySearch.add(trayYahoo);
        traySearch.add(baidu);
        traySearch.add(google);

        Page page = factory.createPage("LinkPage", "逝不等琴生");
        page.add(trayNews);
        page.add(traySearch);
        page.output();
    }

    public static void usage() {
        System.out.println("Usage：input class.name.of.ConcreteFactory");
        System.out.println("Example 1：abstractfactory.sample1.listfactory.ListFactory");
        System.out.println("Example 2：abstractfactory.sample1.tablefactory.TableFactory");
    }
}
