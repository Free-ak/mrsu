package com.example.mrsu

import android.annotation.SuppressLint
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.mrsu.databinding.ActivityButtonMenu2Binding



    @SuppressLint("StaticFieldLeak")
    private lateinit var binding: ActivityButtonMenu2Binding

    class ButtonMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityButtonMenu2Binding.inflate(layoutInflater)
        replaceFragment(personal_account_fragment())
        setContentView(binding.root)
//        val navController = findNavController(R.id.nav_host_fragment_content_button_menu)
//        appBarConfiguration = AppBarConfiguration(navController.graph)
//        setupActionBarWithNavController(navController, appBarConfiguration)
        binding.bottomNavigationView.setOnClickListener(){
            when(it.id){
                R.id.profile-> replaceFragment(personal_account_fragment())
                R.id.mydisciplines -> replaceFragment(my_disciplines_fragment())
                R.id.schedule -> replaceFragment(schedule_fragment())
                R.id.table -> replaceFragment(communication_fragment())
                R.id.padding -> replaceFragment(other_fragment())
                else ->{
                }
            }
         }
        }
//        override fun onSupportNavigateUp(): Boolean
//        {
//            val navController = findNavController(R.id.bottomNavigationView)
//            return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
//        }
        private fun replaceFragment(fragment : Fragment){
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frame_layout,fragment)
            fragmentTransaction.commit()
        }



}