package com.stefanini.projeto.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stefanini.projeto.exception.TreinaException;
import com.stefanini.projeto.model.Dono;
import com.stefanini.projeto.repository.DonoRepository;

@Service
public class DonoService {

	@Autowired
	private DonoRepository repository;
	
	public List<Dono> findAll() throws TreinaException {
		List<Dono> donos = (List<Dono>)repository.findAll();
		return donos;
		}
	
	public void save(Dono dono){
		repository.save(dono);
	}
	}

