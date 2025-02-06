package dev.lpa;
import java.util.Arrays;

//Generic Class Challenge 1
public interface Mappable {
	void render();

	static double[] stringToLatLon(String location) {
		var splits = location.split(",");
		double lat = Double.valueOf(splits[0]);
		double lon = Double.valueOf(splits[1]);
		return new double[] { lat, lon };
	}
}

abstract class Point implements Mappable {
	private double[] location = new double[2];

	public Point(String location) {
		this.location = Mappable.stringToLatLon(location);
	}

	@Override
	public void render(){
		System.out.println("Render " + this + " as POINT (" + location() + ")");
	}

	private String location() {
		return Arrays.toString(location);
	}
}

abstract class Line implements Mappable {
	private double[][] lotactions;

	public Line(String... locations) {
		this.lotactions = new double[locations.length][];
		for (int i = 0; i < locations.length; i++) {
			this.lotactions[i] = Mappable.stringToLatLon(locations[i]);
		}
	}

	public void render() {
		System.out.println("Render " + this + " as LINES (" + location() + ")");
	}

	private String location() {
		return Arrays.deepToString(lotactions);
	}
}
