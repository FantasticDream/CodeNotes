package pers.zc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/*
 *   @创建人  zc
 *   @创建时间 2020/10/27 1:19
 *   @包名: pers.zc
 *   @描述：
 */
@SpringBootApplication
@ImportResource("classpath:provider.xml")
public class MyProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyProducerApplication.class);
    }
}
