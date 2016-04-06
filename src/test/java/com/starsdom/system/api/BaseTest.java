package com.starsdom.system.api;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Title: BaseTest
 * Description:
 *
 * @author swe
 * @since 2016/4/2 0002
 */
@RunWith( value = SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-context.xml"})
public abstract class BaseTest {

}
