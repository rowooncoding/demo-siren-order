package com.example.demosirenorder.domain;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


@Getter
@Table(name = "customers")
public class Customer {
    @Id
    private int customerId;

    @Column
    private String name;

    @Column
    private String address;

    @Column
    private String phoneNumber;

    public Customer(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // 새로운 유저를 받을 때 도메인에 있는 생성자를 사용하지 않고 빌더 클래스를 사용함
    public static Customer newCustomer(CreateCustomer customer) {
        return new Customer(customer.getName(), customer.getAddress(), customer.getPhoneNumber());
    }
}
