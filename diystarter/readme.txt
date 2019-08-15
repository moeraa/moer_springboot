调用自定义的starter
使用的依赖：
<dependency>
            <groupId>com.moer.springboot</groupId>
            <artifactId>diystarter-spring-boot-starter</artifactId>
            <version>${project.version}</version>
</dependency>

1.@ConfigurationProperties(prefix = "cc")  --> 类型安全的属性注入，即将application.properties 中配置的属性值，直接注入到这个实例中

2.自动配置类
    @Configuration 表示这是一个配置类
    @EnableConfigurationProperties 注解是使得我们之前配置的ConfigurationProperties生效
    @ConditionalOnClass表示当前项目classpath下存在某个class时配置生效
3.spring.factories
     Spring Boot 项目的启动类都有一个 @SpringBootApplication 注解
     @EnableAutoConfiguration 表示启用 Spring 应用程序上下文的自动配置，
   该注解会自动导入一个名为 AutoConfigurationImportSelector 的类,而这个类会去读取一个名为 spring.factories 的文件,
   spring.factories 中则定义需要加载的自动化配置类，
   org.springframework.boot.autoconfigure.EnableAutoConfiguration=com.moer.springboot.HelloServiceAutoConfiguration
