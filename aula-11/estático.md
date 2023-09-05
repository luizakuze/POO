c.toString
c



estatico é compartilhado p todas as isntancias da classe


Math. é um metodo estatico
-> classe utilitaria



COLEÇÕES



NO MAIN!!

ArrayList<Circulo> lista = new ArrayList<>();

//cria onj
Circulo c = new CIrculo(1,1,3);
Circulo d = new CIrculo(1,1,3);


// manda referencia do obj
lista.add(c);
lista.add(d);

// mais um obj e a referencia é somente seu indice
lista.add(new Circulo(7.8.9));

for(inti = 0; i <lista.size(); i++) {
Ciruclo a = lista.get(i);
sout(a)
}

for (Circulo a : lista) {
sout(A);
}

lista.forEach(a->sout(a));

// referencia ali do foreach acima , p cada elemento q tiver la dentro, fazer c tdos os outros
lista.forEach(System.out::println);