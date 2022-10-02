import java.until.Scanner;
Class Guesser
{
  int gnum;
  int guessingNum()
  {
    System.out.println("Guesser, kindly guess a number!");
    scanner scan=new scanner(System.in);
    gnum=scan.nextInt();
    return gnum;
    }
}
Class Player
{
  int pnum;
  int predictNum()
  {
    System.out.println("Player,kindly predict a number");
    Scanner scan=new Scanner(system.in);
    pnum=scan.nextInt();
    return pnum;
   }
 }
Class Umpire
{
  int numFromGuesser;
  int numFromPlayer1;
  int numFromPlayer2;
  int numFromPlayer3;
  Void collectNumFromGuesser()
  {
    Guesser g=new GUesser();
    numFromGuesser=g.guessingNum();
  }
  Void collectNumPlayers()
  {
    Player p1=new Player();
    Player p2=new Player();
    Player p3=new Player();
    numFromPlayer1=p1.predictingNum();
    numFromPlayer2=p2.predictingNum();
    numFromPlayer3=p3.predictingNum();
   }
Void compare()
{
  if(numFromPlayer1==numFromGuesser)
  {
    System.out.println("Player1 has won the game!");
  }
elseif(numFromPlayer2==numFromGuesser)
{
  System.out.println("Player2 has won the game!");
}
elseif(numFromPlayer3==numFromGuesser)
{
  System.out.println("Player3 has won the game!");
}
  else
  {
    System.out.println("Gamelost.try again!");
    }
 }
}
Class Main
{
  public static void main(string[]args)
  {
    Umpire u=new umpire();
    u.collectNumFromGuesser();
    u.collectNumFromPlayers();
    u.compare();
    }
    }
  
  
