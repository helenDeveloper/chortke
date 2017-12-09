package com.cert.chortke.controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cert.chortke.dto.Factor;
import com.cert.chortke.entities.FactorEntity;
import com.cert.chortke.service.FactorRepository;

@RestController
@RequestMapping("/api/factor")
public class FactorController {

	private FactorRepository factorRepository;

	private ModelMapper modelMapper;

	@Autowired
	public FactorController(FactorRepository factorRepository,
			ModelMapper modelMapper) {
		this.factorRepository = factorRepository;
		this.modelMapper = modelMapper;

	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<Factor> getFactors() {

		List<Factor> result = new ArrayList<Factor>();

		List<FactorEntity> factorList = factorRepository.findAll();

		if (factorList != null) {

			for (FactorEntity factorEntity : factorList) {

				Factor dto = modelMapper.map(factorEntity, Factor.class);
				result.add(dto);

			}

		}
		return result;

	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public Long saveOrUpdate(
	/* @PathVariable("user") */@RequestBody Factor factor) {

		FactorEntity entity = modelMapper.map(factor, FactorEntity.class);

		FactorEntity result = factorRepository.save(entity);
		if (result != null)
			return result.getId();
		return null;
	}

}
