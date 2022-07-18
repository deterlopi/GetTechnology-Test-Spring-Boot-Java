package com.example.demo.entity;

import java.util.Date;

import javax.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Facturas_table")
@Setter
@Getter
@ToString
  public class FacturaRepository{
	@Column(name="id")
	public long id;
	@UpdateTimestamp
	@Column(name="updated_at")
	public Date updatedAt;
	@Column(name="monto")
	public int monto;


    public Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    public int getMonto() {
        return monto;
    }
    public void setMonto(int monto) {
        this.monto = monto;
    }

}
