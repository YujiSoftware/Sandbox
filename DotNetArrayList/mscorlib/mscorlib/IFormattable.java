package mscorlib  ;

import com4j.*;

@IID("{9A604EE7-E630-3DED-9444-BAAE247075AB}")
public interface IFormattable extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ToString"
   * </p>
   * @param format Mandatory java.lang.String parameter.
   * @param formatProvider Mandatory mscorlib.IFormatProvider parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String toString_(
    java.lang.String format,
    mscorlib.IFormatProvider formatProvider);


  // Properties:
}
