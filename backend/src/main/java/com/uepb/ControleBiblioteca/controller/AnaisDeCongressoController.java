package com.uepb.ControleBiblioteca.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.uepb.ControleBiblioteca.entities.AnaisDeCongresso;
import com.uepb.ControleBiblioteca.services.IAnaisDeCongressoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping("/anaisDeCongresso")
@Api(value = "API Rest - AnaisDeCongresso Endpoint")
public class AnaisDeCongressoController {

	private static final Logger LOG = LoggerFactory.getLogger(AnaisDeCongressoController.class);

	@Autowired
	private IAnaisDeCongressoService anaisDeCongressoService;

	public AnaisDeCongressoController(IAnaisDeCongressoService anaisDeCongressoService) {
		this.anaisDeCongressoService = anaisDeCongressoService;
	}

	@GetMapping
	@ApiOperation(value = "Busca todos os dados do banco.")
	public List<AnaisDeCongresso> findAll() {
		LOG.info("recupera anais de congresso...");
		return this.anaisDeCongressoService.findAll();
	}

	@GetMapping("/{id}")
	@ApiOperation(value = "Busca um dado do banco atrav�s do id.")
	public Optional<AnaisDeCongresso> findOne(@PathVariable("id") Long id) {
		LOG.info("busca dado atrav�s do id...");
		return this.anaisDeCongressoService.findOne(id);
	}

	@PostMapping
	@ResponseBody
	@ApiOperation(value = "Cria um dado no banco.")
	public AnaisDeCongresso create(@RequestBody AnaisDeCongresso anaisDeCongresso) {
		LOG.info("criou registro no banco...");
		return this.anaisDeCongressoService.create(anaisDeCongresso);
	}

	// Update a AnaisDeCongresso
	@PutMapping("/{id}")
	@ApiOperation(value = "Edita um dado do Banco atrav�s id.")
	public AnaisDeCongresso update(@PathVariable(value = "id") Long id, @RequestBody AnaisDeCongresso anaisDeCongressoDetails) {
		LOG.info("editou um registro no banco...");
		return this.anaisDeCongressoService.update(anaisDeCongressoDetails, id);
	}
	

	@DeleteMapping("/{id}")
	@ApiOperation(value = "Remove um dado do Banco atrav�s id.")
	public void remove(@PathVariable("id") Long id) {
		LOG.info("removeu um registro do banco...");
		this.anaisDeCongressoService.remove(id);
	}

}
