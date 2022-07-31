class overs {
    int cal(int x, int y) {
        int z;
        z = x + y;
        System.out.println("Using Summation Method ");
        System.out.println("Result is: " + z);
        return 0;
    }

    float cal(float m1, float m2) {
        float mark;
        mark = m1 + m2;
        System.out.println("Using Float Method");
        System.out.println("The mark is :" + mark);
        return 0;
    }

    int cal(int x) {
        System.out.println("Using Input Output Method");
        System.out.println(x);
        return 0;
    }
}

public class Overloadingn {
    public static void main(String args[]) {
        overs s = new overs();
        s.cal(37.25f, 50.25f);
        s.cal(44);
        s.cal(23, 10);
    }
}