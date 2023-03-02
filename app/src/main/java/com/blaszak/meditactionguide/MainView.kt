package com.blaszak.meditactionguide

import android.widget.TextView


class MainView {

    private val elements = LinkedHashMap<String, TextView>()
    companion object {
        const val txtFileName1 = "txtFileName1"
        const val btnChooseFile1 = "btnOpenFile1"
        const val txtPauseTime = "txtPauseTime"
        const val edtPauseTime = "edtPauseTime"
        const val txtFileName2 = "txtFileName2"
        const val btnChooseFile2 = "btnOpenFile2"
        const val btnStart = "btnStart"
        const val btnStop = "btnStop"
    }

    open fun initElement(elementName: String, viewElement: TextView) {
        elements[elementName] = viewElement
    }

    open fun getElement(name: String) = elements[name]

}