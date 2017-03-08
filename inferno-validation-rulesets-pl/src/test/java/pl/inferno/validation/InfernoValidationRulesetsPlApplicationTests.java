package pl.inferno.validation;

import java.lang.annotation.Annotation;

import javax.validation.Payload;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pl.inferno.validation.annotation.Email;
import pl.inferno.validation.validators.EmailValidator;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = InfernoValidationRulesetsPlApplication.class)
public class InfernoValidationRulesetsPlApplicationTests {

	@Autowired
	private EmailValidator validator;

	@Test
	public void contextLoads() {
		Email email = new Email() {

			@Override
			public Class<? extends Annotation> annotationType() {
				// TODO Auto-generated method stub
				return Email.class;
			}

			@Override
			public Class<? extends Payload>[] payload() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String message() {
				// TODO Auto-generated method stub
				return "test";
			}

			@Override
			public Class<?>[] groups() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		validator.initialize(email);
	}

}
