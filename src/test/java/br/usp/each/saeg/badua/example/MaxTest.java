package br.usp.each.saeg.badua.example;

import static br.usp.each.saeg.badua.example.Max.max;

public class MaxTest {

    public void testArrayOrdered() {
        final int[] array = new int[] { 1, 2, 3, 2 };
        assert 3 == max(array, array.length);
    }

}