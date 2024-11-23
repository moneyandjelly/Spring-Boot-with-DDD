package com.example.demo.dice.service;

import com.example.demo.dice.repository.DiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DiceServiceImpl implements DiceService {
    final private DiceRepository DiceRepository;

    @Override
    public Integer rollDice() {
        return DiceRepository.rollDice();
    }
}
