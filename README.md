<p align="center"><img src="doc/logo.gif"></p>

<h1 align="center">Movie API Rest</h1>

<h3 align="center">
Este projeto inicialmente teve como principal objetivo o poder de trazer um código pratico e habilidoso sobre a estrutura principal, a interoperabilidade de se comunicar e se-multar conforme os parâmetros enviado do back-end  todos o seu fluxo de dados que esta sendo utilizado esta sendo operado pela API movie-api.</h3>

<p align="center">
<a href="https://www.travis-ci.com/github/Mario23junior/Jurassic-API/pull_requests"><img src="https://img.shields.io/github/workflow/status/r-spacex/SpaceX-API/Test?style=flat-square"></a>
<a href="https://en.wikipedia.org/wiki/Representational_state_transfer"><img src="https://img.shields.io/badge/interface-REST-brightgreen.svg?longCache=true&style=flat-square"></a>
</p>

## Etapas para testar ou reproduzir

Primeiro execute o maven 
 
```
 mvn package
```
Em seguida faça
```
java -jar target/movie-1.0-SNAPSHOT.jar

```
## Uso

```
  http://localhost:8080/api/movie/
```

## Informações

```json
 [
    {
        "id": 1,
        "nome": "Rango",
        "imagem": "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSTtmLfwxfgjuexYD4IBRvrF6Lzgs-jAeTLU8GKTFzES6Jm8S1s",
        "descricao": "A história da aventura de Rango, um camaleão de cativeiro que vive uma normal vida de animal de estimação, enquanto enfrenta uma enorme crise de identidade. A final de contas, de que serve sonhar alto se sabemos que o nosso propósito na vida é nos diluirmos? Quando acidentalmente Rango se vê na arenosa e 'nervosa' Vila Poeira – um lugar sem lei, habitado pelas criaturas mais astutas e extravagantes do deserto – o pouco corajoso lagarto descobre rapidamente que se distingue dos outros.",
        "favorito": false,
        "dataLancamento": "09-03-2022"
    },
    {
        "id": 2,
        "nome": "Cruella",
        "imagem": "https://wallpapercave.com/wp/wp9436533.jpg",
        "descricao": "Inteligente, criativa e determinada, Estella quer fazer um nome para si através de seus designs e acaba chamando a atenção da Baronesa Von Hellman. Entretanto, o relacionamento delas desencadeia um curso de eventos e revelações que fazem com que Estella abrace seu lado rebelde e se torne a Cruella, uma pessoa má, elegante e voltada para a vingança.",
        "favorito": false,
        "dataLancamento": "27-05-2021"
    },
    {
        "id": 3,
        "nome": "A Chegada",
        "imagem": "https://2.bp.blogspot.com/-H2Ga0r9DewQ/WDxsJ26F9yI/AAAAAAAAVcQ/2TwT-OB5eC0gl1Wi-epoHLbtZnKzi8N7ACLcB/s1600/A%2BChegada%2B01.jpg",
        "descricao": "Naves alienígenas chegaram às principais cidades do mundo. Com a intenção de se comunicar com os visitantes, uma linguista e um militar são chamados para decifrar as estranhas mensagens dos visitantes.",
        "favorito": false,
        "dataLancamento": "22-11-2016"
    },
    {
        "id": 4,
        "nome": "Interestelar",
        "imagem": "https://m.media-amazon.com/images/I/71qzTzxzoCL.jpg",
        "descricao": "As reservas naturais da Terra estão chegando ao fim e um grupo de astronautas recebe a missão de verificar possíveis planetas para receberem a população mundial, possibilitando a continuação da espécie. Cooper é chamado para liderar o grupo e aceita a missão sabendo que pode nunca mais ver os filhos",
        "favorito": true,
        "dataLancamento": "06-11-2014"
    },
    {
        "id": 5,
        "nome": "Wall-E",
        "imagem": "https://lumiere-a.akamaihd.net/v1/images/p_walle_19753_69f7ff00.jpeg",
        "descricao": "Após entulhar a Terra de lixo e poluir a atmosfera com gases tóxicos, a humanidade deixou o planeta e passou a viver em uma gigantesca nave. O plano era que o retiro durasse alguns poucos anos, com robôs sendo deixados para limpar o planeta. WALL-E é o último destes robôs, e sua vida consiste em compactar o lixo existente no planeta. Até que um dia surge repentinamente uma nave, que traz um novo e moderno robô: Eva. A princípio curioso, WALL-E se apaixona e resolve segui-la por toda a galáxia.",
        "favorito": false,
        "dataLancamento": "27-06-2008"
    },
    {
        "id": 6,
        "nome": "Lucy",
        "imagem": "https://br.web.img3.acsta.net/pictures/14/06/12/15/31/228587.jpg",
        "descricao": "Lucy é obrigada a contrabandear drogas dentro do estômago. Mas o corpo da jovem absorve as substâncias e ela passa a ter superpoderes, como telepatia, telecinesia, a ausência de dor e a capacidade de adquirir conhecimento instantaneamente",
        "favorito": false,
        "dataLancamento": "28-08-2014"
    },
    {
        "id": 7,
        "nome": "Os Incríveis",
        "imagem": "https://cineclick-static.flixmedia.cloud/480/processed/69/1080x1620_1588165592.webp",
        "descricao": "Depois do governo banir o uso de superpoderes, o maior herói do planeta, o Sr. Incrível, vive de forma pacata com sua família. Apesar de estar feliz com a vida doméstica, o Sr. Incrível ainda sente falta dos tempos em que viveu como super-herói, e sua grande chance de entrar em ação novamente surge ",
        "favorito": false,
        "dataLancamento": "10-12-2004"
    },
    {
        "id": 8,
        "nome": "Shrek",
        "imagem": "https://m.media-amazon.com/images/I/71wfvHXxvYL.jpg",
        "descricao": "Um ogro tem sua vida invadida por personagens de contos de fadas que acabam com a tranquilidade de seu lar. Ele faz um acordo pra resgatar uma princesa.",
        "favorito": false,
        "dataLancamento": "22-06-2001"
    },
    {
        "id": 9,
        "nome": "Zootopia: Essa Cidade É o Bicho",
        "imagem": "https://br.web.img3.acsta.net/r_1280_720/pictures/17/12/27/23/58/5850500.jpg",
        "descricao": "Em uma cidade de animais, uma raposa falante se torna uma fugitiva ao ser acusada de um crime que não cometeu. O principal policial do local, o incontestável coelho, sai em sua busca.",
        "favorito": false,
        "dataLancamento": "17-03-2016"
    },
    {
        "id": 10,
        "nome": "Coraline",
        "imagem": "https://m.media-amazon.com/images/I/81lU6I-SGDL.jpg",
        "descricao": "Enquanto explora sua nova casa à noite, a pequena Coraline descobre uma porta secreta que contém um mundo parecido com o dela, porém melhor em muitas maneiras. Todos têm botões no lugar dos olhos, os pais são carinhosos e os sonhos de Coraline viram realidade por lá. Ela se encanta com essa descober",
        "favorito": false,
        "dataLancamento": "13-02-2009"
    }
]
```

## Uso

```
  http://localhost:8080/api/info/
```

## Informações

```json
 [
    {
        "id": 1,
        "elenco": "Johnny Depp, Isla Fisher, Bill Nighy, Abigail Breslin, Alfred Molina, Harry Dean Stanton, Ray Winstone, Ned Beatty e Timothy Olyphant",
        "genero": "western, aventura,comédia,ação",
        "ano": "2011",
        "autor": "Gore Verbinski,John Logan ,James Byrkit"
    },
    {
        "id": 2,
        "elenco": "Emma Stone ,Emma Thompson , Paul Walter Hauser ,Joel Fry  ,Mark Strong  ,Emily Beecham ,Kirby Howell-Baptiste ,Jamie Demetriou,John McCrea ",
        "genero": "Aventura,Comédia,Família",
        "ano": "2021",
        "autor": "Dodie Smith"
    },
    {
        "id": 3,
        "elenco": "Amy Adams  \nForest Whitaker  \nMichael Stuhlbarg  \nTzi Ma  \nMark O'Brien  \nAbigail Pniowsky  \nJulia Scarlett Dan \nJadyn Malone  \nFrank Schorpion  ",
        "genero": "Ficção científica,Drama,Aventura,Suspense",
        "ano": "2016",
        "autor": "Ted Chiang"
    },
    {
        "id": 4,
        "elenco": "Matthew McConaughey, Anne Hathaway, Jessica Chastain, Bill Irwin, Mackenzie Foy, Matt Damon, John Lithgow , Michael Caine.",
        "genero": "Aventura,Drama,Ficção Científica",
        "ano": "2014",
        "autor": "Christopher Nolan,Jonathan Nolan"
    },
    {
        "id": 5,
        "elenco": "\t\nBen Burtt\nElissa Knight\nJeff Garlin\nFred Willard\nJohn Ratzenberger\nKathy Najimy\nSigourney Weaver\nMacInTalk",
        "genero": "ficção científica, comédia",
        "ano": "2008",
        "autor": "Andrew Stanton; Pete Docter"
    },
    {
        "id": 6,
        "elenco": " Bertrand Quoniam · Jan Oliver Schroeder · Julian Rhind-Tutt · Loïc Brabant · Luca Angeletti · Min-sik Choi · Nicolas Phongpheth · Pascal Loison",
        "genero": "ficção científica,Drama,Ação",
        "ano": "2014",
        "autor": "Luc Besson"
    },
    {
        "id": 7,
        "elenco": "Craig T. Nelson, Holly Hunter, Samuel L. Jackson, Jason Lee, Sarah Vowell e Brad Bird",
        "genero": "Animação,Ação,ficção científica",
        "ano": "2004",
        "autor": "Brad Bird"
    },
    {
        "id": 8,
        "elenco": "William Steig · Rupert Everett · Mike Myers · Eddie Murphy · Cameron Diaz · Antonio Banderas · Julie Andrews",
        "genero": "Aventura,Drama,Romance",
        "ano": "2001",
        "autor": "William Steig"
    },
    {
        "id": 9,
        "elenco": "Ginnifer Goodwin · Jason Bateman · Shakira · Idris Elba",
        "genero": "Animção,Aventura",
        "ano": "2016",
        "autor": "Rich Moore,Byron Howard,Phil Johnston,Josie Trinidad , Jared Bush, Jennifer Lee, Jim Reardon, Nancy Kruse"
    },
    {
        "id": 10,
        "elenco": "Dakota Fanning · Aankha Neal · Carolyn Crawford · Christopher Murrie · Dawn French · Emerson Hatcher",
        "genero": "Animação,Terro,Aventura,Intrigante",
        "ano": "2009",
        "autor": "Neil Gaiman"
    }
]
```

## Uso

```
 http://localhost:8080/api/givenbase/
```

## Informações

```json
 [
    {
        "id": 1,
        "emissora": "Paramount Pictures",
        "urlTrilerVideo": "https://www.youtube.com/watch?v=LwSfIbBH8Pw",
        "direcao": "Gore Verbinski",
        "tipo": "Animação"
    },
    {
        "id": 2,
        "emissora": "Disney+",
        "urlTrilerVideo": "https://youtu.be/tflvpp467hc",
        "direcao": "Craig Gillespie",
        "tipo": "Crime,Aventura"
    },
    {
        "id": 3,
        "emissora": "Paramount Pictures",
        "urlTrilerVideo": "https://youtu.be/isWwUJf4KEA",
        "direcao": "Denis Villeneuve",
        "tipo": "ficção científica"
    },
    {
        "id": 4,
        "emissora": "Paramount Pictures ,Warner Bros. Pictures",
        "urlTrilerVideo": "https://www.youtube.com/watch?v=mbbPSq63yuM",
        "direcao": "Christopher Nolan",
        "tipo": "Ficção Científica"
    },
    {
        "id": 5,
        "emissora": "Disney+",
        "urlTrilerVideo": "https://youtu.be/m5_lIuBXKWk",
        "direcao": "Andrew Stanton",
        "tipo": "ficção científica"
    },
    {
        "id": 6,
        "emissora": "CBS",
        "urlTrilerVideo": "https://youtu.be/1oJR6Di0Eck",
        "direcao": "Luc Besson",
        "tipo": "ficção científica"
    },
    {
        "id": 7,
        "emissora": "Disney,Pixar",
        "urlTrilerVideo": "https://youtu.be/W33ZopI8YaE",
        "direcao": "Brad Bird",
        "tipo": "Animaçaõ"
    },
    {
        "id": 8,
        "emissora": "DreamWorks",
        "urlTrilerVideo": "https://www.youtube.com/watch?v=CwXOrWvPBPk",
        "direcao": "Andrew Adamson; ‎Vicky Jenson",
        "tipo": "Animação"
    },
    {
        "id": 9,
        "emissora": "Disney",
        "urlTrilerVideo": "https://www.youtube.com/watch?v=prct6AB5tR8",
        "direcao": "Byron Howard, Rich Moore",
        "tipo": "Animação"
    },
    {
        "id": 10,
        "emissora": "Laika",
        "urlTrilerVideo": "https://www.youtube.com/watch?v=P8lfdvXkhu0",
        "direcao": "Henry Selick",
        "tipo": "Animação"
    }
]
```
