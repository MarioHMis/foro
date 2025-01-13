package com.mariodev.ForoHub.usuario;

import com.mariodev.ForoHub.perfil.Perfil;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(name = "email", nullable = false, length = 150, unique = true)
    private String email;

    private String contrasena;

    @ManyToOne
    @JoinColumn(name = "perfiles")
    private Perfil perfil;

}
