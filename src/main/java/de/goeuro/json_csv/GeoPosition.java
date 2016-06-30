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
@JsonPropertyOrder({ "latitude", "longitude" })
public class GeoPosition {

	@JsonProperty("latitude")
	private double latitude;
	@JsonProperty("longitude")
	private double longitude;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public GeoPosition() {
	}

	/**
	 *
	 * @param longitude
	 * @param latitude
	 */
	public GeoPosition(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	/**
	 *
	 * @return The latitude
	 */
	@JsonProperty("latitude")
	public double getLatitude() {
		return latitude;
	}

	/**
	 *
	 * @param latitude
	 *            The latitude
	 */
	@JsonProperty("latitude")
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	/**
	 *
	 * @return The longitude
	 */
	@JsonProperty("longitude")
	public double getLongitude() {
		return longitude;
	}

	/**
	 *
	 * @param longitude
	 *            The longitude
	 */
	@JsonProperty("longitude")
	public void setLongitude(double longitude) {
		this.longitude = longitude;
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
