package pl.upaid.springcloudbluegreendeployment;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties(StageProperties.class)
public class SpringCloudBlueGreenDeployment {

    public static void main(String[] args) {
        run(SpringCloudBlueGreenDeployment.class, args);
    }
}
