package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaceService.IClienteService;
import com.example.demo.interfaces.ICliente;
import com.example.demo.models.Cliente;

@Service
public class ClienteService implements IClienteService{
	
	//ESTA CLASE TIENE LA IMPLEMENTACION DE LOS METODOS QUE ESTAN EN LA INTERFAZ
	
	@Autowired
	private ICliente data;

	@Override
	public List<Cliente> listar() {
		return (List<Cliente>)data.findAll();
	}

	@Override
	public Optional<Cliente> listarId(int id) {
		return (Optional<Cliente>)data.findById(id);
	}

	@Override
	public String save(Cliente cliente)throws Exception {
		String strMensaje = "";
		try {
			data.save(cliente);
			strMensaje = "Transacción Exitosa";
		}catch (Exception e) {
			e.printStackTrace();
			strMensaje = "Excepción del aplicativo , Mensaje Sistemas: "+e.getLocalizedMessage();
			throw new Exception(strMensaje);
		}
		
		return strMensaje;
	}
	
	
	@Override
	public String actualiza(Cliente cliente)throws Exception {
		
		Cliente cl = data.findById(cliente.getId()).get();
		
		cl.setAddressHome(cliente.getAddressHome());
		cl.setBirthay(cliente.getBirthay());
		cl.setCellPhone(cliente.getCellPhone());
		cl.setFirstName(cliente.getFirstName());
		cl.setLastName(cliente.getLastName());
		cl.setGender(cliente.getGender());
		cl.setIncomes(cliente.getIncomes());
		cl.setProfession(cliente.getProfession());
		cl.setHomePhone(cliente.getHomePhone());
		
		
		String strMensaje = "";
		try {
			data.save(cl);
			strMensaje = "Transacción Exitosa";
		}catch (Exception e) {
			e.printStackTrace();
			strMensaje = "Excepción del aplicativo , Mensaje Sistemas: "+e.getLocalizedMessage();
			throw new Exception(strMensaje);
		}
		
		return strMensaje;
	}
	
	

	@Override
	public String delete(int id) throws Exception {
		String strMensaje = "";
		try {
			data.deleteById(id);
			strMensaje = "OK";
		}catch (Exception e) {
			e.printStackTrace();
			strMensaje = "Excepción del aplicativo , Mensaje Sistemas: "+e.getLocalizedMessage();
			throw new Exception(strMensaje);
		}
		return strMensaje;
	}

	@Override
	public String deleteAll()throws Exception {
		String strMensaje = "";
		try {
			data.deleteAll();
			strMensaje = "Transacción Exitosa";
		}catch (Exception e) {
			e.printStackTrace();
			strMensaje = "Excepción del aplicativo , Mensaje Sistemas: "+e.getLocalizedMessage();
			throw new Exception(strMensaje);
		}
		return strMensaje;
	}

}
