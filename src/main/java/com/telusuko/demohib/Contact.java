package com.telusuko.demohib;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_id")
    private Integer id;

    private String name;
    private String email;
    private String address;
    private String phone;

    // getters and setters are not shown for brevity

    @Override
    public String toString() {
        return "Contact [id=" + id + ", name=" + name + ", email=" + email
                + ", address=" + address + ", phone=" + phone + "]";
    }


}