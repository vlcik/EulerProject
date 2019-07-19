package org.euler.theory;

public class PascalTriangle {

    private final int size;
    private final int[][] instance;

    public PascalTriangle(int size) {
        this.size = size;
        this.instance = createPascalTriangle();
    }

    public static void main(String[] args) {
        final PascalTriangle pascalTriangle = new PascalTriangle(10);

        pascalTriangle.print();

    }

    private int[][] createPascalTriangle() {
        final int depth = size + 2;
        final int[][] triangle = init(depth);

        for (int i = 1; i < depth; i++) {
            for (int j = 1; j < depth; j++) {
                triangle[i][j] = triangle[i - 1][j] + triangle[i][j - 1];
            }
        }

        return triangle;
    }

    private int[][] init(int depth) {
        final int[][] triangle = new int[depth][depth];
        for (int i = 0; i < depth; i++) {
            triangle[0][i] = 1;
            triangle[i][0] = 1;
        }

        return triangle;
    }

    public void print() {
        System.out.println("Depth: " + size);
        for (int j = 0; j < size; j++) {
            int k = 0;
            for (int i = 0; i < j ; i++) {
                System.out.print(instance[i][j - ++k] + "  ");
            }

            System.out.println();
        }
    }

}
