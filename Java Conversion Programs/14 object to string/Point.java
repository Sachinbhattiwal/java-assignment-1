class Point {
    int x ,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        String str = "";
        str += "("+x+", "+y+")";
        return str;
    }
    public static void main(String[] args) {
        Point pt = new Point(2, 3);
        System.out.println(pt.toString());
    }
}