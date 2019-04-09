package com.song2.a1st_assignment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_signup.*

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        et_signup_id.setOnFocusChangeListener { v, hasfocus ->
            if (hasfocus == true)
                v.setBackgroundResource(R.drawable.yellow_border)
            else
                v.setBackgroundResource(R.drawable.gray_border)
        }

        et_signup_pw.setOnFocusChangeListener { v, hasfocus ->
            if (hasfocus == true)
                v.setBackgroundResource(R.drawable.yellow_border)
            else
                v.setBackgroundResource(R.drawable.gray_border)
        }

        et_signup_name.setOnFocusChangeListener { v, hasfocus ->
            if (hasfocus == true)
                v.setBackgroundResource(R.drawable.yellow_border)
            else
                v.setBackgroundResource(R.drawable.gray_border)
        }

        btn_signup_submit.setOnClickListener {
            if(et_signup_id.text.toString() == "")  {
                et_signup_id.setBackgroundResource(R.drawable.yellow_border)
                et_signup_pw.setBackgroundResource(R.drawable.gray_border)
                et_signup_name.setBackgroundResource(R.drawable.gray_border)
            }else if(et_signup_pw.text.toString() == "") {
                et_signup_pw.setBackgroundResource(R.drawable.yellow_border)
                et_signup_id.setBackgroundResource(R.drawable.gray_border)
                et_signup_name.setBackgroundResource(R.drawable.gray_border)
            }else if(et_signup_name.text.toString() == "") {
                et_signup_name.setBackgroundResource(R.drawable.yellow_border)
                et_signup_id.setBackgroundResource(R.drawable.gray_border)
                et_signup_pw.setBackgroundResource(R.drawable.gray_border)
            }
            else
                finish()
        }
    }
}
