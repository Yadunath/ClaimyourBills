package com.mobisy.claimyourbills.ui.views

import android.content.Context
import android.text.InputType
import android.view.View
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import com.mobisy.claimyourbills.data.ClaimField
import com.mobisy.claimyourbills.data.ClaimFieldOption
import com.mobisy.claimyourbills.ui.adapter.DropdownAdapter

class ViewHelper{

    fun getSpinner(context:Context,options:List<ClaimFieldOption>) : View{
        var spinner =Spinner(context)
        var arrayAdapter = DropdownAdapter(context,options)
        spinner.background = context.resources.getDrawable(android.R.drawable.edit_text)
        spinner.setAdapter( arrayAdapter)
        return spinner;
    }

    fun getTextField(context:Context,claimField:ClaimField): View{
        var textView = EditText(context)
        textView.setHint(claimField.label)
        textView.setSingleLine()
        textView.setTextSize(22F)
        setType(claimField,textView)
        return textView

    }
    fun setType(claimField: ClaimField, textView: TextView) {
        when(claimField.type){
            "SingleLineTextAllCaps" -> textView.inputType = InputType.TYPE_TEXT_FLAG_CAP_CHARACTERS
            "SingleLineTextNumeric" -> textView.inputType = InputType.TYPE_CLASS_NUMBER

        }
    }
}