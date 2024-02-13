package ir.tanasob.tanasob

import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import ir.tanasob.tanasob.databinding.ActivityBellyBinding

class BellyActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBellyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_belly)
        init()
    }

    private fun init(){
        video1()
        video2()
        video3()
        video4()
    }

    private fun video1(){
        val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.belly1)
        binding.videoView1.setVideoURI(uri)
        binding.videoView1.start()
        binding.videoView1.setOnPreparedListener {
            it.isLooping = true
        }
    }
    private fun video2(){
        val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.belly2)
        binding.videoView2.setVideoURI(uri)
        binding.videoView2.start()
        binding.videoView2.setOnPreparedListener {
            it.isLooping = true
        }
    }
    private fun video3(){
        val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.belly3)
        binding.videoView3.setVideoURI(uri)
        binding.videoView3.start()
        binding.videoView3.setOnPreparedListener {
            it.isLooping = true
        }
    }
    private fun video4(){
        val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.belly4)
        binding.videoView4.setVideoURI(uri)
        binding.videoView4.start()
        binding.videoView4.setOnPreparedListener {
            it.isLooping = true
        }
    }
}