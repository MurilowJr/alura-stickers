import java.io.File;
import java.util.Scanner;

public class CriarPasta {
    public static void main(String[] args) {
        
        //Using Scanner class to get the path from the user where he wants to create a folder.  
        System.out.println("Coloque o caminho para criar a pasta: ");  
        try (Scanner sc = new Scanner(System.in)) {
            String path = sc.next();
            
            //Using Scanner class to get the folder name from the user 
            System.out.println("Coloque o nome da pasta: "); 
            path = path+sc.next();
            
            //Instantiate the File class   
            File f1 = new File(path);  
            
            //Creating a folder using mkdir() method  
            boolean bool = f1.mkdir();  
            if(bool){  
                System.out.println("A Pasta foi criada com sucesso!");  
            }else{  
                 System.out.println("Deu ruim!"); 

   }
        }
    
}}
