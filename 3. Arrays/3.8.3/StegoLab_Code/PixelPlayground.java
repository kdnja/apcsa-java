import java.awt.Color;

public class PixelPlayground {

    /**
     * Removes all blue values from every pixel in an image
     * 
     * @param p - original picture
     * @return - original picture without blue values
     */
    public static Picture zeroBlue(Picture p) {
        // Copy p so as not to destroy persistent data
        Picture newPic = new Picture(p);

        // STEP 1: Get 2D array of pixels (use existing getPixels2D() method)
        Pixel[][] pixels = newPic.getPixels2D();

        // STEP 2: Traverse through all pixels (rows and columns) using a nested for
        // loop
        for (int r = 0; r < pixels.length; r++) {
            for (int c = 0; c < pixels[0].length; c++) {
                // STEP 3: Set blue to 0 using existing setBlue(?) method
                pixels[r][c].setBlue(0);
            }
        }

        return newPic;
    }

    /**
     * Keeps all blue from every pixel in an image by removing red and green values
     * 
     * @param p -> original picture
     * @return - original picture without red and green values
     */
    public static Picture keepOnlyBlue(Picture p) {
        // Copy p so as not to destroy persistent data
        Picture newPic = new Picture(p);

        // STEP 1: Get 2D array of pixels (use existing getPixels2D() method)
        Pixel[][] pixels = newPic.getPixels2D();

        // STEP 2: Traverse through all pixels (rows and columns) using a nested for
        // loop
        for (int r = 0; r < pixels.length; r++) {
            for (int c = 0; c < pixels[0].length; c++) {
                // STEP 3: Set red and green to 0 using existing setRed() and setGreen() methods
                pixels[r][c].setRed(0);
                pixels[r][c].setGreen(0);
            }
        }

        return newPic;
    }

    public static Picture negate(Picture p) {
        // Copy p so as not to destroy persistent data
        Picture newPic = new Picture(p);

        // STEP 1: Get 2D array of pixels (use existing getPixels2D() method)
        Pixel[][] pixels = newPic.getPixels2D();

        // STEP 2: Traverse through all pixels (rows and columns) using a nested for
        // loop
        for (int r = 0; r < pixels.length; r++) {
            for (int c = 0; c < pixels[0].length; c++) {
                // STEP 3: Get current color value of pixel
                int red = pixels[r][c].getRed();
                int green = pixels[r][c].getGreen();
                int blue = pixels[r][c].getBlue();

                // STEP 4: Subtract current color value from 255 and set color as that
                pixels[r][c].setRed(255 - red);
                pixels[r][c].setGreen(255 - green);
                pixels[r][c].setBlue(255 - blue);
            }
        }

        return newPic;
    }

    /**
     * Makes an image grayscale
     * 
     * @param p - original picture
     * @return - original picture in grayscale
     */
    public static Picture grayscale(Picture p) {
        // Copy p so as not to destroy persistent data
        Picture newPic = new Picture(p);

        // STEP 1: Get 2D array of pixels (use existing getPixels2D() method)
        Pixel[][] pixels = newPic.getPixels2D();

        // STEP 2: Traverse through all pixels (rows and columns) using a nested for
        // loop
        for (int r = 0; r < pixels.length; r++) {
            for (int c = 0; c < pixels[0].length; c++) {
                // STEP 3: Get the current red, green, and blue values of the current pixel
                int red = pixels[r][c].getRed();
                int green = pixels[r][c].getGreen();
                int blue = pixels[r][c].getBlue();

                // STEP 4: Calculate the average of the red, green, and blue values
                int average = (red + green + blue) / 3;

                // STEP 5: Set the red, green, and blue values to the average
                pixels[r][c].setRed(average);
                pixels[r][c].setGreen(average);
                pixels[r][c].setBlue(average);
            }
        }

        return newPic;
    }

    /**
     * Vertically mirrors the left part of an image to the right image
     * 
     * @param p - original picture
     * @return - image without blue
     */
    public static Picture mirrorVertical(Picture p) {
        Picture newPic = new Picture(p);
        Pixel[][] pixels = newPic.getPixels2D();

        int length = pixels.length;
        int width = pixels[0].length;

        Pixel leftPixel = null;
        Pixel rightPixel = null;

        for (int r = 0; r < length; r++) {
            for (int c = 0; c < width / 2; c++) {
                leftPixel = pixels[r][c];
                rightPixel = pixels[r][width - 1 - c];
                rightPixel.setColor(leftPixel.getColor());
            }
        }

        return newPic;
    }

    /**
     * Mirrors image vertically from right to left
     * 
     * @param p - original picture
     * @return - original picture mirrored vertically from right to left
     */
    public static Picture mirrorVerticalRightToLeft(Picture p) {
        Picture newPic = new Picture(p);
        Pixel[][] pixels = newPic.getPixels2D();

        int length = pixels.length;
        int width = pixels[0].length;

        Pixel leftPixel = null;
        Pixel rightPixel = null;

        for (int r = 0; r < length; r++) {
            for (int c = 0; c < width / 2; c++) {
                leftPixel = pixels[r][c];
                rightPixel = pixels[r][width - 1 - c];
                leftPixel.setColor(rightPixel.getColor());
            }
        }

        return newPic;
    }

    /**
     * Mirrors picture horizontally
     * 
     * @param p - original picture
     * @return - original picture horizontally
     */
    public static Picture mirrorHorizontal(Picture p) {
        Picture newPic = new Picture(p);
        Pixel[][] pixels = newPic.getPixels2D();

        int length = pixels.length;
        int width = pixels[0].length;

        Pixel topPixel = null;
        Pixel bottomPixel = null;

        for (int r = 0; r < length / 2; r++) {
            for (int c = 0; c < width; c++) {
                topPixel = pixels[r][c];
                bottomPixel = pixels[length - 1 - r][c];
                bottomPixel.setColor(topPixel.getColor());
            }
        }

        return newPic;
    }

    /**
     * Mirrors picture horizontally from bottom to top.
     * 
     * @param p - original picture
     * @return - original picture mirrored horizontally from bottom to top
     */
    public static Picture mirrorHorizontalBotToTop(Picture p) {
        Picture newPic = new Picture(p);
        Pixel[][] pixels = newPic.getPixels2D();

        int length = pixels.length;
        int width = pixels[0].length;

        Pixel topPixel = null;
        Pixel bottomPixel = null;

        for (int r = 0; r < length / 2; r++) {
            for (int c = 0; c < width; c++) {
                topPixel = pixels[r][c];
                bottomPixel = pixels[length - 1 - r][c];
                topPixel.setColor(bottomPixel.getColor());
            }
        }

        return newPic;
    }

    /**
     * Mirrors picture diagonally.
     * 
     * @param p - original picture
     * @return - original picture diagonally mirrored
     */
    public static Picture mirrorDiagonal(Picture p) {
        Picture newPic = new Picture(p);
        Pixel[][] pixels = newPic.getPixels2D();

        int length = pixels.length;
        int width = pixels[0].length;

        int stopPoint = length;
        if (length > width) {
            stopPoint = width;
        }

        Pixel leftPixel = null;
        Pixel rightPixel = null;

        for (int r = 0; r < stopPoint; r++) {
            for (int c = 0; c < stopPoint; c++) {
                leftPixel = pixels[r][c];
                rightPixel = pixels[c][r];
                leftPixel.setColor(rightPixel.getColor());
            }
        }

        return newPic;
    }

    public static void main(String[] args) {
        Picture beachPic = new Picture("beach.jpg");
        // Picture swanPic = new Picture("swan.jpg");
        // Picture waterPic = new Picture("water.jpg");
        Picture testPic = new Picture(beachPic);

        // beachPic.explore();
        // waterPic.explore();
        // swanPic.explore();

        // Picture beachPicNoBlue = zeroBlue(beachPic);
        // beachPicNoBlue.explore();

        // Picture beachPicKeepOnlyBlue = keepOnlyBlue(beachPic);
        // beachPicKeepOnlyBlue.explore();

        // Picture beachPicNegate = negate(beachPic);
        // beachPicNegate.explore();

        // Picture beachPicGrayscale = grayscale(beachPic);
        // beachPicGrayscale.explore();

        Picture testMirrorVertical = mirrorVertical(testPic);
        testMirrorVertical.explore();

        Picture testMirrorVerticalRightToLeft = mirrorVerticalRightToLeft(testPic);
        testMirrorVerticalRightToLeft.explore();

        Picture testMirrorHorizontal = mirrorHorizontal(testPic);
        testMirrorHorizontal.explore();

        Picture testMirrorHorizontalBotToTop = mirrorHorizontalBotToTop(testPic);
        testMirrorHorizontalBotToTop.explore();

        Picture testMirrorDiagonal = mirrorDiagonal(testPic);
        testMirrorDiagonal.explore();

        // Picture swanPicMirror = mirrorVertical(swanPic);
        // swanPicMirror.explore();
    }
}
