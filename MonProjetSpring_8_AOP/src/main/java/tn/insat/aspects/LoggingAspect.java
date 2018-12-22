package tn.insat.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Before("execution(* tn.insat.service.Calcul.*(..))")
	public void logItBefore(JoinPoint point) {
		String methodName = point.getSignature().getName();
		System.out.print(">>>>> A l'entrée de la méthode : "+methodName);
		for (Object arg : point.getArgs()) {
			System.out.print("  Argument : "+ arg);
		}
		System.out.println();
	}
	
	@AfterReturning(value = "execution (* tn.insat.service.Calcul.*(..))", returning = "resultat")
	public void logItAfter(JoinPoint point, Object resultat) {
		String methodName = point.getSignature().getName();
		System.out.println("<<<<< Sortie de "+methodName+ " Resultat: " + (Integer)resultat);
	}

}
