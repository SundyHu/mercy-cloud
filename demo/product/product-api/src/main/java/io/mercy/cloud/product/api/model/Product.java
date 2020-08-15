package io.mercy.cloud.product.api.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author hkc
 * @version 1.0
 * @date 2020-08-15 10:22
 * @description
 */
@Data
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;
}
