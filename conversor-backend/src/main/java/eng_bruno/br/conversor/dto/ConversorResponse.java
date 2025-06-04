package eng_bruno.br.conversor.dto;

public class ConversorResponse {
    private double convertedValue;
    private String unit;

    public ConversorResponse(double convertedValue, String unit) {
        this.convertedValue = convertedValue;
        this.unit = unit;
    }

    public double getConvertedValue() { return convertedValue; }
    public String getUnit() { return unit; }
}
