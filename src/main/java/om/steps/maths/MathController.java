package om.steps.maths;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/math")
public class MathController {

    private MyMathService mathService;

    public MathController(MyMathService mathService) {
        this.mathService = mathService;
    }

    @PostMapping
    public MathResult getAdditionResult(@RequestParam int a , @RequestParam int b) {
        return mathService.add(a, b);
    }
}
