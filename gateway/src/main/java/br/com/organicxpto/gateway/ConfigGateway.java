package br.com.organicxpto.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Bruno Gomes Damascena dos santos (bruno-gds) < brunog.damascena@gmail.com >
 * Date: 20/02/2024
 * Project Name: spring-cloud
 */

@Configuration
public class ConfigGateway {

    @Bean
    public RouteLocator custom(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("estoque", r -> r.path("/estoque/**")
                        .and()
                        .not(p -> p.path("/estoque/api/**"))
                        .filters(f -> f.stripPrefix(1))
                        .uri("http://localhost:8081"))
                .route("pedidos", r -> r.path("/pedidos/**")
                        .filters(f -> f.stripPrefix(1))
                        .uri("http://localhost:8082"))
                .build();
    }
}
