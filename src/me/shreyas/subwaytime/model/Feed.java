package me.shreyas.subwaytime.model;

import java.util.Arrays;

public class Feed {
	private TripList TripList;
	
	public Feed() {}
	
	@Override
	public String toString() {
		return TripList.toString();
	}

	public TripList getTripList() {
		return TripList;
	}

	public void setTripList(TripList tripList) {
		TripList = tripList;
	}

	public static class TripList {
		private long CurrentTime;
		private String Line;
		private Trip[] Trips;
		
		public TripList() {}
		
		@Override
		public String toString() {
			return CurrentTime + " - " + Line + 
					Arrays.toString(Trips);
		}
		
		public long getCurrentTime() {
			return CurrentTime;
		}

		public void setCurrentTime(long currentTime) {
			CurrentTime = currentTime;
		}

		public String getLine() {
			return Line;
		}

		public void setLine(String line) {
			Line = line;
		}

		public Trip[] getTrips() {
			return Trips;
		}

		public void setTrips(Trip[] trips) {
			Trips = trips;
		}

		public static class Trip {
			private String TripID;
			private String Destination;
			private Prediction[] Predictions;
			
			public Trip() {}
			
			@Override
			public String toString() {
				return "\n\t" + TripID + ":" + Destination + 
						Arrays.toString(Predictions);
			}
			
			public String getTripID() {
				return TripID;
			}

			public void setTripID(String tripID) {
				TripID = tripID;
			}

			public String getDestination() {
				return Destination;
			}

			public void setDestination(String destination) {
				Destination = destination;
			}

			public Prediction[] getPredictions() {
				return Predictions;
			}

			public void setPredictions(Prediction[] predictions) {
				Predictions = predictions;
			}

			public static class Prediction {
				private String StopID;
				private String Stop;
				private int Seconds;
				
				public Prediction() {}
				
				@Override
				public String toString() {
					return "\n\t\t" + Stop + "@" + Seconds;
				}

				public String getStopID() {
					return StopID;
				}

				public void setStopID(String stopID) {
					StopID = stopID;
				}

				public String getStop() {
					return Stop;
				}

				public void setStop(String stop) {
					Stop = stop;
				}

				public int getSeconds() {
					return Seconds;
				}

				public void setSeconds(int seconds) {
					Seconds = seconds;
				}
			}
		}
	}
}
