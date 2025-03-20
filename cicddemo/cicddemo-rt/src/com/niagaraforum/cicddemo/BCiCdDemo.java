package com.niagaraforum.cicddemo;

import java.util.logging.Logger;

import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.BComponent;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

@NiagaraType
public class BCiCdDemo extends BComponent
{
// region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.tridiumx.cicd_demo.BCiCdDemo(2979906276)1.0$ @*/
/* Generated Thu Jan 30 11:53:01 EST 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BCiCdDemo.class);

  //endregion Type

//@formatter:on
    // endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

  public void sayHelloWorld()
  {
    LOG.info(getMessage());
  }

  public String getMessage()
  {
    return HELLO_WORLD;
  }

  public String getFirstWord()
  {
    return HELLO_WORLD.split(",")[0];
  }

  public String getSecondWord()
  {
    return HELLO_WORLD.split(",")[1];
  }

//  @Override
//  public Object clone()
//  {
//    return this;
//  }

  private static final Logger LOG = Logger.getLogger("cicd_demo");
  private static final String HELLO_WORLD = "Hello, World!";
}
