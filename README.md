# 1、spring

## 1.1、简介

- Spring:春天-------->给软件行业带来春天！
- 2002年，首次推出了spring的雏形：interface21框架！
- *Spring*框架即以interface21框架为基础,经过重新设计,并不断丰富其内涵,于*2004年3月24日,*发布了1.0正式版。
- **Rod Johnson** ，Spring Framework创始人，著名作者。很难想象Rod Johnson的学历，真的让好多人大吃一惊，他是[悉尼大学](https://baike.baidu.com/item/悉尼大学)的博士，然而他的专业不是计算机，而是音乐学。
- spring理念：使现有的技术更加容易使用，本身是一个大杂烩，整合了现有的技术框架！



- SSH : Struct2 + Spring + Hibernate!
- SSM : SpringMvc + Spring + Mybatis!

官网：https://spring.io/projects/spring-framework#overview

中文官方文档：https://www.docs4dev.com/docs/zh/spring-framework/5.1.3.RELEASE/reference/overview.html

官方文档地址： https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html

GitHub：https://github.com/spring-projects/spring-framework


```xml
<!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-webmvc</artifactId>
    <version>5.2.0.RELEASE</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-jdbc</artifactId>
    <version>5.2.0.RELEASE</version>
</dependency>

```

## 1.2、优点

- Spring是一个开源免费的框架（容器）！
- Spring是一个轻量级的，非入侵式的框架！
- 控制反转（IOC）,面向切面编程（AOP）!
- 支持事务的处理，对框架整合的支持！

总结一句话：Spring就是一个轻量级的控制反转（IOC）和面向切面编程（AOP）的框架！

## 1.3、组成

![1](spring.assets/1.png)

> #### 1. Data Access/Integration（数据访问／集成）
>
> 数据访问/集成层包括 JDBC、ORM、OXM、JMS 和 Transactions 模块，具体介绍如下。
>
> - JDBC 模块：提供了一个 JDBC 的抽象层，大幅度减少了在开发过程中对数据库操作的编码。
> - ORM 模块：对流行的对象关系映射 API，包括 JPA、JDO、[Hibernate](http://c.biancheng.net/hibernate/) 和 iBatis 提供了的集成层。
> - OXM 模块：提供了一个支持对象/XML 映射的抽象层实现，如 JAXB、Castor、XMLBeans、JiBX 和 XStream。
> - JMS 模块：指 [Java](http://c.biancheng.net/java/) 消息服务，包含的功能为生产和消费的信息。
> - Transactions 事务模块：支持编程和声明式事务管理实现特殊接口类，并为所有的 POJO。
>
> #### 2. Web 模块
>
> Spring 的 Web 层包括 Web、[Servlet](http://c.biancheng.net/servlet/)、Struts 和 Portlet 组件，具体介绍如下。
>
> - Web 模块：提供了基本的 Web 开发集成特性，例如多文件上传功能、使用的 Servlet 监听器的 IoC 容器初始化以及 Web 应用上下文。
> - Servlet模块：包括 Spring 模型—视图—控制器（MVC）实现 Web 应用程序。
> - Struts 模块：包含支持类内的 Spring 应用程序，集成了经典的 Struts Web 层。
> - Portlet 模块：提供了在 Portlet 环境中使用 MV C实现，类似 Web-Servlet 模块的功能。
>
> #### 3. Core Container（核心容器）
>
> Spring 的核心容器是其他模块建立的基础，由 Beans 模块、Core 核心模块、Context 上下文模块和 Expression Language 表达式语言模块组成，具体介绍如下。
>
> - Beans 模块：提供了 BeanFactory，是工厂模式的经典实现，Spring 将管理对象称为 Bean。
> - Core 核心模块：提供了 Spring 框架的基本组成部分，包括 IoC 和 DI 功能。
> - Context 上下文模块：建立在核心和 Beans 模块的基础之上，它是访问定义和配置任何对象的媒介。ApplicationContext 接口是上下文模块的焦点。
> - Expression Language 模块：是运行时查询和操作对象图的强大的表达式语言。
>
> #### 4. 其他模块
>
> Spring的其他模块还有 AOP、Aspects、Instrumentation 以及 Test 模块，具体介绍如下。
>
> - AOP 模块：提供了面向切面编程实现，允许定义方法拦截器和切入点，将代码按照功能进行分离，以降低耦合性。
> - Aspects 模块：提供与 AspectJ 的集成，是一个功能强大且成熟的面向切面编程（AOP）框架。
> - Instrumentation 模块：提供了类工具的支持和类加载器的实现，可以在特定的应用服务器中使用。
> - Test 模块：支持 Spring 组件，使用 JUnit 或 TestNG 框架的测试。

## 1.4、扩展

在Spring的官网有这个介绍：现代化的java开发！说白就是基于Spring的开发！

![2](spring.assets/2.png)

- SpringBoot
  - 一个快速开发的脚手架。
  - 基于SpringBoot可以快速的开发单个微服务。
  - 约定大于配置！

- Spring Cloud
  - SpringCloud是基于SpringBoot实现的。

**为什么要学习？因为现在大多数公司都在使用SpringBoot进行快速开发，学习SpringBoot的前提，需要完全掌握Spring及SpringMVC!承上启下的作用**



弊端：发展了太久之后，违背了原来的理念！配置十分繁琐，人称：“配置地狱！”

# 2、IOC理论推导[代码：spring-01-ioc]

在传统的web代码中需要Dao层和业务层，Dao层是交给业务层实现的，而且用户只需要接触业务层，不要接触Dao层的！	

​	1.导入Jar包

```xml
<dependency>
   <groupId>org.springframework</groupId>
   <artifactId>spring-webmvc</artifactId>
   <version>5.1.10.RELEASE</version>
</dependency>
```

​	2.UserDao 接口

```java
package com.spring.dao;

/**
 * @author Orange
 * @create 2021-08-20  20:44
 */
public interface UserDao {
    void getUser();
}
```

​	3.UserDaoImpl 实现类

```java
package com.spring.dao;

/**
 * @author Orange
 * @create 2021-08-20  20:46
 */
public class UserDaoImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("获取用户！！！");
    }
}
```

```java
package com.spring.dao;

/**
 * @author Orange
 * @create 2021-08-20  21:03
 */
public class UserDaoMysqlImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("Mysql获取用户数据");
    }
}

```

```java
package com.spring.dao;

/**
 * @author Orange
 * @create 2021-08-20  21:08
 */
public class UserDaoOracleImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("Oracle获取用户数据！");
    }
}

```

```java
package com.spring.dao;

/**
 * @author Orange
 * @create 2021-08-20  21:08
 */
public class UserDaoSqlServiceImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("SqlService获取用户数据！");
    }
}

```

4.UserService 业务接口

```java
package com.spring.service;

/**
 * @author Orange
 * @create 2021-08-20  20:52
 */
public interface UserService {
    void getUSer();
}

```

​	5.UserServiceImpl 业务实现类 

```java
package com.spring.service;

import com.spring.dao.UserDao;
import com.spring.dao.UserDaoImpl;
import com.spring.dao.UserDaoMysqlImpl;
import com.spring.dao.UserDaoOracleImpl;

/**
 * @author Orange
 * @create 2021-08-20  20:52
 */
public class UserServiceImpl implements UserService{
    /**
     * 业务层调dao层：组合
     */
    //如果用户要求需求变化，就需要用户自己手段变化了
//    private  UserDao userDao=new UserDaoImpl();
//    private  UserDao userDao=new UserDaoMysqlImpl();
//    private  UserDao userDao=new UserDaoOracleImpl();
    private  UserDao userDao;
    //利用set进行动态实现值的注入！
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUSer() {
        userDao.getUser();
    }
}

```

​	6.测试类

```java
import com.spring.dao.UserDaoImpl;
import com.spring.dao.UserDaoMysqlImpl;
import com.spring.dao.UserDaoOracleImpl;
import com.spring.service.UserService;
import com.spring.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Orange
 * @create 2021-08-20  20:55
 *
 * 在我们的业务中，用户需求可能影响到我们原来代码，我们需要根据用户的需求去修改源代码！
 * 例如要求读取不同数据，使用到mysql或oracle读取是数据就要改变UserServiceImpl的代码！
 * 如果代码量十分打，修改一次的成本代价十分昂贵！
 * 我们巧妙使用一个Set接口实现，直接不要改变源代码！
 */
public class MyTest {
    public static void main(String[] args) {

         //这是使用原生的
        //用户实际调用的是业务层，dao层他们不需要接触！
        UserService userService = new UserServiceImpl();
        ((UserServiceImpl)userService).setUserDao(new UserDaoImpl());
//        ((UserServiceImpl)userService).setUserDao(new UserDaoMysqlImpl());
//        ((UserServiceImpl)userService).setUserDao(new UserDaoOracleImpl());

        userService.getUSer();
/**
		 //使用spring
        //获取ApplicationContext:拿到spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beam.xml");
        //容器在手，天下
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");
        userServiceImpl.getUSer();

*/
    }
}

```

在我们的业务中，用户需求可能影响到我们原来代码，我们需要根据用户的需求去修改源代码！例如要求读取不同数据，使用到mysql或oracle读取是数据就要改变UserServiceImpl的代码！如果代码量十分大，修改一次的成本代价十分昂贵！

![3](spring.assets/3.png)

我们巧妙使用一个Set接口实现，已经发生革命性的变化了（直接由用户选择的需求变化而变化，不用改变源代码的）！

```java
private  UserDao userDao;
//利用set进行动态实现值的注入！
public void setUserDao(UserDao userDao) {
    this.userDao = userDao;
}
```

- 之前，程序是主动创建对象！控制权在程序猿手上！
- 使用了set注入以后，程序不再具有主动性，而是变成了被动的接受对象！

这种思想，冲本质上解决了问题，我们程序猿不用再去管理对象的创建了。系统的耦合性大大降低~，可以更加专注的在业务的实现上！这是IOC的原型！

![4](spring.assets/4.png)

### IOC本质

**控制反转IOC(Inversion of Control),是一种设计思想,DI（依赖注入）是实现IOC的一种方法**，也有人认为DI只是IOC的另一种说法。没有IOC的程序中，我们使用面向对象编程，对象创建与对象间的依赖关系完全硬编码在程序中，对象的创建有程序自己控制，控制反转后将对象的创建转移给第三方，个人认为所谓控制反转就是：获得依赖对象的方式反转了。

![5](spring.assets/5.png)

IOC是Spring框架的核心内容，使用多种方式完美的实现了IOC，可以使用XML配置，也可以使用注解，新版本的Spring也可以零配置实现IOC。

Spring容器在初始时先读配置文件，根据配置文件或元数据创建与组织对象存入容器中，程序使用时再从IOC容器中取出需要的对象。

![6](spring.assets/6.png)

采用XML方式配置Bean的时候，Bean的定义信息是和实现分离的，而采用注解的方式可以把两者合为一体，Bean的定义信息直接以注解的形式定义在实现类中，从而达到了零配置的目的。

**控制反转是一种通过描述（XML或注解）并通过第三方去生产或获取特定对象的方式。在Spring中实现控制反转的是IoC容器，其实现方法是依赖注入（Dependency Injection,DI）。**

# 3.HelloSpring[代码：spring-02-hellospring]

#### 1.导入Jar包

```xml
<dependency>
   <groupId>org.springframework</groupId>
   <artifactId>spring-webmvc</artifactId>
   <version>5.1.10.RELEASE</version>
</dependency>
```

#### 2.编写一个Hello实体类

```java
package com.spring.pojo;

/**
 * @author Orange
 * @create 2021-08-21  12:15
 */
public class Hello {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
```

#### 3.编程我们的spring文件，这里我们命名为bean.xml（格式要以官方对应的版本）

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">
    <!--使用Spring来创建对象，在Spring这些都称为Bean
    原来java创建对象：
    类型 变量名 = new 类型（）
    Hello hello = new Hello()

    在Spring中只需要Bean下写配置
    id == 变量名
    class == new 的对象
    property  相当于给对象中的属性设置一个值(初始化)！
    -->
    <bean id="hello" class="com.spring.pojo.Hello">
        <property name="str" value="Spring"/>
     </bean>
</beans>
```

#### 4.测试类

```java
import com.spring.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @author Orange
 * @create 2021-08-21  12:24
 */
public class MyTest {
    public static void main(String[] args) {
        //获取Spring上下文的对象
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //我们的对象现在都在spring中的管理了，我们要使用，之间去里面取出来就可以！
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello);
    }
}
```

#### 思考：

> - Hello对象时谁创建的？【hello对象时有spring创建的】
> - hello对像的属性是怎么设置的？【hello对象的属性是由Spring容器设置的】

这个过程就叫控制反转（IOC）：

- 控制：谁来控制对象的创建，传统应用程序的对象是由程序控制创建的，使用spring后，对象是由Spring来创建的
- 反转：程序本身不创建对象，而变成被动的接收对象

依赖注入：就是利用set方法来进行注入的

**IOC是一种编程思想，由主动的编程变成被动的接收**

可以通过new ClassPathXmlApplicationContext去流量一下底层源码。

![7](spring.assets/7.png)

**Ok,到了现在，我们彻底不用在程序中去改动了，要实现不同的操作，只需要在xml配置文件中进行修改，所谓的IOC，一句话搞定：对象由spring来创建,管理，装配！**

# 4.IOC创建对象的方式[代码：spring-03-ioc2]

**这里是主要是讨论实体pojo层的构造函数只要无参构造函数或有参构造函数，在spring的bean如何创建！！**

实体类

```java
package com.spring.pojo;
/**
 * @author Orange
 * @create 2021-08-21  15:26
 */
public class User {
    private String name;
	//无参构造器
//    public User(){
//        System.out.println("User的无参构造！");
//    }
    //有参构造函器
    public User(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("name="+name);
    }
}
```

1.使用无参构造创建对象，默认！

2.假设我们要使用有参构造创建对象。

​	1.下标赋值

```xml
<!--第一种，下标赋值-->
<bean id="user" class="com.spring.pojo.User">
    <constructor-arg index="0" value="张飞"/>
    <!--<property name="name" value="Lisa"/>-->
</bean>


```

​	2.类型

```xml
<!--第二种，通过参数类型创建，不建议使用！-->
<bean id="user" class="com.spring.pojo.User">
    <constructor-arg type="java.lang.String" value="Make"/>
</bean>
```

​	3.参数名

```xml
<!--第三种，直接通过参数名来设置-->
<bean id="user" class="com.spring.pojo.User">
    <constructor-arg name="name" value="Make2"/>
</bean>
```

注意：当bean中给某一个对象在某个环节被实例化时，它会把整个bean里面的对象都会实例化

总结：在配置文件加载的时候，容器（spring中的bean文件）中管理的对象都已经初始化了

# 5.Spring配置

#### 5.1、别名

```xml
<bean id="user" class="com.spring.pojo.User">
    <constructor-arg name="name" value="Make2"/>
</bean>

<!--别名，如果添加了别名，我们也可以使用别名获取到这个对象-->
<alias name="user" alias="userNew"/>
```

#### 5.2、Bean配置

```xml
<!--
        id: bean 的唯一标识符，也就是相当于我们学的对象名
        class : bean 对象所对应的全限定名：包名 + 类型
        name : 也是别名，而且name 可以同时去取多个别名  可以使用多种类型分隔符：空格 逗号 分号
    -->
    <bean id="userT" class="com.spring.pojo.UserT" name="userT2 u2,u3;u4">
        <property name="name" value="Lisa2"/>
    </bean>
```

#### 5.3、import

这个import,一般用于团队开发使用，他可以将多个配置文件，导入合并为一个

假设，现在项目中有多个人开发，这三个人复制不同的类开发，不同类需要注册在不同的bean中，我们可以利用import将所有人的beans.xml合并为一个总的！

![8](spring.assets/8.png)

- 李三（beans.xml）
- 张三（beans2.xml）
- 王五（beans3.xml）
- applicationContext.xml

```xml
<import resource="beans.xml"/>
<import resource="beans2.xml"/>
<import resource="beans3.xml"/>
```

使用的时候，直接使用总的配置就可以了

注意：存在多个spring容器（beans.xml），里面的内容有重复会自动合并！！！

# 6.依赖注入[代码：spring-04]



#### 6.1、构造器注入

前面已经说过了！

#### 6.2、Set方式注入（重点）

- 依赖注入：Set注入

  - 依赖 : 指Bean对象的创建依赖于容器 . Bean对象的依赖资源 .

  - 注入 : 指Bean对象所有属性 , 由容器来注入

#### 【环境搭建】

##### 1.实体类

​	1.简单类型

```java
package com.spring.pojo;

/**
 * @author Orange
 * @create 2021-08-21  21:01
 */
public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

```

​	2.复杂实体类（全面的类型）

```java
package com.spring.pojo;

import java.util.*;

/**
 * @author Orange
 * @create 2021-08-21  21:01
 */
public class Student {
    private String name;
    private Address address;
    private String[] books;
    private List<String> hobbys;
    private Map<String,String> card;
    private Set<String> games;
    private String wife; //null
    private Properties info;  //Properties是配置文件

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public List<String> getHobbys() {
        return hobbys;
    }

    public void setHobbys(List<String> hobbys) {
        this.hobbys = hobbys;
    }

    public Map<String, String> getCard() {
        return card;
    }

    public void setCard(Map<String, String> card) {
        this.card = card;
    }

    public Set<String> getGames() {
        return games;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", books=" + Arrays.toString(books) +
                ", hobbys=" + hobbys +
                ", card=" + card +
                ", games=" + games +
                ", wife='" + wife + '\'' +
                ", info=" + info +
                '}';
    }
}
```

##### 2.bean.xml（对应Student实体类的8种不同类型的变量进行bena实例化）

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="address" class="com.spring.pojo.Address">
        <property name="address" value="广东"/>
     </bean>

    <bean id="student" class="com.spring.pojo.Student">
        <!--第一种，普通值注入-->
        <property name="name" value="Lisa"/>

        <property name="address" ref="address"></property>

        <property name="books">
            <array>
                <value>西游计</value>
                <value>三国演义</value>
                <value>水浒传</value>
                <value>红楼梦</value>
            </array>
        </property>
        
        <property name="hobbys">
            <list>
                <value>打游戏</value>
                <value>看书</value>
            </list>
        </property>
        
        <property name="card">
            <map>
                <entry key="身份证" value="111123313513"></entry>
                <entry key="学生卡" value="20180220899"/>
            </map>
        </property>
        
        <property name="games">
            <set>
                <value>LOL</value>
                <value>BOB</value>
            </set>
        </property>
        
        <property name="wife">
            <null/>
        </property>
        
        <property name="info">
            <props>
                <prop key="Dirver">Mysql</prop>
                <prop key="userName">root</prop>
                <prop key="password">123456</prop>
            </props>
        </property>

    </bean>
</beans>
```

> 1、**常量注入**
>
> ```xml
> <bean id="student" class="com.kuang.pojo.Student">
>      <property name="name" value="小明"/>
>  </bean>
> ```
>
> 2、**Bean注入** 
>
> 注意点：这里的值是一个引用，ref
>
> ```
>  <bean id="addr" class="com.kuang.pojo.Address">
>      <property name="address" value="重庆"/>
>  </bean>
>  
>  <bean id="student" class="com.kuang.pojo.Student">
>      <property name="name" value="小明"/>
>      <property name="address" ref="addr"/>
>  </bean>
> ```
>
> 3、**数组注入**
>
> ```
>  <bean id="student" class="com.kuang.pojo.Student">
>      <property name="name" value="小明"/>
>      <property name="address" ref="addr"/>
>      <property name="books">
>          <array>
>              <value>西游记</value>
>              <value>红楼梦</value>
>              <value>水浒传</value>
>          </array>
>      </property>
>  </bean>
> ```
>
> 4、**List注入**
>
> ```
>  <property name="hobbys">
>      <list>
>          <value>听歌</value>
>          <value>看电影</value>
>          <value>爬山</value>
>      </list>
>  </property>
> ```
>
> 5、**Map注入**
>
> ```
>  <property name="card">
>      <map>
>          <entry key="中国邮政" value="456456456465456"/>
>          <entry key="建设" value="1456682255511"/>
>      </map>
>  </property>
> ```
>
> 6、**set注入**
>
> ```
>  <property name="games">
>      <set>
>          <value>LOL</value>
>          <value>BOB</value>
>          <value>COC</value>
>      </set>
>  </property>
> ```
>
> 7、**Null注入**
>
> ```
>  <property name="wife"><null/></property>
> ```
>
> 8、**Properties注入**
>
> ```
>  <property name="info">
>      <props>
>          <prop key="学号">20190604</prop>
>          <prop key="性别">男</prop>
>          <prop key="姓名">小明</prop>
>      </props>
>  </property>
> ```

#### 3.测试类

```java
import com.spring.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Orange
 * @create 2021-08-21  21:15
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }
}

/*
输出结果
Student{
	name='Lisa',
    address=Address{
    	address='广东'
    				},
    books=[西游计, 三国演义, 水浒传, 红楼梦],
    hobbys=[打游戏, 看书],
    card={
    	身份证=111123313513,
        学生卡=20180220899
        				},
    games=[LOL, BOB],
    wife='null',
    info={
    	Dirver=Mysql,
        password=123456,
        userName=root
        }
     }


*/
```

#### 6.3、扩展方式注入

我们可以使用p命名空间和c命名空间进行注入

官方解释：

p-namespace

![9](spring.assets/9.png)

c-namespace

![10](spring.assets/10.png)

#### 代码操作

1.实体类

```java
public class User {
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
```

2.bean.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:p="http://www.springframework.org/schema/p"
       xmlns:c="http://www.springframework.org/schema/c"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">

    <!--p命名空间注入，可以直接注入属性的值：property
        这个相当于是set注入的一个快捷版
    -->
    <bean id="user" class="com.spring.pojo.User" p:name="Boss" p:age="20">
    </bean>

    <!--c命名空间注入，通过构造器注入：construct-args
        针对实体类构造函数里面的参数
        这个相当于是构造器注入的一个快捷版
    -->
    <bean id="user2" class="com.spring.pojo.User" c:name="Fluent" c:age="30">
    </bean>

</beans>
```

3.测试

```java
@Test
public void test(){
    ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
    //User user = context.getBean("user", User.class);
    User user = context.getBean("user2", User.class);
    System.out.println(user);
}
```

注意点：p命名和c命名空间不能直接使用，需要导入xml约束！

```xml
xmlns:p="http://www.springframework.org/schema/p"
xmlns:c="http://www.springframework.org/schema/c"
```

#### 6.4、bean的作用域（scope）

![11](spring.assets/11.png)

1.单例模式(Spring默认机制)：单线程使用多

就是获取(new)同一个对象时候，会取容器之前的对象，不会新创建对象。

```xml
<bean id="user2" class="com.spring.pojo.User" c:name="Fluent" c:age="30" scope="singleton">
</bean>
```

坏处：并发情况下，会产生延迟或者数据库不一致！

2.原型模式：多线程使用多

每次从容器中get的时候，都会产生一个新的对象！

```xml
<bean id="user2" class="com.spring.pojo.User" c:name="Fluent" c:age="30" scope="prototype">
</bean>
```

弊端：占用内存资源

3.其余的request、session、application、这些个只能在web开发种使用



# 7、Bean的自动装配[代码：spring-05]

- 自动装配是Spring满足bean依赖一种方式！
- Spring回相似上下文自动寻找，并自动给bean装配属性！



在Spring中有三种装配的方式

​	1.在xml中显式的配置

```xml
<bean id="dog" class="com.spring.pojo.Dog"></bean>
    <bean id="cat" class="com.spring.pojo.Cat"/>
    <bean id="people" class="com.spring.pojo.People">
        <property name="name" value="Lisa"/>
        <property name="age" value="22"/>
        <property name="cat" ref="cat"/>
        <property name="dog" ref="dog"/>
    </bean>
```

​	2.在java中显示配置

​	3.隐式的自动装配bean【重点】

```xml

```

### 7.1测试

##### 	1.搭建环境：一个人有狗和猫

​		实体类

```java
public class People {
    private String name;
    private int age;
    private Dog dog;
    private Cat cat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dog=" + dog +
                ", cat=" + cat +
                '}';
    }
}

```

```java
public class Cat {
    public void shout(){
        System.out.println("miao~");
    }
}
```

```java
public class Dog {
    public void shout(){
        System.out.println("wang~");
    }
}

```

bean.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="dog" class="com.spring.pojo.Dog"></bean>
    <bean id="cat" class="com.spring.pojo.Cat"/>
    <bean id="people" class="com.spring.pojo.People">
        <property name="name" value="Lisa"/>
        <property name="age" value="22"/>
        <property name="cat" ref="cat"/>
        <property name="dog" ref="dog"/>
    </bean>

</beans>
```

测试类

```java
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = context.getBean("people", People.class);
        people.getCat().shout();
        people.getDog().shout();
    }
}
```

### 7.2、ByName自动装配

```xml
<bean id="dog" class="com.spring.pojo.Dog"></bean>
<bean id="cat" class="com.spring.pojo.Cat"/>
<!--自动装配是针对与加载实体类的
            byName:会自动在容器上下文中查找，和自己对象set方法后面的值对呀的beanid
       -->
<bean id="people" class="com.spring.pojo.People" autowire="byName">
    <property name="name" value="Lisa"/>
    <property name="age" value="22"/>
</bean>

```

注意：当在bean.xml有些实体类beanid与实体类名称完全(忽略大小写)不一样，会自动失败

![12](spring.assets/12.png)

### 7.3、ByType自动装箱

```xml
<!--使用ByType下面的实体类可以不用id-->
<bean class="com.spring.pojo.Dog"></bean>
<bean class="com.spring.pojo.Cat"/>

<!--自动装配是针对与加载实体类的
            byName:会自动在容器上下文中查找，和自己对象set方法后面的值对呀的beanid（根据bena里面的id识别）
            byType:会自动在容器上下文中查找，和自己对象属性类型相同的bean（根据bean里面的class识别）
       -->
<bean id="people" class="com.spring.pojo.People" autowire="byType">
    <property name="name" value="Lisa"/>
    <property name="age" value="22"/>
</bean>
```

注意：使用这个不能让bean容器出现两个相同的对象类型名，不然会报错

![13](spring.assets/13.png)



#### 小结：

- byname的时候，需要保证所有的bean唯一，并且这个bean需要和自动注入的属性的set方法的值一致！
- bytype的时候，需要保证所有bean的class唯一，并且这个bean需要和自动注入的属性的类型一致！



### 7.4使用注解实现自动装配

jdk1.5支持的注解，Spring2.5就支持注解了！

The introduction of annotation-based configuration raised the question of whether this approach is “better” than XML.

要使用注解须知：

​	1.导入约束：context约束

​	2.配置注解的支持：<context:annotation-config/>

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:context="http://www.springframework.org/schema/context"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">
    <context:annotation-config/>
</beans>
```



##### **@Autowaited**

直接在属性上使用即可！

使用Autowired我们可以不用Set方法了，前提是你这个自动装配的属性在IOC（Spring）容器中存在，且符合名字byname!

科普：

```java
@Nullable    //字段标记了这个注解，说明这个字段可以为null;
```

eg:

```java
public class People {
    private String name;

    public People(@Nullable String name) {//在构造器中这表示变成①有参构造器 ②无参构造器
        this.name = name;
    }
}
```

在Autowaited这个接口类是：

```java
public @interface Autowired {
    boolean required() default true;
}
```

测试代码：

```java
public class People {
    private String name;
    private int age;
    //如果显示定义了Autowired的required的属性为false,说明这个对象可以为null,否则不允许为空
    @Autowired(required = false)
    private Dog dog;
    @Autowired
    private Cat cat;
}
```



##### @Qualifier注解

如果@Autowired自动装配的环境比较复杂，自动装配无法通过一个注解【@Autowired】完成的时候，我们可以使用@Qualifier(value="xxx")去配置@Autowired的使用，指定一个唯一的bean对象注入！

spring容器

```xml
<!--开启注解支持-->
<context:annotation-config/>
<bean id="cat" class="com.spring.pojo.Cat"/>
<bean id="cat22" class="com.spring.pojo.Cat"/>
<bean id="cat212" class="com.spring.pojo.Cat"/>
<bean id="dog222" class="com.spring.pojo.Dog"></bean>
<bean id="dog22" class="com.spring.pojo.Dog"></bean>
<bean id="dog" class="com.spring.pojo.Dog"></bean>
<bean id="people" class="com.spring.pojo.People"/>

```

使用@Qualifier(value="xxx")指定bean对象注入

```java
public class People {
    private String name;
    @Autowired
    @Qualifier(value = "dog22")
    private Dog dog;
    @Autowired
    @Qualifier(value = "cat22")
    private Cat cat;
}
```



##### @Resource注解

@Resource（name="xxx"）注解是属于java内部自带的不属于spring自带，它的功能完全和【@Autowired+@Qualifier(value="xxx")】一样强大

spring容器：

```xml
 <!--开启注解支持-->
    <context:annotation-config/>
    <bean id="cat222" class="com.spring.pojo.Cat"/>
    <bean id="cat22" class="com.spring.pojo.Cat"/>
    <bean id="cat" class="com.spring.pojo.Cat"/>
    <bean id="dog222" class="com.spring.pojo.Dog"></bean>
    <bean id="dog2" class="com.spring.pojo.Dog"></bean>
    <bean id="people" class="com.spring.pojo.People"/>
```

使用@Resource(name="xxx")指定bean对象注入

```java
public class People {
    private String name;

    @Resource(name = "dog2")
    private Dog dog;
    @Resource
    private Cat cat;
}
```



小结：

@Resource和@Autowired的区别：

- 都是用来自动装配的，都可以放在属性字段上
- @Autowired通过byType的方式实现，而且必须要求这个对象存在【常用】
- @Resource默认通过byname的方式实现，如果找不到名字，则通过byType实现！如果两个都找不到的情况下，就报错！【常用】
- 执行顺序不同：@Autowired 通过byType的方式实现。@Resource默认通过byname的方式实现。



## 8.使用注解开发【spring-06-anno】

在Spring4之后,要使用注解开发，必须保证aop的包导入

![14](spring.assets/14.png)

使用注解需要导入context约束，增加注解的支持！

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:context="http://www.springframework.org/schema/context"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">
    <context:annotation-config/>
</beans>
```



##### 1.bean对象注入【@Component 】

```java
//@Component  组件的意思
//等价于 <bean id = "user" class="com.spring.pojo"/>
@Component
public class User {
    public String name="张三";
}
```

##### 2.属性如何注入【@Value("xxx")】

```java
//@Component  组件的意思
//等价于 <bean id = "user" class="com.spring.pojo"/>
@Component
public class User {
    public String name;

    /**
     * @Value("帅哥") 相当于
     *<bean id="user" class="com.spring.pojo.User">
     *    <property name="name" value="帅哥"></property>
     *</bean>
     */
    @Value("帅哥")
    public void setName(String name) {
        this.name = name;
    }
}
```

##### 3.衍生的注解

@Component有几个衍生注解，我们在web开发中，会按照mvc三层架构分层！

- dao层			【@Repository】（仓库的意思）

- service层      【@Service】

- controller层 【@Controller】

  ​	这四个注解功能都是一样的，都是代表将某个类注册到Spring中，装配Bean



##### 4.自动装配置

> -@Autowired :  自动装配通过类型。【常用】
>
> ​			如果Autowired 不能唯一自动装配上属性，则需要通过@Qualifier(value="xxx")
>
> -@Nullable  :  字段标记了这个注解，说明这个字段可以null；
>
> -@Resource :  自动装配通过名字。类型



##### 5.作用域【@Scope】

@Scope("singleton")：单例模式

@Scope("prototype") ：原形模式

```java
package com.spring.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//@Component  组件的意思
//等价于 <bean id = "user" class="com.spring.pojo"/>
@Component
@Scope("prototype")
public class User {
    public String name;

    /**
     * @Value("帅哥") 相当于
     *<bean id="user" class="com.spring.pojo.User">
     *    <property name="name" value="帅哥"></property>
     *</bean>
     */
    @Value("帅哥")
    public void setName(String name) {
        this.name = name;
    }
}
```

##### 6.小结

xml和注解：

- xml更加万能，适用于任何场合！维护简单方便
- 注解不是自己类适应不了，维护相对复杂！

xml和注解最佳实践：

- xml用来管理bean；
- 注解只负责完成属性的注入；
- 我们在使用的过程，只需要注意一个问题：必须让注解生效，就需要开启注解的支持

```xml
<!--指定扫描的包，这个包下的注解就会生效-->
<context:component-scan base-package="com.spring"/>
<context:annotation-config/>
```

## 9、使用java的方式配置Spring【spring-07】

我们现在要完全不使用Spring的xml配置了，全权交给Java来做！

JavaConfig是Spring的一个子项目，在Spring4之后，它成为了一个核心功能！

![15](spring.assets/15.png)

##### 代码：

User类

```java
package com.spring.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Orange
 * @create 2021-08-31  23:30
 */
//这里这个注解的意思，就是说明这个类被Spring接管了，注册到了容器中
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("沙比")//属性注解
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
```

SpringConfig类(这是把bean.xml文件变成java格式)：

```java
package com.spring.config;

import com.spring.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Orange
 * @create 2021-08-31  23:31
 */
//这个也会Spring容器托管，注册到容器中，因为他本来就是一个@Component
//@Configuration代表这是一个配置类，就和我们之前看的bean.xml
@Configuration
@ComponentScan("com.spring.pojo")
@Import(SpringConfig2.class)
public class SpringConfig {

    //注册一个bean，就相当于我们之前写的一个bean标签
    //这个方法的名字，就相当于bean标签中的id属性
    //这个方法的返回值，就相当于bean标签中的class属性
    @Bean
    public User getUser(){
        return new User();//就是返回要注入到bean的对象！
    }
}
```

测试类（MyTest类）：

```java
import com.spring.config.SpringConfig;
import com.spring.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Orange
 * @create 2021-08-31  23:35
 */
public class MyTest {
    public static void main(String[] args) {
        //如果完全使用了配置类方式去做，我们就只能通过AnnotationConfig上下文来获取容器，通过配置类的calss对象加载！
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        User user = context.getBean("getUser", User.class);
        System.out.println(user.getName());
    }
}
```

###### 注意：这种纯java的配置方式，在**springboot**随处可见

##### 对比这个使用java写法和使用bean.xml的变化：

![16](spring.assets/16.png)

使用java写的容器配置类

```java
//这个也会Spring容器托管，注册到容器中，因为他本来就是一个@Component
//@Configuration代表这是一个配置类，就和我们之前看的bean.xml
@Configuration
@ComponentScan("com.spring.pojo")
@Import(SpringConfig2.class)
public class SpringConfig {

    //注册一个bean，就相当于我们之前写的一个bean标签
    //这个方法的名字，就相当于bean标签中的id属性
    //这个方法的返回值，就相当于bean标签中的class属性
    @Bean
    public User getUser(){
        return new User();//就是返回要注入到bean的对象！
    }
}
```

​											上面的等价下面的bean.xml配置文件

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">

    <!--指定扫描的包，这个包下的注解就会生效-->
    <context:component-scan base-package="com.spring.pojo"/>
    <context:annotation-config/>
    <import resource="SpringConfig.xml"/>
    <bean id="getUser" class="com.spring.pojo.User">
    </bean>

</beans>
```

##### 注意：bean.xml是可以继承多个配置文件的，那么使用java配置类这么实现呢？

```java
//直接使用@Import(xxx.class)注解
@Import(SpringConfig2.class)
```



## 10、代理模式【spring-08-proxy】

**为什么要学习代理模式？** 因为这就是SpringAOP的底层！【面试必问：SpringAOP 和 SpringMVC】

##### 代理模式：

- 静态代理
- 动态代理

![17](spring.assets/17.png)

### 10.1、静态代理【demo01】

角色分析：

- 抽象角色：一般会使用接口或者抽象类来解决
- 真实角色：被代理的角色
- 代理角色：代理真实角色，代理真实角色后，我们一般会做一些附属操作
- 客户：访问代理对象的人！



#### 代码：

1.真实角色和代理角色的共同接口：

```java
package com.spring.demo01;

/**
 * @author Orange
 * @create 2021-09-01  9:09
 */
//出租房子
public interface Rent {
    public void rent();
}
```

2.真实角色：

```java
package com.spring.demo01;

/**
 * @author Orange
 * @create 2021-09-01  9:10
 */
//房东
public class Host implements Rent{
    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }
}
```

3.代理角色：

```java
package com.spring.demo01;

/**
 * @author Orange
 * @create 2021-09-01  9:12
 */
//代理有个原则：尽量使用组合的方式获取房东不要使用继承的方式获取房东方法
public class Proxy implements Rent{
    private Host host;//组合

    public Proxy(){}
    public Proxy(Host host){
        this.host=host;
    }

    @Override
    public void rent() {
        seekHouse();
        host.rent();
        hetong();
        fare();
    }

    //看房
    public void seekHouse(){
        System.out.println("中介带你去看房");
    }
    //收中介费
    public void fare(){
        System.out.println("收中介费");
    }
    //签合同
    public void hetong(){
        System.out.println("签租赁合同");
    }
}
```

4.客户端访问代理角色：

```java
package com.spring.demo01;

//我要租房子
public class Client {
    public static void main(String[] args) {
        //房东要出租房子
        Host host = new Host();
        //代理，中介帮房东出租房子，但是呢？代理角色一般会有一些附属操作！
        Proxy proxy = new Proxy(host);
        //你不用面对房东，直接面对中介即可！
        proxy.rent();
    }
}
```



##### 代理模式的好处：

- 可以使真实角色的操作更加纯碎！不用去关注一些公共的业务
- 公共也就交给代理角色！实现了业务的分工！
- 公共业务发生扩展的时候，方便集中管理！

##### 缺点：

- 一个真实角色就会产生一个代理角色：代码量会翻倍--->开发效率会变低~



### 10.2、加深了解静态代理【demo02】

在一个完整增删查改的业务中，要**添加一个日志**，我们不能在源代码上改动添加日志功能(防止改变源代码逻辑，防止改动源代码系统崩溃)，我们最好写一个**代理类**用来添加代码，即没有改变源代码意思，又可以正常添加日志！【这个就是AOP思想】

#### 代码：

1.业务接口：

```java
package com.spring.demo02;

/**
 * @author Orange
 * @create 2021-09-01  9:46
 */
public interface UserService {
    public void add();
    public void delete();
    public void update();
    public void query();
}
```

2.真实角色：实现业务类

```java
package com.spring.demo02;

/**
 * @author Orange
 * @create 2021-09-01  9:47
 */
//真实对象
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        //当要增加日志时候，如果方法多就要修改所以方法加日志
        //我们修代码原则：经理不要修改源代码，--->做一个代理
        //System.out.println("调用了add()方法");

        System.out.println("增加了一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户");
    }

    @Override
    public void update() {
        System.out.println("更新了一个用户");
    }

    @Override
    public void query() {
        System.out.println("查询了一个用户");
    }

    //为什么添加一个日志，不在这里写要弄个代理写，这样不是更麻烦吗？
    //如果在源代码写在企业是一个大忌，如果源代码写改变了业务逻辑，运行不了等等。。。
}
```

3.客户端：

```java
package com.spring.demo02;
/**
 * @author Orange
 * @create 2021-09-01  9:50
 */
//客户
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        //使用代理模式添加日志
        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);
        proxy.add();
    }
}
```

4.代理类：实现不改变源码，添加日志功能

```java
package com.spring.demo02;

/**
 * @author Orange
 * @create 2021-09-01  9:52
 */
public class UserServiceProxy implements UserService{
    private UserServiceImpl userService;
    //不建议使用构造器获取真实角色，使用set方法
//    public Proxy(){}
//    public Proxy(UserServiceImpl userService){
//        this.userService=userService;
//    }

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }
    
    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }

    //日志方法
    public void log(String msg){
        System.out.println("[Debug]使用了"+msg+"()方法");
    }
}
```

聊一下AOP

![18](spring.assets/18.png)



## 10.3、动态代理【demo03、demo04】

- 动态代理和静态代理角色一样
- 动态代理的代理类是动态生成的，不是我们直接写死的！
- 动态代理分为两大类：基于接口的动态代理，基于类的动态代理
  - 基于接口 ---JDK动态代理 【这里使用这个】
  - 基于类  ： cglib
  - java字节码实现 ： javasistx

需要了解两个类：Proxy （代理）, InvocationHandler（调用处理程序）

```
Proxy：生成动态代理这个实例的
InvocationHandler：调用代理实例，并返回结果
```

#### 动态代理的好处：

- 可以使真实角色的操作更加纯碎！不用去关注一些公共的业务
- 公共也就交给代理角色！实现了业务的分工！
- 公共业务发生扩展的时候，方便集中管理！
- 一个动态代理类代理的是一个接口，一般就是对应的一类业务
- 一个动态代理类可以代理多个类，只要是实现了同一个接口即可！

#### 代码1（房东--中介[自动proxy]--租客）：

##### 接口类[房东和代理类的共同接口类]：

```java
package com.spring.demo03;
//出租房子
public interface Rent {
    public void rent();
}
```

##### 房东类：

```java
package com.spring.demo03;
//房东
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }
}
```

中介类[自动代理类，重点]：

```java
package com.spring.demo03;
import com.spring.demo03.Rent;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//等会我们会用这个类，自动生成代理类！
public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private Rent rent;
    public void setRent(Rent rent){
        this.rent=rent;
    }

//    Foo f=(Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(),
//            new Class<?>[]{Foo.class},
//            handler);

    //生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }
    //处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        //动态代理的本质，就是使用反射机制实现！
        Object result = method.invoke(rent, args);
        fare();
        return result;
    }

    public void seeHouse(){
        System.out.println("中介带你看房");
    }

    public void fare(){
        System.out.println("收中介费");
    }
}
```

##### 住客类：

```java
package com.spring.demo03;
public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        //代理角色：现在没有
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //通过调用程序处理角色来处理我们要调用的接口对象！
        pih.setRent(host);
        Rent proxy = (Rent) pih.getProxy();//这里的Proxy就是动态生成，我们并没有写
        proxy.rent();
    }
}
```

这是动态代理类，不用像静态那样重新下一个类横向插入代理



#### 代码2（以增删查改业务插入日志）

##### 接口类(真实类和代理类的共同接口)：

```java
package com.spring.demo02;
public interface UserService {
    public void add();
    public void delete();
    public void update();
    public void query();
}
```

##### 业务类（真实类）：

```java
package com.spring.demo02;
//真实对象
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        //当要增加日志时候，如果方法多就要修改所以方法加日志
        //我们修代码原则：经理不要修改源代码，--->做一个代理
        //System.out.println("调用了add()方法");
        System.out.println("增加了一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户");
    }

    @Override
    public void update() {
        System.out.println("更新了一个用户");
    }

    @Override
    public void query() {
        System.out.println("查询了一个用户");
    }

    //为什么添加一个日志，不在这里写要弄个代理写，这样不是更麻烦吗？
    //如果在源代码写在企业是一个大忌，如果源代码写改变了业务逻辑，运行不了等等。。。
}
```

##### 日志类（代理类,这是万能模板，主要了解Proxy和InvocationHandler作用）:

```java
package com.spring.demo04;
import com.spring.demo03.Rent;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Orange
 * @create 2021-09-02  11:28
 */
//等会我们会用这个类，自动生成代理类！
//万能模板
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Object target;

    public void setTarget(Object target){
        this.target=target;
    }

//    Foo f=(Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(),
//            new Class<?>[]{Foo.class},
//            handler);

    //生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    //处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质，就是使用反射机制实现！
        log(method.getName());
        Object result = method.invoke(target, args);
        return result;
    }

    //添加日志
    public void log(String msg){
        System.out.println("执行了"+msg+"()方法");
    }
}
```

##### 调用业务类（客户类）：

```java
package com.spring.demo04;
import com.spring.demo02.UserService;
import com.spring.demo02.UserServiceImpl;
public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色，不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userService);//设置要代理的对象
        //动态生成代理
        UserService proxy = (UserService) pih.getProxy();
        proxy.query();
    }
}
```

## 11.AOP

### 11.1、什么是AOP

AOP（Aspect Oriented Programming）意为：面向切面编程，通过预编译方式和运行期动态代理实现程序功能的统一维护的一种技术。AOP是OOP的延续，是软件开发中的一个热点，也是Spring框架中的一个重要内容，是函数式编程的一种衍生范型。利用AOP可以对业务逻辑的各个部分进行隔离，从而使得业务逻辑各部分之间的耦合度降低，提高程序的可重用性，同时提高了开发的效率。

![19](spring.assets/19.png)

### 11.2、AOP在Spring中的作用

##### 提供声明式事务：允许用户自定义切面

以下名词需要了解以下：

- 横切关注点：跨越应用程序多个模块的方法或功能。即是，与我们业务逻辑无关的，但是我们需要关注的部分，就是横切关注点。如日志 , 安全 , 缓存 , 事务等等 ....
- 切面（ASPECT）：横切关注点 被模块化 的特殊对象。即，它是一个类。
- 通知（Advice）：切面必须要完成的工作。即，它是类中的一个方法。
- 目标（Target）：被通知对象。
- 代理（Proxy）：向目标对象应用通知之后创建的对象。
- 切入点（PointCut）：切面通知 执行的 “地点”的定义。
- 连接点（JointPoint）：与切入点匹配的执行点。

![20](spring.assets/20.png)

SpringAOP中，通过Advice定义横切逻辑，Spring中支持5种类型的Advice:

![21](spring.assets/21.png)

**即 Aop 在 不改变原有代码的情况下 , 去增加新的功能 **

## 11.3、使用Spring实现AOP[spring09-aop]

【重点】使用AOP织入，需要导入一个依赖包

```xml
<!-- https://mvnrepository.com/artifact/org.aspectj/aspectjweaver -->
<dependency>
   <groupId>org.aspectj</groupId>
   <artifactId>aspectjweaver</artifactId>
   <version>1.9.4</version>
</dependency>
```



#### 方式一：使用Spring的API接口【主要SpringAPI的接口实现】

步骤：配置aop---》切入点(要在那个类那个方法进行打印日志)-----》环绕通知

###### 代码：

接口类（业务层接口）：

```java
package com.spring.service;
public interface UserService {
    public void add();
    public void delete();
    public void update();
    public void select();

}
```

真实类（业务层类）：

```java
package com.spring.service;
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("增加了一个用户！");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户！");
    }

    @Override
    public void update() {
        System.out.println("更新了一个用户！");
    }

    @Override
    public void select() {
        System.out.println("查询了一个用户！");
    }
}

```

方法前日志类（代理类1）：

```java
package com.spring.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice {

    @Override
    /**
     * method：要执行的目标对象的方法
     * args:参数
     * target:目标对象
     */
    public void before(Method method, Object[] ags, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"的"+method.getName()+"方法被执行了");
    }
}
```

方法后日志类（代理类2）：

```java
package com.spring.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
public class AfterLog implements AfterReturningAdvice {
    @Override
    //returnValue:返回值
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"类"+"执行了"+method.getName()+"方法，返回的结果为："+returnValue);
    }
}

```

bean.xml（spring ioc容器）:

```java
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/aop
        https://www.springframework.org/schema/aop/spring-aop.xsd">

    <bean id="userService" class="com.spring.service.UserServiceImpl"/>
    <bean id="log" class="com.spring.log.Log"/>
    <bean id="afterLog" class="com.spring.log.AfterLog"/>

    <!--方式一：使用原生Spring API接口-->
    <!--配置aop：需要导入aop的约束-->
    <aop:config>
        <!--切入点：  expression:表达式，execution(要执行的位置！ * * * * *)-->
        <aop:pointcut id="pointcut" expression="execution(* com.spring.service.UserServiceImpl.*(..))"/>
        <!--执行环绕增加！-->
        <!--环绕          那个方法                 执行那个切入点      -->
        <aop:advisor advice-ref="log" pointcut-ref="pointcut"/>
        <aop:advisor advice-ref="afterLog" pointcut-ref="pointcut"/>
    </aop:config>
</beans>
```

MyTest类（测试类）

```java
import com.spring.service.UserService;
import com.spring.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Orange
 * @create 2021-09-02  17:21
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //注意点：动态代理代理的是接口！！！不是实体类
        UserService userSerice = (UserService) context.getBean("userService");
        userSerice.add();
    }
}

```

#### 方式二：自定义来实现AOP【主要是切面定义】

步骤：1.定义切面类---》切入点-----》通知(就是日志应该放到那个时间点输出)

在上面方式一做修改，添加一个自定义的日志类

```java
package com.spring.diy;

/**
 * @author Orange
 * @create 2021-09-02  18:09
 */
public class DiyPointCut {
    public void before(){
        System.out.println("==============方法执行前===============");
    }
    public void after(){
        System.out.println("===============方法执行后==============");
    }
}
```

再修改一下bean.xml文件

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/aop
        https://www.springframework.org/schema/aop/spring-aop.xsd">
    <bean id="userService" class="com.spring.service.UserServiceImpl"/>
    <bean id="log" class="com.spring.log.Log"/>
    <bean id="afterLog" class="com.spring.log.AfterLog"/>

    <!--方式一：使用原生Spring API接口-->
    <!--配置aop：需要导入aop的约束-->
<!--    <aop:config>-->
<!--        &lt;!&ndash;切入点：  expression:表达式，execution(要执行的位置！ * * * * *)&ndash;&gt;-->
<!--        <aop:pointcut id="pointcut" expression="execution(* com.spring.service.UserServiceImpl.*(..))"/>-->
<!--        &lt;!&ndash;执行环绕增加！&ndash;&gt;-->
<!--        &lt;!&ndash;环绕          那个方法                 执行那个切入点      &ndash;&gt;-->
<!--        <aop:advisor advice-ref="log" pointcut-ref="pointcut"/>-->
<!--        <aop:advisor advice-ref="afterLog" pointcut-ref="pointcut"/>-->
<!--    </aop:config>-->

    <!--方法二：自定义类切面方法-->
    <bean id="diy" class="com.spring.diy.DiyPointCut"/>
    <aop:config>
        <!--自定义切面，ref要引用的类-->
        <aop:aspect ref="diy">
            <!--切入点-->
            <aop:pointcut id="pointcut" expression="execution(* com.spring.service.UserServiceImpl.*(..))"/>
            <!--通知，就是在切入点打印日志-->
            <aop:before method="before" pointcut-ref="pointcut"/>
            <aop:after method="after" pointcut-ref="pointcut"/>
        </aop:aspect>
    </aop:config>
</beans>
```

