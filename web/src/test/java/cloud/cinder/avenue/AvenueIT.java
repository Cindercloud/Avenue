package cloud.cinder.avenue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AvenueApp.class)
public class AvenueIT {

    @Autowired
    private Environment env;

    @Test
    public void avenueCorrectlyStarts() throws Exception {
        assertThat(env.getProperty("spring.application.name")).isEqualTo("Avenue");
    }
}
