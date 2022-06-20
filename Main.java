import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   int[] tab = {1,2,3,4,5};
    int dlugosc = tab.length;
    for(int i=0;i<dlugosc;i++){
      if(tab[i]%2==0)
        System.out.println(i+"jest parzyste");
      else
        System.out.println(i+"jest nieparzyste");
    }
  }
}