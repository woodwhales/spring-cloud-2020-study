# spring-cloud-2020-study

> 如果使用 github 克隆仓库缓慢，可以移步到笔者在 gitee 平台实时同步的仓库：https://gitee.com/woodwhales/spring-cloud-2020-study

# 概述

## 课程相关资料

Spring Cloud 第二季：

> 对应视频：[尚硅谷2020最新版SpringCloud(H版&alibaba)框架开发教程全套完整版从入门到精通(大牛讲授spring cloud)](https://www.bilibili.com/video/BV18E411x7eT?p=4)
>
> 周阳老师也在自己的 GitHub 仓库上发布了当堂源码：https://github.com/zzyybs/atguigu_spirngcloud2020
>
> 笔者也 fork 了一份该源码：https://github.com/woodwhales/atguigu_spirngcloud2020
>
> 对应资料：[尚硅谷SpringCloud第2季](doc/尚硅谷SpringCloud第2季)，建议使用[百度脑图](https://naotu.baidu.com)打开（只能看文字，不能看图片）。
>
> 网友整理的学习笔记或者资料：
>
> https://github.com/liusCoding/springcloud-2020
>
> https://github.com/leelovejava/cloud2020
>
> https://github.com/OT-mt/cloud2020


所需软件：

apache-jmeter-5.3：https://archive.apache.org/dist/jmeter/binaries/apache-jmeter-5.3.zip

consul_1.7.2_windows_amd64：https://releases.hashicorp.com/consul/1.7.2/consul_1.7.2_windows_amd64.zip

nacos-server-1.1.4：https://github.com/alibaba/nacos/releases/download/1.1.4/nacos-server-1.1.4.zip

seata-server-0.9.0：https://github.com/seata/seata/releases/download/v0.9.0/seata-server-0.9.0.zip

sentinel-dashboard-1.6.3：https://github.com/alibaba/Sentinel/releases/download/1.6.3/sentinel-dashboard-1.6.3.jar

zipkin-server-2.12.9-exec：https://dl.bintray.com/openzipkin/maven/io/zipkin/java/zipkin-server/2.12.9/zipkin-server-2.12.9-exec.jar

zookeeper-3.4.11：https://archive.apache.org/dist/zookeeper/zookeeper-3.4.11/zookeeper-3.4.11.tar.gz

想完全打开思维导图，则需要安装 MindManager：https://www.mindmanager.com/en/support/download-library/

## 课程大纲

课程大纲的思维导图如下：

![](doc/images/spring-cloud-2020-study-guide.png)

因为上述思维导图文件太大，不利于快速打开阅读学习，所以笔者在此思维导图基础上结合视频教程，自己整理一套属于自己的学习笔记。

# 一、微服务架构零基础理论入门(小白必看)

## 笔记大纲

技术要求：java8 + maven + git、github + Nginx + RabbotMQ + SpringBoot2.0

Git 源码地址：[https:github.com/spring-projects/spring-boot/releases/](https:github.com/spring-projects/spring-boot/releases/)

Spring Cloud 视频教程第一季大纲：

![](doc/images/spring-cloud-2018.png)

> 对应视频：[尚硅谷经典SpringCloud框架开发教程全套完整版从入门到精通(大牛讲授spring cloud)](https://www.bilibili.com/video/BV1wW411V7Df)
>
> 对应资料：[尚硅谷SpringCloud第1季](doc/尚硅谷SpringCloud第1季)

## 扩展资料

尚硅谷Java面试题第一季：

> 对应视频：[尚硅谷经典Java面试题第一季(java面试精讲)](https://www.bilibili.com/video/BV1Eb411P7bP)
>
> 对应资料：[尚硅谷Java面试题第1季](doc/尚硅谷Java面试题第1季)

尚硅谷Java面试题第二季：

> 对应视频：[尚硅谷Java大厂面试题第二季(java面试必学，周阳主讲)](https://www.bilibili.com/video/BV18b411M7xz)
>
> 对应资料：[尚硅谷Java面试题第2季](doc/尚硅谷Java面试题第2季)
>
> 网友整理的学习笔记或者资料：
>
> https://github.com/MaJesTySA/JVM-JUC-Core
>
> https://github.com/yangjinwh/Mindmap
>
> https://gitee.com/moxi159753/LearningNotes/tree/master/%E6%A0%A1%E6%8B%9B%E9%9D%A2%E8%AF%95/JUC

尚硅谷Java面试题第三季：

> 对应视频：[尚硅谷2021逆袭版Java面试题第三季（java大厂面试题，周阳主讲）](https://www.bilibili.com/video/BV1Hy4y1B78T)
>
> 对应资料：[尚硅谷Java面试题第3季](doc/尚硅谷Java面试题第3季)

尚硅谷Java数据结构与java算法（Java数据结构与算法）：

> 对应视频：[尚硅谷Java数据结构与java算法（Java数据结构与算法）](https://www.bilibili.com/video/BV1E4411H73v)
>
> 对应资料：[尚硅谷图解Java数据结构和算法](doc/尚硅谷图解Java数据结构和算法)

尚硅谷JUC：

> 对应视频：https://www.bilibili.com/video/BV1c4411w7c7
>
> 对应资料：[尚硅谷JUC](doc/尚硅谷JUC)

juc 与 jvm _并发编程

> 对应视频：https://www.bilibili.com/video/BV1vE411D7KE
>
> 对应资料：[尚硅谷JUC-JVM](doc/尚硅谷JUC-JVM)

# 二、从2.2.x和H版开始说起

## Spring Cloud 与 Spring Boot 版本对应关系

Spring Boot 2.0 wiki：https:github.com/spring-projects/spring-boot/wiki/Spring-Boot-2.0-Release-Notes

Spring Cloud 版本选择需要注意对应 Spring Boot 版本，在 Spring Cloud 官网中 https://spring.io/projects/spring-cloud/#overview 提到：

![](doc/images/spring-cloud-and-spring-boot-version.png)

本视频教程时，2020 年 02 月 15 日 之前，Spring Cloud 最新版本为：Hoxton.SR1，支持的 Spring Boot 版本为：2.2.2.RELEASE。

Spring Cloud 版本可支持的 Spring Boot 版本，在其官网：中已经写明：

![](doc/images/spring-cloud-guide1.png)

![](doc/images/spring-cloud-guide2.png)

Spring 系列版本对应关系，官方参考地址：https://start.spring.io/actuator/info

## 本笔记使用版本

本笔记统一使用如下版本：

	cloud：Hoxton.SR1
	boot：2.2.RELEASE
	cloud：alibaba 2.1.0.RELEASE
	java：Java8
	Maven：3.5及以上
	mysql：5.7及以上


# 三、关于Cloud各种组件的停更/升级/替换

截止 2020 年，Spring Cloud 各种组件的停更/升级/替换：

- 服务注册中心
  Eureka：停更			
  Zookeeper：替代品
  Consul：替代品
  Spring Cloud Alibaba Nacos：替代品（主推）

- 服务调用
  Ribbon：更新变慢，有停更趋势
  Loadbalancer：Spring 新主推产品

- 服务调用
  Feign：停更
  OpenFeign：Spring 新主推产品
- 服务降级
  Hystrix：停更
  resilience4j：替代品，国外使用多
  alibaba Sentinel：替代品，国内使用多
- 服务网关
  Zuul：停更
  Zuul2：推出时间未知，慎用
  gateway：Spring 新主推产品
- 服务配置
  Config：停更
  Spring Cloud Alibaba Nacos：替代品（主推）
  apollo：替代品
- 服务主线
  Bus：停更
  Spring Cloud Alibaba Nacos：替代品（主推）

# 四、微服务架构编码、构建

笔者使用的 IDEA 版本为：2020.2

![](doc/images/code01/00.png)

## 创建父工程

### 创建maven工程

![](doc/images/code01/01.png)

![](doc/images/code01/02.png)

### 设置编码字符集

点击创建好的工程根目录，File -> setttings 设置字符集编码

![](doc/images/code01/03.png)

### 设置 IDEA 支持注解

![](doc/images/code01/04.png)

### 设置JDK编译版本

![](doc/images/code01/05.png)

### IDEA设置无关工程文件不显示

参见笔者的博文：[IDEA 常用设置：忽略显示与工程无关的文件](https://woodwhales.cn/2020/03/03/060/#%E5%BF%BD%E7%95%A5%E6%98%BE%E7%A4%BA%E4%B8%8E%E5%B7%A5%E7%A8%8B%E6%97%A0%E5%85%B3%E7%9A%84%E6%96%87%E4%BB%B6)

## 设置父工程POM

将上述模板工程改造成空的父工程：

![](doc/images/code01/06.png)

设置版本依赖管理：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>cn.woodwhales</groupId>
    <artifactId>spring-cloud-demo1</artifactId>
    <version>1.0.0</version>
    <packaging>pom</packaging>

    <name>spring-cloud-demo1</name>
    <url>http://woodwhales.cn/</url>

    <!-- 统一管理jar包版本 -->
    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
        <junit.version>4.12</junit.version>
        <log4j.version>1.2.17</log4j.version>
        <lombok.version>1.16.18</lombok.version>
        <mysql.version>8.0.18</mysql.version>
        <druid.version>1.1.16</druid.version>
        <druid.spring.boot.starter.version>1.1.10</druid.spring.boot.starter.version>
        <spring.boot.version>2.2.2.RELEASE</spring.boot.version>
        <spring.cloud.version>Hoxton.SR1</spring.cloud.version>
        <spring.cloud.alibaba.version>2.1.0.RELEASE</spring.cloud.alibaba.version>
        <mybatis.spring.boot.version>1.3.0</mybatis.spring.boot.version>
        <mybatis-spring-boot-starter.version>2.1.1</mybatis-spring-boot-starter.version>
        <hutool-all.version>5.1.0</hutool-all.version>
    </properties>

    <!-- 子模块继承之后，提供作用：锁定版本 + 子module不用谢groupId和version -->
    <dependencyManagement>
        <dependencies>
            <!--spring boot 2.2.2-->
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-dependencies</artifactId>
                <version>2.2.2.RELEASE</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
            <!--spring cloud Hoxton.SR1-->
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-dependencies</artifactId>
                <version>Hoxton.SR1</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
            <!--Spring cloud alibaba 2.1.0.RELEASE-->
            <dependency>
                <groupId>com.alibaba.cloud</groupId>
                <artifactId>spring-cloud-alibaba-dependencies</artifactId>
                <version>2.1.0.RELEASE</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
            <dependency>
                <groupId>mysql</groupId>
                <artifactId>mysql-connector-java</artifactId>
                <version>${mysql.version}</version>
            </dependency>
            <dependency>
                <groupId>com.alibaba</groupId>
                <artifactId>druid</artifactId>
                <version>${druid.version}</version>
            </dependency>
            <dependency>
                <groupId>com.alibaba</groupId>
                <artifactId>druid-spring-boot-starter</artifactId>
                <version>${druid.spring.boot.starter.version}</version>
            </dependency>
            <dependency>
                <groupId>org.mybatis.spring.boot</groupId>
                <artifactId>mybatis-spring-boot-starter</artifactId>
                <version>${mybatis-spring-boot-starter.version}</version>
            </dependency>
            <dependency>
                <groupId>org.projectlombok</groupId>
                <artifactId>lombok</artifactId>
                <version>${lombok.version}</version>
            </dependency>
        </dependencies>
    </dependencyManagement>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <fork>true</fork>
                    <addResources>true</addResources>
                </configuration>
            </plugin>
        </plugins>
    </build>

    <!--第三方maven私服-->
    <repositories>
        <repository>
            <id>nexus-aliyun</id>
            <name>Nexus aliyun</name>
            <url>http://maven.aliyun.com/nexus/content/groups/public</url>
            <releases>
                <enabled>true</enabled>
            </releases>
            <snapshots>
                <enabled>true</enabled>
            </snapshots>
        </repository>
    </repositories>

</project>
```

## 搭建父工程

使用 IDEA 创建 project，pom 配置如下：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>cn.woodwhales</groupId>
    <artifactId>spring-cloud-project</artifactId>
    <version>1.0.0</version>
    <packaging>pom</packaging>

    <name>spring-cloud-project</name>
    <url>http://woodwhales.cn/</url>

    <!-- 统一管理jar包版本 -->
    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
        <junit.version>4.12</junit.version>
        <log4j.version>1.2.17</log4j.version>
        <lombok.version>1.16.18</lombok.version>
        <mysql.version>8.0.18</mysql.version>
        <druid.version>1.1.16</druid.version>
        <druid.spring.boot.starter.version>1.1.10</druid.spring.boot.starter.version>
        <spring.boot.version>2.2.2.RELEASE</spring.boot.version>
        <spring.cloud.version>Hoxton.SR1</spring.cloud.version>
        <spring.cloud.alibaba.version>2.1.0.RELEASE</spring.cloud.alibaba.version>
        <mybatis.spring.boot.version>1.3.0</mybatis.spring.boot.version>
        <mybatis-spring-boot-starter.version>2.1.1</mybatis-spring-boot-starter.version>
        <hutool-all.version>5.1.0</hutool-all.version>
    </properties>

    <!-- 子模块继承之后，提供作用：锁定版本 + 子module不用写groupId和version -->
    <dependencyManagement>
        <dependencies>
            <!--spring boot 2.2.2-->
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-dependencies</artifactId>
                <version>2.2.2.RELEASE</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
            <!--spring cloud Hoxton.SR1-->
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-dependencies</artifactId>
                <version>Hoxton.SR1</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
            <!--Spring cloud alibaba 2.1.0.RELEASE-->
            <dependency>
                <groupId>com.alibaba.cloud</groupId>
                <artifactId>spring-cloud-alibaba-dependencies</artifactId>
                <version>2.1.0.RELEASE</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
            <dependency>
                <groupId>mysql</groupId>
                <artifactId>mysql-connector-java</artifactId>
                <version>${mysql.version}</version>
            </dependency>
            <dependency>
                <groupId>com.alibaba</groupId>
                <artifactId>druid</artifactId>
                <version>${druid.version}</version>
            </dependency>
            <dependency>
                <groupId>com.alibaba</groupId>
                <artifactId>druid-spring-boot-starter</artifactId>
                <version>${druid.spring.boot.starter.version}</version>
            </dependency>
            <dependency>
                <groupId>org.mybatis.spring.boot</groupId>
                <artifactId>mybatis-spring-boot-starter</artifactId>
                <version>${mybatis-spring-boot-starter.version}</version>
            </dependency>
            <dependency>
                <groupId>org.projectlombok</groupId>
                <artifactId>lombok</artifactId>
                <version>${lombok.version}</version>
            </dependency>
        </dependencies>
    </dependencyManagement>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <fork>true</fork>
                    <addResources>true</addResources>
                </configuration>
            </plugin>
        </plugins>
    </build>

    <!--第三方maven私服-->
    <repositories>
        <repository>
            <id>nexus-aliyun</id>
            <name>Nexus aliyun</name>
            <url>http://maven.aliyun.com/nexus/content/groups/public</url>
            <releases>
                <enabled>true</enabled>
            </releases>
            <snapshots>
                <enabled>true</enabled>
            </snapshots>
        </repository>
    </repositories>

</project>
```

## 搭建子工程（cloud-api-commons）

选中父工程文件目录，右击选择创建 “Module”，创建 cloud-api-commons 子工程。

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>spring-cloud-project</artifactId>
        <groupId>cn.woodwhales</groupId>
        <version>1.0.0</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <artifactId>cloud-api-commons</artifactId>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>cn.hutool</groupId>
            <artifactId>hutool-all</artifactId>
            <version>5.1.0</version>
        </dependency>
    </dependencies>
</project>
```

## 搭建子工程（cloud-provider-payment8001）

选中父工程文件目录，右击选择创建 “Module”，创建 cloud-provider-payment8001 子工程。

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>spring-cloud-project</artifactId>
        <groupId>cn.woodwhales</groupId>
        <version>1.0.0</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <artifactId>cloud-provider-payment8001</artifactId>

    <dependencies>
        <!--引入其他工程-->
        <!-- 引入自己定义的api通用包，可以使用Payment支付Entity -->
        <dependency>
            <groupId>cn.woodwhales</groupId>
            <artifactId>cloud-api-commons</artifactId>
            <version>${project.version}</version>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
        </dependency>
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>druid-spring-boot-starter</artifactId>
        </dependency>
        <dependency>
            <groupId>org.mybatis.spring.boot</groupId>
            <artifactId>mybatis-spring-boot-starter</artifactId>
        </dependency>
        <!--jdbc-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-jdbc</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>

    </dependencies>

</project>
```

编写系统配置文件：

```yml
server:
  port: 8001

spring:
  application:
    name: cloud-provider-payment

  datasource:
    type: com.alibaba.druid.pool.DruidDataSource
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/cloud-2020?useUnicode=true&characterEncoding=utf-8&useSSL=false
    username: root
    password: root1234

mybatis:
  mapper-locations: classpath:mapper/*.xml
  type-aliases-package: cn.woodwhales.springcloud.entity
```

## IDEA 设置热部署

### 步骤1：子工程引用 spring-boot-devtools

各个子工程引用：

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
    <scope>runtime</scope>
    <optional>true</optional>
</dependency>
```

### 步骤2：父工程引用 spring-boot-maven-plugin

父工程引用：

```xml
<plugins>
    <plugin>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-maven-plugin</artifactId>
        <configuration>
            <fork>true</fork>
            <addResources>true</addResources>
        </configuration>
    </plugin>
</plugins>
```

### 步骤3：设置 IDEA 及时编译

![](doc\images\code01\07.png)

### 步骤4：IDEA 系统参数设置

按键：ctrl+shift+alt+/，搜索 Registry

![](doc\images\code01\08.png)

![](doc\images\code01\09.png)

## 搭建子工程（cloud-consumer-order80）

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>spring-cloud-project</artifactId>
        <groupId>cn.woodwhales</groupId>
        <version>1.0.0</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <artifactId>cloud-consumer-order80</artifactId>

    <dependencies>
        <!-- 引入自己定义的api通用包，可以使用Payment支付Entity -->
        <dependency>
            <groupId>cn.woodwhales</groupId>
            <artifactId>cloud-api-commons</artifactId>
            <version>${project.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>
</project>
```

# 五、Eureka服务注册与发现

# 六、Zookeeper服务注册与发现

# 七、Consul服务注册与发现

# 八、Ribbon负载均衡调用

# 九、OpenFeign服务接口调用

# 十、Hystrix断路器

# 十一、Zuul路由网关

# 十二、Gateway新一代网关

# 十三、SpringCloud Config（分布式配置中心）

# 十四、SpringCloud Bus消息总线

# 十五、SpringCloud Stream消息驱动

# 十六、SpringCloud Sleuth分布式链路跟踪

# 十七、SpringCloud Alibaba入门简介

# 十八、SpringCloud Alibaba Nacos服务注册和配置中心

# 十九、SpringCloud Alibaba Sentinel实现熔断与限流

# 二十、SpringCloud Alibaba Seata处理分布式事务

# 二十一、大厂面试第三季(预告片)

