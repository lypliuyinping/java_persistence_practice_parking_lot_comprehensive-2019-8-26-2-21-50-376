package tws.controller;

import org.junit.Test;
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

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ParkingLotControllerTest {
	@Autowired
	MockMvc mockMvc;
	@Test
	 public void should_return_isCreated_when_given_post_request_of_parkingboylots() throws Exception {
		mockMvc.perform(post("/parkingLots")
                .contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
                .content("{\"parkingLotID\":1,\"capatity\":80,\"availablePositionCount\":50,\"parkingBoyID\":3}"))
                .andDo(print())
                .andExpect(status().isCreated());
    }
	}

