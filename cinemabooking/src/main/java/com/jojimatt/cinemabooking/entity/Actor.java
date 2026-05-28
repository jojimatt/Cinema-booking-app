package com.jojimatt.cinemabooking.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "actors")
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(max = 300)
    @NotNull
    @Column(name = "name", nullable = false, length = 300)
    private String name;

    @Column(name = "age")
    private Integer age;

    @Size(max = 300)
    @Column(name = "industry", length = 300)
    private String industry;

}