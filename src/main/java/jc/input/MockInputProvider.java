package jc.input;

import java.util.Random;

public class MockInputProvider implements InputProvider {
    private final Random rand = new Random(System.currentTimeMillis());

    @Override
    public int[] getList() {
        return rand.ints(10, 0, 100).toArray();
    }
}
