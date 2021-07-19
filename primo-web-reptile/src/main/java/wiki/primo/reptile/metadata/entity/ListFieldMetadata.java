/*
 * chenhx
 * Copyright (C) 2013-2021 All Rights Reserved.
 */
package wiki.primo.reptile.metadata.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chenhx
 * @version 0.0.1
 * @className FieldMetadata.java
 * @date 2021-07-07 2:41 下午
 * @description 字段元数据定义 集合，该类型的元数据获取的数据为集合类型的。
 */
@Data
public class ListFieldMetadata extends FieldMetadata implements Serializable {
   private static final long serialVersionUID = 8076291497710988834L;
   /**
    * 关联字段的code
    */
   private String quoteFieldCode;
}
