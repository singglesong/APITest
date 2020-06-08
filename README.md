# APITest
接口测试

#### mybatis 自动生成代码
- resources目录下修改 generatorConfig.xml 文件
- 在idea的右侧栏点击Maven,选中添加的Mybatis-generator插件并运行









#### testng 使用suit.xml
- mvn clean test -Dsurefire.suiteXmlFiles=src/test/java/game-unit-test-suite.xml






allure

1. 安装
brew install allure





testng 
1.pom 文件配置

2.mvn clean test 运行测试用例


3.打开报告结果
allure serve allure-results


#### 约定俗成
assertParams 中 "包含字符串" 使用关键字  contain
assertParams 中
