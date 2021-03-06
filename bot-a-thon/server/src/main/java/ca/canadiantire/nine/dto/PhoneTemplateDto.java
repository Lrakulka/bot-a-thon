package ca.canadiantire.nine.dto;

/*
 * Canadian Tire Corporation, Ltd. Do not reproduce without permission in writing.
 * Copyright (c) 2018. Canadian Tire Corporation, Ltd. All rights reserved.
 */

import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude
public class PhoneTemplateDto extends AbstractTemplateDto {
    
    private Collection<PhoneTemplateItem> barCodes;

    public Collection<PhoneTemplateItem> getBarCodes() {
        return barCodes;
    }

    public void setBarCodes(final Collection<PhoneTemplateItem> barCodes) {
        this.barCodes = barCodes;
    }

    public static class PhoneTemplateItem {

        private String barCode;

        private Integer quantity;

        public String getBarCode() {
            return barCode;
        }

        public void setBarCode(final String barCode) {
            this.barCode = barCode;
        }

        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(final Integer quantity) {
            this.quantity = quantity;
        }
    }
}


