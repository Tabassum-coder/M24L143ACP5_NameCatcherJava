// The Collections framework is defined in the java.util package
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args){
		//creating an object of arrayList
        ArrayList<String> animals = new ArrayList<>();
        // Add elements
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cheetah");
		System.out.println("=============Printing Current Array==========");
        System.out.println(animals);
		animals.clear();
		System.out.println("=============Printing Cleared Array==========");
		System.out.println("Empty Array : " +animals);
		if(animals.isEmpty()){
			System.out.println("Array is empty");
		}
		else{
			System.out.println("Array is not empty");
		}
		animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cheetah");
		System.out.println("The size of Array: " +animals.size());
		System.out.println("Adding more element " +animals.add("Dog"));
		System.out.println(animals);
		animals.remove(2);//removes the string at 2
		System.out.println(animals);
        System.out.println("Enter animal name for search");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        animals.forEach(n -> {
            if (n.equals(str))
                System.out.println("Found "+str);
            else{
                System.out.println(str+" Not Found");
            }
            
        });
		sc.close();
    }
}