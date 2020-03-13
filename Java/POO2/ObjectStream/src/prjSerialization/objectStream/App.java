package prjSerialization.objectStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class App {

	private ObjectOutputStream oos = null;
	private ObjectInputStream ois = null;
	
	public App(String fileName) throws FileNotFoundException, IOException{
		// Padrão de projeto Decorator = são wrappers (os file adicionam funcionalidade a outro objetos)
		oos = new ObjectOutputStream(new FileOutputStream(fileName));
		ois = new ObjectInputStream(new FileInputStream(fileName));
	}
	
	public void destroy() {
		try {
			if (oos != null) {
				oos.close();
			}
			if (ois != null) {
				ois.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//objeto serializável (implementa a interface serializable)
	// interface serializable = não tem nenhum método, serve apenas como marcador
	// objetos que não podem ser serializáveis = thread
	public void write(Serializable obj) {
		try {
			// escreve o objeto no fluxo - fazer uma stream de informações (sequencia de bytes) 
			//que seja possível interpretar qdo remontar o conjunto. 
			oos.writeObject(obj); // não é serializavel
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Object readObject() {
		try {
			return ois.readObject();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String args[]) throws FileNotFoundException, IOException {
		App app = new App("objectFile.txt");
		
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
	    
		Address address1 = new Address("rua Formosa", 2428, "sobrado");
		Address address2 = new Address("rua Lima", 1593, "casa");
		
		Person person1 = new Person(1, "Vilson Luiz", "Dalle Mole", LocalDate.parse("04/01/1971", dateFormatter));
		Person person2 = new Person(1, "Maria", "Flores", LocalDate.parse("16/04/1980", dateFormatter));
		
		person1.setAddress(address1);
		
		// crie um objeto person2 - utilize o mesmo endereço
		
		app.write(person1);
		app.write(person2);
		
		Person person3 = (Person)app.readObject();
		Person person4 = (Person)app.readObject();
		
		System.out.println(person3);
		System.out.println(person4);
		
	}
}
