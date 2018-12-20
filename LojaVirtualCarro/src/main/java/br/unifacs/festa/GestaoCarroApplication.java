package br.unifacs.festa;

import br.unifacs.festa.model.CarroRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GestaoCarroApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaoCarroApplication.class, args);
	}
        
        @Bean
        public CarroRepository repositorio(){
            return new CarroRepository();
        }
        

}

