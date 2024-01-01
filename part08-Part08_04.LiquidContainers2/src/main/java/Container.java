public class Container {

  private int content;

  public Container(){
    this.content = 0;
  }

  public int contains(){
    return this.content;
  }

  public void setContent(int content){
    this.content = content;
  }


  public void add(int volume){

    if (volume < 0) return;

    if (this.content + volume > 100){
      this.content = 100;
    } else {
      this.content += volume;
    }
  }

  public void remove(int volume){

    if (this.content - volume < 0){
      this.content = 0;
      return;
    } 

    this.content -= volume;

  }

  public String toString(){
    return this.content + "/100";
  }
  
}
