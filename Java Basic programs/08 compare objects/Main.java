class Point {
    int x ;
    int y ;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point obj1 = new Point(1, 1);
        Point obj2 = new Point(1, 1);
        Point obj3 = new Point(2, 2);
        Point obj4 = obj1;
        System.out.println("obj1 == obj2: "+obj1.equals(obj2));
        System.out.println("obj1 == obj3: "+obj1.equals(obj3));
        System.out.println("obj1 == obj4: "+obj1.equals(obj4));
    }
}