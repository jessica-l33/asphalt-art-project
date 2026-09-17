import org.code.neighborhood.*;

public class SmileyPainter extends PainterPlus {

public void paintSmiley() {
setPaint(64);

// Row 1 

  move();
  move();
  paint("black");
  move();
  paint("black");
  move();
  paint("black");
  move();
  paint("black");
  move();
  move();

  goToNextRowLeft();

  // Row 2 
  move();
  paint("black");
  move();
  paint("yellow");
  move();
  paint("yellow");
  move();
  paint("yellow");
  move();
  paint("yellow");
  move();
  paint("black");
  move();

  goToNextRowRight();

  // Row 3
  paint("black");
  move();
  paint("yellow");
  move();
  paint("black");
  move();
  paint("yellow");
  move();
  paint("yellow");
  move();
  paint("black");
  move();
  paint("yellow");
  move();
  paint("black");
  
  goToNextRowLeft();

  // Row 4
  paint("black");
  move();
  paint("yellow");
  move();
  paint("yellow");
  move();
  paint("yellow");
  move();
  paint("yellow");
  move();
  paint("yellow");
  move();
  paint("yellow");
  move();
  paint("black");

  goToNextRowRight();

  // Row 5
  paint("black");
  move();
  paint("yellow");
  move();
  paint("yellow");
  move();
  paint("yellow");
  move();
  paint("yellow");
  move();
  paint("yellow");
  move();
  paint("yellow");
  move();
  paint("black");

  goToNextRowLeft();

  // Row 6 
  paint("black");
  move();
  paint("yellow");
  move();
  paint("yellow");
  move();
  paint("black");
  move();
  paint("black");
  move();
  paint("yellow");
  move();
  paint("yellow");
  move();
  paint("black");

  goToNextRowRight();

  // Row 7
  move();
  paint("black");
  move();
  paint("yellow");
  move();
  paint("yellow");
  move();
  paint("yellow");
  move();
  paint("yellow");
  move();
  paint("black");
  move();

  goToNextRowLeft();

  // Row 8 
  move();
  move();
  paint("black");
  move();
  paint("black");
  move();
  paint("black");
  move();
  paint("black");

}




// Moves down one row when facing right
public void goToNextRowLeft() {
turnRight();
move();
turnRight();
}


// Moves down one row when facing left
public void goToNextRowRight() {
turnLeft();
move();
turnLeft();
}
}
