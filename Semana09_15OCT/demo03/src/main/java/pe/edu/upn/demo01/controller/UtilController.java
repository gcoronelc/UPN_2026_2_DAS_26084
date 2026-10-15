package pe.edu.upn.demo01.controller;

import com.google.gson.Gson;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class UtilController {

    static void responseMap(HttpServletResponse response, Map<String, Object> datos) throws IOException {

        Gson gson = new Gson();
        String json = new Gson().toJson(datos);
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);
        
    }

}
