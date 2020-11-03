package ru.mtuci.simpleapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.SafeHtml;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class KaggleRanking extends AbstractBaseEntity {
    @NotNull
    private Integer rank;
    @NotBlank
   // @SafeHtml
    private String tier;
    @NotBlank
   // @SafeHtml
    private String username;
    @NotNull
    private Integer points;

}