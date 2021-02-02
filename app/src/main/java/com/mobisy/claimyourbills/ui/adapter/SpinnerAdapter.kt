package com.mobisy.claimyourbills.ui.adapter

import android.content.Context
import android.graphics.ColorSpace
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.mobisy.claimyourbills.R
import com.mobisy.claimyourbills.data.ClaimsItem

class SpinnerAdapter(val context: Context, var dataSource: List<ClaimsItem>): BaseAdapter(){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val vh: ItemHolder
        if (convertView == null) {
            view = inflater.inflate(R.layout.spinner_item, parent, false)
            vh = ItemHolder(view)
            view?.tag = vh
        } else {
            view = convertView
            vh = view.tag as ItemHolder
        }
        vh.label.text = dataSource.get(position).claimtype.name
        return view
    }

    override fun getItem(position: Int): Any {
       return dataSource[position];
    }

    override fun getItemId(p0: Int): Long {
        return 1;
    }

    override fun getCount(): Int {
        return dataSource.size
    }

    lateinit var  name:String
    //Add this
    private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    private class ItemHolder(row: View?) {
        val label: TextView

        init {
            label = row?.findViewById(R.id.textView) as TextView
        }
    }
}