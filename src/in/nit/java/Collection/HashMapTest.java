package in.nit.java.Collection;

import java.util.WeakHashMap;

public class HashMapTest {

	public static void main(String[] args) throws InterruptedException {
	
		
		/*LinkedhashMap-------
		 * it is the child class hashmap,exactly hashmap,but diff is
		 * 
		 * hashmap                    linkedhashMap
		 *  ========                    -============= 
		 *  insertion not prsv(1.2)
		 *                                      prsv(1.4)
		 *                                      
		 *   linkedhashset/map are used to dev cache based appln    
		 *   
		 *    IdentityHashMap  
		 *    ===========
		 *    it sexactly same as hashmap(including const and methods)
		 *    in hashmap jvm used to identify duplicate key by ==operator(ref/adds comparision)
		 *                               
		 *                                
		 *                                  
		 */
		/*
		 * IdentityHashMap m=new IdentityHashMap();
		 * 
		 * HashMap m1=new HashMap();
		 * 
		 * LinkedHashMap m2=new LinkedHashMap();
		 * 
		 * Integer i1=new Integer(10); Integer i2=new Integer(10); m.put(i1,"jk");
		 * m.put(i2,"kk"); System.out.println(m);//{20=kk, 10=jk}
		 * 
		 * m1.put(i1,"jk"); m1.put(i2,"kk"); System.out.println(m1); //{10=kk}
		 * 
		 * m2.put(i1,"jk"); m2.put(i2,"kk"); System.out.println(m2);//{10=kk}
		 */
		// from above we concluded that hashmap and linked hashmap using == operator
		//Identity hashmap used equal method
		
		//WeakHashMap
		//=============
		//it is exactly same as hashmap,but the diff is
		/*
		 * in the case of hashmap obj has no diff and not eligible for gc it asoociated
		 * with map\ if obj doesnt conatin any ref it is eligible for gc even though obj
		 * associated with waekhash map
		 */
		//HashMap m=new HashMap();
		WeakHashMap m=new WeakHashMap();
		Temp t=new Temp();
		m.put(t,"jk");
		System.out.println(m);
		t=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);
		//from above program if we replace hashmap  weakhashmap temp is eligible for gc
		/*op
		 * {temp=jk} from finaize method {}
		 */

	}

}
class Temp{
	public String toString() {
		return "temp";
		
	}
	public void finalize() {
		System.out.println("from finaize method");
	}
}


