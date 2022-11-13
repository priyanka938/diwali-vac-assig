import java.util.*;
class pattern23{
public static void main(String args[]){
int i,j,rows=9;
int count=1;


for(i=1; i<=rows; i++){
  for(j=1; j<=rows; j++){
  if(j%2==1){
      System.out.print("1");
  }
  else{
      System.out.print("0");
  }
  
}
System.out.println();
}
}
}