#include <bits/stdc++.h>
using namespace std;

//Redefiniendo el tipo de dato para hacer más rápida la programacion
typedef long long int ulld;

//El apuntador al archivo es de tipo global para facilitar el llamado a las funciones
FILE *lectura, *historia, *totales, *encontradas;

char c;
ulld i, web, webapp, webinar, webmail, webpage, ebay, ebaywish;

void saca();
void imprime();
void q0();
void q1();
void q2();
void q3();
void q4();
void q5();
void q6();
void q7();
void q8();
void q9();
void q10();
void q11();
void q12();
void q13();
void q14();
void q15();
void q16();
void q17();
void q18();
void q19();
void q20();
void q21();
void q22();
void q23();
void q24();
void q25();
void q26();

int main (void)
{

	lectura=fopen("web.txt", "r");			totales=fopen("totales.txt", "w");
	historia=fopen("historia.txt", "w");	encontradas=fopen("encontradas.txt", "w");

    i=web=webapp=webinar=webmail=webpage=ebay=ebaywish=0;

    q0();

	return 0;
}

void saca(){
	c=fgetc(lectura);
    i++;
    if(c==EOF)
    {
		printf("LISTO\n");
		imprime();
    }

}

void imprime(){

	fprintf(totales, "Total de WEB = %i\n", web);
	fprintf(totales, "Total de WEBAPP = %i\n", webapp);
	fprintf(totales, "Total de WEBINAR = %i\n", webinar);
	fprintf(totales, "Total de WEBMAIL = %i\n", webmail);
	fprintf(totales, "Total de WEBPAGE = %i\n", webpage);
	fprintf(totales, "Total de EBAY = %i\n", ebay);
	fprintf(totales, "Total de EBAYWISH = %i\n", ebaywish);

	fclose(lectura);	fclose(totales);
	fclose(historia);	fclose(encontradas);

	system("java AFD");

	exit(0);
}

void q0(){

	if(i>0)
		fprintf(historia, "%c, q0\n", c);
	else
		fprintf(historia, "Empieza en q0\n");

	saca();
	if(c=='w')
		q1();
	if(c=='e')
		q2();
	else
		q0();

}
void q1(){

	fprintf(historia, "%c, q1\n", c);
	saca();
	if(c=='e')
		q3();
	if(c=='w')
		q1();
	else
		q0();

}
void q2(){

	fprintf(historia, "%c, q2\n", c);
	saca();
	if(c=='b')
		q4();
	if(c=='e')
		q2();
	if(c=='w')
		q1();
	else
		q0();

}
void q3(){

	fprintf(historia, "%c, q3\n", c);
	saca();
	if(c=='b')
		q5();
	if(c=='e')
		q2();
	if(c=='w')
		q1();
	else
		q0();

}
void q4(){

	fprintf(historia, "%c, q4\n", c);
	saca();
	if(c=='a')
		q6();
	if(c=='e')
		q2();
	if(c=='w')
		q1();
	else
		q0();

}
void q5(){
	//FINAL WEB
	fprintf(historia, "%c, q5\n", c);
	fprintf(encontradas, "WEB en posicion %i\n",i-3);
	web++;
	saca();
	if(c=='a')
		q7();
	if(c=='e')
		q2();
	if(c=='i')
		q8();
	if(c=='m')
		q9();
	if(c=='p')
		q10();
	if(c=='w')
		q1();
	else
		q0();

}
void q6(){

	fprintf(historia, "%c, q6\n", c);
	saca();
	if(c=='e')
		q2();
	if(c=='w')
		q1();
	if(c=='y')
		q11();
	else
		q0();

}
void q7(){

	fprintf(historia, "%c, q7\n", c);
	saca();
	if(c=='e')
		q2();
	if(c=='p')
		q12();
	if(c=='w')
		q1();
	if(c=='y')
		q11();
	else
		q0();

}
void q8(){

	saca();
	if(c=='e')
		q2();
	if(c=='n')
		q13();
	if(c=='w')
		q1();
	else
		q0();

}
void q9(){

	fprintf(historia, "%c, q9\n", c);
	saca();
	if(c=='a')
		q14();
	if(c=='e')
		q2();
	if(c=='w')
		q1();
	else
		q0();

}
void q10(){

	fprintf(historia, "%c, q10\n", c);
	saca();
	if(c=='a')
		q15();
	if(c=='e')
		q2();
	if(c=='w')
		q1();
	else
		q0();		

}
void q11(){
	//FINAL EBAY
	fprintf(historia, "%c, q11\n", c);
	fprintf(encontradas, "EBAY en posicion %i\n",i-4);
	ebay++;
	saca();
	if(c=='e')
		q2();
	if(c=='w')
		q16();
	else
		q0();

}
void q12(){

	fprintf(historia, "%c, q12\n", c);
	saca();
	if(c=='e')
		q2();
	if(c=='p')
		q17();
	if(c=='w')
		q1();
	else
		q0();

}
void q13(){

	fprintf(historia, "%c, q13\n", c);
	saca();
	if(c=='a')
		q18();
	if(c=='e')
		q2();
	if(c=='w')
		q1();
	else
		q0();

}
void q14(){

	fprintf(historia, "%c, q14\n", c);
	saca();
	if(c=='e')
		q2();
	if(c=='i')
		q19();
	if(c=='w')
		q1();
	else
		q0();

}
void q15(){

	fprintf(historia, "%c, q15\n", c);
	saca();
	if(c=='e')
		q2();
	if(c=='g')
		q20();
	if(c=='w')
		q1();
	else
		q0();

}
void q16(){

	fprintf(historia, "%c, q16\n", c);
	saca();
	if(c=='e')
		q3();
	if(c=='i')
		q21();
	if(c=='w')
		q1();
	else
		q0();

}
void q17(){
	//FINAL WEBAPP
	fprintf(historia, "%c, q17\n", c);
	fprintf(encontradas, "WEBAPP en posicion %i\n",i-6);
	webapp++;
	saca();
	if(c=='e')
		q2();
	if(c=='w')
		q1();
	else
		q0();

}
void q18(){

	fprintf(historia, "%c, q18\n", c);
	saca();
	if(c=='e')
		q2();
	if(c=='r')
		q22();
	if(c=='w')
		q1();
	else
		q0();

}
void q19(){

	fprintf(historia, "%c, q19\n", c);
	saca();
	if(c=='e')
		q2();
	if(c=='l')
		q23();
	if(c=='w')
		q1();
	else
		q0();

}
void q20(){

	fprintf(historia, "%c, q20\n", c);
	saca();
	if(c=='e')
		q24();
	if(c=='w')
		q1();
	else
		q0();

}
void q21(){

	fprintf(historia, "%c, q21\n", c);
	saca();
	if(c=='e')
		q2();
	if(c=='s')
		q25();
	if(c=='w')
		q1();
	else
		q0();

}
void q22(){
	//FINAL WEBINAR
	fprintf(historia, "%c, q22\n", c);
	fprintf(encontradas, "WEBINAR en posicion %i\n",i-7);
	webinar++;
	saca();
	if(c=='e')
		q2();
	if(c=='w')
		q1();
	else
		q0();

}
void q23(){
	//FINAL WEBMAIL
	fprintf(historia, "%c, q23\n", c);
	fprintf(encontradas, "WEBMAIL en posicion %i\n",i-6);
	webmail++;
	saca();
	if(c=='e')
		q2();
	if(c=='w')
		q1();
	else
		q0();

}
void q24(){
	//FINAL WEBPAGE
	fprintf(historia, "%c, q24\n", c);
	fprintf(encontradas, "WEBPAGE en posicion %i\n",i-7);
	webpage++;
	saca();
	if(c=='b')
		q4();
	if(c=='e')
		q2();
	if(c=='w')
		q1();
	else
		q0();

}
void q25(){

	fprintf(historia, "%c, q25\n", c);
	saca();
	if(c=='e')
		q2();
	if(c=='h')
		q26();
	if(c=='w')
		q1();
	else
		q0();

}
void q26(){
	//FINAL EBAYWISH
	fprintf(historia, "%c, q26\n", c);
	fprintf(encontradas, "EBAYWISH en posicion %i\n",i-8);
	ebaywish++;
	saca();
	if(c=='e')
		q2();
	if(c=='w')
		q1();
	else
		q0();

}