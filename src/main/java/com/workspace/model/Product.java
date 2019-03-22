package com.workspace.model;

import javax.persistence.*;

@Entity
@Table(name = "products" )
public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long product_id;

        private Long created_at;

        private String product_img_url;

        private String product_name;

        private String product_content;

        private String product_code;

        public Product() {
        }

        public Product(Long created_at, String product_img_url, String product_name, String product_content, String product_code) {
                this.created_at = created_at;
                this.product_img_url = product_img_url;
                this.product_name = product_name;
                this.product_content = product_content;
                this.product_code = product_code;
        }

        public Long getCreated_at() {
                return created_at;
        }

        public void setCreated_at(Long created_at) {
                this.created_at = created_at;
        }

        public String getProduct_img_url() {
                return product_img_url;
        }

        public void setProduct_img_url(String product_img_url) {
                this.product_img_url = product_img_url;
        }

        public String getProduct_name() {
                return product_name;
        }

        public void setProduct_name(String product_name) {
                this.product_name = product_name;
        }

        public String getProduct_content() {
                return product_content;
        }

        public void setProduct_content(String product_content) {
                this.product_content = product_content;
        }

        public String getProduct_code() {
                return product_code;
        }

        public void setProduct_code(String product_code) {
                this.product_code = product_code;
        }
}
