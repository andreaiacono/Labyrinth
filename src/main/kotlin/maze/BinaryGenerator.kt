package maze

import org.w3c.dom.CanvasRenderingContext2D
import utils.Params
import kotlin.math.min

class BinaryGenerator : Generator {

    val margin: Double = 15.0
    override fun draw(params: Params, context: CanvasRenderingContext2D) {
        clearMaze(params, context)
        drawBorder(params, context)
        drawMaze(params, context)
    }

    fun drawBorder(params: Params, context: CanvasRenderingContext2D) {
//        with(context) {
//            strokeStyle = params.foregroundColor
//            lineWidth = params.lineWidth
//            rect(
//                margin,
//                margin,
//                canvas.width.toDouble() - margin - params.lineWidth,
//                canvas.height.toDouble() - margin - params.lineWidth
//            )
//            stroke()
//        }
    }

    fun drawMaze(params: Params, context: CanvasRenderingContext2D) {
        console.log(params)
        with(context) {
            val cellSize = min(canvas.width / params.cols, context.canvas.height / params.rows)
            val totalWidth = (cellSize * params.cols).toDouble()
            val totalHeight = (cellSize * params.rows).toDouble()

            strokeStyle = params.foregroundColor
            lineWidth = params.lineWidth
            for (row in 0..params.rows) {
                moveTo(margin, margin + (row * cellSize).toDouble())
                lineTo(totalWidth + margin, margin + (row * cellSize).toDouble())
                stroke()
            }
            for (col in 0..params.cols) {
                moveTo(margin + (col * cellSize).toDouble(), margin)
                lineTo(margin + (col * cellSize).toDouble(), totalHeight + margin)
                stroke()
            }
        }
    }

    fun clearMaze(params: Params, context: CanvasRenderingContext2D) {
//        context.clearRect(
//            -params.lineWidth,
//            -params.lineWidth,
//            context.canvas.width.toDouble() + params.lineWidth + 1.0,
//            context.canvas.height.toDouble() + params.lineWidth + 1.0
//        )
        with(context) {
            fillStyle = params.backgroundColor
            rect(-params.lineWidth, -params.lineWidth, context.canvas.width.toDouble() + params.lineWidth + 1.0, context.canvas.height.toDouble() + params.lineWidth + 1.0)
            fill()
        }
    }

}