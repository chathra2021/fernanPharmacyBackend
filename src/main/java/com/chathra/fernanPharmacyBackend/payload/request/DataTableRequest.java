package com.chathra.fernanPharmacyBackend.payload.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 21/11/2021
 * Time: 2:15 pm
 */
@Setter
@Getter
@NoArgsConstructor
@ToString
public class DataTableRequest {
    private int start;
    private int length;
    private int draw;
    private List<Order> order;
    private List<Column> columns;
    private Search search;
}
