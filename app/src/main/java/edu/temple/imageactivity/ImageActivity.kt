package edu.temple.imageactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.LargeCityImageView)
        val textView = findViewById<TextView>(R.id.CityTextView)

        val cityPics = arrayOf(
            ImageObject(R.drawable.amsterdam, "Amsterdam, NL"),
            ImageObject(R.drawable.copenhagen, "Copenhagen, DK"),
            ImageObject(R.drawable.florence, "Florence, IT"),
            ImageObject(R.drawable.london, "London, UK"),
            ImageObject(R.drawable.nyc, "New York City, US"),
            ImageObject(R.drawable.paris, "Paris, FR"),
            ImageObject(R.drawable.san_francisco, "San Francisco, UA"),
            ImageObject(R.drawable.shenzhen, "Shenzhen, CN"),
            ImageObject(R.drawable.singapore, "Singapore, MY"),
            ImageObject(R.drawable.stockholm, "Stockholm, SE"),
            ImageObject(R.drawable.tokyo, "Tokyo, JP")
        )
    }
}