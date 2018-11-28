package thranaga.IOoperations;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ScannerExp {


    public static void main(String[] args) throws IOException {
        
         
        String fileName = "/Users/USER/source.txt";
        Path path = Paths.get(fileName);
        Scanner scanner = new Scanner(path);
        
        //read file line by line
        scanner.useDelimiter(System.getProperty("line.separator"));
        while(scanner.hasNext()){
            System.out.println("Lines: "+scanner.next());
        }
        scanner.close();
     
        scanner = new Scanner(Paths.get("/Users/USER/data.csv"));
        scanner.useDelimiter(System.getProperty("line.separator"));
        while(scanner.hasNext()){
            
            Employee emp = parseCSVLine(scanner.next());
            System.out.println(emp.toString());
        }
        scanner.close();
        
        
        System.out.println("Read from system input:");
        scanner = new Scanner(System.in);
        System.out.println("Input first word: "+scanner.next());
    }
    
    private static Employee parseCSVLine(String line) {
         Scanner scanner = new Scanner(line);
         scanner.useDelimiter("\\s*,\\s*");
         String name = scanner.next();
         int age = scanner.nextInt();
         String gender = scanner.next();
         ScannerExp jfs = new ScannerExp();
         return jfs.new Employee(name, age, gender);
    }

    public class Employee{
        private String name;
        private int age;
        private String gender;
        
        public Employee(String n, int a, String gen){
            this.name = n;
            this.age = a;
            this.gender = gen;
        }
        
        
        public String toString(){
            return "Name="+this.name+"::Age="+this.age+"::Gender="+this.gender;
        }
    }

}
