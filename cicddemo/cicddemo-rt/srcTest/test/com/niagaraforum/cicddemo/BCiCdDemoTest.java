package test.com.niagaraforum.cicddemo;

import javax.baja.nre.annotations.NiagaraType;
import javax.baja.test.BTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

import com.niagaraforum.cicddemo.BCiCdDemo;

@NiagaraType
@Test
public class BCiCdDemoTest extends BTestNg
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $test.com.tridiumx.cicd_demo.BCiCdDemoTest(2979906276)1.0$ @*/
/* Generated Thu Jan 30 12:15:15 EST 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BCiCdDemoTest.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

  public void testConstructor()
  {
    BCiCdDemo demo = new BCiCdDemo();
  }

  public void testGetMessage()
  {
    BCiCdDemo demo = new BCiCdDemo();
    Assert.assertEquals(demo.getMessage(), "Hello, World!");
  }

  public void testGetFirstWord()
  {
    BCiCdDemo demo = new BCiCdDemo();
    Assert.assertEquals(demo.getFirstWord(), "Hello");
  }

  public void testGetSecondWord()
  {
    BCiCdDemo demo = new BCiCdDemo();
    Assert.assertEquals(demo.getSecondWord(), " World!");
  }

  public void testSayHelloWorld()
  {
    BCiCdDemo demo = new BCiCdDemo();
    demo.sayHelloWorld();
  }
}
