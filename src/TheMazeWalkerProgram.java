import se.lth.cs.pt.window.SimpleWindow;
import java.util.Scanner;
import se.lth.cs.pt.maze.Maze;

public class TheMazeWalkerProgram {

	public static void main(String[] args) {
		System.out.println("Skriv in ett kartnummer 1-5");
		Scanner scan = new Scanner(System.in);
		int mazeNbr = scan.nextInt(); 
		Maze m = new Maze(mazeNbr); //här skapas ett objekt m av typen Maze med nr mazeNbr
		SimpleWindow w = new SimpleWindow(600, 600, "Labyrinten");
		m.draw(w);//här ritas objektet m i rutan w
		Turtle turtle = new Turtle(w, m.getXEntry(), m.getYEntry()); //m.getXEntry () = objektet m anropar en metod i klassen maze
		MazeWalker mw = new MazeWalker(turtle); //ett mazewalkerobjekt skapas
		mw.walk(m); //metoden walk i klassen MazeWalker anropas
	}

}
