package com.teja.ecomproj.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    private int id;
    private String name;
    private String desc;
    private String brand;
    private BigDecimal price;
    private String category;
    private Data releaseDate;
    private Boolean available;
    private int quantity;

}
