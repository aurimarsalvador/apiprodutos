package com.aurimarsalvador22.produtosapi.repository;

import com.aurimarsalvador22.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
