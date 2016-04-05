package testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import testcase.TestFull;
import testcase.TesteLogin;
import testcase.TesteSair;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TesteLogin.class, TestFull.class, TesteSair.class,
})
public class TestSuiteSCRM {
}
