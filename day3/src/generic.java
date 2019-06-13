import java.util.ArrayList;
public class generic {
public static void  main(String[] args)
{
ArrayList al = new ArrayList();
			al.add("vinay");
			al.add("kumar");

			for (Object object : al) {
				String s = (String) object; // down casting
				System.out.println(s);
			}
		
			
			ArrayList<String> al2 =  new ArrayList<>();
			al2.add("this");
			al2.add("is");
			al2.add("vinay");
			for (String s : al2) {
				System.out.println(s);
			}
		}

	}
