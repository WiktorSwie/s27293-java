package com.example.s27293Bank;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.AfterEach;

import java.util.Optional;


@SpringBootTest
class S27293BankApplicationTests {

	@Autowired
	private BazaKlientow bazaklientow;
	@Autowired Bazaprzelewow bazaprzelewow;
	@Autowired
	private Dzialania dzialania;



	@AfterEach
	void czystka(){
		bazaklientow.czystka();
		bazaprzelewow.czystka();
	}

	@Test
	void powinienznalezcklienta() {
		//GIVEN
		bazaklientow.addKlient(new Klient(1,23));
		//WHEN
		Optional<Klient> klientID = dzialania.findklient(1);
		//THEN
		assertThat(klientID).isPresent();
	}
	@Test
	void niepowinnoznalezcklienta() {
		//GIVEN
		bazaklientow.addKlient(new Klient(1,23));
		//WHEN
		Optional<Klient> klientID = dzialania.findklient(2);
		//THEN
		assertThat(klientID).isEmpty();
	}
	@Test
	void czyklientaniema(){
		//GIVEN
		bazaklientow.addKlient(new Klient(1,23));
		//WHEN
		boolean err = dzialania.klientistnieje(2);
		//THEN
		assertThat(err).isTrue();
	}

	@Test
	void czyklientjest(){
		//GIVEN
		bazaklientow.addKlient(new Klient(1,23));
		//WHEN
		boolean err = dzialania.klientistnieje(1);
		//THEN
		assertThat(err).isFalse();
	}

	@Test
	void tworzklienta(){
		//GIVEN
		bazaklientow.addKlient(new Klient(1,23));
		//WHEN
		Klient err = dzialania.register(2, 23);
		//THEN
		assertThat(err).isNot(null);
	}
	
	@Test 
	void Nietworzklienta(){
		//GIVEN
		bazaklientow.addKlient(new Klient(1,23));
		//WHEN
		Klient err = dzialania.register(1, 23);
		//THEN
		assertThat(err).isNull();
	}


}
