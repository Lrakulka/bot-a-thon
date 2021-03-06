/*
 * Canadian Tire Corporation, Ltd. Do not reproduce without permission in writing.
 * Copyright (c) 2018. Canadian Tire Corporation, Ltd. All rights reserved.
 */

package ca.canadiantire.nine.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import ca.canadiantire.nine.dao.RecurringItemRepository;
import ca.canadiantire.nine.domain.Product;
import ca.canadiantire.nine.domain.RecurringItem;
import ca.canadiantire.nine.domain.RecurringTemplate;
import ca.canadiantire.nine.domain.Store;
import ca.canadiantire.nine.domain.User;
import ca.canadiantire.nine.util.NetworkUtil;

@Service
public class MailContentBuilder {

    @Autowired
    private RecurringItemRepository itemRepository;

    @Autowired
    private TemplateEngine templateEngine;

    public String buildRepeatableItemsOrdered(final String recipient, final User user,
                                              final List<Product> productsToOfferRecurring) {
        Context context = new Context();
        context.setVariable("recipient", recipient);
        context.setVariable("products", productsToOfferRecurring);
        context.setVariable("user", user);
        context.setVariable("host", NetworkUtil.getHostname());
        context.setVariable("port", NetworkUtil.getPort());
        return templateEngine.process("repeatableItemsOrderedPreviously", context);
    }

    public String buildRecurringOrderIsReady(final String recipient, final User user,
                                             final RecurringTemplate recurringTemplate) {
        Context context = new Context();
        context.setVariable("recipient", recipient);
        final List<RecurringItem> items = itemRepository.getRecurringItemsByTemplateId
                (recurringTemplate.getId());
        context.setVariable("items", items);
        context.setVariable("user", user);
        context.setVariable("orderTotal",
                items.stream().mapToDouble(i -> i.getProduct().getPrice().doubleValue() * i.getQuantity()).sum());
        context.setVariable("host", NetworkUtil.getHostname());
        context.setVariable("port", NetworkUtil.getPort());
        return templateEngine.process("recurringOrderIsReady", context);
    }

    public String buildTopProducts(final String recipient, final Store store,
                                   final List<Map.Entry<Product, Integer>> products) {
        Context context = new Context();
        context.setVariable("recipient", recipient);
        context.setVariable("items", products);
        context.setVariable("store", store);
        context.setVariable("host", NetworkUtil.getHostname());
        context.setVariable("port", NetworkUtil.getPort());
        return templateEngine.process("topRecurringProducts", context);
    }
}
