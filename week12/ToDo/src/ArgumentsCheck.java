public class ArgumentsCheck {

  ListOfTasks instanceOfListOfTasks;
  String [] args;

  public ArgumentsCheck(String[] args){
    instanceOfListOfTasks = new ListOfTasks();
    this.args = args;
    checkingArgument();
  }

  private void checkingArgument(){
   if (args.length == 0){
    System.out.println(instanceOfListOfTasks.usage());
  } else if (args[0].equals("-l")){
    argumentL(args);
  } else if (args[0].equals("-a")){
    argumentA(args);
  } else if (args[0].equals("-r")){
    argumentR(args);
  } else if (args[0].equals("-c")){
    argumentC(args);
  } else {
    System.out.println("Sorry, there is no such option. Please, see options below:");
    System.out.println(instanceOfListOfTasks.usage());
  }
}

  private void argumentL(String[] args){
    if (args.length == 1){
      instanceOfListOfTasks.list();
    } else {
      System.out.println("For listing no plus argument needed");
      instanceOfListOfTasks.list();
    }
  }

   private void argumentA(String[] args){
    if (args.length == 1){
      System.out.println("Unable to add: no task provided.");
    } else  if (args.length > 2){
      System.out.println("Please, add only one task each time");
    } else {
      instanceOfListOfTasks.add(args[1]);
    }
  }

  private void argumentR(String[] args){
    if (args.length == 1){
      System.out.println("Unable to remove: no index provided.");
    } else  if (args.length > 2){
      System.out.println("Please, remove only one index each time");
    } else {
      try{
        Integer index = Integer.parseInt(args[1]);
        instanceOfListOfTasks.remove(index);
      } catch (NumberFormatException e){
        System.out.println("Unable to remove: index is not a number.");
      } catch (IndexOutOfBoundsException e){
        System.out.println("Unable to remove: index is out of bound.");
      }
    }
  }

  private void argumentC(String[] args){
    if (args.length == 1){
      System.out.println("Unable to check: no index provided.");
    } else  if (args.length > 2){
      System.out.println("Please, check only one index each time");
    } else {
      try{
        Integer index = Integer.parseInt(args[1]);
        instanceOfListOfTasks.complete(index);
      } catch (NumberFormatException e){
        System.out.println("Unable to check: index is not a number.");
      } catch (IndexOutOfBoundsException e){
        System.out.println("Unable to remove: index is out of bound.");
      }
    }
  }

}
