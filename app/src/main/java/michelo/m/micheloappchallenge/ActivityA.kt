package michelo.m.micheloappchallenge

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.Button


class ActivityA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val toolbar = findViewById<Toolbar>(R.id.toolbar_main)
        toolbar.title = "ALC Phase 1"
        setSupportActionBar(toolbar)*/

        val btnL1=findViewById<View>(R.id.button1) as Button
        val btnL2=findViewById<View>(R.id.button2) as Button

        btnL1.setOnClickListener { view ->
            val intent = Intent(this,ActivityB::class.java)
            startActivity(intent)
        }

        btnL2.setOnClickListener { view ->
            val intent = Intent(this,ActivityC::class.java)
            startActivity(intent)
        }


    }


}
