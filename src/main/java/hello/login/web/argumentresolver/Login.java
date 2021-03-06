package hello.login.web.argumentresolver;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER) // 파라미터에 쓰인다
@Retention(RetentionPolicy.RUNTIME) // 실제 동작할때 까지 어노테이션이 남아 있어야 한다
public @interface Login {

}
