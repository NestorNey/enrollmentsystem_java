package consultorio.baseDeDatos;

import com.google.gson.GsonBuilder;

import consultorio.Tools;

import com.google.gson.Gson;

import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.plaf.metal.MetalBorders.ToolBarBorder;

import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ModRegistro{
	public void agregarRegistro(int cate,int tel,String feDeNa,String domi,String nombre,String pade,String tratam) {
		Tools tool = new Tools();
		if(getErrors(tel,feDeNa,domi,nombre,pade,tratam)) {
			tool.sumFolio();int folio = tool.getFolio();
			File file = new File("");
			String userDirectory = System.getProperty("user.dir");
			com.google.gson.JsonObject object = new com.google.gson.JsonObject();
			com.google.gson.JsonObject subObject = new com.google.gson.JsonObject();
			com.google.gson.JsonObject main = new com.google.gson.JsonObject();
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
					main = object.get("main").getAsJsonObject();

				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			subObject.addProperty("Cate", cate);
			subObject.addProperty("Folio", folio);
			subObject.addProperty("Tel", tel);
			subObject.addProperty("Nombre", nombre);
			subObject.addProperty("FechaNa", feDeNa);
			subObject.addProperty("Domi", domi);
			subObject.addProperty("Pade", pade);
			subObject.addProperty("Tratam", tratam);
			object.add(("" + folio), subObject);
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
		}else {
			String opciones[] = {"Ok"};
			int entero = JOptionPane.showOptionDialog(null, "ERROR: El formulario no se lleno o se lleno incorrectamente",
					"Formulario", 0, 0, null, opciones, 0);
		}
	}
	public boolean getErrors(int tel,String feDeNa,String domi,String nombre,String pade,String tratam) {
		if(tel <= 0) {
			System.out.println("fue numero");
			return false;
		}else if(feDeNa.length() <= 0) {
			return false;
		}else if(domi.length() <= 0) {
			return false;
		}else if(nombre.length() <= 0) {
			return false;
		}
		return true;
	}
}