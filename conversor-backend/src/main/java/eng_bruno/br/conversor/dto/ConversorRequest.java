package eng_bruno.br.conversor.dto;

public class ConversorRequest {
    private double value;
    private String from;
    private String to;
    private String type;

    public double getValue() { return value; }
    public String getFrom() { return from; }
    public String getTo() { return to; }
    public String getType() { return type; }

    public void setValue(double value) { this.value = value; }
    public void setFrom(String from) { this.from = from; }
    public void setTo(String to) { this.to = to; }
    public void setType(String type) { this.type = type; }
}
