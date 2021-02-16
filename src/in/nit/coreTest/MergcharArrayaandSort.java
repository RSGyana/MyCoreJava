package in.nit.coreTest;

public class MergcharArrayaandSort {

	public static void main(String[] args) {
	
		
		try{
            char[] a = {'x','a','r','e','w'};
            char[] b = {'l','t','s','a','e','x'};
            char[] c = new char[a.length+b.length];
          //  System.out.println(c);
            char[] fin = new char[a.length+b.length];
            int i = 0;
            for(char j : fin){
                fin[i++] = (char) -1;
            }
            i = 0;
            for(char j : a){
                c[i++] = j;
            }
            for(char j : b){
                c[i++] = j;
            }
            boolean check = false;
            for(char j = 0,k = 0; j < c.length; j++){
                for(int l : fin){
                    if( l == c[j] )
                        check = true;
                }
                if(!check){
                   System.out.println( fin[k++] = c[j]);
                   
                   
                } else check = false;
            }
        } catch(Exception ex){
            ex.printStackTrace();
        }

	}

}
