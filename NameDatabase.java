import java.io.*;

public class NameDatabase{

  private SkipList database;

  public NameDatabase(){
    this.database = new SkipList();
  }

  /**
  * add(String) adds the names contained in a given file to the database
  * @param String fileName - name of file to be added
  * each line of the file is interpreted as a name to be inserted
  */
  public void add(String fileName){
    BufferedReader reader = null;
    try{
      reader = new BufferedReader(new FileReader(fileName));
      String currLine = null;
      while((currLine = reader.readLine())!= null){
        database.insert(currLine);
      }
    }catch(FileNotFoundException e){
      e.printStackTrace();
    }catch(IOException e){
      e.printStackTrace();
    }

  }

  public boolean find(String name){
    SkipListNode found = database.retrieve(name);
    if(found == null){
      return false;
    }
    return true;
  }

  public static void main(String[] args){
    NameDatabase nameData = new NameDatabase();
    if(args.length < 1){
      return;
    }else{
      nameData.add(args[0]);
    }
    boolean found = nameData.find("Bo Horvat");
    System.out.println(found);
    found = nameData.find("Zastre");
    System.out.println(found);


  }


}
