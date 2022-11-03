package maze

import org.w3c.dom.CanvasRenderingContext2D
import utils.Params

sealed interface Generator {
    fun draw(params: Params, context: CanvasRenderingContext2D)
}