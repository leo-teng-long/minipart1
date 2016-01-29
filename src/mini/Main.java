package mini;

import mini.parser.*;
import mini.lexer.*;
import mini.node.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    try {
      Parser p = new Parser(new Lexer(new PushbackReader(new InputStreamReader(System.in), 1024)));
      p.parse();

      System.out.println("Valid");
    } catch (Exception e) {
      System.out.println("Invalid: " + e.getMessage());
    }
  }
}
