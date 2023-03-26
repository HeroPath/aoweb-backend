package com.gianca1994.heropathbackend.resources.market;

import com.gianca1994.heropathbackend.resources.jwt.config.JwtTokenUtil;
import com.gianca1994.heropathbackend.resources.market.dto.request.MarketRegisterDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/market")
public class MarketController {

    @Autowired
    private MarketService marketS;

    @Autowired
    private JwtTokenUtil jwt;

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('STANDARD')")
    public List<Market> getAllMarkets() {
        return marketS.getAllMarkets();
    }

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('STANDARD')")
    public void registerItem(@RequestHeader(value = "Authorization") String token,
                             @RequestBody MarketRegisterDTO marketRegisterDTO) {
        marketS.registerItem(
                jwt.getIdFromToken(token.substring(7)),
                jwt.getUsernameFromToken(token.substring(7)),
                marketRegisterDTO
        );
    }

    @GetMapping("/buy/{marketId}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('STANDARD')")
    public void buyItem(@RequestHeader(value = "Authorization") String token,
                        @PathVariable Long marketId) {
        marketS.buyItem(
                jwt.getIdFromToken(token.substring(7)),
                marketId
        );
    }
}
