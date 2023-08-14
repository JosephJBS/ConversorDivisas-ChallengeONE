package com.mycompany.conversordivisas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.*;

import com.mycompany.conversordivisas.Responses.ConvertionResultResponse;
import com.mycompany.conversordivisas.Responses.DivisasCodeResponse;
/**
 *
 * @author josep
 */
public class ApiCall {
    String urlBase = "https://v6.exchangerate-api.com/v6/ac732d013324b5006eb6d592";


    String pruebaJson = "{\n" +
            "  \"result\": \"success\",\n" +
            "  \"documentation\": \"https://www.exchangerate-api.com/docs\",\n" +
            "  \"terms_of_use\": \"https://www.exchangerate-api.com/terms\",\n" +
            "  \"supported_codes\": [\n" +
            "    [\n" +
            "      \"PEN\",\n" +
            "      \"Peruvian Sol\"\n" +
            "    ],\n" +
            "    [\n" +
            "      \"USD\",\n" +
            "      \"United States Dollar\"\n" +
            "    ],\n" +
            "    [\n" +
            "      \"EUR\",\n" +
            "      \"EURO\"\n" +
            "    ]\n" +
            "  ]\n" +
            "}";

    public ArrayList<String> obtenerArrayListDeDivisas() throws IOException {
        ArrayList<String> arrayCodes = new ArrayList<>();
        DivisasCodeResponse respuestaApi = new DivisasCodeResponse();

        /* QUITAR CUANDO SE REALICE LA PRUEBA FINAL
        String urlConsulta = urlBase + "/codes";
        String responseString = callAPI(urlConsulta);
        respuestaApi = mappingResponse(DivisasCodeResponse.class,responseString);*/

        respuestaApi = mappingResponse(DivisasCodeResponse.class,pruebaJson);

        //Se agregan los codigos a la variable ArrayCodes
        respuestaApi.supported_codes.stream()
                .map(codes -> codes.get(0))
                .forEach(arrayCodes::add);

        System.out.println(arrayCodes);       
        return arrayCodes;
    }

    public <T> T mappingResponse(Class<T> response, String stringResponse) throws JsonProcessingException {
        ObjectMapper om = new ObjectMapper();
        return om.readValue(stringResponse, response);
    }

    public double convertirDivisa(String divisaActual, String divisaConvertir, double monto) throws IOException {
        ConvertionResultResponse convertionResultResponse = new ConvertionResultResponse();
        String urlConsulta = urlBase +
                "/pair/" +
                divisaActual + "/" +
                divisaConvertir + "/" +
                monto;

        String responseString = callAPI(urlConsulta);
        convertionResultResponse = mappingResponse(ConvertionResultResponse.class,responseString);
        return convertionResultResponse.conversion_result;
    }


    public String callAPI(String apiUrl) throws IOException {
        URL url = new URL(apiUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        // Configura la solicitud
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");

        // Verifica si la respuesta fue exitosa
        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Fallo: código HTTP: " + conn.getResponseCode());
        }

        // Lee la respuesta de la API
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder responseBuilder = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            responseBuilder.append(line);
        }

        br.close();
        conn.disconnect();
        return responseBuilder.toString();
    }
}
