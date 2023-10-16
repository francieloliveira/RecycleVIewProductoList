package com.example.recycleviewproductolist.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleviewproductolist.Produto;
import com.example.recycleviewproductolist.R;

import java.util.List;

public class AdapterProdutos extends RecyclerView.Adapter<AdapterProdutos.ProdutoViewHolder> {

    private List<Produto> produtoList;

    @NonNull
    @Override
    public AdapterProdutos.ProdutoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Declaramos um objeto view que será exibido para cada item
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items, parent, false);

        //Declaramos um objeto viewHolder e passamos como parametro a view recem criada
        ProdutoViewHolder viewHolder = new ProdutoViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterProdutos.ProdutoViewHolder holder, int position) {
        Produto produto = produtoList.get(position);
        holder.mTextViewDescricao.setText(produto.getDescricao());
        holder.mTextViewNomeProduto.setText(produto.getNome());
        holder.mTextViewValor.setText(String.format("R$ %.2f", produto.getValor()));
    }

    @Override
    public int getItemCount() {
        if (produtoList.size() != 0) {
            return produtoList.size();
        } else {
            return 0;
        }
    }

    public void atualizarListagemCompleta(List<Produto> produtoList){
        this.produtoList = produtoList;
        notifyDataSetChanged();
    }

    //Classe que vincula cada elemento de layout ao viewHolder
    public static class ProdutoViewHolder extends RecyclerView.ViewHolder {
        TextView mTextViewNomeProduto, mTextViewValor, mTextViewDescricao;

        public ProdutoViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextViewNomeProduto = itemView.findViewById(R.id.nomeProduto);
            mTextViewValor = itemView.findViewById(R.id.valor);
            mTextViewDescricao = itemView.findViewById(R.id.descricao);
        }
    }

}
