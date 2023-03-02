package com.blaszak.meditactionguide

import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.TimePicker
import androidx.core.view.isVisible
import com.blaszak.meditactionguide.MainView.Companion.btnChooseFile1
import com.blaszak.meditactionguide.MainView.Companion.btnChooseFile2
import com.blaszak.meditactionguide.MainView.Companion.btnStart
import com.blaszak.meditactionguide.MainView.Companion.btnStop
import com.blaszak.meditactionguide.MainView.Companion.edtPauseTime
import com.blaszak.meditactionguide.MainView.Companion.txtFileName1
import com.blaszak.meditactionguide.MainView.Companion.txtFileName2
import com.blaszak.meditactionguide.MainView.Companion.txtPauseTime

class ViewInitializer(private val mainLayout: LinearLayout, private val mainView: MainView) {

    open fun init() {
        mainView.initElement(txtFileName1, mainLayout.findViewById(R.id.txtFileName1))
        mainView.initElement(btnChooseFile1, mainLayout.findViewById<Button>(R.id.btnChooseFile1))
        mainView.initElement(txtPauseTime, mainLayout.findViewById(R.id.txtPauseTime))
        mainView.initElement(edtPauseTime, mainLayout.findViewById<EditText>(R.id.edtTime))
        mainView.initElement(txtFileName2, mainLayout.findViewById(R.id.txtFileName2))
        mainView.initElement(btnChooseFile2, mainLayout.findViewById<Button>(R.id.btnChooseFile2))
        mainView.initElement(btnStart, mainLayout.findViewById<Button>(R.id.btnStart))
        mainView.initElement(btnStop, mainLayout.findViewById<Button>(R.id.btnStop))
    }

    open fun initSetup() {
        mainView.getElement(txtFileName1)!!.isVisible = false
        val btnOpenFile1 = mainView.getElement(btnChooseFile1)
        btnOpenFile1!!.setText(R.string.btnChooseFile1)
        mainView.getElement(txtPauseTime)!!.setText(R.string.txtPauseTime)
        mainView.getElement(edtPauseTime)!!.setText(R.string.edtPauseTime)
        mainView.getElement(txtFileName2)!!.isVisible = false
        mainView.getElement(btnChooseFile2)!!.setText(R.string.btnChooseFile2)
        mainView.getElement(btnStart)!!.setText(R.string.btnStart)
        mainView.getElement(btnStop)!!.setText(R.string.btnStop)
        mainView.getElement(btnStop)!!.isEnabled = false
    }

}