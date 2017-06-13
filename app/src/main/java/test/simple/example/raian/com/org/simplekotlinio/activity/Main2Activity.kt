package test.simple.example.raian.com.org.simplekotlinio.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import test.simple.example.raian.com.org.simplekotlinio.R
import test.simple.example.raian.com.org.simplekotlinio.fragments.FirstFragment
import java.util.logging.Logger


class Main2Activity : AppCompatActivity() {
    var log = Logger.getLogger(Main2Activity::class.java.name)
    var mButton4: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        log.warning("onCreate")

        mButton4 = findViewById(R.id.mButton4) as Button

        mButton4!!.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                log.warning("Goto fragment")
                supportFragmentManager.beginTransaction()
                        .add(R.id.fragmentContainer, FirstFragment.newInstance())
                        .commit()
            }
        })

    }
}
