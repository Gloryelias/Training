package com.ust.service;

import java.util.List;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.model.Country;
import com.ust.repository.CountryRepository;

@Service
public class CountryService 
{
	@Autowired
	private  CountryRepository countryRepository; 
	@Transactional
	public List<Country> getAllCountry()
	{
		return countryRepository.findAll();
    } 
	@Transactional
     public Country findCountryByCode(String countryCode) {
	 Optional<Country> result = countryRepository.findById(countryCode);
	 Country country=result.get();
	 return country;
	 }
	@Transactional
public void addCountry(Country country) {
	
	 countryRepository.save(country);
	 }
	 @Transactional
 public void updateCountry(String code,String name) {
	
	 Country country = countryRepository.findById(code).orElse(null);
	if (country != null)
	{
	 country.setName(name);
	 countryRepository.save(country);
	 }
	}
	@Transactional
	 public void deleteCountry(String code) {
	 countryRepository.deleteById(code);
	 }
	}


