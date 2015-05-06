package javase.jaxws.axis2.example1.client;

import static org.junit.Assert.assertTrue;

import java.rmi.RemoteException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import us.codecraft.xsoup.Xsoup;

public class GlobalWeatherClientTest {

	@Test
    public void test1() throws RemoteException {
		String xml = GlobalWeatherClient.getHKWeather();		
        Document doc = Jsoup.parse(xml);
        String location = Xsoup.compile("//CurrentWeather/Location/text()").evaluate(doc).get();       
        String temperature = Xsoup.compile("//CurrentWeather/Temperature/text()").evaluate(doc).list().get(0);
        
        System.out.println(location);
        System.out.println(temperature);
        assertTrue(location.contains("Hong Kong"));
    }
}

