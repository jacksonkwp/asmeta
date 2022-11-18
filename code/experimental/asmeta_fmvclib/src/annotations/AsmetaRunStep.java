package annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * JButtons annotated with AsmetaRunStep are attached with an ActionListener
 * that updates the monitored functions and perform a single simulation step
 * 
 * @author Andrea Bombarda
 *
 */

@Retention(RetentionPolicy.RUNTIME)
public @interface AsmetaRunStep {

}
