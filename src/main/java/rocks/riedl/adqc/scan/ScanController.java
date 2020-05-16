package rocks.riedl.adqc.scan;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(
    value = "/scans",
    consumes = MediaType.APPLICATION_JSON_VALUE
)
public class ScanController {

  @PostMapping()
  public ScanAcceptedResponse startNewScan(@RequestBody Project project) {
    return ScanAcceptedResponse.builder().build();
  }
}
