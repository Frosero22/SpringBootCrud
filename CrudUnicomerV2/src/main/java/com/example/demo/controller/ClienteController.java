package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.interfaceService.IClienteService;
import com.example.demo.models.Cliente;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	//ESTA CLASE ES LA QUE CONTENDRA LOS METODOS QUE EL FRONT VA A CONSUMIR
	//DENTRO DE CADA METODO SE ENCUENTRA LA INTERFACE DEL SERVICIO A LA CUAL ACCEDEREMOS
	
	@Autowired
	private IClienteService clienteService;
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Cliente> getCliente(){
		return clienteService.listar();
	}
	
	@RequestMapping(value = "/guarda", method = RequestMethod.PUT, produces = { MediaType.APPLICATION_JSON_VALUE })
	public String guardaCliente(@RequestBody Cliente cliente){
		return clienteService.save(cliente);
	}
	
	@RequestMapping(value = "/actualiza", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
	public String actualizaCliente(@RequestBody Cliente cliente){
		return clienteService.actualiza(cliente);
	}
	
	@RequestMapping(value = "/elimina", method = RequestMethod.DELETE, produces = { MediaType.APPLICATION_JSON_VALUE })
	public String eliminaCliente(@RequestParam Integer id){
		return clienteService.delete(id);
	}
	
	@RequestMapping(value = "/limpiarBaseDeDatos", method = RequestMethod.DELETE, produces = { MediaType.APPLICATION_JSON_VALUE })
	public String limpiarBaseDeDatos(){
		return clienteService.deleteAll();
	}

	
	
}