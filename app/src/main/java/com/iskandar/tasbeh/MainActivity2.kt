package com.iskandar.tasbeh




import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main2.tv_1

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        var count = 0


        btn_1.setOnClickListener {
            tv_1.text = "${++count}"

        }

        btn_2.setOnClickListener {
            count = 0
            tv_1.text = "0"

        }




        val text = intent.getStringExtra("tv_1", )
        tv_4.text = text

        val text1 = intent.getStringExtra("tv_2")
        tv_5.text = text1

        val text2 = intent.getStringExtra("tv_3")
        tv_6.text = text2

        val tex4 = intent.getStringExtra("edt_1")
        tv_7.text = tex4
    }
}