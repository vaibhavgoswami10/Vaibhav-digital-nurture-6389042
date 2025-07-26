package com.cognizant.ormlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.model.Country;
import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	private static CountryService countryService;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		LOGGER.info("Inside main");

		countryService = context.getBean(CountryService.class);
		testGetAllCountries();
		testFindCountryByCode();
		testAddCountry();
		testUpdateCountry();
		testDeleteCountry();
		testFindCountryByNameContaining();
	}

	private static void testGetAllCountries() {
		LOGGER.info("Start");
		List<Country> countries = countryService.getAllCountries();
		LOGGER.debug("countries={}", countries);
		LOGGER.info("End");
	}

	private static void testFindCountryByCode() {
		LOGGER.info("Start testFindCountryByCode");
		Country country = countryService.findCountryByCode("IN");
		LOGGER.debug("Country: {}", country);
		LOGGER.info("End testFindCountryByCode");
	}

	private static void testAddCountry() {
		LOGGER.info("Start testAddCountry");
		Country country = new Country();
		country.setCode("ZZ");
		country.setName("Zootopia");
		countryService.addCountry(country);
		LOGGER.debug("Added Country: {}", countryService.findCountryByCode("ZZ"));
		LOGGER.info("End testAddCountry");
	}

	private static void testUpdateCountry() {
		LOGGER.info("Start testUpdateCountry");
		Country country = countryService.findCountryByCode("ZZ");
		if (country != null) {
			country.setName("Zootopia Updated");
			countryService.updateCountry(country);
			LOGGER.debug("Updated Country: {}", countryService.findCountryByCode("ZZ"));
		}
		LOGGER.info("End testUpdateCountry");
	}

	private static void testDeleteCountry() {
		LOGGER.info("Start testDeleteCountry");
		countryService.deleteCountry("ZZ");
		Country deleted = countryService.findCountryByCode("ZZ");
		LOGGER.debug("Deleted Country? {}", deleted == null ? "Yes" : "No");
		LOGGER.info("End testDeleteCountry");
	}

	private static void testFindCountryByNameContaining() {
		LOGGER.info("Start testFindCountryByNameContaining");
		List<Country> countries = countryService.findCountryByNameContaining("land");
		for (Country country : countries) {
			LOGGER.debug("Matching Country: {}", country);
		}
		LOGGER.info("End testFindCountryByNameContaining");
	}

}
