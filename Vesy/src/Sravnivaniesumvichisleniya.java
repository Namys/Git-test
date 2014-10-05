
public class Sravnivaniesumvichisleniya {
	String text2="";
	String text1 = "";
	int[] sum = new int[1500];
	int[][] b1=new int[1500][1500];
public Sravnivaniesumvichisleniya(int n,int[] a){
	
	int t,x = 0,q3,j2,x3;
	int x4=0;
	int s=0;
	int vsego=1;
	int q=0;
	int q1=0;
	
    for (int i = 0; i < n; i++) {        	
    	vsego=vsego*2;
    }
    for (int i11= 1; i11 <=  vsego-1; i11++){
    			 t = i11;
    for (int j1= 0; j1 <n; j1++){
    			 if (t%2!=0) { 
    			s= s + a[j1];
    			b1[q][q1]=a[j1];
    			q1=q1+1;
   		}
    			 t=t/2; 
    	}  			 
    			 q=q+1;
    			 q1=0;
    			 sum[q]=s;
    			 s=0;
    	 }

    for (int i=1; i<q; i++){
       if ((sum[i]==(sum[q]*0.5)) && (x<1)){
    	   x=x+1;x4=x4+1;
    	   for (j2 =0; j2<n-1; j2++){
             q3=0;
             if (b1[i-1][j2]!=0)
            	 text1=text1+b1[ i-1][ j2 ]+" ";
               for (int q2=0; q2<n; q2++)
               {
            	   
                   if ((b1[i-1][j2]==a[q2])&&(q3<1)){ 
                	      a[q2]=0;q3=q3+1;
                   }}
                	 			}
    text1=text1+"= ";
     for (q1=0;  q1<n; q1++) {
            		if (a[q1]!=0) { text1=text1+a[q1]+" ";}}
            
            
            
                         }
}
       if (x4==0){
    	   text1="Вычисления невозможны"; 
    	   }  
        x3=0;
       for (int i=0; i<=q; i++){ 
	if (sum[i]==100){
    	   x3=x3+1;}}	
       if (x3>=1) {text2="yes";} 
       else {text2="no";}
}
}