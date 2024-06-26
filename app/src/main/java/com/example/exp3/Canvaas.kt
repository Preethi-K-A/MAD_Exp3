package com.example.exp3
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
    class Canvaas @JvmOverloads constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int = 0
    ): View(context, attrs, defStyleAttr)
    {
        override fun onDraw(canvas: Canvas) {
            super.onDraw(canvas)
            val paint : Paint = Paint()
            paint.setColor(Color.LTGRAY)
            canvas.drawPaint(paint)
            paint.setColor(Color.BLUE)
            paint.textSize=100f
            canvas.drawText("circle",100f,200f,paint)
            canvas.drawCircle(300f,500f,200f,paint)
            paint.setColor(Color.GREEN)
            paint.textSize=100f
            canvas.drawText("Rectangle",700f,200f,paint)
            canvas.drawRect(800f,300f,1300f,900f,paint)
            paint.setColor(Color.GRAY)
            paint.textSize=100f
            canvas.drawText("Square",175f,1100f,paint)
            canvas.drawRect(100f,1200f,700f,1850f,paint)
            paint.setColor(Color.RED)
            canvas.drawText("line",1000f,1100f,paint)
            paint.setStrokeWidth(20f)
            canvas.drawLine(1050f,1300f,1050f,1800f,paint)


        }
    }