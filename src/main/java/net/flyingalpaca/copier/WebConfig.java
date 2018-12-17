package net.flyingalpaca.copier;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Spring MVCの設定クラス.
 *
 * @author Suita Fujino
 */

@Configuration
public class WebConfig implements WebMvcConfigurer {

    /**
     * {@inheritDoc}
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");
    }
}
