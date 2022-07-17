# 习题 8-2
```text
请在示例程序的 Factory 类中定义一个 “生成只含有雅虎网站（http://www.yahoo.com）超链接的 HTML 页面的具体方法”。
    public Page createYahooPage();
请把页面的作者和标题都设置为 "Yahoo！"。这时，具体工厂类和具体零件类又需要如何修改呢？ 
```
只需要修改 Factory 类即可。

```java
public abstract class Factory {
    public static Factory getFactory(String className) {
        Factory factory;
        try {
            factory = (Factory) Class.forName(className).newInstance();
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
    // 添加如下的代码
    public Page createYahooPage(String title, String author) {
        Link link = createLink("Yahoo！", "http://www.yahoo.com/");
        Page page = createPage("Yahoo！", "Yahoo！");
        page.add(link);
        return page;
    }
}
```