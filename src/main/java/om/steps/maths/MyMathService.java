package om.steps.maths;

import org.springframework.stereotype.Service;

@Service
public class MyMathService {

    public MathResult add(int a, int b){
        return new MathResult(a + b, "Operation finished successfully");
    }
}
