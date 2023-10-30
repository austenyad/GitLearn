package com.austen.gitlearn

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.auste.share.Util
import com.austen.gitlearn.R.id.tvOne

/**
 * Company: TAO_LE
 * ================================================
 * Description:
 *
 *
 *
 *
 * Created by austenYang on 2023/10/31
 * ================================================
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        findViewById<TextView>(tvOne).setText("${Util.add(10, 20)}")
    }
}