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

            strings.put("login_email_password_invalid","E-mail or password invalid");
            strings.put("login_error", "An error ocurred. Please, try again.");
            strings.put("login_user_registred","User successfully registered");
            strings.put("login_logout","Sucess Logout");



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

            strings.put("register_error","An error ocurred. Please, try again.");
            strings.put("register_invalid_name","Invalid Name");
            strings.put("register_invalid_registration","Invalid Registration");
            strings.put("register_already_registration","Registration already registered");
            strings.put("register_invalid_email","Invalid Email");
            strings.put("register_already_email","E-mail already registered");
            strings.put("register_invalid_password","Invalid Password");
            strings.put("register_passwords_dont_match","The passwords don't match");
            strings.put("register_invalid_neighborhood","Invalid Neighborhood");
            strings.put("register_invalid_street","Invalid Street Address");
            strings.put("register_invalid_phone","Invalid phone number");
            strings.put("register_invalid_number_passenger","If you are a driver, put the number of passenger");
            strings.put("register_number_passenber_ltz","Please, put the number of passenger greater than zero");


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


            //-------------UpdateData---------//
            strings.put("update_update_data", "Update Data");
            strings.put("update_departure_time", "Departure Time");
            strings.put("update_return_time", "Return Time");
            strings.put("update_question_user", "You want to update the return address?");
            strings.put("update_tag_yes", "Yes");
            strings.put("update_tag_no", "No");
            strings.put("update_botton_update", "Update");

            strings.put("update_invalided_departure_time", "Invalid Departure time");
            strings.put("update_invalided_return_time", "Return time is invalid");
            strings.put("update_invalided_new_return_address", "Invalid New Return Address");


            //-----------NewCarona--------------//
            strings.put("newCarona_New_Carona", "New Carona");
            strings.put("newCarona_leaving_neighbordhood", "leaving from (neighborhood)");
            strings.put("newCarona_leaving_street", "leaving from (street)");
            strings.put("newCarona_going_neighbordhood", "Going to (neighbordhood)");
            strings.put("newCarona_going_street", "Going to (street)");
            strings.put("newCarona_number_seats", "Number of Avaliable seats");
            strings.put("newCarona_departure_time", "Departure Time");
            strings.put("newCarona_botton_create", "Create");

            strings.put("newCarona_invalided_leaving_neaghbordhood", "Leaving from (Neighborhood) is invalid.");
            strings.put("newCarona_invalided_leaving_street", "Leaving from (Street) is invalid.");
            strings.put("newCarona_invalided_going_neaghbordhood", "Going to (Neighborhood) is invalid.");
            strings.put("newCarona_invalided_going_street", "Leaving from (Street) is invalid.");
            strings.put("newCarona_invalided_number_seats", "Number of Available Seats is invalid.");
            strings.put("newCarona_invalided_departure_time", "Departure Time is invalid.");
            strings.put("newCarona_not_exist_vacancies", "Number of vacancies not free!");





            //-------footer-------//
            strings.put("footer", "Authored by: Caio, Carlos, Izabella, Jefferson and Yago *All rights reservated");

        } else if (language.equals("PT")) {
            strings.put("login_login", "Login");
            strings.put("login_email", "Email");
            strings.put("login_password", "Senha");
            strings.put("login_account", "Não tem uma conta?");
            strings.put("login_signup", "Cadastre-se agora!");

            strings.put("login_email_password_invalid","Email ou senha inválido!");
            strings.put("login_error", "Aconteceu um erro. Por favor, tente novamente!");
            strings.put("login_user_registred","Usuário cadastrado com sucesso!");
            strings.put("login_logout","Deslogado com sucesso");


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

            strings.put("register_error","Aconteceu um erro. Por favor, tente novamente");
            strings.put("register_invalid_name","Nome inválido");
            strings.put("register_invalid_registration","Matrícula inválida");
            strings.put("register_already_registration","Matrícula já cadastrada");
            strings.put("register_invalid_email","Email inválido");
            strings.put("register_already_email","Email já cadastrado");
            strings.put("register_invalid_password","Senha inválida");
            strings.put("register_passwords_dont_match","As senhas devem ser iguais");
            strings.put("register_invalid_neighborhood","Bairro inválido");
            strings.put("register_invalid_street","Rua inválida");
            strings.put("register_invalid_phone","Número de telefone inválido");
            strings.put("register_invalid_number_passenger","Se você é um motorista, coloque o número de passageiros");
            strings.put("register_number_passenber_ltz","Por favor, digite um número de passageiros maior que zero");


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

            //-------------AtualizarDados---------//
            strings.put("update_update_data", "Atualizar Dados");
            strings.put("update_departure_time", "Horário de Partida");
            strings.put("update_return_time", "Horário de Retorno");
            strings.put("update_question_user", "Você deseja atualizar o endereço de retorno?");
            strings.put("update_tag_yes", "Sim");
            strings.put("update_tag_no", "Não");
            strings.put("update_botton_update", "Atualizar");

            strings.put("update_invalided_departure_time", "Horário de partida inválido");
            strings.put("update_invalided_return_time", "Horário de retorno inválido");
            strings.put("update_invalided_new_return_address", "Novo endereço de retorno inválido");


            //-----------NovaCarona--------------//
            strings.put("newCarona_New_Carona", "Nova Carona");
            strings.put("newCarona_leaving_neighbordhood", "Partindo de (bairro)");
            strings.put("newCarona_leaving_street", "Partindo de (rua)");
            strings.put("newCarona_going_neighbordhood", "Indo a (bairro)");
            strings.put("newCarona_going_street", "Indo a (rua)");
            strings.put("newCarona_number_seats", "Número de assentos disponíveis");
            strings.put("newCarona_departure_time", "Horário de partida");
            strings.put("newCarona_botton_create", "Criar");

            strings.put("newCarona_invalided_leaving_neaghbordhood", "Local de saída (bairro) inválido.");
            strings.put("newCarona_invalided_leaving_street", "Local de saída (rua) inválido.");
            strings.put("newCarona_invalided_going_neaghbordhood", "Destino (bairro) inválido");
            strings.put("newCarona_invalided_going_street", "Destino (rua) inválido");
            strings.put("newCarona_invalided_number_seats", "Número inválido de assentos.");
            strings.put("newCarona_invalided_departure_time", "Horário de partida inváliso.");
            strings.put("newCarona_not_exist_vacancies", "Não existe vagas.");

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
