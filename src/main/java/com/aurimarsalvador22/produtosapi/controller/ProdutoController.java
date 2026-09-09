package com.aurimarsalvador22.produtosapi.controller;

import com.aurimarsalvador22.produtosapi.model.Produto;
import com.aurimarsalvador22.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto salvarProduto(@RequestBody Produto produto){
        System.out.println("Produto recebido: " + produto);

        var id = UUID.randomUUID().toString();
        produto.setId(id);

        produtoRepository.save(produto);

        return produto;
    }

    @GetMapping("{id}")
    public Produto obterProdutoPorId(@PathVariable("id") String id){
        return produtoRepository.findById(id).orElse(null);
    }

    @DeleteMapping("{id}")
    public void deletarProdutoPorId(@PathVariable("id") String id){
        produtoRepository.deleteById(id);
    }

    @PutMapping("{id}")
    public void atualizarProdutoPorId(@PathVariable("id") String id, @RequestBody Produto produto){
        produto.setId(id);
        produtoRepository.save(produto);
    }

}
