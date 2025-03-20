package com.micsdevstudio.notetoself

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity() {

    // Temporary Code
    private var tempNote = Note()

    fun createNewNote(n: Note) {
        // Temporary Code
        tempNote = n
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.layout_main)

        // Temporary Code
        val button = findViewById<View>(R.id.button) as Button
        button.setOnClickListener {
            // Create a new DialogShowNote called dialog
            val dialog = DialogShowNote()

            // Send the note via the sendNoteSelected function
            dialog.sendNoteSelected(tempNote)

            // Create the dialog
            dialog.show(supportFragmentManager, "123")
        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
}