package za.ac.cput.project3assignment.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "category")
public class Category {

    @Id
    private String categoryID;

    private String categoryName;

    protected Category() {
    }

    protected Category(Builder builder) {
        this.categoryID = builder.categoryID;
        this.categoryName = builder.categoryName;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryID='" + categoryID + '\'' +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }

    public static class Builder {

        private String categoryID;
        private String categoryName;

        public Builder setCategoryID(String categoryID) {
            this.categoryID = categoryID;
            return this;
        }

        public Builder setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }

        public Category build() {
            return new Category(this);
        }
    }
}