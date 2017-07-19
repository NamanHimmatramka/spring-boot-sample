package org.spring.springboot.service;

import java.util.List;
import org.spring.springboot.domain.City;

/**
 * Created by quiclsandzn@gmail.com on 2017/7/19.
 */
public interface CityService {

    City findOne(Long id);

    void insertCity(City city);

    List<City> searchCity(String searchContent);

    List<City> findByDescription(String description);

    List<City> findByName(String name);
}