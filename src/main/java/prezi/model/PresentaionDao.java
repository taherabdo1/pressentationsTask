package prezi.model;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.List;

import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import entities.Presentation;

@Component
public class PresentaionDao implements PresentationDaoInt{

	public List<Presentation> getAll(){
		InputStream is =  getClass().getResourceAsStream("/prezis.json");
		  Reader reader = new InputStreamReader(is);
		  
		  // Use the JSON to fill the list with data
		  JsonReader jsonReader = new JsonReader(reader);
		  Type type = new TypeToken<List<Presentation>>() {
		  }.getType();
		  List<Presentation> inpList  = new Gson().fromJson(jsonReader, type);
		  
		  return inpList;
	}
}
