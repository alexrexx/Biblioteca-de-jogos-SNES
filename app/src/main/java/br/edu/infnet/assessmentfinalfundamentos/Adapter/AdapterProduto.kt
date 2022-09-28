package br.edu.infnet.assessmentfinalfundamentos.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import br.edu.infnet.assessmentfinalfundamentos.R
import br.edu.infnet.assessmentfinalfundamentos.databinding.JogoItemBinding
import br.edu.infnet.assessmentfinalfundamentos.model.Produto
import org.w3c.dom.Text

class AdapterProduto : ListAdapter<Produto, AdapterProduto.ViewHolder>(ProdutoDiffUtil()) {


    class ViewHolder private constructor(val binding: JogoItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Produto) {
            binding.run {
                descricaoDK.text = item.descricao
                nomeDK.text = item.nome
                capaDK.setImageResource(item.foto)

            }
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val binding =
                    JogoItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                return ViewHolder(binding)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)


    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))

    }

}


class ProdutoDiffUtil() : DiffUtil.ItemCallback<Produto>() {
    override fun areItemsTheSame(oldItem: Produto, newItem: Produto): Boolean {
        return oldItem.nome == newItem.nome
    }

    override fun areContentsTheSame(oldItem: Produto, newItem: Produto): Boolean {
        return oldItem == newItem
    }
}



