package examples.test;

import com.intuit.karate.junit5.Karate;

 class TestRunner {
    @Karate.Test
    Karate user () {
        return Karate.run("getApi").relativeTo(getClass());
    }
}