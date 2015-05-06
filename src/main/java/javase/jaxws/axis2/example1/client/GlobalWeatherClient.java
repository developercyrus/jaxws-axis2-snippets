package javase.jaxws.axis2.example1.client;

import java.rmi.RemoteException;

import javase.jaxws.axis2.example1.stub.GlobalWeatherStub;

public class GlobalWeatherClient  {
	public static String getHKWeather() throws RemoteException {
		GlobalWeatherStub stub = new GlobalWeatherStub();
        GlobalWeatherStub.GetWeather weatherRequest = new GlobalWeatherStub.GetWeather();
        weatherRequest.setCountryName("Hong Kong");
        weatherRequest.setCityName("Hong Kong Inter-National Airport");
        GlobalWeatherStub.GetWeatherResponse weatherResponse = stub.getWeather(weatherRequest);
        return weatherResponse.getGetWeatherResult();
	}
	
	public static void main(String[] args) throws RemoteException {
        System.out.println(getHKWeather());
    }
}
