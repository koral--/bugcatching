package pl.droidsonroids.bugcatching

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_configuration.*
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

class ConfigurationActivity : AppCompatActivity(R.layout.activity_configuration) {

    private var clickCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        dateFull.text = DateTimeFormatter.ofPattern("dd MMMM YYYY").format(ZonedDateTime.now())
        dateStandalone.text = DateTimeFormatter.ofPattern("dd LLLL YYYY").format(ZonedDateTime.now())
    }

    fun onConfigIncrementClick(view: View) {
        clickCount++
        numberOfClicksResource.text = getString(R.string.clickCount, clickCount)
        numberOfClicksRaw.text = "Number of clicks $clickCount"
    }
}