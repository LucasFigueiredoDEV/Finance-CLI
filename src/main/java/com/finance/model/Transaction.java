package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {

    private Long id;
    private BigDecimal value;
    private TransactionType type;
    private LocalDateTime dateTime;
    private CategoryType category;
    private String description;

    public Transaction(BigDecimal value, TransactionType type, LocalDateTime dateTime, CategoryType category) {
        this(value, type, dateTime, category, "");
    }

    public Transaction(BigDecimal value, TransactionType type, LocalDateTime dateTime, CategoryType category, String description) {
        this.value = value;
        this.type = type;
        this.dateTime = dateTime;
        this.category = category;
        this.description = description;
    }

}