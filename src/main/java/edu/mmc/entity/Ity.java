package edu.mmc.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Huang
 * @since 2019-05-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Ity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;


}
