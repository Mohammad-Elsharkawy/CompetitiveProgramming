import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		    int tt=sc.nextInt();
		    while(tt-->0){
		    	
		int []cols = new int[51];
		int []rows = new int[51];
		    	int r = sc.nextInt();
		int c = sc.nextInt();
		
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        int t;t=sc.nextInt();
		        if(t==1){
		            cols[j]=1;
		            rows[i]=1;
		        }
		    }
		}
		    int cnt1=0,cnt2=0;
			for(int i=0;i<r;i++){
			    if(rows[i]==0)cnt1++;
			}
		
				for(int i=0;i<c;i++){
			 if(cols[i]==0) cnt2++;
					
				}
		int t =Math.min(cnt1,cnt2);
		
		if(t%2==0){
		   System.out.println("Vivek");
		}else{
		   System.out.println("Ashish"); 
		}
	}
}
}