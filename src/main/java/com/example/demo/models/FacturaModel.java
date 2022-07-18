package com.example.demo.models;

import java.util.Date;
import org.hibernate.annotations.CreationTimestamp;
import org.jetbrains.annotations.NotNull;
import javax.persistence.*;

@Entity(name="ventas")
@Table(name = "ventas")
public class FacturaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @NotNull
    @Column(nullable=false)
    private String name;
    @NotNull
    @Column(nullable=false)
    private int monto;
    @CreationTimestamp
    @Column(name="fecha", nullable=false, updatable=false)
    private Date createdAt;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ventas_Id")
    private UsuarioModel UsuarioModel;

    public FacturaModel() {}
    public long getId() {
        return id;
    }
    public String getName(){
        return this.name;
    }
    public int getMonto(){
        return this.monto;
    }

}
