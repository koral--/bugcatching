package pl.droidsonroids.bugcatching

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.android.synthetic.main.activity_api.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.net.URL

class ApiActivity : AppCompatActivity(R.layout.activity_api) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        getButton.setOnClickListener {
            lifecycleScope.launch(Dispatchers.IO) {
                val normalizedQuery = query.text.toString().toLowerCase()
                val text =
                    kotlin.runCatching { URL("https://jsonplaceholder.typicode.com/posts?$normalizedQuery").readText() }
                        .getOrElse {
                            it.message
                        }
                withContext(Dispatchers.Main) {
                    result.text = text
                }
            }
        }
    }
}
