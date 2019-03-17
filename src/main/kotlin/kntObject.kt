
@Suppress("ClassName", "unused", "MayBeConstant")
object nt {
    object const {
        val Inf: Double = Double.POSITIVE_INFINITY
        val Infinity: Double = Double.POSITIVE_INFINITY
        val NZERO: Double = -0.0
        val PZERO: Double = 0.0
        val infty: Double = Double.POSITIVE_INFINITY
        val PINF: Double = Double.POSITIVE_INFINITY
        val NINF: Double = Double.NEGATIVE_INFINITY
    }

    val nan: Double = Double.NaN

    val inf: Double = Double.POSITIVE_INFINITY

    val e: Double = Math.E

    val pi: Double = Math.PI

    fun linspace(start: Number, end: Number, segments: Int): Array<Double> {
        return linspace0(start.toDouble(), end.toDouble(), segments)
    }

    fun linspace(range: IntRange, segments: Int): Array<Double> {
        return linspace0(range.start.toDouble(), range.endInclusive.toDouble(), segments)
    }
}