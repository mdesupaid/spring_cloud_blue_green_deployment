package pl.upaid.springcloudbluegreendeployment;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties
public class StageProperties {
    private String stage;
}
