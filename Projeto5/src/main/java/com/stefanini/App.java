package com.stefanini;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.stefanini.projeto.model.Cachorro;
import com.stefanini.projeto.model.Dono;

@SpringBootApplication
public class App extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
//	public void run(String... args) throws Exception {
//
//		Cachorro c1 = new Cachorro("Tuco", 2);
//		Cachorro c2 = new Cachorro("Pit", 10);
//		Dono d1 = new Dono("Matheus Campelo");
//		
//		
//		aluno.setMochilas(Arrays.asList(mochila1, mochila2));
//
//		mochila1.setAluno(aluno);
//		mochila2.setAluno(aluno);
//
//		// Pesistindo no banco de dados:
//
//		System.out.println("Persisitindo dados...");
//
//		alunoRepository.saveAll(Arrays.asList(aluno));
//		mochilaRepository.saveAll(Arrays.asList(mochila1, mochila2));
//
//	}
}
