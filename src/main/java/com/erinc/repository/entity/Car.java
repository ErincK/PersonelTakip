package com.erinc.repository.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tblcar")
public class Car {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
    String marka;

    @OneToOne(mappedBy = "car")
    Person person;
}
