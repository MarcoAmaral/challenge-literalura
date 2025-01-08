package com.br.marco.literalura;

import com.br.marco.literalura.main.Main;
import com.br.marco.literalura.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {
		public static void main(String[] args) {
				SpringApplication.run(LiteraluraApplication.class, args);
		}

		@Autowired
		private BookRepository repository;

		@Override
		public void run(String... args) throws Exception {
				Main main = new Main(repository);
				main.displayMenu();
		}
}