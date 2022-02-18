package com.severalsoft.expensetracker.service;

import com.severalsoft.expensetracker.model.Expense;

import java.util.List;

public interface ExpenseService {

    List<Expense> findAll();
}
