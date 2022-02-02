package om.steps.maths;

public class MathResult {
    private int mathResult;
    private String message;

    public MathResult(int mathResult, String message) {
        this.mathResult = mathResult;
        this.message = message;
    }

    public int getMathResult() {
        return mathResult;
    }

    public void setMathResult(int mathResult) {
        this.mathResult = mathResult;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
