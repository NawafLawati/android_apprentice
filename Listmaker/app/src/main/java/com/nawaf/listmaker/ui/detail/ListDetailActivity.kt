package com.nawaf.listmaker.ui.detail

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nawaf.listmaker.MainActivity
import com.nawaf.listmaker.R
import com.nawaf.listmaker.models.TaskList

class ListDetailActivity : AppCompatActivity() {

    lateinit var list: TaskList

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_detail)
        list = intent.getParcelableExtra(MainActivity.INTENT_LIST_KEY)!!
        title = list.name
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, ListDetailFragment.newInstance())
                .commitNow()
        }
    }
}