package com.example.demospringboot.controller;

import com.example.demospringboot.model.AccountModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {
    @GetMapping("/{id}/{customerName}")
    public ResponseEntity<?> index(
            @PathVariable int id,
            @PathVariable("customerName") String customer,
            @RequestParam String address) {

        return new ResponseEntity<>("Hello Restfull API" + id + "-" + customer + "- address:" + address, HttpStatus.OK);
    }

    /*
     *  Các type truyền dữ liệu ngầm trong Spring
     *   1) url - encoded: Truyền dữ liệu ngầm không đính kèm file
     *   2) form - data : Truyền dữ liệu ngầm có đính kèm file
     *   3) raw body: Truyền dữ liệu ngầm dạng JSON
     * */

    @PostMapping("/{id}")
// khi nào biểu diện dấu ngoặc vuông khi sử dụng List
    public ResponseEntity<?> insertAccount(
            @PathVariable int id,
            @RequestBody AccountModel accountModel
    ) {
//        AccountModel accountModel = new AccountModel();
        accountModel.setId(id);
//        accountModel.setCustomerName("Nguyen Van A");
//        accountModel.setAge(18);

        return new ResponseEntity<>(accountModel, HttpStatus.OK);
    }
}
