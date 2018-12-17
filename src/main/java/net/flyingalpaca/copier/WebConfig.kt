package net.flyingalpaca.copier

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

/**
 * Spring MVCの設定クラス.
 *
 * @author Suita Fujino
 */

@Configuration
open class WebConfig : WebMvcConfigurer {

    /**
     * {@inheritDoc}
     */
    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
        registry
                .addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/")
    }
}
