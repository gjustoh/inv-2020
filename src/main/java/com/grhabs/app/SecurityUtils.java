package com.grhabs.app;
import org.springframework.core.annotation.AnnotationUtils;
import com.grhabs.ui.login.login;
import com.vaadin.flow.server.ServletHelper;
import com.vaadin.flow.shared.ApplicationConstants;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SecurityUtils {
    public static String getusername(){
        SecurityContext context =SecurityContextHolder.getContext();
        Object obj = context.getAuthentication().getPrincipal();
        if (obj instanceof UserDetails){
            UserDetails user = (UserDetails)context.getAuthentication().getPrincipal();
            return user.getUsername();
        }
        return null;
    }
    public static boolean accesootorgado(Class<?> claseSegura){
        final boolean publicview = login.class.equals(claseSegura);
        if (publicview){
            return true;
        }
        Authentication userAuthentication = SecurityContextHolder.getContext().getAuthentication();
        if (!isUserLoggedIn(userAuthentication)){
            return false;
        }
        Secured secured = AnnotationUtils.findAnnotation(claseSegura,Secured.class);
        if (secured==null){
            return  true;
        }
        List<String > roles = Arrays.asList(secured.value());
        return userAuthentication.getAuthorities().stream().map(GrantedAuthority::getAuthority).anyMatch(roles::contains);

    }
    static boolean isFrameworkInternalRequest(HttpServletRequest request) {
        final String parameterValue = request.getParameter(ApplicationConstants.REQUEST_TYPE_PARAMETER);
        return parameterValue != null
                && Stream.of(ServletHelper.RequestType.values()).anyMatch(r -> r.getIdentifier().equals(parameterValue));
    }
    public static boolean estaLogeado(){
        return isUserLoggedIn(SecurityContextHolder.getContext().getAuthentication());
    }
    private static boolean isUserLoggedIn(Authentication authentication) {
        return authentication != null
                && !(authentication instanceof AnonymousAuthenticationToken);
    }
}
