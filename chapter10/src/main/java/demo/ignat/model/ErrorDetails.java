package demo.ignat.model;

public record ErrorDetails(String message) {

    @Override
    public String toString() {
        return "ErrorDetails{" +
                "message='" + message + '\'' +
                '}';
    }
}
