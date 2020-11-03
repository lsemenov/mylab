package ru.mtuci.simpleapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@Data
@AllArgsConstructor
public class Status {
    private String hostname;
    private String cyberpunk;

    public Status(String hostname) {
        this.hostname = hostname;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Status status = (Status) o;
        return Objects.equals(hostname, status.hostname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostname);
    }
}
