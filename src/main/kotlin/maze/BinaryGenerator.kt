package maze

import org.w3c.dom.CanvasRenderingContext2D
import utils.Params

class BinaryGenerator: Generator {
    override fun draw(params: Params, context: CanvasRenderingContext2D) {
        clearMaze(params, context)
        drawBorder(params, context)
        drawMaze(params, context)
    }

    fun drawBorder(params: Params, context: CanvasRenderingContext2D) {
        with(context) {
            val margin = 0.0
            strokeStyle = params.foregroundColor
            lineWidth = params.lineWidth
            rect(margin, margin, context.canvas.width.toDouble() - margin, context.canvas.height.toDouble() - margin)
            stroke()
        }
    }

    fun drawMaze(params: Params, context: CanvasRenderingContext2D) {
//        context.strokeStyle = params.foregroundColor
//        context.lineWidth = params.lineWidth
//        context.moveTo(0.0, 0.0)
//        context.lineTo(200.0, 200.0)
//        context.stroke()
    }

    fun clearMaze(params: Params, context: CanvasRenderingContext2D) {
        with(context) {
            fillStyle = params.backgroundColor
            rect(0.0, 0.0, context.canvas.width.toDouble(), context.canvas.height.toDouble())
            fill()
        }
    }

}