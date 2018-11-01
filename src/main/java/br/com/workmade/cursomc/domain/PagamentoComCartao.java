package br.com.workmade.cursomc.domain;

import javax.persistence.Entity;

import br.com.workmade.cursomc.domain.enums.EstadoPagamento;
@Entity
public class PagamentoComCartao extends Pagamento {

	private static final long serialVersionUID = 8227980364589553016L;
	private Integer numeroDeParcelas;

	public PagamentoComCartao() {}

	public PagamentoComCartao(Integer id, EstadoPagamento estadoPagamento, Pedido pedido, Integer numeroDeParcelas) {
		super(id, estadoPagamento, pedido);
		this.numeroDeParcelas = numeroDeParcelas;
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
	
	
}
