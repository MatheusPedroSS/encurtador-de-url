package com.pedro.backendencurtadordeurl.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
@ToString
public class Url implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String urlOriginal;
    private @Setter String hashUrl;
    private @Setter String urlEncurtada;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataCriacao;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}