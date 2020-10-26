package pers.zc;

/*
 *   @创建人  zc
 *   @创建时间 2020/10/27 1:42
 *   @包名: pers.zc
 *   @描述：
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("comsumer.xml")
public class MyConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyConsumerApplication.class);
    }
}
