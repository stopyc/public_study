package cn.stopyc.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @program: spring_01_quickstart
 * @description:
 * @author: stop.yc
 * @create: 2022-07-18 15:12
 **/
public class MybatisConfig {

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){

        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();

        //设置模型类的别名扫描
        ssfb.setTypeAliasesPackage("cn.stopyc.po");

//        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
//        configuration.setLogImpl(Log4jImpl.class);

        //设置数据源
        ssfb.setDataSource(dataSource);

        return ssfb;
    }


    //定义bean，返回MapperScannerConfigurer对象
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("cn.stopyc.dao");
        return msc;
    }
}
