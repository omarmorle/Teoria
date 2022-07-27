#include <bits/stdc++.h>
#include<math.h>
using namespace std;

FILE *totales, *ganadores, *winers;
char *res;
char cad[1000000];
int tam, banderilla=0, contadora=0;

void menu1();
void automata();
int menu2();
void cadenaperfecta();

void q1(int i, string caminos); void q9(int i, string caminos);
void q2(int i, string caminos); void q10(int i, string caminos);
void q3(int i, string caminos); void q11(int i, string caminos);
void q4(int i, string caminos); void q12(int i, string caminos);
void q5(int i, string caminos); void q13(int i, string caminos);
void q6(int i, string caminos); void q14(int i, string caminos);
void q7(int i, string caminos); void q15(int i, string caminos);
void q8(int i, string caminos); void q16(int i, string caminos);

void q1b(int i, string caminitos); void q9b(int i, string caminitos);
void q2b(int i, string caminitos); void q10b(int i, string caminitos);
void q3b(int i, string caminitos); void q11b(int i, string caminitos);
void q4b(int i, string caminitos); void q12b(int i, string caminitos);
void q5b(int i, string caminitos); void q13b(int i, string caminitos);
void q6b(int i, string caminitos); void q14b(int i, string caminitos);
void q7b(int i, string caminitos); void q15b(int i, string caminitos);
void q8b(int i, string caminitos); void q16b(int i, string caminitos);

int main (void)
{
    int flag; 

    totales=fopen("Caminos.txt", "w");
    ganadores=fopen("Ganadores.txt", "w");

    menu1();

    cout<<"Su cadena es: "<<cad<<endl;
    
    int comprueba=strlen(cad);
    if(cad[comprueba-1]=='r'||comprueba<3)
    {
        printf("Cadena no aceptada\n");
        exit(0);
    }

    automata();

    fclose(totales); fclose(ganadores);

    do
    {
        flag = menu2();
    }while(flag != 0);

    return 0;
}

void menu1()
{
    int op, lon, generada;

    cout<<"1 --- ingresar cadena\n";
    cout<<"2 --- generar cadena\n";

    cin>>op;

    if(op==1)
    {
        system("clear");
        cout<<"Ingrese su cadena.\n";
        scanf("%s",&cad);
    }
    if(op==2)
    {
        system("clear");
        srand (time(NULL));
        int n=4 + abs(rand()) % 10;
        for(int i=0; i<n-1; i++)
        {
            generada=rand();
            if(generada%2==0)
                cad[i]='r';
            else
                cad[i]='b';
        }
        cad[n-1]='b';
    }
    return;
}

int menu2()
{
    int op, flag;
    system("clear");
    cout<<"1 --- Simular\n";
    cout<<"2 --- Simular 2\n";
    cout<<"3 --- Salir\n";

    cin>>op;

    if(op==1)
    {
        flag=1;
        system("clear");
        system("xterm -e java Simula");
    }
    if(op==2)
    {
        flag=1; banderilla=1;
        
        winers=fopen("Ganadoresb.txt", "w");
        
        automata();
        
        fclose(winers);

        cadenaperfecta();

        system("clear");
        system("xterm -e java Simula2");
    }
    if(op==3)
    {
        flag=0;
    }
    return flag;
}

void cadenaperfecta()
{


	return;
}

void automata()
{
    if(banderilla==0)
    {
	    string caminos;

	    q1(-1, caminos);

	    cout<<"LISTO\n";
	}
	else
	{
		string caminitos;

		for(int i=0; i<strlen(cad); i++)
		{
			if(cad[i]=='r')
				cad[i]='b';
			else
				cad[i]='r';
		}

	    q4b(-1, caminitos);

	    cout<<"LISTO\n";
	}
    return;
}

void q1(int i, string caminos)
{
	if(abs(i)>strlen(cad))
	{
		printf("%i>%i?\n",i,strlen(cad));
		return;
	}
    i++;
    caminos += "q1 ";
    printf("%i q1 ",i);
    if(i==strlen(cad))
    {
    	printf("\n");
    	contadora++;
        tam=caminos.size();
        res = (char*) calloc (tam,sizeof(char));
        strcpy (res,caminos.c_str());
        //printf("%s %i\n",res, contadora);
        fprintf(totales, "%s\n", res);
        return;
    }
    if(cad[i]=='r')
    {
        q2(i, caminos);
        q5(i, caminos);
    }
    else if(cad[i]=='b')
    {
        q6(i, caminos);
    }
}
void q2(int i, string caminos)
{
	if(abs(i)>strlen(cad))
	{
		printf("%i>%i?\n",i,strlen(cad));
		return;
	}
    i++;
    caminos += "q2 ";
    printf("%i q2 ",i);
    if(i==strlen(cad))
    {
    	printf("\n");
    	contadora++;
        tam=caminos.size();
        res = (char*) calloc (tam,sizeof(char));
        strcpy (res,caminos.c_str());
        //printf("%s %i\n",res, contadora);
        fprintf(totales, "%s\n", res);
        return;
    }
    if(cad[i]=='r')
    {
        q5(i, caminos);
        q7(i, caminos);
    }
    else if(cad[i]=='b')
    {
        q1(i, caminos);
        q3(i, caminos);
        q6(i, caminos);
    }
}
void q3(int i, string caminos)
{
	if(abs(i)>strlen(cad))
	{
		printf("%i>%i?\n",i,strlen(cad));
		return;
	}
    i++;
    caminos += "q3 ";
    printf("%i q3 ",i);
    if(i==strlen(cad))
    {
    	printf("\n");
    	contadora++;
        tam=caminos.size();
        res = (char*) calloc (tam,sizeof(char));
        strcpy (res,caminos.c_str());
        //printf("%s %i\n",res, contadora);
        fprintf(totales, "%s\n", res);
        return;
    }
    if(cad[i]=='r')
    {
        q2(i, caminos);
        q4(i, caminos);
        q7(i, caminos);
    }
    else if(cad[i]=='b')
    {
        q6(i, caminos);
        q8(i, caminos);
    }
}
void q4(int i, string caminos)
{
	if(abs(i)>strlen(cad))
	{
		printf("%i>%i?\n",i,strlen(cad));
		return;
	}
    i++;
    caminos += "q4 ";
    printf("%i q4",i);
    if(i==strlen(cad))
    {
    	printf("\n");
    	contadora++;
        tam=caminos.size();
        res = (char*) calloc (tam,sizeof(char));
        strcpy (res,caminos.c_str());
        //printf("%s %i\n",res, contadora);
        fprintf(totales, "%s\n", res);
        return;
    }
    if(cad[i]=='r')
    {
        q7(i, caminos);
    }
    else if(cad[i]=='b')
    {
        q3(i, caminos);
        q8(i, caminos);
    }
}
void q5(int i, string caminos)
{
	if(abs(i)>strlen(cad))
	{
		printf("%i>%i?\n",i,strlen(cad));
		return;
	}
    i++;
    caminos += "q5 ";
    printf("%i q5 ",i);
    if(i==strlen(cad))
    {
    	printf("\n");
    	contadora++;
        tam=caminos.size();
        res = (char*) calloc (tam,sizeof(char));
        strcpy (res,caminos.c_str());
        //printf("%s %i\n",res, contadora);
        fprintf(totales, "%s\n", res);
        return;
    }
    if(cad[i]=='r')
    {
        q2(i, caminos);
        q10(i, caminos);
    }
    else if(cad[i]=='b')
    {
        q1(i, caminos);
        q6(i, caminos);
        q9(i, caminos);
    }
}
void q6(int i, string caminos)
{
	if(abs(i)>strlen(cad))
	{
		printf("%i>%i?\n",i,strlen(cad));
		return;
	}
    i++;
    caminos += "q6 ";
    printf("%i q6 ",i);
    if(i==strlen(cad))
    {
    	printf("\n");
    	contadora++;
        tam=caminos.size();
        res = (char*) calloc (tam,sizeof(char));
        strcpy (res,caminos.c_str());
        //printf("%s %i\n",res, contadora);
        fprintf(totales, "%s\n", res);
        return;
    }
    if(cad[i]=='r')
    {
        q2(i, caminos);
        q5(i, caminos);
        q7(i, caminos);
        q10(i, caminos);
    }
    else if(cad[i]=='b')
    {
        q1(i, caminos);
        q3(i, caminos);
        q9(i, caminos);
        q11(i, caminos);
    }
}
void q7(int i, string caminos)
{
	if(abs(i)>strlen(cad))
	{
		printf("%i>%i?\n",i,strlen(cad));
		return;
	}
    i++;
    caminos += "q7 ";
    printf("%i q7 ",i);
    if(i==strlen(cad))
    {
    	printf("\n");
    	contadora++;
        tam=caminos.size();
        res = (char*) calloc (tam,sizeof(char));
        strcpy (res,caminos.c_str());
        //printf("%s %i\n",res, contadora);
        fprintf(totales, "%s\n", res);
        return;
    }
    if(cad[i]=='r')
    {
        q2(i, caminos);
        q4(i, caminos);
        q10(i, caminos);
        q12(i, caminos);
    }
    else if(cad[i]=='b')
    {
        q3(i, caminos);
        q6(i, caminos);
        q8(i, caminos);
        q11(i, caminos);
    }
}
void q8(int i, string caminos)
{
	if(abs(i)>strlen(cad))
	{
		printf("%i>%i?\n",i,strlen(cad));
		return;
	}
    i++;
    caminos += "q8 ";
    printf("%i q8 ",i);
    if(i==strlen(cad))
    {
    	printf("\n");
    	contadora++;
        tam=caminos.size();
        res = (char*) calloc (tam,sizeof(char));
        strcpy (res,caminos.c_str());
        //printf("%s %i\n",res, contadora);
        fprintf(totales, "%s\n", res);
        return;
    }
    if(cad[i]=='r')
    {
        q4(i, caminos);
        q7(i, caminos);
        q12(i, caminos);
    }
    else if(cad[i]=='b')
    {
        q3(i, caminos);
        q11(i, caminos);
    }
}
void q9(int i, string caminos)
{
	if(abs(i)>strlen(cad))
	{
		printf("%i>%i?\n",i,strlen(cad));
		return;
	}
    i++;
    caminos += "q9 ";
    printf("%i q9 ",i);
    if(i==strlen(cad))
    {
    	printf("\n");
    	contadora++;
        tam=caminos.size();
        res = (char*) calloc (tam,sizeof(char));
        strcpy (res,caminos.c_str());
        //printf("%s %i\n",res, contadora);
        fprintf(totales, "%s\n", res);
        return;
    }
    if(cad[i]=='r')
    {
        q5(i, caminos);
        q10(i, caminos);
        q13(i, caminos);
    }
    else if(cad[i]=='b')
    {
        q6(i, caminos);
        q14(i, caminos);
    }
}
void q10(int i, string caminos)
{
	if(abs(i)>strlen(cad))
	{
		printf("%i>%i?\n",i,strlen(cad));
		return;
	}
    i++;
    caminos += "q10 ";
    printf("%i q10 ",i);
    if(i==strlen(cad))
    {
    	printf("\n");
    	contadora++;
        tam=caminos.size();
        res = (char*) calloc (tam,sizeof(char));
        strcpy (res,caminos.c_str());
        //printf("%s %i\n",res, contadora);
        fprintf(totales, "%s\n", res);
        return;
    }
    if(cad[i]=='r')
    {
        q5(i, caminos);
        q7(i, caminos);
        q13(i, caminos);
        q15(i, caminos);
    }
    else if(cad[i]=='b')
    {
        q6(i, caminos);
        q9(i, caminos);
        q11(i, caminos);
        q14(i, caminos);
    }
}
void q11(int i, string caminos)
{
	if(abs(i)>strlen(cad))
	{
		printf("%i>%i?\n",i,strlen(cad));
		return;
	}
    i++;
    caminos += "q11 ";
    printf("%i q11 ",i);
    if(i==strlen(cad))
    {
    	printf("\n");
    	contadora++;
        tam=caminos.size();
        res = (char*) calloc (tam,sizeof(char));
        strcpy (res,caminos.c_str());
        //printf("%s %i\n",res, contadora);
        fprintf(totales, "%s\n", res);
        return;
    }
    if(cad[i]=='r')
    {
        q7(i, caminos);
        q10(i, caminos);
        q12(i, caminos);
        q15(i, caminos);
    }
    else if(cad[i]=='b')
    {
        q6(i, caminos);
        q8(i, caminos);
        q14(i, caminos);
        q16(i, caminos);
    }
}
void q12(int i, string caminos)
{
	if(abs(i)>strlen(cad))
	{
		printf("%i>%i?\n",i,strlen(cad));
		return;
	}
    i++;
    caminos += "q12 ";
    printf("%i q12 ",i);
    if(i==strlen(cad))
    {
    	printf("\n");
    	contadora++;
        tam=caminos.size();
        res = (char*) calloc (tam,sizeof(char));
        strcpy (res,caminos.c_str());
        //printf("%s %i\n",res, contadora);
        fprintf(totales, "%s\n", res);
        return;
    }
    if(cad[i]=='r')
    {
        q7(i, caminos);
        q15(i, caminos);
    }
    else if(cad[i]=='b')
    {
        q8(i, caminos);
        q11(i, caminos);
        q16(i, caminos);
    }
}
void q13(int i, string caminos)
{
	if(abs(i)>strlen(cad))
	{
		printf("%i>%i?\n",i,strlen(cad));
		return;
	}
    i++;
    caminos += "q13 ";
    printf("%i q13 ",i);
    if(i==strlen(cad))
    {
    	printf("\n");
    	contadora++;
        tam=caminos.size();
        res = (char*) calloc (tam,sizeof(char));
        strcpy (res,caminos.c_str());
        //printf("%s %i\n",res, contadora);
        fprintf(totales, "%s\n", res);
        return;
    }
    if(cad[i]=='r')
    {
        q10(i, caminos);
    }
    else if(cad[i]=='b')
    {
        q9(i, caminos);
        q14(i, caminos);
    }
}
void q14(int i, string caminos)
{
	if(abs(i)>strlen(cad))
	{
		printf("%i>%i?\n",i,strlen(cad));
		return;
	}
    i++;
    caminos += "q14 ";
    printf("%i q14 ",i);
    if(i==strlen(cad))
    {
    	printf("\n");
    	contadora++;
        tam=caminos.size();
        res = (char*) calloc (tam,sizeof(char));
        strcpy (res,caminos.c_str());
        //printf("%s %i\n",res, contadora);
        fprintf(totales, "%s\n", res);
        return;
    }
    if(cad[i]=='r')
    {
        q10(i, caminos);
        q13(i, caminos);
        q15(i, caminos);
    }
    else if(cad[i]=='b')
    {
        q9(i, caminos);
        q11(i, caminos);
    }
}
void q15(int i, string caminos)
{
	if(abs(i)>strlen(cad))
	{
		printf("%i>%i?\n",i,strlen(cad));
		return;
	}
    i++;
    caminos += "q15 ";
    printf("%i q15 ",i);
    if(i==strlen(cad))
    {
    	printf("\n");
    	contadora++;
        tam=caminos.size();
        res = (char*) calloc (tam,sizeof(char));
        strcpy (res,caminos.c_str());
        //printf("%s %i\n",res, contadora);
        fprintf(totales, "%s\n", res);
        return;
    }
    if(cad[i]=='r')
    {
        q10(i, caminos);
        q12(i, caminos);
    }
    else if(cad[i]=='b')
    {
        q11(i, caminos);
        q14(i, caminos);
        q16(i, caminos);
    }
}
void q16(int i, string caminos)
{
	if(abs(i)>strlen(cad))
	{
		printf("%i>%i?\n",i,strlen(cad));
		return;
	}
    i++;
    caminos += "q16 ";
    printf("%i q16 ",i);
    if(i==strlen(cad))
    {
    	printf("\n");
    	contadora++;
        tam=caminos.size();
        res = (char*) calloc (tam,sizeof(char));
        strcpy (res,caminos.c_str());
        //printf("Ganadora: %s q16 %i\n",res, contadora);
        fprintf(totales, "%s\n", res);
        fprintf(ganadores, "%s\n", res);
        return;
    }
    if(cad[i]=='r')
    {
        q12(i, caminos);
        q15(i, caminos);
    }
    else if(cad[i]=='b')
    {
        q11(i, caminos);
    }
}

void q1b(int i, string caminitos)
{
    i++;
    caminitos += "q1 ";
    if(i==strlen(cad))
        return;
    if(cad[i]=='r')
    {
        q2b(i, caminitos);
        q5b(i, caminitos);
    }
    else if(cad[i]=='b')
    {
        q6b(i, caminitos);
    }
}
void q2b(int i, string caminitos)
{
    i++;
    caminitos += "q2 ";
    if(i==strlen(cad))
        return;
    if(cad[i]=='r')
    {
        q5b(i, caminitos);
        q7b(i, caminitos);
    }
    else if(cad[i]=='b')
    {
        q1b(i, caminitos);
        q3b(i, caminitos);
        q6b(i, caminitos);
    }
}
void q3b(int i, string caminitos)
{
    i++;
    caminitos += "q3 ";
    if(i==strlen(cad))
        return;
    if(cad[i]=='r')
    {
        q2b(i, caminitos);
        q4b(i, caminitos);
        q7b(i, caminitos);
    }
    else if(cad[i]=='b')
    {
        q6b(i, caminitos);
        q8b(i, caminitos);
    }
}
void q4b(int i, string caminitos)
{
    i++;
    caminitos += "q4 ";
    if(i==strlen(cad))
        return;
    if(cad[i]=='r')
    {
        q7b(i, caminitos);
    }
    else if(cad[i]=='b')
    {
        q3b(i, caminitos);
        q8b(i, caminitos);
    }
}
void q5b(int i, string caminitos)
{
    i++;
    caminitos += "q5 ";
    if(i==strlen(cad))
        return;
    if(cad[i]=='r')
    {
        q2b(i, caminitos);
        q10b(i, caminitos);
    }
    else if(cad[i]=='b')
    {
        q1b(i, caminitos);
        q6b(i, caminitos);
        q9b(i, caminitos);
    }
}
void q6b(int i, string caminitos)
{
    i++;
    caminitos += "q6 ";
    if(i==strlen(cad))
        return;
    if(cad[i]=='r')
    {
        q2b(i, caminitos);
        q5b(i, caminitos);
        q7b(i, caminitos);
        q10b(i, caminitos);
    }
    else if(cad[i]=='b')
    {
        q1b(i, caminitos);
        q3b(i, caminitos);
        q9b(i, caminitos);
        q11b(i, caminitos);
    }
}
void q7b(int i, string caminitos)
{
    i++;
    caminitos += "q7 ";
    if(i==strlen(cad))
        return;
    if(cad[i]=='r')
    {
        q2b(i, caminitos);
        q4b(i, caminitos);
        q10b(i, caminitos);
        q12b(i, caminitos);
    }
    else if(cad[i]=='b')
    {
        q3b(i, caminitos);
        q6b(i, caminitos);
        q8b(i, caminitos);
        q11b(i, caminitos);
    }
}
void q8b(int i, string caminitos)
{
    i++;
    caminitos += "q8 ";
    if(i==strlen(cad))
        return;
    if(cad[i]=='r')
    {
        q4b(i, caminitos);
        q7b(i, caminitos);
        q12b(i, caminitos);
    }
    else if(cad[i]=='b')
    {
        q3b(i, caminitos);
        q11b(i, caminitos);
    }
}
void q9b(int i, string caminitos)
{
    i++;
    caminitos += "q9 ";
    if(i==strlen(cad))
        return;
    if(cad[i]=='r')
    {
        q5b(i, caminitos);
        q10b(i, caminitos);
        q13b(i, caminitos);
    }
    else if(cad[i]=='b')
    {
        q6b(i, caminitos);
        q14b(i, caminitos);
    }
}
void q10b(int i, string caminitos)
{
    i++;
    caminitos += "q10 ";
    if(i==strlen(cad))
        return;
    if(cad[i]=='r')
    {
        q5b(i, caminitos);
        q7b(i, caminitos);
        q13b(i, caminitos);
        q15b(i, caminitos);
    }
    else if(cad[i]=='b')
    {
        q6b(i, caminitos);
        q9b(i, caminitos);
        q11b(i, caminitos);
        q14b(i, caminitos);
    }
}
void q11b(int i, string caminitos)
{
    i++;
    caminitos += "q11 ";
    if(i==strlen(cad))
        return;
    if(cad[i]=='r')
    {
        q7b(i, caminitos);
        q10b(i, caminitos);
        q12b(i, caminitos);
        q15b(i, caminitos);
    }
    else if(cad[i]=='b')
    {
        q6b(i, caminitos);
        q8b(i, caminitos);
        q14b(i, caminitos);
        q16b(i, caminitos);
    }
}
void q12b(int i, string caminitos)
{
    i++;
    caminitos += "q12 ";
    if(i==strlen(cad))
        return;
    if(cad[i]=='r')
    {
        q7b(i, caminitos);
        q15b(i, caminitos);
    }
    else if(cad[i]=='b')
    {
        q8b(i, caminitos);
        q11b(i, caminitos);
        q16b(i, caminitos);
    }
}
void q13b(int i, string caminitos)
{
    i++;
    caminitos += "q13 ";
    if(i==strlen(cad))
    {
        tam=caminitos.size();
        res = (char*) calloc (tam,sizeof(char));
        strcpy (res,caminitos.c_str());
        fprintf(winers, "%s\n", res);
        return;
    }
    if(cad[i]=='r')
    {
        q10b(i, caminitos);
    }
    else if(cad[i]=='b')
    {
        q9b(i, caminitos);
        q14b(i, caminitos);
    }
}
void q14b(int i, string caminitos)
{
    i++;
    caminitos += "q14 ";
    if(i==strlen(cad))
        return;
    if(cad[i]=='r')
    {
        q10b(i, caminitos);
        q13b(i, caminitos);
        q15b(i, caminitos);
    }
    else if(cad[i]=='b')
    {
        q9b(i, caminitos);
        q11b(i, caminitos);
    }
}
void q15b(int i, string caminitos)
{
    i++;
    caminitos += "q15 ";
    if(i==strlen(cad))
        return;
    if(cad[i]=='r')
    {
        q10b(i, caminitos);
        q12b(i, caminitos);
    }
    else if(cad[i]=='b')
    {
        q11b(i, caminitos);
        q14b(i, caminitos);
        q16b(i, caminitos);
    }
}
void q16b(int i, string caminitos)
{
    i++;
    caminitos += "q16 ";;
    if(i==strlen(cad))
        return;
    if(cad[i]=='r')
    {
        q12b(i, caminitos);
        q15b(i, caminitos);
    }
    else if(cad[i]=='b')
    {
        q11b(i, caminitos);
    }
}
