class Solution {
    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
        if (image[sr][sc] == color) return image
        floodFill(image, sr, sc, image[sr][sc], color)
        return image
    }

    private fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, oldColor: Int, newColor: Int) {
        if (sr >= 0 && sr < image.size && sc >= 0 && sc < image[0].size && image[sr][sc] == oldColor) {
            image[sr][sc] = newColor
            floodFill(image, sr - 1, sc, oldColor, newColor)
            floodFill(image, sr + 1, sc, oldColor, newColor)
            floodFill(image, sr, sc - 1, oldColor, newColor)
            floodFill(image, sr, sc + 1, oldColor, newColor)
        }
    }
}