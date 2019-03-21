package com.ljq.order.repository;

import com.ljq.order.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
}
