package com.example.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.example.demo.models.Cliente;

public interface IClienteService {
	
	//ESTA CLASE ES UNA INTERFAZ DE LOS METODOS QUE VAMOS A IMPLEMENTAR
	

	public List<Cliente> listar()throws Exception;
	public Optional<Cliente>listarId(int id)throws Exception;
	public String save(Cliente cliente) throws Exception;
	public String actualiza(Cliente cliente)throws Exception;
	public String delete(int id) throws Exception;
	public String deleteAll()throws Exception;
	
	
}
