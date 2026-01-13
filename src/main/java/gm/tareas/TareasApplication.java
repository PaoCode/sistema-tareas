package gm.tareas;

import gm.tareas.presentacion.SistemaTareasFX;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TareasApplication {

	public static void main(String[] args) {
//		SpringApplication.run(TareasApplication.class, args);
		Application.launch(SistemaTareasFX.class,args);
	}

}
