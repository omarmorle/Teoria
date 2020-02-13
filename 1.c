#include <bits/stdc++.h>
using namespace std;

//Redefiniendo el tipo de dato para hacer más rápida la programación
typedef unsigned long long int ulld;

//El apuntador al archivo es de tipo global para facilitar el llamado a las funciones
FILE *fp, *fs;
ulld flag;

void divide()
{
	FILE *en20, *en60, *en100;
	char c, veinte[20], sesenta[60], cien[100];
	ulld ve, se, ci, i;
	veinte[21]=sesenta[61]=cien[101]=sesenta[60]='\0';

	ve=se=ci=0;

	fs=fopen("resultadocompleto.txt", "r");
	en20=fopen("res20.txt", "w");
	en60=fopen("res60.txt", "w");
	en100=fopen("res100.txt", "w");

	
	while(1)
	{
		c=fgetc(fs);
		if(c==EOF)
			break;
		veinte[ve]=sesenta[se]=cien[ci]=c;
		//cout<<veinte[ve]<<" "<<sesenta[se]<<" "<<cien[ci]<<endl;
		//cout<<ve<<" "<<se<<" "<<ci<<endl;
		ve++; se++; ci++;
		if(ve==20)
		{
			fprintf(en20, "%s \n", veinte);
			for(i=0;i<21;i++)
				veinte[i]='\0';
			ve=0;
		}
		if(se==60)
		{
			fprintf(en60, "%s \n", sesenta);
			for(i=0;i<61;i++)
				sesenta[i]='\0';
			se=0;
		}
		if(ci==100)
		{
			fprintf(en100, "%s \n", cien);
			for(i=0;i<101;i++)
				cien[i]='\0';
			ci=0;
		}
	}

	fprintf(en20, "%s", veinte);
	fprintf(en60, "%s", sesenta);
	fprintf(en100, "%s", cien);


	fclose(fs); fclose(en20); fclose(en60); fclose(en60);


	return;
}

//Función con_bin. Recibe como parametros el tamaño de la cadena y el número
//No retorna nada, pero escribe el número en binario en el archivo
void con_bin(ulld tam, ulld num)
{
    //Creamos un string del tamaño recibido
    char res[tam+2];
    res[tam + 1] = '\0';
    //i = la variable que nos servira de contador
    //aux = Nos ayudara a comparar bit por bit para saber que guardar
    ulld i, aux;
    for (i=0;i<=tam;i++)
    {
        /*aux va a ser igual al bit en la iesima posición del numero
        (en representación binaria) que queremos convertir a binario*/
        aux=num>>i;

        //Si el bit en la posición aux=1 entonces lo guardamos como 1
        if (aux&1)
            res[i] = '1';
        //Caso contrario, lo guardamos en nuestro arreglo como un 0
        else
            res[i] = '0';
    }
    //Guardamos en el archivo la cadena generada
    //fputs(res, fp);
    fprintf(fp, "%s", res);
    //cout<<flag<<endl;
    if(tam!=flag && num!=flag-1)
    	fprintf(fp, ",");
	fprintf(fs, "%s", res);
    //cout<<res<<endl;

    //Regresamos al main
    return;
}

//Función menu.
ulld menu(void)
{
    //n = si es valor aleatorio
    //op = opción elegida por el usuario
    ulld n, op;

    //Damos a elegir si quiere elegir él o que sea al azar
    system("cls");
    cout<<"OPCIONES:\n0------------Elegir numero\n1------------Al azar\n";
    cin>>op;

    //Opción 1 es un número aleatorio
    if(op==1)
    {
        //Iniciamos el generador de numeros aleatorios
        srand (time(NULL));
        //Obtenemos un número, le sacamos absoluto y esto modulo 11
        //el modulo 11 es para que no se salga de control jaja
        n=abs(rand()) % 11;
    }
    //Opción 2 el usuario elige su número
    else
    {
        //Lo pedimos y lo guardamos en n
        cout<<"Ingrese su numero\n";
        cin>>n;
        n=abs(n);
    }

    //Retornamos n
    return n;
}

//Funcion main
int main(void)
{
    /*Declaración de:
    k = longitud de las cadenas
    i = variable para ciclos
    conta = numero de cadenas*/
    ulld k, i, conta, j;

    //k va a ser lo que retorna la variable menu
    k=menu();

    //Limpiamos y mostramos el valor porque pudo haber sido generado
    system("cls");
    cout<<"Su numero es: "<<k<<endl;

    //Abrimos el archivo en modo escritura
    //Si no existe, se crea
    fp=fopen("resultado.txt", "w");
    fs=fopen("resultadocompleto.txt","w");
    //conta toma el valor de las cadenas totales
    flag = (ulld) pow(2, k);
    //En el archivo ponemos el total de las cadenas
    //fprintf (fp, "TOTAL = %lld \n",conta);
    //Y decimos que el programa esta trabajando en generarlas
    cout<<"Trabajando...\n";
    //Aqui es para indicar en donde empieza y la longitud
    //Esto con la notación vista en clase
    fprintf(fp, "Σ={");

    //Mientras k sea diferente a 0 podemos hacer el procedimiento para generar las cadenas
    if(k!=0)
    {
        //Damos un anuncio al usuario si es que su archivo será grande
        if(k>=27)
            cout<<"Tus archivos generados tardaran un poco y seran pesados\n";
        for(j=1;j<=k;j++)
        {
	        //Ciclo que crea cadena por cadena
	        //En realidad es solo un contador de 0 al numero de cadenas-1
	        conta=(ulld) pow (2, j);
	        //cout<<conta<<" "<<j<<endl;
	        for (i=0;i<conta;i++)
	        {
	            //llamamos a la funcion, mandando la longitud y el numero a convertir
	            con_bin(j-1, i);
	            //Este if es para saber donde van las comas para separar los elementos del conjunto
	            //Si esta en el último numero, este no necesita la coma
	            //if(i!=conta-1)
	            //	fputc (',' , fp);
	        }
	    }
    }
    //Pero si k = 0 entonces solo podemos poner el epsilon
    else
    {
        fputc('E',fp);
    }
    //Terminamos el archivo indicando que se cierra el conjunto
    fputc('}',fp);
    //Se cierra el archivo
    fclose (fp);
    fclose (fs);

    divide();

    //Se imprime que esta hecho el trabajo
    cout<<"Listo\n";
    //Se termina
    return 0;
}
