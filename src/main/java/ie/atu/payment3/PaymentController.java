package ie.atu.payment3;



import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class PaymentController {

    @GetMapping("/{id}")
    public String Employye(@PathVariable String id)
    {
        return "You called Microservice 3 - person by ID " + id;
    }
}
