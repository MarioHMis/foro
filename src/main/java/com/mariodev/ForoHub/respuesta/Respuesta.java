package com.mariodev.ForoHub.respuesta;

import com.mariodev.ForoHub.topico.Topico;
import com.mariodev.ForoHub.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Respuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mensaje;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fechaCreacion;

    private Boolean solucion;

    @ManyToOne
    @JoinColumn(name = "topico")
    private Topico topico;

    @ManyToOne
    @JoinColumn(name = "autor")
    private Usuario autor;
}
