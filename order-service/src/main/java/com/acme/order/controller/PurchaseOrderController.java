package com.acme.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.Tracer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.order.controller.model.PurchaseOrder;
import com.acme.order.service.PurchaseOrderService;

@RestController
@RequestMapping("/api/")
public class PurchaseOrderController {

	private static final Logger LOGGER = LoggerFactory.getLogger(PurchaseOrderController.class);
	
	@Autowired
	private PurchaseOrderService purchaseOrderService;
	
	@PostMapping("/purchaseorder")
	public ResponseEntity<PurchaseOrder> postOrder(
			@RequestBody PurchaseOrder purchaseOrder) {
		
		LOGGER.info("New purchase order request get for {}", purchaseOrder);
		
		
		PurchaseOrder newPurchaseOrder = purchaseOrderService.createPurchaseOrder(purchaseOrder);
		
		LOGGER.info("New purchase order created {}", newPurchaseOrder);
		
		return ResponseEntity.ok(newPurchaseOrder);
		
	}

	@GetMapping("/purchaseorder/{id}")
	public ResponseEntity<PurchaseOrder> getOrder(@PathVariable long id) {

		LOGGER.info("New get request for purchase order having id={}", id);

		PurchaseOrder purchaseOrder = purchaseOrderService.getPurchaseOrder(id);
		
		LOGGER.info("Retrieved purchase order {}", purchaseOrder);
		
		return ResponseEntity.ok(purchaseOrder);
		
	}
}
