declare variable $input :=doc("books.xml");

declare function local:libros(){
  
 for $libro in $input//book
 where $libro/genre != "Computer" and $libro/price <5
 return $libro/title
};
declare function local:cuenta(){
count($input [book/genre !="Computer" and book/price <5])};

(
local:libros(),
local:cuenta()
)