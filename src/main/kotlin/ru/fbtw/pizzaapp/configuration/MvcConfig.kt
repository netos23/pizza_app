package ru.fbtw.pizzaapp.configuration

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class MvcConfig(@param:Value("\${upload-path}") private val uploadPath: String) : WebMvcConfigurer {
    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
        registry.addResourceHandler("/images/**")
            .addResourceLocations("classpath:/static/images/", uploadPath)
        registry.addResourceHandler("/static/**")
            .addResourceLocations("classpath:/static/")
    }
}