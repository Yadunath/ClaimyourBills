package com.mobisy.claimyourbills.ui.views

import android.content.Context
import android.view.View
import android.widget.*
import com.mobisy.claimyourbills.data.ClaimDetails
import com.mobisy.claimyourbills.data.ClaimField


class CustomView : LinearLayout{
    var viewHelper :ViewHelper;
    constructor(context: Context,claimItem: List<ClaimDetails>) : super(context) {
         viewHelper = ViewHelper()
        var size =claimItem.size -1
        orientation = VERTICAL
        for (i in 0..size ){
            var claimField = claimItem.get(i).claimField;
            when(claimField.type){
                "DropDown" -> addSpinner(claimField)
                else -> addEditText(claimField)
            }
        }
    }
    fun addSpinner(claimField: ClaimField){
        var textView  = TextView(context)
        addView(textView)
        textView.setText(claimField.label+"*")
        addViewToLayout(viewHelper.getSpinner(context,claimField.claimFiledOptionList))

    }
    fun addEditText(claimField: ClaimField){
        addViewToLayout(viewHelper.getTextField(context,claimField))

    }
    fun addViewToLayout(view:View){
        var layoutParams = LayoutParams(900,LayoutParams.WRAP_CONTENT)
        view.layoutParams =layoutParams
        addView(view)
    }


}