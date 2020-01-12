package pl.droidsonroids.bugcatching

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LocalizationActivity : AppCompatActivity(R.layout.activity_localization) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        findViewById<Button>(R.id.logcatButton).text = "${getString(R.string.log)} ${getString(R.string.cat)}"
    }
}