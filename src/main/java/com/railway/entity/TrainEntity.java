package com.railway.entity;

public class TrainEntity{
    private Integer trainNumber;
    private String source;
    private String destination;
    private String trainDuration;
	public Integer getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(Integer trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getTrainDuration() {
		return trainDuration;
	}
	public void setTrainDuration(String trainDuration) {
		this.trainDuration = trainDuration;
	}
    
}