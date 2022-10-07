package arquitectura.software.mscustomer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class Api {
    @GetMapping(path = "/test")
    public ResponseEntity<String> get(){
        return ResponseEntity.ok("customer test! ");
    }
}
