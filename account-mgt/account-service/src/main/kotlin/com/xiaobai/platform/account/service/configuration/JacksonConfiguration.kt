package com.xiaobai.platform.account.service.configuration

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 *
 *  @author  : xiaobai
 */
@Configuration
class JacksonConfiguration {

    @Bean
    fun objectMapper(): ObjectMapper =
        ObjectMapper().registerModule(JavaTimeModule())
                .registerModule(ParameterNamesModule())
                .registerModule(Jdk8Module())
                .registerModule(KotlinModule())


}