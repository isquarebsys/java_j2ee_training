package jersey;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(JerseyEndpointSample.class);
    }

}