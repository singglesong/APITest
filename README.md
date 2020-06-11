# APITest
接口测试

#### mybatis 自动生成代码
- resources目录下修改 generatorConfig.xml 文件
- 在idea的右侧栏点击Maven,选中添加的Mybatis-generator插件并运行









#### testng 使用testng.xml
- mvn clean test -Dsurefire.suiteXmlFiles=src/test/java/testSuit/testng.xml






#### allure

1. 安装 brew install allure (mac 环境)

2. 安装 npm install allure (node 环境)

3. 参见https://www.cnblogs.com/wsy1103/p/10530397.html  （windows环境）

3. 通过allure --version  查看是否安装成功

##### java 用例中的注释
- @Epic
敏捷的术语，定义史诗，可以理解为一级标题，往下再分Feature和Story。
- @Feature
敏捷的术语，定义功能模块，可以理解为二级标题，往下是Story。
- @Story
敏捷的术语，定义用户故事。可以理解为三级标题
- @Title(当前版本不支持)
定义用例名称。
- @Description
定义用例描述。
- @Issue
定义缺陷链接。可结合@Link使用，也可以结合配置文件使用。配置文件放到resource目录下，Allure 会替换{}为对应注解的值。
- @TmsLink
与@Issue类似用法，定义案例链接。
- @Link
定义一个链接，在测试报告展现。
- @Severity
定义用例的级别，主要有BLOCKER,CRITICAL,MINOR,NORMAL,TRIVIAL等几种类型，默认是NORMAL。使用方法如下。
> @Severity(SeverityLevel.TRIVIAL)
- @Attachment
添加已有附件或者新建附件后添加至测试报告。




#### mvn 运行测试用例 
1.1.pom 文件配置 或 命令行配置
1.2.命令行配置 mvn clean test -Dsurefire.suiteXmlFiles=src/test/java/testSuit/testng.xml(pom 未配置命令行指定运行的xml文件)
2.mvn clean test 运行测试用例(pom 已经配置了运行的xml文件)
3.打开报告结果（使用4.1 或者4.2)
- 4.1 allure serve allure-results  或者  allure serve target/allure-results (生成临时目录并打开报告)
- 4.2.1 allure generate target/allure-results  先生成报告到目录
- 4.2.2  allure open allure-results  然后再执行打开命令

#### 使用说明
- 1.TestCase包中新建测试类，执行指定的测试用例
- 2.测试过程中使用的数据库等信息通过json文件传入，文件放在资源文件夹(resources)的TestCaseData目录下
- 3.项目中默认读resource/testNg/testng.xml 文件(pom文件suiteXmlFile字段修改)，执行文件中配置的测试类。
- 4.mvn clean test 运行resource/testNg/testng.xml 中配置的测试类
- 5.allure serve target/allure-results  查看结果报告


