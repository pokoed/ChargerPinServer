package xyz.pokoed.chargerpinserver.chargerInfo.service;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import xyz.pokoed.chargerpinserver.chargerInfo.api.ChargerInfoClient;

@Service
@AllArgsConstructor
public class ChargerInfoServiceImpl implements ChargerInfoService {
    private ChargerInfoClient chargerInfoClient;

    @Override
    public ResponseEntity<String> searchInfo(String keyword) {
        return chargerInfoClient.getChargerInfo(keyword);
    }
}
