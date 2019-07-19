package org.euler.problem;


import static java.math.RoundingMode.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.euler.IResult;

public class Problem15 implements IResult {

    private static int count = 0;

    @Override
    public void compute() {
        final long start = System.currentTimeMillis();
        //traceGrid(0, 0, 20, new ArrayList<>());

        System.out.println(countRoutes(20, 20));

        final long time = new BigDecimal(System.currentTimeMillis() - start).divide(new BigDecimal(1000L), HALF_UP).longValue();
        System.out.println("Time to run in seconds: " + time);
    }

    private void traceGrid(int x, int y, int gridSize, List<String> trace) {

        //trace.add("[" + x + "," + y + "]");

        if (checkFinishPoint(x, y, gridSize)) {
            count++;

            //System.out.println("#" + count + ": " + trace);
        }

        if (x != gridSize) {
            traceGrid(x + 1, y, gridSize, new ArrayList<>(trace));
        }
        if (y != gridSize) {
            traceGrid(x, y + 1, gridSize, new ArrayList<>(trace));
        }

    }

    private boolean checkFinishPoint(int x, int y, int gridSize) {
        return (x == gridSize) && (y == gridSize);
    }

    private int countRoutes(int x, int y) {
        return  (x == 0 || y == 0) ? 1 : countRoutes(x, y -1) + countRoutes(x - 1, y);
    }
}
