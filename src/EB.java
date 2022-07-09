
class EB extends Exception {
String str;
public EB( ) {
str = "B";
}
}
class ED extends EB {
String str;
public ED( ) {
str = "D";
}
}
class Test {
public static void thrower(int i) throws EB, ED {
if (i == 0) throw new EB( );
else if (i == 1) throw new ED( );
}
}
class Main {
public static void main(String args[]) {
int i = 0;
while (i < 2) {
try {
Test.thrower(i);
}
catch (ED e) {System.out.print(e.str);} // LINE A
catch (EB e) {System.out.print(e.str);} // LINE B
finally {System.out.print(" final "); i++;}
}
System.out.println(" ");
}
}