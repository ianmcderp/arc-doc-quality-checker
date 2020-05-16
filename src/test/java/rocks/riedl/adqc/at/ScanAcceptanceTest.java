package rocks.riedl.adqc.at;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URI;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import rocks.riedl.adqc.App;
import rocks.riedl.adqc.scan.Project;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
@AutoConfigureMockMvc
public class ScanAcceptanceTest {

  @Autowired
  private MockMvc mvc;

  @Test
  public void when_startJobRequestIsReceived_then_return202Accepted() throws Exception {
    Project project = new Project();
    project.setDocumentationUri(URI.create("http://example.com"));

    mvc.perform(
            post("/scans")
                .contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(project)))
        .andExpect(status().isAccepted());
  }

}
