package com.github.dimitryivaniuta.gateway.botdefense.consumer;

import com.github.dimitryivaniuta.gateway.botdefense.net.IpResolverProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Entry point for the Kafka step-up consumer pipeline.
 */
@SpringBootApplication(scanBasePackages = "com.github.dimitryivaniuta.gateway.botdefense")
@EnableConfigurationProperties({ConsumerProperties.class, IpResolverProperties.class})
public class StepUpConsumerApplication {

    /**
     * Main method.
     */
    public static void main(String[] args) {
        SpringApplication.run(StepUpConsumerApplication.class, args);
    }
}
