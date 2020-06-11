package main;

public class CruiserShipFactory implements ShipFactory{

    @Override
    public Ship createShip() {
        return new Ship(ShipType.CRUISER);
    }
}
