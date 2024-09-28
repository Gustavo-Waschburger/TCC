package br.org.casa.csrc.model;


import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Fone")
public class Fone {

    @Id
    private Integer id_Fone;
    @Column(length = 10, nullable = false)
    private String fone;
    @Column(length = 4, nullable = false)
    private String ddd;

}
