package dynamic_array;

public class Array {
	public static void main(String[] args) {
       DynamicArray dArray=new DynamicArray(3);
       dArray.insert(10);
       dArray.insert(20);
       dArray.insert(30);
      dArray.insert(40);
      // dArray.removeAt(1);
      // dArray.removeAt(2);
      // dArray.removeAt(2);
       dArray.print();
       System.out.println(dArray.indexOf(20));
	}
}
