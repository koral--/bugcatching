package pl.droidsonroids.bugcatching.items

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import pl.droidsonroids.bugcatching.R

class ItemListActivity:AppCompatActivity(R.layout.item_list_container) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.beginTransaction().apply {
            add(R.id.root, ItemListFragment())
        }.commit()
    }
}