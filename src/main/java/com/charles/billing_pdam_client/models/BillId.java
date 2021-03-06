package com.charles.billing_pdam_client.models;

import java.io.Serializable;
import java.time.LocalDate;

public class BillId implements Serializable {
    private String billerId;
    private String customerAccountId;
    private LocalDate dueDate;
}
