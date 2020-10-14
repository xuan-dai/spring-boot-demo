### 自动装配
#### Spring 模式装配
`@Configure` 表明是配置类

#### Spring 模块装配
两种方式导入模块的配置类
`@Import(HelloWorldConfigura.class)` 直接导入
`@EnableHellWorldConfigura(xxxImportSelector.class)` -> `xxxImportSelector.class` 间接导入模块的配置类

#### Spring 条件装配
`@ConditionalOnSystemProperties` -> `OnSystemProperties.class` 进行条件判断，满足时，才能装配注解修饰的类 

#### Spring 工厂加载机制
配置 `META-INF/spring.factoies`