/*
 * Custom exception class for handling invalid rating values in real estate properties.
 * This exception is thrown when a rating value falls outside the acceptable range.
 */

public class InvalidRatingException extends Exception{
    // Constructor for creating new InvalidRatingException with a specific error message.
    public InvalidRatingException(String message){
        super(message);
    }
}