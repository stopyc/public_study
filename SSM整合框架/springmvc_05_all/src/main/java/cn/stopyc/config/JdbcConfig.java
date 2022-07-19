package cn.stopyc.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;


/**
 * @program: spring_01_quickstart
 * @description:
 * @author: stop.yc
 * @create: 2022-07-18 15:00
 **/
public class JdbcConfig {
    //添加简单数据类型,如何配置请看上面介绍

    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;


    //1.定义一个方法获得要管理的对象
    //2.添加@Bean,表示当前方法的返回值是一个bean

    //3.添加引用类型,只要引用类型是被加载到容器当中,直接加入形参即可
    @Bean
    public DataSource dataSource () {
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }

    //配置事务管理器，mybatis使用的是jdbc事务
    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource){
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }
}
