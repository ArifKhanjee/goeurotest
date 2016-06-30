package de.goeuro.json_csv;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "_id", "key", "name", "fullName", "iata_airport_code", "type", "country", "geo_position",
		"locationId", "inEurope", "countryId", "countryCode", "coreCountry", "distance", "names", "alternativeNames" })
public class City {

	@JsonProperty("_id")
	private int id;
	@JsonProperty("key")
	private Object key;
	@JsonProperty("name")
	private String name;
	@JsonProperty("fullName")
	private String fullName;
	@JsonProperty("iata_airport_code")
	private Object iataAirportCode;
	@JsonProperty("type")
	private String type;
	@JsonProperty("country")
	private String country;
	@JsonProperty("geo_position")
	private GeoPosition geoPosition;
	@JsonProperty("locationId")
	private int locationId;
	@JsonProperty("inEurope")
	private boolean inEurope;
	@JsonProperty("countryId")
	private int countryId;
	@JsonProperty("countryCode")
	private String countryCode;
	@JsonProperty("coreCountry")
	private boolean coreCountry;
	@JsonProperty("distance")
	private Object distance;
	@JsonProperty("names")
	private Names names;
	@JsonProperty("alternativeNames")
	private AlternativeNames alternativeNames;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public City() {
	}

	/**
	 *
	 * @param geoPosition
	 * @param countryId
	 * @param inEurope
	 * @param locationId
	 * @param countryCode
	 * @param type
	 * @param country
	 * @param id
	 * @param coreCountry
	 * @param distance
	 * @param names
	 * @param name
	 * @param iataAirportCode
	 * @param fullName
	 * @param alternativeNames
	 * @param key
	 */
	public City(int id, Object key, String name, String fullName, Object iataAirportCode, String type, String country,
			GeoPosition geoPosition, int locationId, boolean inEurope, int countryId, String countryCode,
			boolean coreCountry, Object distance, Names names, AlternativeNames alternativeNames) {
		this.id = id;
		this.key = key;
		this.name = name;
		this.fullName = fullName;
		this.iataAirportCode = iataAirportCode;
		this.type = type;
		this.country = country;
		this.geoPosition = geoPosition;
		this.locationId = locationId;
		this.inEurope = inEurope;
		this.countryId = countryId;
		this.countryCode = countryCode;
		this.coreCountry = coreCountry;
		this.distance = distance;
		this.names = names;
		this.alternativeNames = alternativeNames;
	}

	/**
	 *
	 * @return The id
	 */
	@JsonProperty("_id")
	public int getId() {
		return id;
	}

	/**
	 *
	 * @param id
	 *            The _id
	 */
	@JsonProperty("_id")
	public void setId(int id) {
		this.id = id;
	}

	/**
	 *
	 * @return The key
	 */
	@JsonProperty("key")
	public Object getKey() {
		return key;
	}

	/**
	 *
	 * @param key
	 *            The key
	 */
	@JsonProperty("key")
	public void setKey(Object key) {
		this.key = key;
	}

	/**
	 *
	 * @return The name
	 */
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	/**
	 *
	 * @param name
	 *            The name
	 */
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	/**
	 *
	 * @return The fullName
	 */
	@JsonProperty("fullName")
	public String getFullName() {
		return fullName;
	}

	/**
	 *
	 * @param fullName
	 *            The fullName
	 */
	@JsonProperty("fullName")
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 *
	 * @return The iataAirportCode
	 */
	@JsonProperty("iata_airport_code")
	public Object getIataAirportCode() {
		return iataAirportCode;
	}

	/**
	 *
	 * @param iataAirportCode
	 *            The iata_airport_code
	 */
	@JsonProperty("iata_airport_code")
	public void setIataAirportCode(Object iataAirportCode) {
		this.iataAirportCode = iataAirportCode;
	}

	/**
	 *
	 * @return The type
	 */
	@JsonProperty("type")
	public String getType() {
		return type;
	}

	/**
	 *
	 * @param type
	 *            The type
	 */
	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	/**
	 *
	 * @return The country
	 */
	@JsonProperty("country")
	public String getCountry() {
		return country;
	}

	/**
	 *
	 * @param country
	 *            The country
	 */
	@JsonProperty("country")
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 *
	 * @return The geoPosition
	 */
	@JsonProperty("geo_position")
	public GeoPosition getGeoPosition() {
		return geoPosition;
	}

	/**
	 *
	 * @param geoPosition
	 *            The geo_position
	 */
	@JsonProperty("geo_position")
	public void setGeoPosition(GeoPosition geoPosition) {
		this.geoPosition = geoPosition;
	}

	/**
	 *
	 * @return The locationId
	 */
	@JsonProperty("locationId")
	public int getLocationId() {
		return locationId;
	}

	/**
	 *
	 * @param locationId
	 *            The locationId
	 */
	@JsonProperty("locationId")
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	/**
	 *
	 * @return The inEurope
	 */
	@JsonProperty("inEurope")
	public boolean isInEurope() {
		return inEurope;
	}

	/**
	 *
	 * @param inEurope
	 *            The inEurope
	 */
	@JsonProperty("inEurope")
	public void setInEurope(boolean inEurope) {
		this.inEurope = inEurope;
	}

	/**
	 *
	 * @return The countryId
	 */
	@JsonProperty("countryId")
	public int getCountryId() {
		return countryId;
	}

	/**
	 *
	 * @param countryId
	 *            The countryId
	 */
	@JsonProperty("countryId")
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	/**
	 *
	 * @return The countryCode
	 */
	@JsonProperty("countryCode")
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 *
	 * @param countryCode
	 *            The countryCode
	 */
	@JsonProperty("countryCode")
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 *
	 * @return The coreCountry
	 */
	@JsonProperty("coreCountry")
	public boolean isCoreCountry() {
		return coreCountry;
	}

	/**
	 *
	 * @param coreCountry
	 *            The coreCountry
	 */
	@JsonProperty("coreCountry")
	public void setCoreCountry(boolean coreCountry) {
		this.coreCountry = coreCountry;
	}

	/**
	 *
	 * @return The distance
	 */
	@JsonProperty("distance")
	public Object getDistance() {
		return distance;
	}

	/**
	 *
	 * @param distance
	 *            The distance
	 */
	@JsonProperty("distance")
	public void setDistance(Object distance) {
		this.distance = distance;
	}

	/**
	 *
	 * @return The names
	 */
	@JsonProperty("names")
	public Names getNames() {
		return names;
	}

	/**
	 *
	 * @param names
	 *            The names
	 */
	@JsonProperty("names")
	public void setNames(Names names) {
		this.names = names;
	}

	/**
	 *
	 * @return The alternativeNames
	 */
	@JsonProperty("alternativeNames")
	public AlternativeNames getAlternativeNames() {
		return alternativeNames;
	}

	/**
	 *
	 * @param alternativeNames
	 *            The alternativeNames
	 */
	@JsonProperty("alternativeNames")
	public void setAlternativeNames(AlternativeNames alternativeNames) {
		this.alternativeNames = alternativeNames;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
