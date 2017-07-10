package rest;

import model.Part;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

/**
 * Created by Pawel Krowicki on 2017-07-10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class PartControllerSpec extends AbstractTransactionalJUnit4SpringContextTests {

    private static final String BASE_URL = "http://localhost:8080/rest" ;
    private RestTemplate restTemplate = new RestTemplate();

    @Test
    public void shouldAddAnItem() throws Exception {
        String productName = "TEST1";
        double productPrice = 20;
        String response = restTemplate.getForObject(BASE_URL+"/add/"+productName+"/"+productPrice, String.class);
        assertThat(response).contains("TEST1");
        assertThat(response).contains("20");
        assertThat(response).doesNotContain("44");
    }

    @Test
    public void shouldShowAllItems() throws Exception {

        Part[] products = restTemplate.getForObject(BASE_URL + "/list", Part[].class);

        assertThat(products).isNotNull();
        assertThat(products.length).isGreaterThan(0);
    }

    @Test
    public void shouldAddByBody() throws Exception {
        Part part = new Part("TESTRER", 13);
        String response = restTemplate.postForObject(BASE_URL+"/addb", part, String.class);
        restTemplate.getForObject(BASE_URL+"/add/"+"SIKAWKA"+"/"+"200", String.class);

        assertThat(response).contains("TESTRER");
        assertThat(response).contains("13");
    }
}