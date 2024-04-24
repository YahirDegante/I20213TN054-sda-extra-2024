package mx.edu.utez.sda.extra.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@Builder
@Entity
public class Usuario {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private int id;

    @Pattern(regexp = "[a-zA-Z ]+$", message = "El nombre no es valido")
    @NotBlank(message = "El nombre es requerido")
    @Size(max = 16, message = "El nombre no puede contener mas de 30 caracteres")
    private String nombre;

    @Pattern(regexp = "[a-zA-Z ]+$", message = "Los apellidos no son validos")
    @NotBlank(message = "Los apellidos son requeridos")
    @Size(max = 16, message = "Los apellidos no puede contener mas de 30 caracteres")
    private String apellidos;

    @NotBlank(message = "El email es requerido")
    @Size(max = 50, message = "El correo no puede contener mas de 50 caracteres")
    @Email(message = "El email no es valido")
    private String email;


    @NotBlank(message = "La contraseña es requerida")
    @Size(min = 8, message = "La contraseña debe contener al menos 8 caracteres")
    @Size(max = 16, message = "La contraseña no puede contener mas de 16 caracteres")
    private String contrasenia;

    @NotNull(message = "La fecha de nacimiento es requerida")
    @Column(columnDefinition = "DATE", nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate feha_nacimiento;

    public Usuario() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public LocalDate getFeha_nacimiento() {
        return feha_nacimiento;
    }

    public void setFeha_nacimiento(LocalDate feha_nacimiento) {
        this.feha_nacimiento = feha_nacimiento;
    }
}
