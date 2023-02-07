package com.example.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.example.demo.models.Cliente;

public interface IClienteService {
	
	//ESTA CLASE ES UNA INTERFAZ DE LOS METODOS QUE VAMOS A IMPLEMENTAR
	

	public List<Cliente> listar();
	public Optional<Cliente>listarId(int id);
	public String save(Cliente cliente);
	public String actualiza(Cliente cliente);
	public String delete(int id);
	public String deleteAll();
	
	
}