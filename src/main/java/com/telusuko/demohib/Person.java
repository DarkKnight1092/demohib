package com.telusuko.demohib;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Person  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer personId;
    private String personName;
    private String joinedDate;



}
