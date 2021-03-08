package br.augusto.spring02.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.augusto.spring02.model.Compra;

public interface CompraRepo extends CrudRepository<Compra, Integer> {
    public List<Compra> findByValorGreaterThan(double valor);
//    public List<Compra> findByValorTop10Compras();
}
