package haba713.postismartship.test;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Feature;

import org.glassfish.jersey.client.proxy.WebResourceFactory;
import org.glassfish.jersey.logging.LoggingFeature;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import haba713.postismartship.PostiSmartShipAuthenticator;
import haba713.postismartship.resources.Addresses;
import haba713.postismartship.resources.Addresses.GetAddressesAgentsResponse;

public class PostiSmartShipTest {
    
    private static final String URI = "https://api.unifaun.com/rs-extapi/v1";
    
    private String username;
    private String password;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {        
        username = System.getProperty("haba713.postismartship.test.username");
        password = System.getProperty("haba713.postismartship.test.password");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws Exception {
        Client client = ClientBuilder.newClient();
        Logger logger = Logger.getLogger(getClass().getName());
        Feature feature = new LoggingFeature(logger, Level.INFO, null, null);
        client.register(feature);        
        client.register(new PostiSmartShipAuthenticator(username, password));
        WebTarget target = client.target(URI);
        Addresses proxy = WebResourceFactory.newResource(Addresses.class, target);
        GetAddressesAgentsResponse response = proxy.getAddressesAgents("ITELLASP", null, "51270", null, "FI", null);
        System.out.println(response.toString());
    }
    
}
