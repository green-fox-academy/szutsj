public class ArgumentsCheck {

  ListOfTasks list = new ListOfTasks();

  public void argumentL(String[] args){
    if (args.length == 1){
      list.list();
    } else {
      System.out.println("For listing no plus argument needed");
      list.list();
    }
  }

  public void  argumentA(String[] args){
    if (args.length == 1){
      System.out.println("Unable to add: no task provided.");
    } else  if (args.length > 2){
      System.out.println("Please, add only one task each time");
    } else {
      list.add(args[1]);
    }
  }

  public void argumentR(String[] args){
    if (args.length == 1){
      System.out.println("Unable to remove: no index provided.");
    } else  if (args.length > 2){
      System.out.println("Please, remove only one index each time");
    } else {
       try{
         Integer index = Integer.parseInt(args[1]);
         list.remove(index);
       } catch (NumberFormatException e){
         System.out.println("Unable to remove: index is not a number.");
       } catch (IndexOutOfBoundsException e){
         System.out.println("Unable to remove: index is out of bound.");
       }
    }
  }

  public void argumentC(String[] args){
    if (args.length == 1){
      System.out.println("Unable to check: no index provided.");
    } else  if (args.length > 2){
      System.out.println("Please, check only one index each time");
    } else {
      try{
        Integer index = Integer.parseInt(args[1]);
        list.complete(index);
      } catch (NumberFormatException e){
        System.out.println("Unable to check: index is not a number.");
      } catch (IndexOutOfBoundsException e){
      System.out.println("Unable to remove: index is out of bound.");
    }
    }
  }

}
