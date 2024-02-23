package org.DenysSyrotiuk;

import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import org.DenysSyrotiuk.creatWorld.GameEngin;

@Getter
@Setter
public class AnimalsPlay implements Runnable {
    private GameEngin gameEngin;
    private boolean isStop = false;

    public AnimalsPlay(GameEngin gameEngin) {
        this.gameEngin = gameEngin;
    }

    @SneakyThrows
    @Override
    public void run() {
        while (!isStop) {
            gameEngin.animalPlay();
        }
    }
}
