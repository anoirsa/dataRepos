package com.example.dataparsing.repository;


import org.json.JSONArray;
import org.springframework.stereotype.Repository;

import javax.swing.plaf.PanelUI;

@Repository
public class DataRepository {
    private final JSONArray CARBON_DB;
    private final JSONArray ELEXON_DB;
    private final JSONArray SOLAR_DB;
    private final JSONArray TEMP_DB;
    private final JSONArray WIND_OFF_SHORE;
    private final JSONArray ON_SHORE;

    public DataRepository() {
        this.CARBON_DB = DataHelperRepos.getData("csvfiles/bankenergi/carbon_intensity.csv");
        this.ELEXON_DB = DataHelperRepos.getData("csvfiles/bankenergi/elexon.csv");
        this.SOLAR_DB = DataHelperRepos.getData("csvfiles/bankenergi/solar.csv");
        this.TEMP_DB = DataHelperRepos.getData("csvfiles/bankenergi/weather.csv");
        this.WIND_OFF_SHORE = DataHelperRepos.getData("csvfiles/bankenergi/wind_offshore.csv");
        this.ON_SHORE = DataHelperRepos.getData("csvfiles/bankenergi/wind_onshore.csv");
    }
    public JSONArray getCarbonIntensity() {
        return CARBON_DB;
    }
    public JSONArray getElexon() {
        return ELEXON_DB;
    }
    public JSONArray getSolar() {
        return SOLAR_DB;
    }
    public JSONArray getTempDB() {
        return TEMP_DB;
    }
    public JSONArray getWindOff() {
        return WIND_OFF_SHORE;
    }
    public  JSONArray getWindOn() {
        return ON_SHORE;
    }
}
