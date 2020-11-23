package com.bach.dv.bulletcurtain

import android.content.Context
import android.util.AttributeSet
import android.view.View

abstract class BulletVideoView<T> : View ,IBulletContainer{
    constructor(context: Context) : super(context) {
        initView(context)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        initView(context, attrs = attrs)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        initView(context, attrs = attrs)
    }



    private fun initView(context: Context, attrs: AttributeSet? = null) {

    }

    private var mBulletLines: MutableList<BulletLine<T>> = ArrayList()
    override fun addView(countLine: Int, view: View) {

    }
    private fun addLine(line: BulletLine<T>) {
        mBulletLines.add(line)
    }

    private fun addLine(listItemInLine: MutableList<T>) {
        val line = BulletLine(listItemInLine)
        mBulletLines.add(line)
    }

    abstract fun drawView(item: T): View
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

    }
}

class BulletLine<T>(private val lines: MutableList<T> = ArrayList()) {
}