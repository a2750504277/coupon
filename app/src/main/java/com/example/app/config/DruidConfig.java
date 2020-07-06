package com.example.app.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 @Description
 @author ${USER}
 @date  ${TIME}
*/
@Configuration
public class DruidConfig {

           @Value("${druid.login.user_name}")
           private String userName;
           @Value("${druid.login.password}")
           private String password;

         @Bean(name="default_datasource")
         @ConfigurationProperties(prefix ="spring.datasource")
         public DataSource druidDataSource(){
                 return new DruidDataSource();
         }

    /** show 方法的简述.
    * <p>show  连接 druid 后台管理的bean<br>
    * @param
    * @return org.springframework.boot.web.servlet.ServletRegistrationBean
    * @Author Administrator
     * @Date 2020/6/24
     */
    @Bean
    public ServletRegistrationBean druidServlet() {
        ServletRegistrationBean servletRegistrationBean = new
                ServletRegistrationBean();
        servletRegistrationBean.setServlet(new StatViewServlet());
        servletRegistrationBean.addUrlMappings("/druid/*");
        Map<String, String> initParameters = new HashMap<>(4);
        //户名
        initParameters.put("loginUsername", userName);
        //密码
        initParameters.put("loginPassword", password);
        //禁⽤HTML⻚⾯上   的“Reset All”功能
        initParameters.put("resetEnable", "false");

        servletRegistrationBean.setInitParameters(initParameters);
        return servletRegistrationBean;
    }

    /** show 方法的简述.
    * <p>show druid 进行全局路径拦截<br>
    * @param
    * @return org.springframework.boot.web.servlet.FilterRegistrationBean
    * @Author Administrator
     * @Date 2020/6/24
     */
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new
                FilterRegistrationBean();
        filterRegistrationBean.setFilter(new WebStatFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.addInitParameter("exclusions",
                "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }


}
