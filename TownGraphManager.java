//TownGraphMan
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Collections;
import java.util.Iterator;

public class TownGraphManager implements TownGraphManagerInterface 
{
	Graph graph;

	public TownGraphManager() 
	{
		graph = new Graph();
	}

	@Override
	public boolean addRoad(String town1, String town2, int weight, String roadName) 
	{
	    Town t1 = new Town(town1);
	    Town t2 = new Town(town2);
	    try 
	    {
	        graph.addEdge(t1, t2, weight, roadName);
	    } 
	    catch (Exception e) 
	    {
	        return false;
	    }
	    return true;
	}
	
	@Override
	public String getRoad(String town1, String town2) 
	{
	    Town t1 = new Town(town1);
	    Town t2 = new Town(town2);
	    Road edge = graph.getEdge(t1, t2);
	    if (edge != null) 
	    {
	        return edge.getName();
	    }
	    else
	    {
	        return "";
	    }
	}

	@Override
	public boolean addTown(String v) 
	{
	    Town town = new Town(v);
	    if (!graph.containsVertex(town)) 
	    {
	        return graph.addVertex(town);
	    }
	    else
	    {
	        return false;
	    }
	}

	@Override
	public Town getTown(String name) 
	{
	    Town town = new Town(name);
	    Town result = null;
	    Iterator<Town> iterator = graph.vertexSet().iterator();
	    while (iterator.hasNext()) 
	    {
	        Town t = iterator.next();
	        if (t.equals(town)) 
	        {
	            result = t;
	            break;
	        }
	    }
	    return result;
	}

	@Override
	public boolean containsTown(String v) 
	{
		return graph.containsVertex(new Town(v));
	}

	@Override
	public boolean containsRoadConnection(String town1, String town2) 
	{
		return graph.containsEdge(new Town(town1), new Town(town2));
	}

	@Override
	public ArrayList<String> allRoads() 
	{
	    ArrayList<String> roads = new ArrayList<>();

	    // Use an iterator to traverse the set of roads in the graph
	    Iterator<Road> iterator = graph.edgeSet().iterator();
	    while (iterator.hasNext()) {
	        Road r = iterator.next();
	        roads.add(r.getName());
	    }

	    // Sort the list of roads alphabetically
	    Collections.sort(roads);
	    return roads;
	}

	@Override
	public boolean deleteRoadConnection(String town1, String town2, String road) 
	{
	    Road r = graph.getEdge(new Town(town1), new Town(town2));
	    if (r != null && r.getName().equals(road)) 
	    { 
	        return graph.removeEdge(r) != null;
	    }
	    return false;
	}

	@Override
	public boolean deleteTown(String v) 
	{
		return graph.removeVertex(new Town(v));
	}

	@Override
	public ArrayList<String> allTowns() 
	{
	    ArrayList<String> towns = new ArrayList<String>();
	    Iterator<Town> iterator = graph.vertexSet().iterator();
	    while (iterator.hasNext()) {
	        Town t = iterator.next();
	        towns.add(t.getName());
	    }
	    Collections.sort(towns);
	    return towns;
	}

	@Override
	public ArrayList<String> getPath(String town1, String town2) 
	{
		return graph.shortestPath(new Town(town1), new Town(town2));
	}

	public void populateTownGraph(File selectedFile) throws FileNotFoundException 
	{
		String line;
	    String[] string;
	    try (Scanner scan = new Scanner(selectedFile)) 
	    {
	        while (scan.hasNextLine()) 
	        {
	            line = scan.nextLine();
	            string = line.split(",|;");
	            Town town1 = new Town(string[2]);
	            Town town2 = new Town(string[3]);
	            if (!graph.containsVertex(town1)) 
	            {
	                graph.addVertex(town1);
	            }
	            if (!graph.containsVertex(town2)) 
	            {
	                graph.addVertex(town2);
	            }
	            graph.addEdge(town1, town2, Integer.parseInt(string[1]), string[0]);
	        }
	    }
	}
}