public class GoLSimulation implements Executable{
  
  GoLLogic logic;
  GoLManager man
  
  
  public GoLSimulation(GoLLogic l, GoLManager man){
    this.logic=l;
    this.man=man;
  }
  
  @Override
  publc void run(){
    int[][] prevField=System.arrayCopyOf(logic.getField());
    while(man.simRunning()){
      logic.simStepField();
      man.refreshField()
      if(prevField==logic.getField()){
        break;
      }
  }
}
