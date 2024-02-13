package ir.tanasob.tanasob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import ir.tanasob.tanasob.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        init()
    }

    private fun init(){
        binding.belly.setOnClickListener {
            startActivity(Intent(this, BellyActivity::class.java))
        }
        binding.leg.setOnClickListener {
            startActivity(Intent(this, LegActivity::class.java))
        }
        binding.tensile.setOnClickListener {
            startActivity(Intent(this, TensileActivity::class.java))
        }
        binding.waist.setOnClickListener {
            startActivity(Intent(this, WaistActivity::class.java))
        }
    }
}