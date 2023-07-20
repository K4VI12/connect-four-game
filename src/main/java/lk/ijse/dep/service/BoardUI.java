package lk.ijse.dep.service;

import lk.ijse.dep.service.impl.Winner;

public interface BoardUI {
    public void update(int col, boolean isHuman);
    public void notifyWinner( Winner winner);
}
