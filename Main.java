
public class Main {
    public static void main(String[] args) {
    Book book1 = new Book("Python101",30,"Author of python");
        System.out.println("Price before the discount: "+book1.getPrice());
        System.out.println("after the discount: "+book1.getDiscount());

    Movie movie1 = new Movie("John wick",100,"empty");
        System.out.println("Price before the discount: "+movie1.getPrice());
        System.out.println("after the discount: "+movie1.getDiscount());


        MovablePoint move = new MovablePoint(1,1,3,3);
        System.out.println("x: "+move.getX());
        System.out.println("y: "+move.getY());
        System.out.println("x speed: "+move.getxSpeed());
        System.out.println("y speed: "+move.getySpeed());

        move.moveDown();
        move.moveRight();
        System.out.println("x: "+move.getX());
        System.out.println("y: "+move.getY());
        System.out.println("x speed: "+move.getxSpeed());
        System.out.println("y speed: "+move.getySpeed());
        move.moveUp();
        move.moveLeft();
        System.out.println("x: "+move.getX());
        System.out.println("y: "+move.getY());
        System.out.println("x speed: "+move.getxSpeed());
        System.out.println("y speed: "+move.getySpeed());



    }

}