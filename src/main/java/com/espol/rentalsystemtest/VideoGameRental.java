package com.espol.rentalsystemtest;


public class VideoGameRental {
    private Object _videoGame;
    private int _daysRented;
    private boolean _consoleRented;

    public VideoGameRental(Object videoGame, int daysRented, boolean consoleRented) {
    	if(videoGame.getClass().isAssignableFrom(Ps3Game.class)||
    	   videoGame.getClass().isAssignableFrom(Xbox360Game.class)||
    	   videoGame.getClass().isAssignableFrom(WiiGame.class))
    		_videoGame = videoGame;
        _daysRented = daysRented;
        _consoleRented = consoleRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Object getVideoGame() {
        return _videoGame;
    }
    
    public double getCharge(){
    	if(_videoGame.getClass().isAssignableFrom(Ps3Game.class))
    		return ((Ps3Game)_videoGame).getCharge(_daysRented, _consoleRented);
    	if(_videoGame.getClass().isAssignableFrom(Xbox360Game.class))
    		return ((Xbox360Game)_videoGame).getCharge(_daysRented, _consoleRented);
    	if(_videoGame.getClass().isAssignableFrom(WiiGame.class))
    		return ((WiiGame)_videoGame).getCharge(_daysRented, _consoleRented);
    	return 0;
    }
    
    public int getFrequentRenterPoints(){
    	if(_videoGame.getClass().isAssignableFrom(Ps3Game.class))
    		return ((Ps3Game)_videoGame).getFrequentRenterPoints(_daysRented, _consoleRented);
    	if(_videoGame.getClass().isAssignableFrom(Xbox360Game.class))
    		return ((Xbox360Game)_videoGame).getFrequentRenterPoints(_daysRented, _consoleRented);
    	if(_videoGame.getClass().isAssignableFrom(WiiGame.class))
    		return ((WiiGame)_videoGame).getFrequentRenterPoints(_daysRented, _consoleRented);
    	return 0;
    }
    
    
    WiiGame mario;
    Xbox360Game halo;
    Ps3Game gta;
    VideoGameRental orden;
    int drenta;
    boolean consola;

    @Before
    public void setUp() {
        mario = new WiiGame("Mario galaxy";
        halo = new Xbox360Game("HALO");
        gta = new Ps3Game("GTA 5");
        drenta = 5;
        consola= True;
        orden = new VideoGameRental(gta, drenta , consola);
    }
    @Test
    public void testGetDaysRented() {
        assertEquals( drenta, orden.getDaysRented());
    }
    public void testGetVideoGame() {
        assertEquals( gta, orden.getVideogame());
    }
    public void testGetDaysRented() {
        assertEquals(gta.getCharge(drenta, consola), orden.getCharge());
    }
    public void testGetFrequentRenterPoints() {
        assertEquals(gta.getFrequentRenterPoints(drenta, consola), orden.getFrequentRenterPoints());
    }
                            
                            
}
