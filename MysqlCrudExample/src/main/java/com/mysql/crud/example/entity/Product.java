package com.mysql.crud.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Product")
public class Product {
	@Id
	@GeneratedValue
	@Column(nullable = false)
	private Long id;
	private String name;
	private int quantity;
	private double price;

}
