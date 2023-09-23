package com.example.VeckorVorker.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "workers")
public class Worker {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int Id;

    @Column(name = "name")
    String name ;


    @Column(name = "category" )
    int category;


}
