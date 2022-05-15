package mk.finki.ukim.fitpoint.model;
import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ROLE_ADMIN,
    ROLE_EMPLOYEE,
    ROLE_CLIENT;

    @Override
    public String getAuthority() {
        return name(); //
    }
}
