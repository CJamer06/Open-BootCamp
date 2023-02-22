# HTML

Iniciemos definiendo que es **HTML** (HyperText Markup Lenguaje) es el componente mas básico de la web. Por medio de su sistema de escritura define los significados y la estructura del contenido que posterior mente se presenta en la web.

Cabe aclarar que HTML noes un lenguaje de programación, este es un lenguaje de marcado que se utiliza para el desarrollo de paginas de internet, ya que como su nombre lo indica no es mas que un lenguaje demarcas de hipertexto.

## Sintaxis

La sintaxis de HTML, funciona bajo un sistema de marcaciones o bien conocidas etiquetas, las cuales nos permiten diferenciar que tipo de material se mostrara posterior mente en la pagina web y el comportamiento de los bloques de información que estén dentro de estas, dichas marcas las cuales son denotadas  por una apertura o cierre.

Cual quier documento basado en **_HTML5_** debe tener como primera linea la declaración del tipo de documento que el navegador espera, por lo tanto la colocamos en la primera linea y no esta de mas decir que esta no es una etiqueta como lo sino una "información".

    <!DOCTYPE HTML>

> NOTA: HTML no difiere entre mayúsculas o minúsculas, para este lenguaje
> ```<!DOCTYPE HTML>``` es igual a decir ```<!doctype HTML>```, o intercalar
> unas con otras ```<!Doctype Html>```.

### Etiquetas

HTML5 cuenta con muchas etiquetas para todo tipo de paginas que se quieran desarrollar, entre estas tenemos `<HTML>`, `<HEAD>`, `<TITLE>`, `<BODY>`, `<IMG>`, `<H1>`, `<P>`, `<UL>`, `<OL>`, `<LI>`...etc. Los anteriores son los tipos de etiquetas que se usan para poder colocar o diferenciar características especificas dentro del texto, esto va desde como se ven, su forma y comportamiento.

### Estructura

Dentro de la estructura de una pagina HTML tenemos un orden que respetar y nos queda que para toda etiqueta que usemos debemos usar su cierre que en esencia se escribe igual pero con la compañía de un </> lo que nos deja con:

    <TITLE> Esto es un titulo </TITLE>

Esto es para cada etiqueta y debemos tener muy presente a la hora de escribir dentro las diferentes etiquetas. Para la estructura general del código debemos manejar la indentation, mas que por lo estético, también es lo practico.

    <!DOCTYPE HTML>
    <HTML>
        <HEAD> ACA SE COLOCA EL NOMBRE DE LA PAGINA WEB</HEAD>
        <BODY>
            <H1> ESTE ES EL PRIMER TITULO DE LA PAGINA. </H2>
            <P> 
                ESTE ES EL PRIMER PÁRRAFO DE LA PAGINA.
                <BR>
                <BR>
                ESTE ES EL SEGUNDO PÁRRAFO DE LA PAGINA.
            </P>
            <P>
                ESTE ES EL TERCER PÁRRAFO DE LA PAGINA.
        </BODY>
    </HTML>

Lo anterior es el ejemplo mas practico de lo que podemos realizar en HTML.