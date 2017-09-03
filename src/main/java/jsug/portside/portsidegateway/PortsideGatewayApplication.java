package jsug.portside.portsidegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PortsideGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortsideGatewayApplication.class, args);
	}
}
