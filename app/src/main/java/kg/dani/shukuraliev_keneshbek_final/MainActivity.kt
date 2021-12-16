package kg.dani.shukuraliev_keneshbek_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView = findViewById<ImageView>(R.id.imageView4)
        imageView.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }

}