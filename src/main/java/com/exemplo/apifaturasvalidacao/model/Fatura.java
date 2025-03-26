package com.exemplo.apifaturasvalidacao.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table (name ="faturas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString


public class Fatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message ="O número do cartão não pode estar em branco")
    @Pattern(regexp = "\\d{16}", message ="O número do cartão deve conter 16 caracteres")
    private String numeroCartao;

    @NotBlank(message = "O nome do titular não pode estar em branco")
    @Size(min=3, max=100, message = "O nome deve possuir entre 3 e 100 caracteres")
    private String nomeTitular;

    @NotNull(message = "O valor não pode ser nulo")
    @DecimalMin(value = "10.0", message = "O valor minimo é de 10 reais")
    @DecimalMax(value = "5000.00", message = "O valor máximo é de 5.000")
    private Double valor;

    @NotNull(message = "A data de pagamento não pode ser nula")
    @FutureOrPresent(message = "A data de pagamento deve ser a data atual ou futura")
    private LocalDate dataPagamento;

    @NotBlank(message = "O e-mail não pode estar em branco")
    @Email
    private String email;

}
