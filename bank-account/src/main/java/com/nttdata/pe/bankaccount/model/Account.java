package com.nttdata.pe.bankaccount.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.List;

;

public class Account {
    @Id
    @Indexed(unique = true)
    @NotEmpty(message = "{NotEmpty.customer.accountNumber}")
    @Pattern(regexp = "[a-zA-Z]{10}", message = "{Pattern.customer.accountNumber}")
    private String accountNumber;

    @NotEmpty(message = "{NotEmpty.customer.personalCustomer}")
    private String personalCustomer;

    @NotEmpty(message = "{NotEmpty.customer.amount}")
    private Double amount;

    @NotEmpty(message = "{NotEmpty.customer.amount}")
    private TypeAccount typeAccount;

    private List<Transaction> transactions;
}
