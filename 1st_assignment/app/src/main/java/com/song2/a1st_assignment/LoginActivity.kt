package com.song2.a1st_assignment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.startActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        et_login_id.setOnFocusChangeListener { v, hasfocus ->
            if (hasfocus == true)
                v.setBackgroundResource(R.drawable.yellow_border)
            else
                v.setBackgroundResource(R.drawable.gray_border)
        }

        et_login_pw.setOnFocusChangeListener { v, hasfocus ->
            if (hasfocus == true)
                v.setBackgroundResource(R.drawable.yellow_border)
            else
                v.setBackgroundResource(R.drawable.gray_border)
        }

        btn_login_submit.setOnClickListener {
            if(et_login_id.text.toString() == "")  {
                et_login_id.setBackgroundResource(R.drawable.yellow_border)
                et_login_pw.setBackgroundResource(R.drawable.gray_border)

            }else if(et_login_pw.text.toString() == "") {
                et_login_pw.setBackgroundResource(R.drawable.yellow_border)
                et_login_id.setBackgroundResource(R.drawable.gray_border)
            }
            else
                startActivity<MainActivity>()
        }

        tv_login_signup.setOnClickListener {
            startActivity<SignupActivity>()
        }
    }
}
