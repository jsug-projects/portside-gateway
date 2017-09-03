package jsug.portside.portsidegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.web.server.WebFilter;

@SpringBootApplication
@EnableDiscoveryClient
public class PortsideGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortsideGatewayApplication.class, args);
	}

	@Bean
	WebFilter corsFilter() {
		return (exchange, chain) -> {
			HttpHeaders headers = exchange.getResponse().getHeaders();
			headers.add("Access-Control-Allow-Origin", "*");
			headers.add("Access-Control-Allow-Methods",
					"OPTIONS, POST, GET, OPTIONS, PUT, DELETE");
			headers.add("Access-Control-Max-Age", "3600");
			headers.add("Access-Control-Allow-Headers",
					"Origin, X-Requested-With, Content-Type, Accept, Authorization");
			return chain.filter(exchange);
		};
	}
}
