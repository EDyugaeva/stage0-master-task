package com.epam.langSyntax.loops;

import com.epam.loops.HalfPyramid;
import com.epam.util.BaseIOTest;
import org.junit.jupiter.api.Test;

class HalfPyramidTest extends BaseIOTest {

    @Test
    void printHalfPyramidEven() {
        String expected =
                    "       *\n" +
                    "      **\n" +
                    "     ***\n" +
                    "    ****\n" +
                    "   *****\n" +
                    "  ******\n" +
                    " *******\n" +
                    "********\n";

                HalfPyramid halfPyramid = new HalfPyramid();
        halfPyramid.printHalfPyramid(8);

        assertOutEquals(expected);
    }

    @Test
    void printHalfPyramidOdd() {
        String expected =
                    "      *\n" +
                    "     **\n" +
                    "    ***\n" +
                    "   ****\n" +
                    "  *****\n" +
                    " ******\n" +
                    "*******\n";

        HalfPyramid halfPyramid = new HalfPyramid();

        halfPyramid.printHalfPyramid(7);

        assertOutEquals(expected);
    }

    @Test
    void printHalfPyramidPrintsNothing() {

        HalfPyramid halfPyramid = new HalfPyramid();

        halfPyramid.printHalfPyramid(0);

        assertOutEquals("");
    }
}
