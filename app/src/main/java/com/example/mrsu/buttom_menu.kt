package com.example.mrsu

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.mrsu.databinding.ActivityButtomMenuBinding

    class bottom_menu : AppCompatActivity() {

        private lateinit var binding : ActivityButtomMenuBinding

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityButtomMenuBinding.inflate(layoutInflater)
            setContentView(binding.root)
            replaceFragment(personal_account_fragment())

            binding.bottomNavigationView.setOnItemSelectedListener {

                when(it.itemId){

                    R.id.profile-> replaceFragment(personal_account_fragment())
                    R.id.mydisciplines -> replaceFragment(my_disciplines())
                    R.id.schedule -> replaceFragment(schedule_fragment())
                    R.id.table -> replaceFragment(communication())
                    R.id.padding -> replaceFragment(other())

                    else ->{
                    }
                }
                true

            }
        }

        private fun replaceFragment(fragment : Fragment){

            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frame_layout,fragment)
            fragmentTransaction.commit()
        }

    }