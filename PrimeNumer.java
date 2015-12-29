import java.util.ArrayList;
import java.util.List;

public class PrimeNumer {
	public static void main(String args[]){

		boolean prime = false;
		for(int i = 29; i>0;i--){
			for(int j = 2;j<i;j++)
			{
				if(i%j == 0){
					prime = false;
				}
				else{
					prime = true;
				}
			}
			if(prime){
				System.out.println(i);
			}
			
		}
	}
	
}
