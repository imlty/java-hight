package com.lagou.config;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import com.lagou.Injector.MySqlInjector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisPlusConfig {

    /*
        分页插件
     */
   /* @Bean
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }*/

   /*
        性能分析插件
    */

   @Bean
   public PerformanceInterceptor performanceInterceptor(){

       PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
        // 设置sql语句的最大执行时间
       performanceInterceptor.setMaxTime(100);
       // 设置sql是否格式化显示
       performanceInterceptor.setFormat(true);

       return performanceInterceptor;
   }

   /*
         乐观锁插件
    */

   @Bean
   public OptimisticLockerInterceptor optimisticLockerInterceptor(){

       return  new OptimisticLockerInterceptor();
   }


    /*
        自定义的sql注入器
    */

    @Bean
   public MySqlInjector mySqlInjector(){
       return new MySqlInjector();
   }



}
