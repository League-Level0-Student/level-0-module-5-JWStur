package _03_method_writing._1_obedient_robot;

public class Obedient_Robot {
public static void main(String[] args) {
	jump();
	int total = add(6,7);
	System.out.println(total);
}

public  static void drawSquare() {
	System.out.println("Jumping");
}


public static int add(int n1, int n2) {
	int total = n1 + n2;
	return total;
}
}
