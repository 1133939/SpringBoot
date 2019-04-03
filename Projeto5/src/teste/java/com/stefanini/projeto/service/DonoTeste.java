package com.stefanini.projeto.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import com.stefanini.projeto.exception.TreinaException;
import com.stefanini.projeto.model.Cachorro;
import com.stefanini.projeto.model.Dono;
import com.stefanini.projeto.service.DonoService;

public class DonoTeste {
	
	@Autowired
	private DonoService service;
	
	
	@Test
public void teste_buscaPorNome() {
	
}
	@Test
public void teste_buscaPeloId() {
	
}
	@Test
public void teste_buscaTodosDonos() throws TreinaException {
	service.findAll();
}
	@Test
public void teste_deletarDono() {
	
}	
	@Test
public void teste_cadastrarDono() {
	Dono dono = new Dono("Aroldo");
	Cachorro cachorro1 = new Cachorro("Tuco",2);
	List<Cachorro> cachorros = new ArrayList<>();
	cachorros.add(cachorro1);
	dono.setCachorros(cachorros);
	cachorro1.setDono(dono);
	
	service.save(dono);	

}
	@Test
public void teste_atualizarDono() {
	
}
}
