package rocks.riedl.adqc.rocks.riedl.adqc.scan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/scans")
@RequestMapping("/scans")
public class ScanController {

  @GetMapping
  public ScanAcceptedResponse startNewScan() {
    return ScanAcceptedResponse.builder().build();
  }
}
