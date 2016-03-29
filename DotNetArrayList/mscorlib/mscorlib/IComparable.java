package mscorlib  ;

import com4j.*;

@IID("{DEB0E770-91FD-3CF6-9A6C-E6A3656F3965}")
public interface IComparable extends Com4jObject {
  // Methods:
  /**
   * @param obj Mandatory java.lang.Object parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  int compareTo(
    @MarshalAs(NativeType.VARIANT) java.lang.Object obj);


  // Properties:
}
