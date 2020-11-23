package com.bach.dv.bulletcurtain

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View


class GraphicView : View {
    private val QUOTE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    private lateinit var circle: Path
    private lateinit var mCirlcePaint: Paint
    private lateinit var tPaint: Paint
    private lateinit var textBounds: Rect
    private var mTextWidth = 0
    private  var mTextHeight:Int = 0
    private  var centerX:Int = 0
    private  var centerY:Int = 0

    private var radius = 0f
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

    private val YOUR_TEXT = "Khi vuốt lên mở ra video tiếp theo có thời gian cập nhật gần nhất - là video liền kề ngay sau video vừa phát (tính theo thời điểm bắt đầu click xem video vừa phát)."
    private lateinit var mPath: Path
    private lateinit var mPaint: Paint
    private fun initView(context: Context, attrs: AttributeSet? = null) {
        circle = Path()

        tPaint = Paint(Paint.ANTI_ALIAS_FLAG)
        tPaint.setStyle(Paint.Style.FILL_AND_STROKE)
        tPaint.setColor(Color.BLACK)
        tPaint.setTextSize(100f)
        textBounds = Rect()

        tPaint.getTextBounds(QUOTE, 0, QUOTE.length, textBounds)
        mTextWidth =
            Math.round(tPaint.measureText(QUOTE)) // Use measureText to calculate width

        mTextHeight = textBounds.height() // Use height from getTextBounds()


        mCirlcePaint = Paint()
        mCirlcePaint.setStyle(Paint.Style.FILL)
        mCirlcePaint.setColor(Color.GREEN)

        radius = (mTextWidth / Math.PI).toFloat()
    }
    override fun onDraw(canvas: Canvas) {
        canvas.rotate(180f, (width / 2).toFloat(), (height / 2).toFloat())
        canvas.drawCircle(centerX.toFloat(), centerY.toFloat(), radius, mCirlcePaint)
        circle.addCircle(centerX.toFloat(), centerY.toFloat(), radius, Path.Direction.CW)
        canvas.drawTextOnPath(QUOTE, circle, 0f, 0f, tPaint)
    }


    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        centerX = w / 2
        centerY = h / 2
    }
}