package mscorlib  ;

import com4j.*;

@IID("{B36B5C63-42EF-38BC-A07E-0B34C98F164A}")
public interface _Exception extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ToString"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  java.lang.String toString_();


  /**
   * @param obj Mandatory java.lang.Object parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  boolean equals_(
    @MarshalAs(NativeType.VARIANT) java.lang.Object obj);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  int getHashCode();


  /**
   * @return  Returns a value of type mscorlib._Type
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  mscorlib._Type getType();


  /**
   * <p>
   * Getter method for the COM property "Message"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String message();


  /**
   * @return  Returns a value of type mscorlib._Exception
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  mscorlib._Exception getBaseException();


  /**
   * <p>
   * Getter method for the COM property "StackTrace"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String stackTrace();


  /**
   * <p>
   * Getter method for the COM property "HelpLink"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String helpLink();


  /**
   * <p>
   * Setter method for the COM property "HelpLink"
   * </p>
   * @param pRetVal Mandatory java.lang.String parameter.
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(15)
  void helpLink(
    java.lang.String pRetVal);


  /**
   * <p>
   * Getter method for the COM property "Source"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String source();


  /**
   * <p>
   * Setter method for the COM property "Source"
   * </p>
   * @param pRetVal Mandatory java.lang.String parameter.
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(17)
  void source(
    java.lang.String pRetVal);


    /**
     * <p>
     * Getter method for the COM property "InnerException"
     * </p>
     * @return  Returns a value of type mscorlib._Exception
     */

    @DISPID(1610743820) //= 0x6002000c. The runtime will prefer the VTID if present
    @VTID(19)
    mscorlib._Exception innerException();


    /**
     * <p>
     * Getter method for the COM property "TargetSite"
     * </p>
     * @return  Returns a value of type mscorlib._MethodBase
     */

    @DISPID(1610743821) //= 0x6002000d. The runtime will prefer the VTID if present
    @VTID(20)
    mscorlib._MethodBase targetSite();


    // Properties:
  }
