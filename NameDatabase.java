import java.io.*;

public class NameDatabase{

  private SkipList database;

  public NameDatabase(){
    this.database = new SkipList();
  }

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

  public static void main(String[] args){
    NameDatabase nameData = new NameDatabase();
    //nameData.add(args[1]);
  }


}
