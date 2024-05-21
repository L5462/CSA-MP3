public class Feeder{
  private int currentFood;

  public Feeder(int cf){
    currentFood = cf;
  }

  public int getCurrentFood(){
    return currentFood;
  }
  
  public void simulateOneDay(int numBirds){
    int percentage = (int)(Math.random()*100);
    int food = (int) (Math.random()*50-10)+10;

    if(percentage < 5){
      currentFood = 0;
    }
    else{
      currentFood -= numBirds*food;
    }
  }

  public int simulateManyDays(int numBirds, int numDays){
    int days = numDays;
    int countDays = 0;
    
    while(days > 0 && currentFood > 0){
      simulateOneDay(numBirds);
      days --;
      countDays ++;
    }

    return countDays;
  }
}
