package com.cenfotec.web;

import org.springframework.beans.factory.annotation.Autowired;


import com.cenfotec.mongoapi.service.ProfessionalService;

@RestController
public class ProfessionalController {
@Autowired
	private ProfessionalService professionalService;

	@PostMapping("/professional")
	public ResponseEntity<String> addColleague(@RequestBody Professional professional) {
		professionalService.saveProfessional(professional);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
}

