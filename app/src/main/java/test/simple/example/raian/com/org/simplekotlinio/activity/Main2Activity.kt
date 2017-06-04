package test.simple.example.raian.com.org.simplekotlinio.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import test.simple.example.raian.com.org.simplekotlinio.R
import java.util.logging.Logger


class Main2Activity : AppCompatActivity() {
    var log = Logger.getLogger(Main2Activity::class.java.name)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        log.warning("onCreate")
    }
}
