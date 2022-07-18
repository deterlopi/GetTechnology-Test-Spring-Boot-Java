package com.example.demo.entity;

import java.util.Date;

import javax.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="table_Users")
@Setter
@Getter
@ToString
  public class PersonaRepository{
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(nullable=false, length = 150)
	private String name;
	@Column(nullable=true, length = 150)
	private String apellido_Materno;
	@Column(nullable=false, length = 150)
	private String apellido_paterno;
	@Column(nullable=false)
	private String identificacion;
	@CreationTimestamp
	@Column(name="created_at", nullable=false, updatable=false)
	private Date createdAt;
	@UpdateTimestamp
	@Column(name="updated_at")
	private Date updatedAt;
   
    public long getId() {
        return id;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String getApellido_Materno() {
        return apellido_Materno;
    }
    public void setApellido_Materno(String apellido_Materno) {
        this.apellido_Materno = apellido_Materno;
    }
    public String getApellido_paterno() {
        return apellido_paterno;
    }
    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }
    public String getidentificacion() {
        return identificacion;
    }
    public void setidentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    
}
