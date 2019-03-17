internal fun linspace0(start: Double, end: Double, segments: Int, includeEnd: Boolean = true): Array<Double> {
    if (segments < 2 || start == end || !start.isFinite() || !end.isFinite()) return arrayOf()
    val size = (end - start) / segments
    if (includeEnd) return Array(segments + 1) { it * size}
    return Array(segments) { it * size }
}