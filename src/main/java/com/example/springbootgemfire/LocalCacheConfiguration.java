package com.example.springbootgemfire;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.gemfire.config.annotation.ClientCacheApplication;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;
import org.springframework.data.gemfire.config.annotation.EnableIndexing;
import org.springframework.data.gemfire.config.annotation.EnablePdx;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;
import org.springframework.stereotype.Component;

@Profile("default")
@Component
@ClientCacheApplication(
        keepAlive = true,
        readyForEvents = true,
        subscriptionEnabled = true
)
@EnableEntityDefinedRegions(basePackages = "com.example.springbootgemfire.model")
@EnableGemfireRepositories(basePackages = "com.example.springbootgemfire.repository")
@EnablePdx
@EnableIndexing
@Configuration
public class LocalCacheConfiguration {

}

