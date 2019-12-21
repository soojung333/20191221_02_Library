package com.soojung.a20191221_02_library

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }



    override fun setupEvents() {

    }

    override fun setValues() {

        Glide.with(mContext).load("http://talkimg.imbc.com/TVianUpload/tvian/TViews/image/2019/09/29/4GdWStvpOnm8637053550036703451.jpg").into(profileImgView)

    }

}
