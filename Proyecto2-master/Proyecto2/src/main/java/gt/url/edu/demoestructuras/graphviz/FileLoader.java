package gt.url.edu.demoestructuras.graphviz;



import Estructuras.CircularLinkedList;
import Estructuras.DoubleLinkedList;
import Estructuras.ImplQueue;
import Estructuras.ImplStack;
import Estructuras.LinkedList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Math.E;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public  class FileLoader {

//	public void loadFileWithJava7() {
//		File file = new File("/Users/tuxtor/Downloads/linked_list.dot");
//
//		try (FileInputStream fis = new FileInputStream(file)) {
//
//			System.out.println("Total file size to read (in bytes) : " + fis.available());
//
//			int content;
//			while ((content = fis.read()) != -1) {
//				// convert to char and display it
//				System.out.print((char) content);
//			}
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
    public void loadFileWithJava8() {
        BufferedReader br = null;
        String sCurrentLine = null;
        String tipoEstructura = "";
        try {
            
            br = new BufferedReader(
           new FileReader("test.txt"));
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
                
                if (sCurrentLine == "Stack") 
                {
                    tipoEstructura = "Stack";
                } 
                else
                {
                 //5 4 3 2 1
                    ImplStack implStack=new ImplStack();
                    String[] numbers = sCurrentLine.split(" ");
                    for (int i = 0; i < numbers.length; i++) {
                          implStack.push(numbers[i]);
                          
                    
                    }      
                       
                }
                 /*    if (sCurrentLine == "BinaryTree") 
                {
                    tipoEstructura = "BinaryTree";
                }  else {
                    //5 4 3 2 1
                    
                    String[] number = sCurrentLine.split(" ");
                    for (int i = 0; i < number.length; i++) {
                       
                        }   
                     }*/
               if (sCurrentLine == "queue") 
                {
                    tipoEstructura = "queue";
                }  else {
                    //5 4 3 2 1
                    ImplQueue implQueue=new ImplQueue();
                    String[] num = sCurrentLine.split(" ");
                    for (int i = 0; i < num.length; i++) {
                      
                      implQueue.enqueue(num[i]);

                        }
                    }
                    
               if (sCurrentLine == "LinkedList") 
                {
                    tipoEstructura = "LinkedList";
                }  else {
                    //5 4 3 2 1
                    LinkedList linkedList=new LinkedList();
                    String[] numbe = sCurrentLine.split(" ");
                    for (int i = 0; i < numbe.length; i++) {
                       linkedList.addFirst(numbe[i]);
                        }
                    }
                if (sCurrentLine == "CircularLinkedList") 
                {
                    tipoEstructura = "CircularLinkedList";
                }  else {
                    //5 4 3 2 1
                    CircularLinkedList circularLinkedList=new CircularLinkedList();
                    String[] numb = sCurrentLine.split(" ");
                    for (int i = 0; i < numb.length; i++) {
                       circularLinkedList.addFirst(numb[i]);
                        } 
                }
                     if (sCurrentLine == "DoubleLinkedList") 
                {
                    tipoEstructura = "DoubleLinkedList";
                }  else {
                    //5 4 3 2 1
                    DoubleLinkedList doubleLinkedList=new DoubleLinkedList();
                    String[] num = sCurrentLine.split(" ");
                    for (int i = 0; i < num.length; i++) {
                       doubleLinkedList.addFirst(num[i]);
                        }   
                } 
                /*          if (sCurrentLine == "btree") 
                {
                    tipoEstructura = "btree";
                }  else {
                    //5 4 3 2 1
                    String[] num = sCurrentLine.split(" ");
                    for (int i = 0; i < num.length; i++) {
                        
                        }   
                } 
                     
           */ }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}

//public void writeUsingFileWriter(String data) {
		//File file = new File("/Users/tuxtor/Downloads/salida.txt");

		//try (FileWriter fw = new FileWriter(file)) {
			//fw.write(data);
		//} catch (IOException e) {
			//e.printStackTrace();
		//}

	//}


