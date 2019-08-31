package tws.controller;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import org.junit.Test;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ParkingBoyControllerTest {
	@Autowired
	MockMvc mockMvc;
	
	@Test
	  public void should_return_isCreated_when_given_post_request_of_parkingboys() throws Exception {
		 mockMvc.perform(post("/parkingBoys")
	                .contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
	                .content("{\"parkingBoyID\":3,\"parkingBoyName\":\"里斯\",\"parkingBoyage\":20}"))
	                .andDo(print())
	                .andExpect(status().isCreated());
	    }
		
	 @Test
	    public void should_return_ststus_isOK_and_content_when_given_a_get_request_of_parkingboys() throws Exception {
	        mockMvc.perform(get("/parkingBoys"))
	                .andDo(print())
	                .andExpect(status().isOk())
	                .andExpect(content().string("[{\"parkingBoyID\":1,\"parkingBoyName\":\"里斯\",\"parkingBoyage\":20}]"));
	    }			
}