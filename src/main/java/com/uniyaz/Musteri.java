package com.uniyaz;

import java.util.Objects;

public class Musteri {

    private String musteriAdi;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Musteri musteri = (Musteri) o;
        return Objects.equals(musteriAdi, musteri.musteriAdi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(musteriAdi);
    }
}
