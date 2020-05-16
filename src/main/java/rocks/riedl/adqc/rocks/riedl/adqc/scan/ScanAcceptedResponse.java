package rocks.riedl.adqc.rocks.riedl.adqc.scan;

import lombok.Builder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Builder
public class ScanAcceptedResponse extends ResponseEntity {

  private ScanAcceptedResponse() {
    super(HttpStatus.ACCEPTED);
  }
}
