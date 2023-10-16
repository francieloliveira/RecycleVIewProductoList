package com.example.recycleviewproductolist.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleviewproductolist.Produto;
import com.example.recycleviewproductolist.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Produto> produtoList = new ArrayList<>();

    //É o objeto da activity_main
    private RecyclerView rvListagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        produtoList.add(new Produto("nomeProduto1", "descricaoProduto1", 0.5f));
        produtoList.add(new Produto("nomeProduto2", "descricaoProduto2", 0.6f));
        produtoList.add(new Produto("nomeProduto3", "descricaoProduto3", 0.7f));
        produtoList.add(new Produto("nomeProduto4", "descricaoProduto4", 0.8f));
        produtoList.add(new Produto("nomeProduto5", "descricaoProduto5", 0.9f));
        produtoList.add(new Produto("nomeProduto6", "descricaoProduto6", 1.5f));
        produtoList.add(new Produto("nomeProduto7", "descricaoProduto7", 1.6f));
        produtoList.add(new Produto("nomeProduto8", "descricaoProduto8", 1.7f));
        produtoList.add(new Produto("nomeProduto9", "descricaoProduto9", 1.8f));
        produtoList.add(new Produto("nomeProduto10", "descricaoProduto10", 1.9f));

        //Instancia a RecycleView
        rvListagem = findViewById(R.id.rvlistagem);
        //Set o tamanho fixo da RV
        rvListagem.setHasFixedSize(true);
        //Define como os itens serão exibidos na na RV
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
        rvListagem.setLayoutManager(layoutManager);
        //Adiciona linha para separar os itens
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        rvListagem.addItemDecoration(itemDecoration);
        //Define o adapter para o RV
        AdapterProdutos adapterProdutos = new AdapterProdutos();
        rvListagem.setAdapter(adapterProdutos);

        //Atualiza a lista de produtos
        adapterProdutos.atualizarListagemCompleta(produtoList);
    }

}