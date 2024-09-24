
#include <iostream.h>
#include <iomanip.h>
#include <cstring>
#include <stdlib.h>

class romanNumerals {
// condição da classe:
 //   0 < num < 3999
 public:
  void returnRoman (char roman[]); // retorna um numero romano

  void setArabic (int number); // seta um número inteiro
  void setRoman (char* roman); // seta um número romano
  bool isError ();  

 private:
  int num;  

 

}; 

void romanNumerals::returnRoman(char roman[]){

 int temp, temp2=num;
 roman[0]=0;
 char *thou[]={ 'M', 'MM', 'MMM'};
 char *hun[]= { "C", "CC", "CCC", "CD", "D" ,"DC", "DCC", "DCCC", "CM"};
 char *ten[]={ "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
 char *one[]={"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
 int count;
  
if  ( num < 0 || num >=4000)// Verifica se o número digitado é menor/igual 4000 or < 0 
 {
  //Coloque uma mensagem de erro

 }
 else{

  for(count=0; count<4; count++){

  if (temp2 >= 1000  && temp2 < 4000){ //Obtém o valor das milhares
   temp = num/1000;
   temp2 = num%1000;
   strcat ( roman, thou[temp-1] );
   cout<<roman<<endl;
  }
  if (temp2 < 1000 && temp2 >=100){ //Obtém o valor das centenas

   temp = (num%1000)/100;
   temp2 = num%100;
   strcat ( roman, hun[temp-1] );
   cout<<roman<<endl;
  }
  if (temp2 < 100 && temp2>= 10){  //Obtém o valor das dezenas

   temp = ((num%1000)%100)/10;
   temp2 = num%10;
   strcat ( roman, ten[temp-1] );
   cout<<roman<<endl;
  }
  if (temp2 <10 && temp2 >= 1){ 
   temp = (((num%1000)%100)%10);
   temp2=0;
   strcat ( roman, one[temp-1] );
   cout<<roman<<endl;
  }
  }
         
  }


}

void romanNumerals::setArabic(int number){
 num=number;
}

void romanNumerals::setRoman(char* roman){
int j=0;
num = 0;
while (roman[j] == 'M')
{
j++;
num+=1000;
}
j=0;
if (roman[j] == 'C' && roman[j+1] == 'M')
num+=900;
}

//bool romanNumerals::isError(){
//return 1;
//}


int main(){
 romanNumerals check;
 int menu=0, number;
 char romanInput[20];
 
 cout<<"Digite a entrada desejada \n1.Arabicos \n2.Romanos\n";
 cin>>menu;

 if(menu==1){
  cout<<"Digite um numero Arabico de 1 ate 3999\n";
  cin>>number;
  check.setArabic(number);
  check.returnRoman(romanInput);
 }
 else if(menu==2){
  cout<<"Digite um numero Romano de 1 ate 3999\n";
 }
 else{
  //erro
 }
system("pause");
}
