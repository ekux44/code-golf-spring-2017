import java.util.*;import java.io.*;
public class S5{
static PrintWriter w;
public static void main(String a[]){try{
Scanner sc=new Scanner(new File("../inputs/5.txt"));
w=new PrintWriter(new FileWriter(new File("../answers/5.txt")));
while(sc.hasNextLine()){
int n=sc.nextInt();
int r=0;
while(n>1){
for(int i=2;i<41;i++){
if(n%i==0){
if(n!=i){p(r,"<composite value=\""+n+"\">");r++;}
n/=i;
p(r,"<prime value=\""+i+"\">");
p(r,"</prime>");
break;
}
}
}
while(r>0){
p(r-1,"</composite>");
r--;	
}
}
}catch(Exception e){}w.close();}
static void p(int n,String s) {
for(int i=0;i<n;i++) {
w.print("  ");
}
w.println(s);
}
}