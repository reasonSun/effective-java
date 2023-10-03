package chapter6.item39.markerannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //@Test가 런타임에도 유지되어야 한다
@Target(ElementType.METHOD) //@Test가 반드시 메서드 선언에서만 사용돼야 한다
public @interface Test {
}
