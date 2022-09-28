package br.edu.infnet.assessmentfinalfundamentos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavHost
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.edu.infnet.assessmentfinalfundamentos.Adapter.AdapterProduto
import br.edu.infnet.assessmentfinalfundamentos.model.Produto
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val navHost =
            supportFragmentManager.findFragmentById(R.id.barnav_container) as NavHostFragment
        val controler = navHost.navController

        findViewById<BottomNavigationView>(R.id.nav_bar).setupWithNavController(controler)

    }


    override fun onSupportNavigateUp(): Boolean {
        val controler =
            findNavController(androidx.navigation.fragment.R.id.nav_host_fragment_container)
        return controler.navigateUp() || super.onSupportNavigateUp()
    }
}
