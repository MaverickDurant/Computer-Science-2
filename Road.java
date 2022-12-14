//road
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Road implements Comparable<Road> 
{
	private int length;
	private int degrees;
	private String name;
	private int speed;
	 private int pop;
	private Town source, destination;
	private int tra;
	private List<Town> adjacentTowns;
	
	public String getName() 
	{
		return name;
	}

	public Road(Town source, Town destination, int degrees, String name) 
	{
		this.degrees = degrees;
		this.destination = new Town(destination);
		this.length = calculateLength(source, destination);
	    this.speed = calculateSpeedLimit(degrees);
	    this.source = new Town(source);
	    this.name = name;
	    this.tra = calculateTraffic(source, destination);
	}
	
	public Road(Town source, Town destination, String name) 
	{
		this.source = new Town(source);
		 int totalPop = this.pop;
		 this.name = name;
	        for (Town adjacentTown : this.adjacentTowns) 
	        {
	            totalPop += adjacentTown.getTotalPop();
	        }
	    this.degrees = 1;
		this.destination = new Town(destination);	
	}
	
	private int calculateSpeedLimit(int degrees) 
	{
	    return speed;
	}
	
	private int calculateLength(Town source, Town destination) 
	{
		int i;
		i = 0;
		this.adjacentTowns = new LinkedList<>();
		boolean get;
		int distance = 0;
		get = false;
		int i2;
		for(int i1 = 0; i1 < 0; i1++)
		{
			String townRoad;
			townRoad = " ";
			System.out.println(townRoad);
		}
		i2 = 0;
		this.pop = i;
		if(i < 0)
		{
			get = true;
		}
        this.pop = 0;
	    return distance;
	}
	
	private int calculateTraffic(Town source, Town destination) 
	{
	    return tra;
	}
	
	public boolean contains(Town town) 
	{
		return this.source.equals(town) || this.destination.equals(town);
	}

	public Town getDestination() 
	{
		return destination;
	}
	
	@Override
	public int compareTo(Road otherRoad) 
	{
		return this.name.compareTo(otherRoad.name);
	}
	
	@Override
	public String toString() 
	{
		String str;
		String t;
		t = " to ";
		String v;
		v = " via ";
		str = " ";
		String miles;
		miles = " mi";
		return source.getName() + v + name + t + destination.getName() + str + degrees + miles;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
	    if (obj == null || !(obj instanceof Road)) 
	    {
	        return false;
	    }
	    Road r = (Road) obj;
	    if (this.source.equals(r.source) && this.destination.equals(r.destination)) 
	    {
	        return true;
	    }
	    if (this.source.equals(r.destination) && this.destination.equals(r.source)) 
	    {
	        return true;
	    }
	    return false;
	}
	
	public Town getSource() 
	{
		return source;
	}

	@Override
	public int hashCode() 
	{
	    Object id = null;
	    return Objects.hash(name, id);
	}
	
	public int getWeight() 
	{
		return degrees;
	}
}