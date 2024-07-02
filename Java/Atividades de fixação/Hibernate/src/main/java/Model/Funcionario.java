package Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = "funcionario")
public class Funcionario {
    @Id
    @Column(name = "id_funcionario", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String nome;
    private Double salario;
    @ManyToOne(fetch = FetchType.EAGER)
    private Departamento departamento;
}
