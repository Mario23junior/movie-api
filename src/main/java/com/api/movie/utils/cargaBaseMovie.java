package com.api.movie.utils;

import java.util.Arrays;

import com.api.movie.dto.GivenBaseDTO;
import com.api.movie.dto.InfoDTO;
import com.api.movie.dto.MovieDTO;
import com.api.movie.model.GivenBase;
import com.api.movie.model.Info;
import com.api.movie.model.Movie;
import com.api.movie.repository.GivenBaseRepository;
import com.api.movie.repository.InfoRepository;
import com.api.movie.repository.MovieRepository;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class cargaBaseMovie {

	private MovieRepository repositoryMovie;
	private InfoRepository infoRepository;
	private GivenBaseRepository givenBaseRepository;
	private ModelMapper mapper;

	public cargaBaseMovie(MovieRepository repositoryMovie, InfoRepository infoRepository,
			GivenBaseRepository givenBaseRepository, ModelMapper mapper) {
		this.repositoryMovie = repositoryMovie;
		this.infoRepository = infoRepository;
		this.givenBaseRepository = givenBaseRepository;
		this.mapper = mapper;
	}

	public void cargaService() {

		// ######################################################################################
		MovieDTO m1 = new MovieDTO();
		m1.setNome("Rango");
		m1.setImagem("https://mb.web.sapo.io/f711101a8d3b5c895bfef0cc3dcb44e4909077d8.jpg");
		m1.setDataLancamento("09-03-2022");
		m1.setFavorito(false);
		m1.setDescricao(
				"A história da aventura de Rango, um camaleão de cativeiro que vive uma normal vida de animal de estimação, enquanto enfrenta uma enorme crise de identidade. A final de contas, de que serve sonhar alto se sabemos que o nosso propósito na vida é nos diluirmos? Quando acidentalmente Rango se vê na arenosa e 'nervosa' Vila Poeira – um lugar sem lei, habitado pelas criaturas mais astutas e extravagantes do deserto – o pouco corajoso lagarto descobre rapidamente que se distingue dos outros.");

		InfoDTO i1 = new InfoDTO();
		i1.setAno("2011");
		i1.setAutor("Gore Verbinski,John Logan ,James Byrkit");
		i1.setElenco(
				"Johnny Depp, Isla Fisher, Bill Nighy, Abigail Breslin, Alfred Molina, Harry Dean Stanton, Ray Winstone, Ned Beatty e Timothy Olyphant");
		i1.setGenero("western, aventura,comédia,ação");

		GivenBaseDTO g1 = new GivenBaseDTO();
		g1.setDirecao("Gore Verbinski");
		g1.setEmissora("Paramount Pictures");
		g1.setTipo("Animação");
		g1.setUrlTrilerVideo("https://www.youtube.com/watch?v=LwSfIbBH8Pw");
		// ######################################################################################

		// ######################################################################################
		MovieDTO m2 = new MovieDTO();
		m2.setNome("Cruella");
		m2.setImagem("https://wallpapercave.com/wp/wp9436533.jpg");
		m2.setDataLancamento("27-05-2021");
		m2.setFavorito(false);
		m2.setDescricao("Inteligente, criativa e determinada, Estella quer fazer um nome para si através de seus designs e acaba chamando a atenção da Baronesa Von Hellman. Entretanto, o relacionamento delas desencadeia um curso de eventos e revelações que fazem com que Estella abrace seu lado rebelde e se torne a Cruella, uma pessoa má, elegante e voltada para a vingança.");
		InfoDTO i2 = new InfoDTO();
		i2.setAno("2021");
		i2.setAutor("Dodie Smith");
		i2.setElenco("Emma Stone ,Emma Thompson , Paul Walter Hauser ,Joel Fry  ,Mark Strong  ,Emily Beecham ,Kirby Howell-Baptiste ,Jamie Demetriou,John McCrea ");
		i2.setGenero("Aventura,Comédia,Família");
		GivenBaseDTO g2 = new GivenBaseDTO();
		g2.setDirecao("Craig Gillespie");
		g2.setEmissora("Disney+");
		g2.setTipo("Crime,Aventura");
		g2.setUrlTrilerVideo("https://youtu.be/tflvpp467hc");
//		// ######################################################################################
//		
		MovieDTO m3 = new MovieDTO();
		m3.setNome("A Chegada");
		m3.setImagem("https://2.bp.blogspot.com/-H2Ga0r9DewQ/WDxsJ26F9yI/AAAAAAAAVcQ/2TwT-OB5eC0gl1Wi-epoHLbtZnKzi8N7ACLcB/s1600/A%2BChegada%2B01.jpg");
		m3.setDataLancamento("22-11-2016");
		m3.setFavorito(false);
		m3.setDescricao("Naves alienígenas chegaram às principais cidades do mundo. Com a intenção de se comunicar com os visitantes, uma linguista e um militar são chamados para decifrar as estranhas mensagens dos visitantes.");
		InfoDTO i3 = new InfoDTO();
		i3.setAno("2016");
		i3.setAutor("Ted Chiang");
		i3.setElenco("Amy Adams  \n"
				+ "Jeremy Renner  \n"
				+ "Forest Whitaker  \n"
				+ "Michael Stuhlbarg  \n"
				+ "Tzi Ma  \n"
				+ "Mark O'Brien  \n"
				+ "Abigail Pniowsky  \n"
				+ "Julia Scarlett Dan \n"
				+ "Jadyn Malone  \n"
				+ "Frank Schorpion  ");
		i3.setGenero("Ficção científica,Drama,Aventura,Suspense");

		GivenBaseDTO g3 = new GivenBaseDTO();
		g3.setDirecao("Denis Villeneuve");
		g3.setEmissora("Paramount Pictures");
		g3.setTipo("ficção científica");
		g3.setUrlTrilerVideo("https://youtu.be/isWwUJf4KEA");
//		
		MovieDTO m4 = new MovieDTO();
		m4.setNome("Interestelar");
		m4.setImagem("https://i.pinimg.com/originals/11/1c/5c/111c5c9ad99661af2d80e38948cf29d8.jpg");
		m4.setDataLancamento("06-11-2014");
		m4.setFavorito(false);
		m4.setDescricao("As reservas naturais da Terra estão chegando ao fim e um grupo de astronautas recebe a missão de verificar possíveis planetas para receberem a população mundial, possibilitando a continuação da espécie. Cooper é chamado para liderar o grupo e aceita a missão sabendo que pode nunca mais ver os filhos");

		InfoDTO i4 = new InfoDTO();
		i4.setAno("2014");
		i4.setAutor("Christopher Nolan,Jonathan Nolan");
		i4.setElenco("Matthew McConaughey, Anne Hathaway, Jessica Chastain, Bill Irwin, Mackenzie Foy, Matt Damon, John Lithgow , Michael Caine.");
		i4.setGenero("Aventura,Drama,Ficção Científica");

		GivenBaseDTO g4 = new GivenBaseDTO();
		g4.setDirecao("Christopher Nolan");
		g4.setEmissora("Paramount Pictures ,Warner Bros. Pictures");
		g4.setTipo("Ficção Científica");
		g4.setUrlTrilerVideo("https://www.youtube.com/watch?v=mbbPSq63yuM");
//		
 
		MovieDTO m1d = mapper.map(m1, MovieDTO.class);
		InfoDTO ifd = mapper.map(i1, InfoDTO.class);
		GivenBaseDTO gb1 = mapper.map(g1, GivenBaseDTO.class);
		
		MovieDTO m2d = mapper.map(m2, MovieDTO.class);
		InfoDTO i2fd = mapper.map(i2, InfoDTO.class);
		GivenBaseDTO gb2 = mapper.map(g2, GivenBaseDTO.class);
		
		MovieDTO m3d = mapper.map(m3, MovieDTO.class);
		InfoDTO i3fd = mapper.map(i3, InfoDTO.class);
		GivenBaseDTO gb3 = mapper.map(g3, GivenBaseDTO.class);
		
		MovieDTO m4d = mapper.map(m4, MovieDTO.class);
		InfoDTO i4fd = mapper.map(i4, InfoDTO.class);
		GivenBaseDTO gb4 = mapper.map(g4, GivenBaseDTO.class);
		
  

		repositoryMovie.saveAll(Arrays.asList(mapper.map(m1d, Movie.class)));
		infoRepository.saveAll(Arrays.asList(mapper.map(ifd, Info.class)));
		givenBaseRepository.saveAll(Arrays.asList(mapper.map(gb1, GivenBase.class)));
		

		repositoryMovie.saveAll(Arrays.asList(mapper.map(m2d, Movie.class)));
		infoRepository.saveAll(Arrays.asList(mapper.map(i2fd, Info.class)));
		givenBaseRepository.saveAll(Arrays.asList(mapper.map(gb2, GivenBase.class)));
		
		

		repositoryMovie.saveAll(Arrays.asList(mapper.map(m3d, Movie.class)));
		infoRepository.saveAll(Arrays.asList(mapper.map(i3fd, Info.class)));
		givenBaseRepository.saveAll(Arrays.asList(mapper.map(gb3, GivenBase.class)));
		
		

		repositoryMovie.saveAll(Arrays.asList(mapper.map(m4d, Movie.class)));
		infoRepository.saveAll(Arrays.asList(mapper.map(i4fd, Info.class)));
		givenBaseRepository.saveAll(Arrays.asList(mapper.map(gb4, GivenBase.class)));

	}
}
