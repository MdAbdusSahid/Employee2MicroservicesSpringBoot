package com.employeeapp.feignClient;

import com.employeeapp.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//http://localhost:1998/address-app/api/address/1
@FeignClient(name = "address-app" ,url="http://localhost:1998", path="/address-app/api/")
//@RibbonClient(name = "address-app")


        public interface AddressClient {

    @GetMapping("address/{employeeId}")
    public ResponseEntity<AddressResponse> getAddressByEmployeeId(@PathVariable("employeeId") int id);
}
