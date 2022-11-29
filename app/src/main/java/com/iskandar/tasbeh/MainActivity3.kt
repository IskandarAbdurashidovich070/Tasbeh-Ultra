package com.iskandar.tasbeh


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import android.view.View
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    var count = 0
    var all = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        val text = intent.getStringExtra("btn_33")
        count_1.text = text




        btn_13.setOnClickListener {
            tv_13.text = "${++count}"
            if (tv_13.text.toString().equals("33")){
                vibro()
                count_1.text = "${++all}"
                count = 0
            }
        }

        btn_23.setOnClickListener {
            count = 0
            tv_13.text = "0"
            all = 0
            count_1.text = "0"
        }



        onResume()
    }

    override fun onResume() {
        super.onResume()

        tv_13.text = count.toString()
    }






    private fun vibro(){

        val v  = getSystemService(VIBRATOR_SERVICE) as Vibrator
        v.vibrate(500)

    }




}
