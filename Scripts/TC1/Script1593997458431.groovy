import java.util.regex.Matcher
import java.util.regex.Pattern

String str = "All work and no play makes Jack a dull boy"

Pattern p1 = Pattern.compile("Jack")
Matcher m1 = p1.matcher(str)
assert m1.find()

Pattern p2 = Pattern.compile("Jackie")
Matcher m2 = p2.matcher(str)
assert ! m2.find()

