
public class vychisleniya {
	int n=1,array1[][];
int[][] perelivaniyaizodnogo(int s1,int s2,int s3){
	int x=0,y=0;
	array1=new int[10000][10000];
	n=1;
	while ((x!=s3)&&(y!=s3)) {
	    if (x+s1>s1){ 
	      if (x>s2){
	        x=x+y-s2;
	        y=s2;
	        if (x!=s3){
	            y=0; 
	            array1[1][n]=x;
	            array1[2][n]=y;
	            n=n+1;}}
	      else {
	        
	        y=x;
	        x=0;
	        array1[1][n]=x;
	        array1[2][n]=y;
	        n=n+1;
	      x=x+s1;
	      array1[1][n]=x;
	      array1[2][n]=y;
	      n=n+1;}
	      if (x+y<=s2){
	        y=y+x; x=0;
	        array1[1][n]=x;
	        array1[2][n]=y; 
	        n=n+1;}
	      else {
	        x=x+y-s2;
	        y=s2;
	        array1[1][n]=x;
	        array1[2][n]=y;
	        n=n+1;
	        if (x!=s3){
	          y=0; 
	          array1[1][n]=x;
	          array1[2][n]=y;
	          n=n+1;}}}
	    else {
	    x=x+s1;
	    array1[1][n]=x;
	    array1[2][n]=y;
	    n=n+1;
	    if (x+y<=s2){ 
	    	y=y+x; x=0;
	        array1[1][n]=x;
	        array1[2][n]=y; 
	        n=n+1;}
	      else {
	        x=x+y-s2;
	        y=s2;
	        array1[1][n]=x;
	        array1[2][n]=y;
	        n=n+1;
	        if (x!=s3){
	            y=0; 
	            array1[1][n]=x;
	            array1[2][n]=y;
	            n=n+1;}}}}
	if (n>999){array1=new int[10000][10000];}
	return array1;
	
}
}
