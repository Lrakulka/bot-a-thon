package ca.canadiantire.nine.converter;

/*
 * Canadian Tire Corporation, Ltd. Do not reproduce without permission in writing.
 * Copyright (c) 2018. Canadian Tire Corporation, Ltd. All rights reserved.
 */


import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import ca.canadiantire.nine.dao.ProductRepository;
import ca.canadiantire.nine.dao.RecurringItemRepository;
import ca.canadiantire.nine.dao.UserRepository;
import ca.canadiantire.nine.domain.Product;
import ca.canadiantire.nine.domain.RecurringItem;
import ca.canadiantire.nine.domain.User;
import ca.canadiantire.nine.dto.PhoneTemplateDto;

import static org.mockito.Matchers.anyCollectionOf;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
@DirtiesContext
public class PhoneTemplateToRecurringTemplateConverterTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RecurringItemRepository recurringItemRepository;

    @Autowired
    private ProductRepository productRepository;

    @InjectMocks
    private PhoneTemplateToRecurringTemplateConverter testingInstance = new PhoneTemplateToRecurringTemplateConverter();

    @Test
    public void shouldSaveTemplate() {
        PhoneTemplateDto templateDto = new PhoneTemplateDto();
        templateDto.setUserId(2L);
        templateDto.setTimeUnit("DAY");
        templateDto.setTimeUnitAmount(3);
        templateDto.setStartDate("2018-01-01");
        templateDto.setBarCodes(Lists.newArrayList(createItem("12345", 3)));
        Product product = mock(Product.class);
        when(productRepository.getProductByBarCode(anyString())).thenReturn(product);
        when(userRepository.findOne(2L)).thenReturn(new User());

        testingInstance.convertAndSave(templateDto);

        Mockito.verify(recurringItemRepository).save(anyCollectionOf(RecurringItem.class));
    }

    private PhoneTemplateDto.PhoneTemplateItem createItem(final String barCode, final int quantity) {
        PhoneTemplateDto.PhoneTemplateItem item = new PhoneTemplateDto.PhoneTemplateItem();
        item.setBarCode(barCode);
        item.setQuantity(quantity);
        return item;
    }
}