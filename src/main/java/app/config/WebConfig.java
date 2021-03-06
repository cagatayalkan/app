package app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/*.js/**").addResourceLocations("/ui/static/");
//        registry.addResourceHandler("/*.css/**").addResourceLocations("/ui/static/");
    }
    
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/login").setViewName("login/login");
        registry.addViewController("/logout").setViewName("login/logout");
    }
    
//    @Bean
//    public InternalResourceViewResolver setupViewResolver()  {
////        InternalResourceViewResolver resolver =  new InternalResourceViewResolver();
////        resolver.setPrefix ("/ui/jsp/");
////        resolver.setSuffix (".jsp");
////        resolver.setViewClass (JstlView.class);
////        return resolver;
//    }

}
