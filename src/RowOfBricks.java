public class RowOfBricks {

  /*
  We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each)
  and big bricks (5 inches each).
  Return true if it is possible to make the goal by choosing from the given bricks.

makeBricks(3, 1, 8) → true
makeBricks(3, 1, 9) → false
makeBricks(3, 2, 10) → true

   */

  private static int small;
  private int big;
  private int goal;

  public RowOfBricks() {
    this.small = small;
    this.big = big;
    this.goal = goal;
  }

  public static void main(String[] args) {
      RowOfBricks rowOfBricks = new RowOfBricks();

    System.out.printf("Using %d small bricks and %d big bricks to make a row of %d gives: " +
        rowOfBricks.makeBricks(3, 1, 8) + "\n\n", 3, 1, 8);
    System.out.printf("Using %d small bricks and %d big bricks to make a row of %d gives: " +
        rowOfBricks.makeBricks(3, 1, 9) + "\n\n", 3, 1, 9);
    System.out.printf("Using %d small bricks and %d big bricks to make a row of %d gives: " +
        rowOfBricks.makeBricks(3, 2, 10) + "\n\n", 3, 2, 10);


  }

  //solution with a ternary
  public boolean makeBricks(int small, int big, int goal) {
    return (goal <= (big * 5) + small && ((goal % 5 <= small) ? true : false));
  }

}
