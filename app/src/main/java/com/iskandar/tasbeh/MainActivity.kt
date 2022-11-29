package com.iskandar.tasbeh
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.tv_1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        tv_1.setOnClickListener {
            var intent = Intent(this, MainActivity2::class.java)
            var text = tv_1.text.toString()
            intent.putExtra("tv_1", text)
            startActivity(intent)
        }
        tv_2.setOnClickListener {
            var intent = Intent(this, MainActivity2::class.java)
            var text = tv_2.text.toString()
            intent.putExtra("tv_2", text)
            startActivity(intent)
        }
        tv_3.setOnClickListener {
            var intent = Intent(this, MainActivity2::class.java)
            var text = tv_3.text.toString()
            intent.putExtra("tv_3", text)
            startActivity(intent)
        }
        btn.setOnClickListener {
            var intent = Intent(this, MainActivity2::class.java)
            var text = edt_1.text.toString()
            intent.putExtra("edt_1", text)
            startActivity(intent)
        }
        btn_33.setOnClickListener {
            var intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}