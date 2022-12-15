package com.arminzheng.service;

import com.arminzheng.domain.City;
import com.arminzheng.repository.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements ICityService {

    private final CityRepository repository;

    public CityServiceImpl(CityRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<City> findAll() {
        return (List<City>) repository.findAll();
    }
}
