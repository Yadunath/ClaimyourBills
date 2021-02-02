package com.mobisy.claimyourbills

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.gson.Gson
import com.mobisy.claimyourbills.data.Response
import com.mobisy.claimyourbills.ui.adapter.SpinnerAdapter
import com.mobisy.claimyourbills.ui.views.CustomView

class MainActivity : AppCompatActivity(),AdapterView.OnItemSelectedListener,View.OnClickListener  {
    lateinit var spinner :Spinner
    lateinit var parentLayout:ConstraintLayout;
    lateinit var gson:Response
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        spinner =findViewById(R.id.spinner)
        parentLayout=findViewById(R.id.parent)
        button =findViewById(R.id.button)
        setData()
        spinner.onItemSelectedListener = this
        button.setOnClickListener(this)

    }

    private fun setData() {
        val json =
            resources.openRawResource(R.raw.claims_json).bufferedReader().use { it.readText() }
        gson = Gson().fromJson(json, Response::class.java)
        var adapter = SpinnerAdapter(this, gson.claims)
        spinner.adapter = adapter
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        var customView = CustomView(applicationContext,gson.claims.get(0).claimDetails)
        parentLayout.addView(customView)       }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
        parentLayout.removeAllViews()
        var customView = CustomView(applicationContext,gson.claims.get(position).claimDetails)
        parentLayout.addView(customView)
    }

    override fun onClick(p0: View?) {
        Toast.makeText(applicationContext,"Claim added successfully",Toast.LENGTH_LONG).show()
    }

}