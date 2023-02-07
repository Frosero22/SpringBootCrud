package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.interfaceService.IClienteService;
import com.example.demo.models.Cliente;
import com.example.demo.response.BaseResponseDTO;
import com.example.demo.response.ResponseUtil;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	//ESTA CLASE ES LA QUE CONTENDRA LOS METODOS QUE EL FRONT VA A CONSUMIR
	//DENTRO DE CADA METODO SE ENCUENTRA LA INTERFACE DEL SERVICIO A LA CUAL ACCEDEREMOS
	
	@Autowired
	private IClienteService clienteService;
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<BaseResponseDTO> getCliente() throws Exception{
		return  ResponseUtil.success().body(clienteService.listar()).message(" Consulta exitosa.").send(HttpStatus.OK);
	}
	
	@RequestMapping(value = "/guarda", method = RequestMethod.PUT, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<BaseResponseDTO> guardaCliente(@RequestBody Cliente cliente){
		try {
			 clienteService.save(cliente);
		}catch (Exception e) {
			return ResponseUtil.error().message("El objeto es obligatorio").send(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return  ResponseUtil.success().body(null).message(" Registro exitoso.").send(HttpStatus.OK);
	}
	
	@RequestMapping(value = "/actualiza", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<BaseResponseDTO> actualizaCliente(@RequestBody Cliente cliente){
		try {
			 clienteService.actualiza(cliente);
		}catch (Exception e) {
			return ResponseUtil.error().message("Excepción del Aplicativo, Mensaje Sistemas: "+e.getLocalizedMessage()).send(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return  ResponseUtil.success().body(null).message(" Actualización exitosa.").send(HttpStatus.OK);
	}
	
	@RequestMapping(value = "/elimina", method = RequestMethod.DELETE, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<BaseResponseDTO> eliminaCliente(@RequestParam Integer id){
		try {
			clienteService.delete(id);
			return  ResponseUtil.success().body(null).message("Cliente Eliminado con exito.").send(HttpStatus.OK);
		}catch (Exception e) {
			return ResponseUtil.error().message(e.getMessage()).send(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@RequestMapping(value = "/limpiarBaseDeDatos", method = RequestMethod.DELETE, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<BaseResponseDTO> limpiarBaseDeDatos(){
		try {
			clienteService.deleteAll();
		}catch (Exception e) {
			return ResponseUtil.error().message("Excepción del Aplicativo, Mensaje Sistemas: "+e.getLocalizedMessage()).send(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return  ResponseUtil.success().body(null).message("Clientes Eliminados con exito.").send(HttpStatus.OK);
	}

	
	
}
