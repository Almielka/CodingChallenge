package leetCodingChallenge.year2021.m03march.week3;

import java.util.*;

/**
 * @author Anna S. Almielka
 * 20.03.2021
 */

public class Day20 {

    /**
     * Implement the UndergroundSystem class:
     * <p>
     * void checkIn(int id, string stationName, int t)
     * – A customer with a card id equal to id, gets in the station stationName at time t.
     * – A customer can only be checked into one place at a time.
     * void checkOut(int id, string stationName, int t)
     * – A customer with a card id equal to id, gets out from the station stationName at time t.
     * double getAverageTime(string startStation, string endStation)
     * – Returns the average time to travel between the startStation and the endStation.
     * – The average time is computed from all the previous traveling from startStation to endStation that happened directly.
     * – Call to getAverageTime is always valid.
     * <p>
     * You can assume all calls to checkIn and checkOut methods are consistent.
     * If a customer gets in at time t1 at some station, they get out at time t2 with t2 > t1.
     * All events happen in chronological order.
     * <p>
     * Constraints:
     * There will be at most 20000 operations.
     * 1 <= id, t <= 10^6
     * All strings consist of uppercase and lowercase English letters, and digits.
     * 1 <= stationName.length <= 10
     * Answers within 10^-5 of the actual value will be accepted as correct.
     */
    // Runtime: 92 ms
    // Memory Usage: 53 MB
    class UndergroundSystem {

        private Map<Integer, Event> mapClients;
        private Map<String, Trip> mapStations;

        public UndergroundSystem() {
            mapClients = new HashMap<>();
            mapStations = new HashMap<>();
        }

        public void checkIn(int id, String stationName, int t) {
            mapClients.put(id, new Event(stationName, t));
        }

        public void checkOut(int id, String stationName, int t) {
            Event event = mapClients.get(id);
            String stations = event.station + " – " + stationName;
            int diff = t - event.time;
            Trip trip = mapStations.containsKey(stations) ? mapStations.get(stations) : new Trip();
            trip.updateAverage(diff);
            mapStations.put(stations, trip);
        }

        public double getAverageTime(String startStation, String endStation) {
            String stations = startStation + " – " + endStation;
            return mapStations.get(stations).getAverage();
        }

        class Event {
            private String station;
            private int time;

            private Event(String station, int time) {
                this.station = station;
                this.time = time;
            }

        }

        class Trip {
            private int time;
            private int qty;

            private void updateAverage(int diff) {
                time += diff;
                qty++;
            }

            private double getAverage() {
                return (double) Math.round(100000d * time / qty) / 100000d;
            }

        }

    }

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
}
