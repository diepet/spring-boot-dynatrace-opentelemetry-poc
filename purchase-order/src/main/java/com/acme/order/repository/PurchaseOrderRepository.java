package com.acme.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acme.order.controller.model.PurchaseOrder;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long>{

}
