package br.com.vitor.montuan.pw3hasfood.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_PEDIDO")
public class Pedido {

	@Id
	@Column(name = "ID_PEDIDO")
	private Integer id; 
	
	@Column(name = "DT_PEDIDO")
	private LocalDate dataPedido;
	
	@Column(name = "STATUS_PEDIDO")
	private String stsPedido;
	
	@Column(name = "ID_RESTAURANTE")
	private Integer idRestaurante;
}
