package ru.fbtw.pizzaapp.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.annotation.EnableAsync
import org.springframework.scheduling.annotation.EnableScheduling
import ru.fbtw.pizzaapp.service.SecludeService

@EnableAsync
@EnableScheduling
@Configuration
class SchedulerConfig {
    @Bean
    fun createScheduler(): SecludeService {
        TODO("Not yet implemented")
    }
}