package io.mercy.cloud.product.api.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @author hkc
 * @version 1.0
 * @date 2020-08-15 11:11
 * @description
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("tb_product_category")
public class ProductCategory extends Model<ProductCategory> {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    private Integer parentId;

    private Integer userId;

    private Date createdDate;

    private Date modifyDate;

    private Integer status;

    private Integer isDeleted;
}
