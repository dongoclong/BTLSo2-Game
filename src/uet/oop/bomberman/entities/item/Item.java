package uet.oop.bomberman.entities.item;

import javafx.scene.image.Image;
import uet.oop.bomberman.entities.still.StillEntity;

public abstract class Item extends StillEntity {
    public Item(int xUnit, int yUnit, Image img, int nLayer) {
        super(xUnit, yUnit, img);
        setLayer(nLayer); // chỉ số va chạm của các Item
    }
}
