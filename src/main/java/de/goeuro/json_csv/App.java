package de.goeuro.json_csv;

import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class App {

	public App(String city) {
		getGeoData(city);
	}

	private void getGeoData(String city) {

		ObjectMapper mapper = new ObjectMapper();

		List<City> cityList;
		try {
			cityList = mapper.readValue(new URL("http://api.goeuro.com/api/v2/position/suggest/en/" + city),
					TypeFactory.defaultInstance().constructCollectionType(List.class, City.class));
			if (cityList.size() < 1) {
				throw new RuntimeException("invalid city name.");
			}
			System.out.println("Writning to file...");
			FileWriter writer = new FileWriter(city + ".csv");

			for (City cityInfo : cityList) {

				System.out.println(cityInfo.getId() + "," + cityInfo.getName() + "," + cityInfo.getType() + ","
						+ cityInfo.getGeoPosition().getLatitude() + "," + cityInfo.getGeoPosition().getLongitude()
						);

				writer.append(cityInfo.getId() + "," + cityInfo.getName() + "," + cityInfo.getType() + ","
						+ cityInfo.getGeoPosition().getLatitude() + "," + cityInfo.getGeoPosition().getLongitude()
						+ "\n");
			}
			writer.flush();
			writer.close();
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		if (args.length < 1) {
			System.err.println("Usage: java -jar GoEuroTest.jar \"CITY_NAME\"");
			System.exit(-1);
		}
		new App(args[0]);
		;
	}
}
