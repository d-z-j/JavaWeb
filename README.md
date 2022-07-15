# JavaWeb

2022.6.30开始

mac进入mysql命令行：打开终端，输入 &nbsp;&nbsp; /usr/local/MySQL/bin/mysql -u root -p &nbsp;&nbsp;&nbsp; 回车，输入密码之后即可。

mac 终端运行jar文件：选择存放jar包的文件夹，右键 -> 新建位于文件夹位置的终端窗口 -> java -jar xxx.jar

Tomcat10以后，要将Maven配置文件（pom.xml）中的依赖名字修改，修改为：

        <dependency>
            <groupId>jakarta.servlet</groupId>
            <artifactId>jakarta.servlet-api</artifactId>
            <version>5.0.0</version>
            <scope>provided</scope>
        </dependency>

网页模版：https://sc.chinaz.com/moban/

图标库：https://iconpark.oceanengine.com/official
