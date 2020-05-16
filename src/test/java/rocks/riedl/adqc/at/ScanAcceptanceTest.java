package rocks.riedl.adqc.at;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import rocks.riedl.adqc.App;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
@AutoConfigureMockMvc
public class ScanAcceptanceTest {

  @Autowired
  private MockMvc mvc;

  @Test
  public void when_startJobRequestIsReceived_then_return202Accepted() throws Exception {
    mvc.perform(get("/scans")).andExpect(status().isAccepted());
  }

}
