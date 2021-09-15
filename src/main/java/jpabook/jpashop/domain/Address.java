package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;


@Embeddable
@Getter
public class Address {
    private String city;
    private String street;
    private String zipCode;


}