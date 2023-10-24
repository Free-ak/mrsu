
    import android.os.Bundle
    import androidx.appcompat.app.AppCompatActivity
    import androidx.fragment.app.Fragment
    import com.example.mrsu.R
    import com.example.mrsu.communication_fragment
    import com.example.mrsu.databinding.ActivityButtonMenuBinding
    import com.example.mrsu.my_disciplines_fragment
    import com.example.mrsu.other_fragment
    import com.example.mrsu.personal_account_fragment
    import com.example.mrsu.schedule_fragment

    class ButtonMenuActivity : AppCompatActivity() {

        lateinit var binding : ActivityButtonMenuBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityButtonMenuBinding.inflate(layoutInflater)
            setContentView(binding.root)
            replaceFragment(personal_account_fragment())
            binding.bottomNavigationView.setOnItemSelectedListener {
                when(it.itemId){
                    R.id.profile-> replaceFragment(personal_account_fragment())
                    R.id.mydisciplines -> replaceFragment(my_disciplines_fragment())
                    R.id.schedule -> replaceFragment(schedule_fragment())
                    R.id.table -> replaceFragment(communication_fragment())
                    R.id.padding -> replaceFragment(other_fragment())
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
