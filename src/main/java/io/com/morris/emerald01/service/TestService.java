package io.com.morris.emerald01.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TestService {
    private final List<String> engineeringPositionsList;

    private final static String ENGINEER_KEYWORD = "Engineer";

    public TestService() {
        this.engineeringPositionsList = Arrays.asList("Software Engineer", "Mechanical Engineer",
                "Computer Engineer", "Electrical Engineer");
    }

    public boolean isEngineeringPosition(String position) {
        return this.engineeringPositionsList.contains(position) || containsIgnoreCase(position, ENGINEER_KEYWORD);
    }

    public boolean containsIgnoreCase(String str1, String str2) {
        String str1Lower = str1.toLowerCase();
        String str2Lower = str2.toLowerCase();
        return str1Lower.contains(str2Lower);
    }
}
