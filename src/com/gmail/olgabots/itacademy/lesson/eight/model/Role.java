package com.gmail.olgabots.itacademy.lesson.eight.model;

public enum Role {
    ADMINISTRATOR(1, "Administrator"),
    USER(2, "User"),
    CUSTOMER(3, "Customer");

    private int roleAuthority;
    private String description;

    Role(int roleAuthority, String description) {
        this.roleAuthority = roleAuthority;
        this.description = description;
    }

    public int getRoleAuthority() {
        return roleAuthority;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleAuthority=" + roleAuthority +
                ", description='" + description + '\'' +
                '}';
    }
}
