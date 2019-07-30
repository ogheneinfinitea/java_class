
package aptech;


public class Aptech {
    String Aptech_location;
    String Manager;
    String Accoutant;
    
void addcenter(){
    Aptech_location="DELTA";
    Manager="Cent Orife";
    Accoutant="Jerry";
}
void displaycenter() {
    System.out.println(Aptech_location);
    System.out.println(Manager);
    System.out.println(Accoutant);
    
}
void modifycenter(){
    Aptech_location="OWERRI";
    Manager="Cent Orife";
    Accoutant="Jerry";
}

    public static void main(String[] args) {
        // TODO code application logic here
        Aptech centerobj = new Aptech();
        centerobj.addcenter();
        centerobj.displaycenter();
        centerobj.modifycenter();
         centerobj.displaycenter();
        
    }
    
}
