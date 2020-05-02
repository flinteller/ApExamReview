package com.company;

import java.util.ArrayList;

public class ProductReview
{
    private String name;
    private String review;

    /** Constructs a ProductReview object and initializes the instance variables. */
    public ProductReview(String pName, String pReview) {
        name = pName;
        review = pReview;
    }

    /** Returns the name of the product. */
    public String getName() {
        return name;
    }

    /** Returns the review of the product. */
    public String getReview() {
        return review;
    }
}

class ReviewCollector
{
    private ArrayList<ProductReview> reviewList;
    private ArrayList<String> productList;

    /** Constructs a ReviewCollector object and initializes the instance variables. */
    public ReviewCollector()
    {
        reviewList = new ArrayList<ProductReview>();
        productList = new ArrayList<String>();
    }

    /** Adds a new review to the collection of reviews, as described in part (a). */
    public void addReview(ProductReview prodReview) {
        /* to be implemented in part (a) */
        reviewList.add(prodReview);
        if(!(productList.contains(prodReview.getName()))){
            productList.add(prodReview.getName());
        }
    }
    /** Returns the number of good reviews for a given product name, as described in part (b). */
    public int getNumGoodReviews(String prodName) {
        /* to be implemented in part (b) */
        int num = 0;
        for(int a = 0; a < reviewList.size(); a++){
            if(reviewList.get(a).getName().equals(prodName)){
                String string_review = reviewList.get(a).getReview();
                int b = string_review.indexOf("b");
                int b2 = string_review.indexOf("b", b + 1);
                if(b != -1 && string_review.substring(b + 1, b + 2).equals("e") && string_review.substring(b + 2, b + 3).equals("s") && string_review.substring(b + 3, b + 4).equals("t")){
                    num++;
                }
                else if(b2 != -1 && string_review.substring(b2 + 1, b2 + 2).equals("e") && string_review.substring(b2 + 2, b2 + 3).equals("s") && string_review.substring(b2 + 3, b2 + 4).equals("t")){
                    num++;
                }
            }
        }

        return num;
    }

    /** Below methods not included in original problem. Needed for testing */
    public ArrayList<String> getProductList() {
        return productList;
    }

    public ArrayList<ProductReview> getReviewList() {
        return reviewList;
    }

    // There may be instance variables, constructors, and methods not shown.
}
