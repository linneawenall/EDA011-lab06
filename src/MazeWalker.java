import se.lth.cs.pt.maze.Maze;
import se.lth.cs.pt.window.SimpleWindow;

public class MazeWalker {
	private Turtle turtle;
	
	public MazeWalker (Turtle turtle){//I konstruktorn skapar vi objekt och anropar de metoder vi behöver
		this.turtle = turtle;
		turtle.penDown();
	}
	
	public void walk(Maze m){
		while(m.atExit (turtle.getX(), turtle.getY()) == false){
			if(m.wallAtLeft (turtle.getDirection(), turtle.getX(), turtle.getY())== true && m.wallInFront (turtle.getDirection(), turtle.getX(), turtle.getY())== true){
				turtle.left(-90);
				turtle.forward (1);
			}
			else if(m.wallAtLeft (turtle.getDirection(), turtle.getX(), turtle.getY())== false){
				turtle.left(90);
				turtle.forward(1);
			}
			else if(m.wallAtLeft (turtle.getDirection(), turtle.getX(), turtle.getY())== true){
					turtle.forward(1);
				}
			else if(m.wallInFront (turtle.getDirection(), turtle.getX(), turtle.getY()) == false){
				turtle.forward(1);
			}
				else if(m.wallInFront (turtle.getDirection(), turtle.getX(), turtle.getY()) == true){
				turtle.left(90);
				turtle.forward(1);
				}
			SimpleWindow.delay(2);
			}
		}
	
	
	}
