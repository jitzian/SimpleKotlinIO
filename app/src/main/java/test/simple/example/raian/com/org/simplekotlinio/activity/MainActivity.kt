package test.simple.example.raian.com.org.simplekotlinio.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import test.simple.example.raian.com.org.simplekotlinio.R
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {
    val LOG = Logger.getLogger(MainActivity::class.java.name)
    var mButton: Button? = null
    var mButton2: Button?= null
    var mButton3: Button?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LOG.warning("FUCK")

        mButton = findViewById(R.id.mButton) as Button
        mButton2 = findViewById(R.id.mButton2) as Button
        mButton3 = findViewById(R.id.mButton3) as Button

        mButton!!.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View): Unit {
                // Handler code here.
                Toast.makeText(this@MainActivity, "Button 1",
                        Toast.LENGTH_LONG).show()
            }
        })

        mButton2!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                LOG.warning("THIS IS SO FUCKING DIFFERENT")
                startActivity(Intent(this@MainActivity, Main2Activity::class.java))
            }

        })

        mButton3!!.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                LOG.warning("Goto the next activity")
                var intent = Intent(this@MainActivity, Main2Activity::class.java)
                startActivity(intent)
            }
        })


    }

}
