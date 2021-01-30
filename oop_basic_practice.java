class employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

class CellPhone {
    public void ring() {
        System.out.println("Ringing...");
    }

    public void vibrate() {
        System.out.println("Vibrating...");
    }

    public void callFriend() {
        System.out.println("Calling Misk bro...");
    }

}

class Square {
    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}

class Rectangle {
    int length;
    int width;

    public int Rectangle_area() {
        return length * width;
    }
}

class Tommy {
    public void hit() {
        System.out.println("Hitting the enemy");
    }

    public void run() {
        System.out.println("Running from the enemy");
    }

    public void fire() {
        System.out.println("Firing on the enemy");
    }
}

public class oop_basic_practice {
    public static void main(String[] args) {

        // Problem 1
        employee misk = new employee();
        misk.setName("Miskatur");
        misk.salary = 233;
        System.out.println(misk.getSalary());
        System.out.println(misk.getName());

        // Problem 2
        CellPhone asus = new CellPhone();
        asus.callFriend();
        asus.vibrate(); // asus.ring();

        // Problem 3
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        // problem 4
        Rectangle area = new Rectangle();
        area.length = 3;
        area.width = 5;
        System.out.println(area.Rectangle_area());

        // Problem 5
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();

    }
}