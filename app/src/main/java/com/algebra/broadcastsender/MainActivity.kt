package com.algebra.broadcastsender

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity( ) {

    private lateinit var etPoruka : EditText

    override fun onCreate( savedInstanceState : Bundle? ) {
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_main )

        etPoruka = findViewById( R.id.etPoruka )
    }

    fun sendBroadcastWithExtra( v : View) {

        val intent = Intent( )
        intent.action = "com.algebra.broadcastreciver.BroadcastWithValue"
        intent.putExtra( "com.algebra.broadcastreciver.BroadcastWithValue.Extra", etPoruka.text.toString( ) )
        sendBroadcast( intent )

    }

    fun sendForNotification( v : View) {

        val intent = Intent( )
        intent.action = "com.algebra.broadcastreciver.NotificationReceiver"
        sendBroadcast( intent )

    }
}