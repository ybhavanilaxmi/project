
public class genericclass<T> {
	
		T obj;
		genericclass(T obj) {
			this.obj = obj;
		}
		public T print() {
			return this.obj;
		}
		public static void main(String[] args) {
			genericclass<Integer> objI = new genericclass<Integer>(10);
			System.out.println("this is integer value "+objI.print());
			
			genericclass<String> objS = new genericclass<String>("this is vinay");
			System.out.println("this is string value "+objS.print());
		}
}
