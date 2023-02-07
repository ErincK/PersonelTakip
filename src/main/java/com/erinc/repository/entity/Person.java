package com.erinc.repository.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tblperson")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;

    Integer age;
    EGender gender;
    /**
     * OneToMany -> Personel tablosunun Adres tablosuyla ilişkisini tanımlar.
     * birden çoğa ilişki ayrı bir bağlantı tablosu ile sağlanır. Böylece,
     * yeni bir tablo yaratılır.
     * CascadeType -> Personel tablosu oluşturmak için adres bilgilerine ihtiyaç duyar.
     *                eğer adresler DB de yok ise, onları create etme yetkisi devralır.
     */

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "tbl_person_adres_iliski",
                joinColumns = @JoinColumn(name = "personelid"),
                inverseJoinColumns = @JoinColumn(name = "adresid")
    )
    List<Address> addresses;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "arabaiddssiii")
    Car car;

    @ManyToOne(cascade = CascadeType.ALL)
    Department department;
}
