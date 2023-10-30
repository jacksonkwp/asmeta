/* Generated By:JJTree&JavaCC: Do not edit this line. CompositionFormulaParser.java */
package org.asmeta.composition.parser;

/**
 * parser for compositional formulas
 */
public class CompositionFormulaParser/*@bgen(jjtree)*/implements CompositionFormulaParserTreeConstants, CompositionFormulaParserConstants {/*@bgen(jjtree)*/
  protected JJTCompositionFormulaParserState jjtree = new JJTCompositionFormulaParserState();
  /** Main entry point. */
  public static void main(String args[]) {
//    System.out.println("Reading from standard input...");
//    CompositionFormula t = new CompositionFormula(System.in);
//    try {
//      SimpleNode n = t.Start();
//      n.dump("");
//      System.out.println("Thank you.");
//    } catch (Exception e) {
//      System.out.println("Oops.");
//      System.out.println(e.getMessage());
//      e.printStackTrace();
//    }
  }

/** Main production. */
  final public SimpleNode parse() throws ParseException {
                      /*@bgen(jjtree) parse */
  ASTparse jjtn000 = new ASTparse(JJTPARSE);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      SimplePipe();
    jjtree.closeNodeScope(jjtn000, true);
    jjtc000 = false;
    {if (true) return jjtn000;}
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
    throw new Error("Missing return statement in function");
  }

/** An Expression. */
//void CompositionFormula() : {}
//{
//  SimplePipe()
//}

/** An Additive Expression. */
  final public void SimplePipe() throws ParseException {
                     /*@bgen(jjtree) SimplePipe */
  ASTSimplePipe jjtn000 = new ASTSimplePipe(JJTSIMPLEPIPE);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      HalfduplexBidirectionalPipe();
      label_1:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 8:
          ;
          break;
        default:
          break label_1;
        }
        jj_consume_token(8);
        HalfduplexBidirectionalPipe();
      }
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

/** A Multiplicative Expression. */
  final public void HalfduplexBidirectionalPipe() throws ParseException {
                                      /*@bgen(jjtree) HalfduplexBidirectionalPipe */
  ASTHalfduplexBidirectionalPipe jjtn000 = new ASTHalfduplexBidirectionalPipe(JJTHALFDUPLEXBIDIRECTIONALPIPE);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      UnaryExpression();
      label_2:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 9:
          ;
          break;
        default:
          break label_2;
        }
        jj_consume_token(9);
        UnaryExpression();
      }
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

/** A Unary Expression. */
  final public void UnaryExpression() throws ParseException {
                          /*@bgen(jjtree) UnaryExpression */
  ASTUnaryExpression jjtn000 = new ASTUnaryExpression(JJTUNARYEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 10:
        jj_consume_token(10);
        SimplePipe();
        jj_consume_token(11);
        break;
      case IDENTIFIER:
        AsmetaSpec();
        break;
      default:
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

/** An Identifier. */
  final public void AsmetaSpec() throws ParseException {
                     /*@bgen(jjtree) AsmetaSpec */
  ASTAsmetaSpec jjtn000 = new ASTAsmetaSpec(JJTASMETASPEC);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(IDENTIFIER);
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  /** Generated Token Manager. */
  public CompositionFormulaParserTokenManager token_source;
  JavaCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;

  /** Constructor with InputStream. */
  public CompositionFormulaParser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public CompositionFormulaParser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new JavaCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new CompositionFormulaParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
  }

  /** Constructor. */
  public CompositionFormulaParser(java.io.Reader stream) {
    jj_input_stream = new JavaCharStream(stream, 1, 1);
    token_source = new CompositionFormulaParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
  }

  /** Constructor with generated Token Manager. */
  public CompositionFormulaParser(CompositionFormulaParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
  }

  /** Reinitialise. */
  public void ReInit(CompositionFormulaParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      return token;
    }
    token = oldToken;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  /** Generate ParseException. */
  public ParseException generateParseException() {
    Token errortok = token.next;
    int line = errortok.beginLine, column = errortok.beginColumn;
    String mess = (errortok.kind == 0) ? tokenImage[0] : errortok.image;
    return new ParseException("Parse error at line " + line + ", column " + column + ".  Encountered: " + mess);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
