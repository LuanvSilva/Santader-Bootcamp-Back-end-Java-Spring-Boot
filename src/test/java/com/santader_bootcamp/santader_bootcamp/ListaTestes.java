package com.santader_bootcamp.santader_bootcamp;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


@ExtendWith(MockitoExtension.class)
public class ListaTestes {
    
    @Mock
    private List<String> letras;

    @Test
    void adicionar() {
        Mockito.when(letras.get(0)).thenReturn("B");
        Assertions.assertThat("B").isEqualTo(letras.get(0));
    }
}
