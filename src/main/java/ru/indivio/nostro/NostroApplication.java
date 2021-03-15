package ru.indivio.nostro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import ru.indivio.nostro.config.NostroConfig;

@SpringBootApplication
@Import(NostroConfig.class) //Подключаем класс конфигурации .class так как интерфейс принимает  классы
public class NostroApplication {

	public static void main(String[] args) {
		SpringApplication.run(NostroApplication.class, args);
	}

}
