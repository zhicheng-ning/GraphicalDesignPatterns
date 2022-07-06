# 习题 2-2
```text
在 java.util.Properties 类中，可以像下面这样管理键值对（属性）。
    year = 2004
    month = 4
    day = 21
java.util.Properties 类提供了以下方法，可以帮助我们方便地从流中取出属性或将属性写入流中。
    void load(InputStream in) throws IOException
    从 InputStream 中取出属性集合
    void store(OutputStream out, String header) throws IOException
    向 OutputStream 写入属性集合。header 是注释文字

请使用 Adapter 模式编写一个将属性集合保存至文件中的 FileProperties 类。
这里，我们假设FileIo 接口（Target 角色）中声明了将属性集合保存至文件的方法，并假设 FileProperties 类会实现这个 
FileIo 接口。输入文件 file.txt 以及输出文件 newfile.txt 中以 # 开始的内容是 java.util.Properties 类自动附加的注释文字。

当 FileProperties 类编写完成后，即使 FileProperties 类不了解 java.util.Properties 类的方法，只要
知道 FileIo 接口的方法也可以对属性进行处理。还是以本章开头的电源例子来说，java.util.Properties 类相当于
100 伏特交流电压，FileIO 接口相当于所需要的直流 12 伏特电源，而 FileProperties 类则相当于适配器。
```

经常用 Properties 来读取配置文件以及读取配置项