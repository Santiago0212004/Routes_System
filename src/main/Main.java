package main;


import control.MenuController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import structures.Graph;

public class Main extends Application{
	public static Graph<String> routes = new Graph<>();
	public static void main(String[] args) {
		
		
		launch(args);
		//Graph<String> routes2 = new Graph<>();
		
		
		/*routes.addVertex("Chiminangos");
		routes.addVertex("Flora Industrial");
		routes.addVertex("Salomia");
		routes.addVertex("Torre de Cali");
		routes.addVertex("Estadio");
		routes.addVertex("Universidades");
		routes.addVertex("Unidad Deportiva");
		
		routes.addEdge("Chiminangos", "Flora Industrial", 10);
		routes.addEdge("Chiminangos", "Flora Industrial", 10);
		routes.addEdge("Flora Industrial", "Salomia", 12);
		routes.addEdge("Salomia", "Torre de Cali", 13);
		routes.addEdge("Torre de Cali", "Estadio", 15);
		routes.addEdge("Estadio", "Universidades", 15);
		routes.addEdge("Torre de Cali", "Unidad Deportiva", 5);
		routes.addEdge("Unidad Deportiva", "Universidades", 5);*/
		
		/*routes.addVertex("Libreria gadner");
		routes.addVertex("Libreria Euler");
		routes.addVertex("Libreria Konisberg");
		routes.addVertex("Libreria Voronoi");
		routes.addVertex("Libreria Gauss");
		routes.addVertex("Casita");
		routes.addVertex("Libreria Richter");
		routes.addVertex("Libreria Fibonacci");
		routes.addVertex("Libreria Fahrenheit");
		routes.addVertex("Libreria Hilbert");
		routes.addVertex("Libreria Celsius");
		
		routes.addEdge("Libreria gadner", "Libreria Euler", 415);
		routes.addEdge("Libreria gadner", "Libreria Voronoi", 170);
		routes.addEdge("Libreria gadner", "Libreria Fibonacci", 310);
		routes.addEdge("Libreria Euler","Libreria Voronoi", 317);
		routes.addEdge("Libreria Euler", "Casita", 330);
		routes.addEdge("Libreria Euler", "Libreria Gauss", 230);
		routes.addEdge("Libreria Euler", "Libreria Konisberg", 300);
		routes.addEdge("Libreria Konisberg", "Libreria Gauss", 275);
		routes.addEdge("Libreria Konisberg", "Libreria Richter", 225);
		routes.addEdge("Libreria Konisberg", "Libreria Celsius", 450);
		routes.addEdge("Libreria Celsius", "Libreria Richter", 280);
		routes.addEdge("Libreria Celsius", "Libreria Fahrenheit", 255);
		routes.addEdge("Libreria Celsius", "Libreria Hilbert", 312);
		routes.addEdge("Libreria Hilbert", "Libreria Fahrenheit", 230);
		routes.addEdge("Libreria Hilbert", "Libreria Fibonacci", 250);
		routes.addEdge("Libreria Fibonacci", "Libreria Fahrenheit", 450);
		routes.addEdge("Libreria Fibonacci", "Casita", 345);
		routes.addEdge("Libreria Fibonacci", "Libreria Voronoi", 299);
		routes.addEdge("Libreria Voronoi", "Casita", 190);
		routes.addEdge("Casita", "Libreria Gauss", 180);
		routes.addEdge("Casita", "Libreria Fahrenheit", 180);
		routes.addEdge("Libreria Gauss", "Libreria Fahrenheit", 314);
		routes.addEdge("Libreria Richter", "Libreria Gauss", 198);
		routes.addEdge("Libreria Richter", "Libreria Fahrenheit", 267);*/
		
		
		
		
		
		
		
		/*ArrayList<Edge<String>> fasterWay = routes.fasterWay("Chiminangos", "Salomia");
		
		System.out.println("");
		
		for(Edge<String> e : fasterWay) {
			System.out.println(e.getVertex1().getValue()+" "+e.getVertex2().getValue());
		}*/
		
		
		
		
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/Menu.fxml"));
		loader.setController(new MenuController());
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene(parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
	}
}
