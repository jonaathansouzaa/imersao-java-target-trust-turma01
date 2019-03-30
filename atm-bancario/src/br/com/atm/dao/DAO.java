package br.com.atm.dao;

import java.util.List;

public interface DAO<T> {

	public void incluir(T object);
	
	public void atualizar(T object);
	
	public void deletar(T object);
	
	public List<T> listar();
	
}
