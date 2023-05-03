package consultorio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import consultorio.ventanas.Menu;
import consultorio.ventanas.Reporte;

public class Tools{
	public int getFolio() {
		File file = new File("");
		String userDirectory = System.getProperty("user.dir");
		com.google.gson.JsonObject object = new com.google.gson.JsonObject();
		int folio = 0;
		file = (File) new File(userDirectory + "\\src\\main\\resources\\assets\\json", File.separator + "folio.json");
		if (!file.exists()) {
			try {
				file.getParentFile().mkdirs();
				file.createNewFile();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
			object.addProperty("folio", 0);
			{
				Gson mainGSONBuilderVariable = new GsonBuilder().setPrettyPrinting().create();
				try {
					FileWriter fileWriter = new FileWriter(file);
					fileWriter.write(mainGSONBuilderVariable.toJson(object));
					fileWriter.close();
				} catch (IOException exception) {
					exception.printStackTrace();
				}
			}
		}
		{
			try {
				BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
				StringBuilder jsonstringbuilder = new StringBuilder();
				String line;
				while ((line = bufferedReader.readLine()) != null) {
					jsonstringbuilder.append(line);
				}
				bufferedReader.close();
				object = new Gson().fromJson(jsonstringbuilder.toString(), com.google.gson.JsonObject.class);
				folio = (object.get("folio").getAsInt());

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return folio;
	}
	public void restartFolio() {
		File file = new File("");
		String userDirectory = System.getProperty("user.dir");
		com.google.gson.JsonObject object = new com.google.gson.JsonObject();
		file = (File) new File(userDirectory + "\\src\\main\\resources\\assets\\json", File.separator + "folio.json");
		if (!file.exists()) {
			try {
				file.getParentFile().mkdirs();
				file.createNewFile();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
		}
		object.addProperty("folio", 0);
		{
			Gson mainGSONBuilderVariable = new GsonBuilder().setPrettyPrinting().create();
			try {
				FileWriter fileWriter = new FileWriter(file);
				fileWriter.write(mainGSONBuilderVariable.toJson(object));
				fileWriter.close();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
		}

	}
	public int sumFolio() {
		File file = new File("");
		String userDirectory = System.getProperty("user.dir");
		com.google.gson.JsonObject object = new com.google.gson.JsonObject();
		int folio = 0;
		file = (File) new File(userDirectory + "\\src\\main\\resources\\assets\\json", File.separator + "folio.json");
		if (!file.exists()) {
			try {
				file.getParentFile().mkdirs();
				file.createNewFile();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
			object.addProperty("folio", 0);
			{
				Gson mainGSONBuilderVariable = new GsonBuilder().setPrettyPrinting().create();
				try {
					FileWriter fileWriter = new FileWriter(file);
					fileWriter.write(mainGSONBuilderVariable.toJson(object));
					fileWriter.close();
				} catch (IOException exception) {
					exception.printStackTrace();
				}
			}
		}
		{
			try {
				BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
				StringBuilder jsonstringbuilder = new StringBuilder();
				String line;
				while ((line = bufferedReader.readLine()) != null) {
					jsonstringbuilder.append(line);
				}
				bufferedReader.close();
				object = new Gson().fromJson(jsonstringbuilder.toString(), com.google.gson.JsonObject.class);
				folio = (object.get("folio").getAsInt() + 1);

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		object.addProperty("folio", folio);
		{
			Gson mainGSONBuilderVariable = new GsonBuilder().setPrettyPrinting().create();
			try {
				FileWriter fileWriter = new FileWriter(file);
				fileWriter.write(mainGSONBuilderVariable.toJson(object));
				fileWriter.close();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
		}
		return folio;
	}
	public String getNombre(int folio) {
		String userDirectory = System.getProperty("user.dir");
		File file = new File("");
		String nombre = "";
		com.google.gson.JsonObject object = new com.google.gson.JsonObject();
		com.google.gson.JsonObject subObject = new com.google.gson.JsonObject();
		file = (File) new File(userDirectory + "\\src\\main\\resources\\assets\\json", File.separator + "formulario.json");
		if (!file.exists()) {
			try {
				file.getParentFile().mkdirs();
				file.createNewFile();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
			object.add("main", subObject);
			{
				Gson mainGSONBuilderVariable = new GsonBuilder().setPrettyPrinting().create();
				try {
					FileWriter fileWriter = new FileWriter(file);
					fileWriter.write(mainGSONBuilderVariable.toJson(object));
					fileWriter.close();
				} catch (IOException exception) {
					exception.printStackTrace();
				}
			}
		}
		{
			try {
				BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
				StringBuilder jsonstringbuilder = new StringBuilder();
				String line;
				while ((line = bufferedReader.readLine()) != null) {
					jsonstringbuilder.append(line);
				}
				bufferedReader.close();
				object = new Gson().fromJson(jsonstringbuilder.toString(), com.google.gson.JsonObject.class);
				if(getFolio() == 0) {
					nombre = "No has registrado";
				}else {
					subObject = object.get( ("" + folio) ).getAsJsonObject();
					nombre = subObject.get("Nombre").getAsString();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return nombre;
	}
	public String getfeDeNa(int folio) {
		String userDirectory = System.getProperty("user.dir");
		File file = new File("");
		String fechaNa = "";
		com.google.gson.JsonObject object = new com.google.gson.JsonObject();
		com.google.gson.JsonObject subObject = new com.google.gson.JsonObject();
		file = (File) new File(userDirectory + "\\src\\main\\resources\\assets\\json", File.separator + "formulario.json");
		if (!file.exists()) {
			try {
				file.getParentFile().mkdirs();
				file.createNewFile();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
			object.add("main", subObject);
			{
				Gson mainGSONBuilderVariable = new GsonBuilder().setPrettyPrinting().create();
				try {
					FileWriter fileWriter = new FileWriter(file);
					fileWriter.write(mainGSONBuilderVariable.toJson(object));
					fileWriter.close();
				} catch (IOException exception) {
					exception.printStackTrace();
				}
			}
		}
		{
			try {
				BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
				StringBuilder jsonstringbuilder = new StringBuilder();
				String line;
				while ((line = bufferedReader.readLine()) != null) {
					jsonstringbuilder.append(line);
				}
				bufferedReader.close();
				object = new Gson().fromJson(jsonstringbuilder.toString(), com.google.gson.JsonObject.class);
				if(getFolio() == 0) {
					fechaNa = "No has registrado";
				}else {
					subObject = object.get( ("" + folio) ).getAsJsonObject();
					fechaNa = subObject.get("FechaNa").getAsString();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return fechaNa;
	}
	public String getDomi(int folio) {
		String userDirectory = System.getProperty("user.dir");
		File file = new File("");
		String rtn = "";
		com.google.gson.JsonObject object = new com.google.gson.JsonObject();
		com.google.gson.JsonObject subObject = new com.google.gson.JsonObject();
		file = (File) new File(userDirectory + "\\src\\main\\resources\\assets\\json", File.separator + "formulario.json");
		if (!file.exists()) {
			try {
				file.getParentFile().mkdirs();
				file.createNewFile();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
			object.add("main", subObject);
			{
				Gson mainGSONBuilderVariable = new GsonBuilder().setPrettyPrinting().create();
				try {
					FileWriter fileWriter = new FileWriter(file);
					fileWriter.write(mainGSONBuilderVariable.toJson(object));
					fileWriter.close();
				} catch (IOException exception) {
					exception.printStackTrace();
				}
			}
		}
		{
			try {
				BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
				StringBuilder jsonstringbuilder = new StringBuilder();
				String line;
				while ((line = bufferedReader.readLine()) != null) {
					jsonstringbuilder.append(line);
				}
				bufferedReader.close();
				object = new Gson().fromJson(jsonstringbuilder.toString(), com.google.gson.JsonObject.class);
				if(getFolio() == 0) {
					rtn = "No has registrado";
				}else {
					subObject = object.get( ("" + folio) ).getAsJsonObject();
					rtn = subObject.get("Domi").getAsString();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return rtn;
	}
	public String getPade(int folio) {
		String userDirectory = System.getProperty("user.dir");
		File file = new File("");
		String rtn = "";
		com.google.gson.JsonObject object = new com.google.gson.JsonObject();
		com.google.gson.JsonObject subObject = new com.google.gson.JsonObject();
		file = (File) new File(userDirectory + "\\src\\main\\resources\\assets\\json", File.separator + "formulario.json");
		if (!file.exists()) {
			try {
				file.getParentFile().mkdirs();
				file.createNewFile();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
			object.add("main", subObject);
			{
				Gson mainGSONBuilderVariable = new GsonBuilder().setPrettyPrinting().create();
				try {
					FileWriter fileWriter = new FileWriter(file);
					fileWriter.write(mainGSONBuilderVariable.toJson(object));
					fileWriter.close();
				} catch (IOException exception) {
					exception.printStackTrace();
				}
			}
		}
		{
			try {
				BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
				StringBuilder jsonstringbuilder = new StringBuilder();
				String line;
				while ((line = bufferedReader.readLine()) != null) {
					jsonstringbuilder.append(line);
				}
				bufferedReader.close();
				object = new Gson().fromJson(jsonstringbuilder.toString(), com.google.gson.JsonObject.class);
				if(getFolio() == 0) {
					rtn = "No has registrado";
				}else {
					subObject = object.get( ("" + getFolio()) ).getAsJsonObject();
					rtn = subObject.get("Pade").getAsString();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return rtn;
	}
	public String getTratam(int folio) {
		String userDirectory = System.getProperty("user.dir");
		File file = new File("");
		String rtn = "";
		com.google.gson.JsonObject object = new com.google.gson.JsonObject();
		com.google.gson.JsonObject subObject = new com.google.gson.JsonObject();
		file = (File) new File(userDirectory + "\\src\\main\\resources\\assets\\json", File.separator + "formulario.json");
		if (!file.exists()) {
			try {
				file.getParentFile().mkdirs();
				file.createNewFile();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
			object.add("main", subObject);
			{
				Gson mainGSONBuilderVariable = new GsonBuilder().setPrettyPrinting().create();
				try {
					FileWriter fileWriter = new FileWriter(file);
					fileWriter.write(mainGSONBuilderVariable.toJson(object));
					fileWriter.close();
				} catch (IOException exception) {
					exception.printStackTrace();
				}
			}
		}
		{
			try {
				BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
				StringBuilder jsonstringbuilder = new StringBuilder();
				String line;
				while ((line = bufferedReader.readLine()) != null) {
					jsonstringbuilder.append(line);
				}
				bufferedReader.close();
				object = new Gson().fromJson(jsonstringbuilder.toString(), com.google.gson.JsonObject.class);
				if(getFolio() == 0) {
					rtn = "No has registrado";
				}else {
					subObject = object.get( ("" + getFolio()) ).getAsJsonObject();
					rtn = subObject.get("Tratam").getAsString();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return rtn;
	}
	
	public int getTel(int folio) {
		String userDirectory = System.getProperty("user.dir");
		File file = new File("");
		int rtn = 0;
		com.google.gson.JsonObject object = new com.google.gson.JsonObject();
		com.google.gson.JsonObject subObject = new com.google.gson.JsonObject();
		file = (File) new File(userDirectory + "\\src\\main\\resources\\assets\\json", File.separator + "formulario.json");
		if (!file.exists()) {
			try {
				file.getParentFile().mkdirs();
				file.createNewFile();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
			object.add("main", subObject);
			{
				Gson mainGSONBuilderVariable = new GsonBuilder().setPrettyPrinting().create();
				try {
					FileWriter fileWriter = new FileWriter(file);
					fileWriter.write(mainGSONBuilderVariable.toJson(object));
					fileWriter.close();
				} catch (IOException exception) {
					exception.printStackTrace();
				}
			}
		}
		{
			try {
				BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
				StringBuilder jsonstringbuilder = new StringBuilder();
				String line;
				while ((line = bufferedReader.readLine()) != null) {
					jsonstringbuilder.append(line);
				}
				bufferedReader.close();
				object = new Gson().fromJson(jsonstringbuilder.toString(), com.google.gson.JsonObject.class);
				if(getFolio() == 0) {
					rtn = 0;
				}else {
					subObject = object.get( ("" + getFolio()) ).getAsJsonObject();
					rtn = subObject.get("Tel").getAsInt();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return rtn;
	}
	public int getCate(int folio) {
		String userDirectory = System.getProperty("user.dir");
		File file = new File("");
		int rtn = 0;
		com.google.gson.JsonObject object = new com.google.gson.JsonObject();
		com.google.gson.JsonObject subObject = new com.google.gson.JsonObject();
		file = (File) new File(userDirectory + "\\src\\main\\resources\\assets\\json", File.separator + "formulario.json");
		if (!file.exists()) {
			try {
				file.getParentFile().mkdirs();
				file.createNewFile();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
			object.add("main", subObject);
			{
				Gson mainGSONBuilderVariable = new GsonBuilder().setPrettyPrinting().create();
				try {
					FileWriter fileWriter = new FileWriter(file);
					fileWriter.write(mainGSONBuilderVariable.toJson(object));
					fileWriter.close();
				} catch (IOException exception) {
					exception.printStackTrace();
				}
			}
		}
		{
			try {
				BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
				StringBuilder jsonstringbuilder = new StringBuilder();
				String line;
				while ((line = bufferedReader.readLine()) != null) {
					jsonstringbuilder.append(line);
				}
				bufferedReader.close();
				object = new Gson().fromJson(jsonstringbuilder.toString(), com.google.gson.JsonObject.class);
				if(getFolio() == 0) {
					rtn = 0;
				}else {
					subObject = object.get( ("" + folio) ).getAsJsonObject();
					rtn = subObject.get("Cate").getAsInt();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return rtn;
	}
	public void borrarForm() {
		Menu menu = new Menu();
		File file = new File("");
		String userDirectory = System.getProperty("user.dir");
		file = (File) new File(userDirectory + "\\src\\main\\resources\\assets\\json", File.separator + "formulario.json");
	    if (file.delete()) { 
	    	String opciones[] = {"Ok"};
			int entero = JOptionPane.showOptionDialog(null, "El formulario fue eliminado",
					"Formulario", 0, 3, null, opciones, 0);
	    } else {
	    	String opciones[] = {"Ok"};
			int entero = JOptionPane.showOptionDialog(null, "ERROR: El formulario no se pudo eliminar",
					"Formulario", 0, 0, null, opciones, 0);
	    }
	    restartFolio();
	    menu.main(null);
	}
	public void reporte(int folio) {
		int total[] = new int[4];
		total[0] = 0;total[1] = 0;total[2] = 0;total[3] = 0;
		int cate;
		for(int i = 1; i <= folio; i++) {
			cate = getCate(i);
			switch(cate) {
			case 0:
				total[0] ++;break;
			case 1:
				total[1] ++;break;
			case 2:
				total[2] ++;break;
			case 3:
				total[3] ++;break;
			}
		}
		Reporte reporte = new Reporte(total);
		reporte.main(null,total);
	}
}