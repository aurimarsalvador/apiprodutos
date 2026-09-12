package com.aurimarsalvador22.produtosapi.repository;

import com.aurimarsalvador22.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

    List<Produto> findByNomeContainingIgnoreCase(String nome);

}
