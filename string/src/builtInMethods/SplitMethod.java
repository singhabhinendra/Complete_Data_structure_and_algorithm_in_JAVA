/*In Java ,the split() method of the String class is used to
* divide a string into an array of substrings based on specified
* delimiter(or pattern).
*Parameters:

    regex (Required): A regular expression that defines the delimiter or pattern used to split the string.
        If you provide a single character as a string (e.g., " " for space), the string will be split wherever that character appears.
        A regex allows you to specify more complex splitting rules, such as matching multiple characters, whitespace, or patterns.

    limit (Optional): Determines the maximum number of substrings to be returned.
        If limit > 0, the array contains at most limit substrings. Extra delimiters are ignored.
        If limit = 0, trailing empty strings are omitted.
        If limit < 0, there’s no limit on the number of substrings, and trailing empty strings are included.
        *
*  */
package builtInMethods;

public class SplitMethod {
    String name = "Abhinendra Singh";
    String[] parts = name.split(" "); // Split by space
     // Output: Sing
}
