package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

}
// 설정에서 gradle intelliJ로 바꿔주면
// gradle을 통하지 않고 intelliJ 에서 Java를 바로 돌려버려서 빠르다.