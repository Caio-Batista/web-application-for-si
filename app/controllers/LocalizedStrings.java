package controllers;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by carlos on 16/05/16.
 */
public class LocalizedStrings {

    private static LocalizedStrings instance;
    private Map<String, String> strings;
    private String language;

    public static LocalizedStrings getInstance(String language) {
        if (instance == null) {
            instance = new LocalizedStrings(language);
        } else {
            instance.setLanguage(language);
        }
        return instance;
    }

    private LocalizedStrings(String language) {
        setLanguage(language);
    }

    //nameOfHTML_nameString
    public void setLanguage(String language) {
        strings = new HashMap<>();
        if (language.equals("EN")) {
            //-------login.html-------//
            strings.put("login_login", "Login");
            strings.put("login_email", "Email");
            strings.put("login_password", "Password");
            strings.put("login_account", "Don't you have an account?");
            strings.put("login_signup", "Signup now!");

            //-------register.html-------//
            strings.put("register_register","Register");
            strings.put("register_name","Name");
            strings.put("register_registation_number","Registation Number");
            strings.put("register_phone","Phone Number");
            strings.put("register_email","Email");
            strings.put("register_password","Password");
            strings.put("register_confirm_password","Confirm Password");
            strings.put("register_neighborhood", "Neighborhood");
            strings.put("register_street", "Street");
            strings.put("register_driver", "Are you a driver?");
            strings.put("register_yes", "Yes");
            strings.put("register_no", "No");
            strings.put("register_seats", "Number of Available Seats");
            strings.put("register_account", "Do you have an account?");
            strings.put("register_login", "Login Now!");

            //-------perfilPassenger-------//
            strings.put("passenger_passenger", "Passenger");
            strings.put("passenger_driver", "Driver");
            strings.put("passenger_update", "Update Data");
            strings.put("passenger_logout", "Logout");
            strings.put("passenger_goingTo", "Going to");
            strings.put("passenger_returnTo", "Return to");
            strings.put("passenger_available", "Available Caronas");
            strings.put("passenger_name", "Name");
            strings.put("passenger_location", "Location");
            strings.put("passenger_hour", "Hour");

            //-------perfilDriver-------//
            strings.put("driver_driver", "Driver");
            strings.put("driver_seats_available", "available seat(s) in your car.");
            strings.put("driver_seats_free", "available seat(s) in order to create a new Carona.");
            strings.put("driver_passenger", "Passenger");
            strings.put("driver_carona", "New Carona");
            strings.put("driver_update", "Update Data");
            strings.put("driver_solicitations", "Solicitations");
            strings.put("driver_logout", "Logout");
            strings.put("driver_name", "Name");
            strings.put("driver_location", "Location");
            strings.put("driver_hour", "Hour");


            //-------footer-------//
            strings.put("footer", "Authored by: Caio, Carlos, Izabella, Jefferson and Yago *All rights reservated");

        } else if (language.equals("PT")) {
            strings.put("login_login", "Login");
            strings.put("login_email", "Email");
            strings.put("login_password", "Senha");
            strings.put("login_account", "Não tem uma conta?");
            strings.put("login_signup", "Cadastre-se agora!");

            //-------register.html-------//
            strings.put("register_register","Cadastrar");
            strings.put("register_name","Nome");
            strings.put("register_registation_number","Matrícula");
            strings.put("register_phone","Número do telefone");
            strings.put("register_email","Email");
            strings.put("register_password","Senha");
            strings.put("register_confirm_password","Confirme a senha");
            strings.put("register_neighborhood", "Bairro");
            strings.put("register_street", "Rua");
            strings.put("register_driver", "Você é um motorista?");
            strings.put("register_yes", "Sim");
            strings.put("register_no", "Não");
            strings.put("register_seats", "Número de vagas disponíveis");
            strings.put("register_account", "Você já tem uma conta?");
            strings.put("register_login", "Logue agora!");

            //-------perfilPassenger-------//
            strings.put("passenger_passenger", "Passageiro");
            strings.put("passenger_driver", "Motorista");
            strings.put("passenger_update", "Atualizar Dados");
            strings.put("passenger_logout", "Sair");
            strings.put("passenger_goingTo", "Destino");
            strings.put("passenger_returnTo", "Retorno");
            strings.put("passenger_available", "Caronas Disponíveis");
            strings.put("login_name", "Nome");
            strings.put("login_location", "Localização");
            strings.put("login_hour", "Horário");

            //-------perfilDriver-------//
            strings.put("driver_driver", "Motorista");
            strings.put("driver_seats_available", "vaga(as) disponíveis no seu carro.");
            strings.put("driver_seats_free", "vaga(as) disponíveis para criar nova(as) Carona(as)");
            strings.put("driver_passenger", "Passageiro");
            strings.put("driver_driver", "Motorista");
            strings.put("driver_carona", "Nova Carona");
            strings.put("driver_solicitations", "Solicitações");
            strings.put("driver_update", "Atualizar Dados");
            strings.put("driver_logout", "Sair");
            strings.put("driver_name", "Nome");
            strings.put("driver_location", "Localização");
            strings.put("driver_hour", "Horário");

            strings.put("footer", "Autores: Caio, Carlos, Izabella, Jefferson and Yago *Todos os direitos reservados");

        } else {
            throw new IllegalArgumentException("Language not supported.");
        }
        this.language = language;
    }

    public String get(String key) {
        return strings.get(key);
    }

    public String getLanguage() {
        return language;
    }

}
