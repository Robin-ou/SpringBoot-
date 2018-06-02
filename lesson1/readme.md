## 一、构建简单spring boot 项目
这里官网提供的生成器SPRING INITIALIZR 来创建简单的spring boot 项目。
1. 访问 http://start.spring.io
2. 选择对应的模块
3. Group填组名，Artifact填模块名，右侧Dependencies 可以选择相应的依赖，因为我们要构建web项目，所以可以添加web的依赖。点击 Generate Project 生成下载项目
4. 在eclipse中打开导入解压后的项目

5. 等对应的依赖下载完毕，点击`src\main\java\com\example\DemoApplication.java`，然后用`Java run `启动应用即可。
6. 启动之后在浏览器输入  http://localhost:8080/index  ，
即可看到页面显示 `hello Springboot 2.0`，即完成项目启动。
7. 在浏览器输入 http://localhost:8080/index2.html 即可启动一个简单的后台用`springboot`写接口，前天基于`Vue 1.x`前后分离的demo。

