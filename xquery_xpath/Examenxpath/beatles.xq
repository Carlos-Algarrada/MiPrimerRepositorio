declare variable $input := doc("beatles.xml"); 

<html>
  <head>
    <title> Ejercicio2</title>
   </head>
  <body>{
  for $x in $input//beatle
  return 
    <span>
      El beatle [$x/beatle/firstname] tiene una web llamada [$x/beatle/@link]
    </span>
  }
  </body>
</html>
 



