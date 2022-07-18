//package com.example.demo.controller;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity; 	
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.entity.FacturaRepository;
//import com.example.demo.repository.FacturaRestService;
//
//@RestController
//@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.PUT,RequestMethod.POST})
//@RequestMapping("/api")
//
//public class VentasController {
//	@Autowired
//	FacturaRestService customerRepo;
//	
//	
//	@GetMapping("/ventas")
//	public ResponseEntity<List<FacturaRepository>> getAllFacturaRepositorys() {
//		try {
//			List<FacturaRepository> list = customerRepo.findAll();
//			
//			if (list.isEmpty() || list.size() == 0) {
//				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//			}
//			
//			return new ResponseEntity<>(list, HttpStatus.OK);
//		} catch (Exception e) {
//			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
//	
//	
//}
