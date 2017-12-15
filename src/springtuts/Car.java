/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springtuts;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author ekaranja
 */
public class Car {
    
    private String carName;
    private Engine engine;
    private String[] carNames;
    private Map countryCapitals;
    private Set cricketers;
    private List fruits;

    public List getFruits() {
        return fruits;
    }

    public void setFruits(List fruits) {
        this.fruits = fruits;
    }

    
    public Set getCricketers() {
        return cricketers;
    }

    public void setCricketers(Set cricketers) {
        this.cricketers = cricketers;
    }
    

    public Map getCountryCapitals() {
        return countryCapitals;
    }

    public void setCountryCapitals(Map countryCapitals) {
        this.countryCapitals = countryCapitals;
    }
    

    public String[] getCarNames() {
        return carNames;
    }

    public void setCarNames(String[] carNames) {
        this.carNames = carNames;
    }
    

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    
    
}
