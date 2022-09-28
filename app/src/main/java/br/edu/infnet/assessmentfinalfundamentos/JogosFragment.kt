package br.edu.infnet.assessmentfinalfundamentos

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import br.edu.infnet.assessmentfinalfundamentos.Adapter.AdapterProduto
import br.edu.infnet.assessmentfinalfundamentos.databinding.FragmentJogosBinding
import br.edu.infnet.assessmentfinalfundamentos.model.Produto


class JogosFragment : Fragment() {

    private var _binding: FragmentJogosBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapterProduto: AdapterProduto

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        adapterProduto = AdapterProduto()
        _binding = FragmentJogosBinding.inflate(inflater, container, false)
        binding.rolagem.adapter = adapterProduto
        binding.rolagem.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        val listProducts = listOf(
            Produto(
                R.drawable.donkey_kong2,
                "Donkey Kong 2",
                "Diddy e sua nova, linda e rebelde namorada Dixie precisam resgata-lo das garras do famigerado Kaptain K. Rool"
            ),
            Produto(
                R.drawable.street_fighter,
                "Street Fighter II",
                "Street Fighter II difere do seu antecessor por oferecer ao jogador uma selecção múltipla de personagens jogáveis"
            ),
            Produto(
                R.drawable.super_mario,
                "Super Mario World",
                "É um jogo eletrônico de plataforma 2D de rolagem lateral, no qual o jogador controla os protagonistas Mario ou Luigi"
            ), Produto(R.drawable.mega_men, "Megan Men X", "Com a ajuda de seu parceiro Zero, X deve frustrar os planos de Sigma, um líder maverick poderoso que deseja trazer a extinção humana"
            ),
            Produto(R.drawable.capitaocomando,"Capitão Comando", "É um jogo no estilo beat 'em up, que se passa em Metro City (mesma cidade de Final Fight) no ano de 2026"),
            Produto(R.drawable.pateta, "Goof Troop", "Baseado na série de mesmo nome. Antes de começar a jogar o jogador pode escolher entre ser Max ou Pateta")
        )
        adapterProduto.submitList(listProducts)
        return binding.root

    }


}