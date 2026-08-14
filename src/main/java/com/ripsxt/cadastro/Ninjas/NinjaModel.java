package com.ripsxt.cadastro.Ninjas;

import com.ripsxt.cadastro.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.*;

//Transforma um classe em uma entidade em um banco de dados
@Entity
//Cria a tablela em banco de dados
@Table(name = "tb_cadastro")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    @Column(unique = true)
    private String email;
    private int idade;

    //Um Ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") //Foreing Key ou chave estrangeira
    private MissoesModel missoes;
}