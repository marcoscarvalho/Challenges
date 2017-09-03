package br.com.hackerrank.challenges.carrier;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Carrier1 {

	public static void main(String[] args) {
		new Carrier1().execute();
	}

	private InputStream systemIn;

	public Carrier1() {
		this(System.in);
	}

	public Carrier1(InputStream in) {
		systemIn = in;
	}

	// The first line of the input contains three decimal integers separated by
	// space: total number of drones ('D'), number of drones to be selected
	// ('G') and number of drones in maintenance ('M').
	// The following 'D' lines each contains two decimal integers separated by
	// space with information about each drone: ID and flight range in
	// kilometers.
	// The following 'M' lines each contains the numeric ID of a drone currently
	// in maintenance.

	// Print the IDs of the 'G' selected drones to the standard output, one per
	// line, sorted by flight range (greater first).
	public void execute() {
		Scanner in = new Scanner(systemIn);

		int numberOfDrones = in.nextInt();
		int numberOfRequiredDrones = in.nextInt();
		int numberOfDronesInMaintenance = in.nextInt();

		List<Drone> drones = new ArrayList<>();
		List<Integer> inMaintenanceDrones = new ArrayList<>();

		for (int i = 0; i < numberOfDrones; i++) {
			drones.add(new Drone(in.nextInt(), in.nextInt()));
		}

		for (int i = 0; i < numberOfDronesInMaintenance; i++) {
			inMaintenanceDrones.add(in.nextInt());
		}

		List<Integer> greatestFlightRangeDrones = greatestFlightRangeDrones(numberOfRequiredDrones, drones,
				inMaintenanceDrones);

		for (int i = 0; i < greatestFlightRangeDrones.size(); i++) {
			System.out.println(greatestFlightRangeDrones.get(i));
		}

		in.close();

	}

	static List<Integer> greatestFlightRangeDrones(Integer numberOfRequiredDrones, List<Drone> drones,
			List<Integer> inMaintenanceDrones) {

		return drones.stream().filter(d -> !inMaintenanceDrones.contains(d.getId()))
				.sorted((d1, d2) -> Integer.compare(d2.getFlightRange(), d1.getFlightRange())).map(Drone::getId)
				.limit(numberOfRequiredDrones).collect(Collectors.toList());
	}

	private static class Drone {
		private int id;
		private int flightRange;

		public Drone(int id, int flightRange) {

			this.id = id;
			this.flightRange = flightRange;
		}

		public int getId() {
			return id;
		}

		public int getFlightRange() {
			return flightRange;
		}
	}
}
