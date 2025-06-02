package eng_bruno.br.conversor.converter;

import eng_bruno.br.conversor.dto.ConversorRequest;
import eng_bruno.br.conversor.dto.ConversorResponse;

public interface Conversor {
    boolean supports(String type);
    ConversorResponse converter(ConversorRequest request);
}
