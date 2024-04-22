package com.github.kubrabal;

public class SimpleBuilder {

    private String name;
    private String type;

    private SimpleBuilder(Builder builder) {
        this.name = builder.name;
        this.type = builder.type;
    }

    public static class Builder {
        private String name;
        private String type;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public SimpleBuilder build() {
            return new SimpleBuilder(this);
        }
    }

    public void showMessage() {
        System.out.println("Builder Message: " + name + " " + type);
    }
}
