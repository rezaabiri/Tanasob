package ir.tanasob.tanasob

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import ir.tanasob.tanasob.databinding.ActivityLegBinding
import ir.tanasob.tanasob.databinding.ActivityTensileBinding

class LegActivity : AppCompatActivity() {
    private lateinit var binding:ActivityLegBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_leg)
        init()
    }

    private fun init(){
        video1()
        video2()
        video3()
        video4()
    }

    private fun video1(){
        val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.leg1)
        binding.videoView1.setVideoURI(uri)
        binding.videoView1.start()
        binding.videoView1.setOnPreparedListener {
            it.isLooping = true
        }
    }
    private fun video2(){
        val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.leg2)
        binding.videoView2.setVideoURI(uri)
        binding.videoView2.start()
        binding.videoView2.setOnPreparedListener {
            it.isLooping = true
        }
    }
    private fun video3(){
        val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.leg3)
        binding.videoView3.setVideoURI(uri)
        binding.videoView3.start()
        binding.videoView3.setOnPreparedListener {
            it.isLooping = true
        }
    }
    private fun video4(){
        val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.leg4)
        binding.videoView4.setVideoURI(uri)
        binding.videoView4.start()
        binding.videoView4.setOnPreparedListener {
            it.isLooping = true
        }
    }
}