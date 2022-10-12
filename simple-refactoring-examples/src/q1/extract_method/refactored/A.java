package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
	   print(nodes, p);
      // other implementation
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
	   print(edgeList, p);
      // other implementation
      return null;
   }

   private <T extends DataField> void print(List<T> list, String p)
   {
	   for (T element : list) {
			if (element.contains(p))
				System.out.println(element);
		}
   }
}

class DataField 
{
	String name;
	public boolean contains(String p) {
	      return name.contains(p);
	}
}
class Node extends DataField{
}

class Edge extends DataField{
}