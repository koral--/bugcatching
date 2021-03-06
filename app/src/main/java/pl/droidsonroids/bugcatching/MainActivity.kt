package pl.droidsonroids.bugcatching

import android.content.Intent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import pl.droidsonroids.bugcatching.items.ItemListActivity

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    fun onItemsClick(view: View) {
        startActivity(Intent(this, ItemListActivity::class.java))
    }

    fun onAccessibilityClick(view: View) {
        startActivity(Intent(this, AccessibilityActivity::class.java))
    }

    fun onLocalizationClick(view: View) {
        startActivity(Intent(this, LocalizationActivity::class.java))
    }

    fun onConfigurationClick(view: View) {
        startActivity(Intent(this, ConfigurationActivity::class.java))
    }

    fun onApiClick(view: View) {
        startActivity(Intent(this, ApiActivity::class.java))
    }

    fun onAboutClick(view: View) {
        startActivity(Intent(this, AboutActivity::class.java))
    }

    fun onIntroClick(view: View) {
        startActivity(Intent(this, IntroActivity::class.java))
    }
}