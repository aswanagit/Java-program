class CPU {
int price;
 class Processor {
    int cores=3;
    String manufacture="Intel";
     void displayprocessor() {
     System.out.println("\nProcessor\n");
     System.out.println("No of Cores: "+cores);
     System.out.println("Processor manufactures: "+manufacture);
    }
  }

static class RAM {
 String memory="8GB";
 String manufacture="HP";
  void displayRAM() {
  System.out.println("\nRAM\n");
  System.out.println("Memory Size: "+memory);
  System.out.println("Memory manufactures: "+manufacture);
   }
}
 
public static void main(String[] args) {
 CPU c=new CPU();
 CPU.Processor p=c.new Processor();
 p.displayprocessor();
 CPU.RAM r=new CPU.RAM();
 r.displayRAM();
 }
}