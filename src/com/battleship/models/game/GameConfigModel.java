/* 
 * Creation : Feb 9, 2015
 * Project Computer Science L2 Semester 4 - BattleShip
 */
package com.battleship.models.game;

import com.battleship.constants.GameConstants;
import com.battleship.main.DebugTrack;





/**
 * <h1>GameConfigModel</h1>
 * <p>
 * public class GameConfigModel<br/>
 * extends Model
 * </p>
 * 
 * <p>
 * Configuration for a new GameModel: it keeps the game configuration.<br/>
 * A new game will be created later with this configuration class.
 * </p>
 * <h2>Configure options</h2>
 * <p>
 * <ul>
 *  <li>Grid width: int number</li>
 *  <li>Grid height: int number</li>
 *  <li>Grid type: square or hexagon</li>
 *  </ul>
 * </p>
 * 
 *
 * @date    Feb 9, 2015
 * @author  Constantin MASSON
 * @author  Jessica FAVIN
 * @author  Anthony CHAFFOT
 * 
 * @see GameModel
 */
public class GameConfigModel extends Model implements GameConstants{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     int             gridWidth;
    private     int             gridHeight;
    private     int             gridType;
    
    
    
    
    
    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new empty GameConfig. All data are loaded with default values.
     */
    public GameConfigModel(){
        DebugTrack.showInitMsg("Create GameConfigModel Model");
        this.defaultConfig();
    }
    
    /**
     * Set configuration to default values
     */
    private void defaultConfig(){
        this.gridWidth  = GRID_DEFAULT_WIDTH;
        this.gridHeight = GRID_DEFAULT_HEIGHT;
        this.gridType   = GRID_TYPE_SQUARE;
        this.notifyObservers(null);
    }
    
    
    
    
    
    //**************************************************************************
    // Functions
    //**************************************************************************
    /**
     * Reset the current configuration. Every value will be set toward default 
     * value.
     */
    public void resetConfig(){
        this.defaultConfig();
    }
    
    /**
     * Check if current config is default config
     * @return true if default config, otherwise,return false
     */
    public boolean isDefaultConfig(){
        return      this.gridWidth  == GRID_DEFAULT_WIDTH   &&
                    this.gridHeight == GRID_DEFAULT_HEIGHT  &&
                    this.gridType   == GRID_TYPE_SQUARE;
    }
    
    /**
     * Check if config is valid
     * @return true if valid, otherwise, return false
     */
    public boolean isValid(){
        //It should be always true atm, bu could be false with name player etc
        return true;
    }
    
    
    
    
    
    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
    /**
     * Return the current grid width
     * @return grid with
     */
    public int getGridWidth() {
        return this.gridWidth;
    }

    /**
     * Return the current grid height
     * @return grid height
     */
    public int getGridHeight() {
        return this.gridHeight;
    }
    
    /**
     * Return current grid type (Ex: SQUARE or HEXAGON)
     * @return 
     */
    public int getGridType() {
        return this.gridType;
    }
    
    //**************************************************************************
    /**
     * Set a new grid width, will replace the old one. Must be between 
     * {@value GameConstants#GRID_MIN_WIDTH} and {@value GameConstants#GRID_MAX_WIDTH},
     * otherwise, do nothing
     * @param pValue new width
     */
    public void setGridWidth(int pValue) {
        if(pValue>=GRID_MIN_WIDTH && pValue<=GRID_MAX_WIDTH){
            this.gridWidth = pValue;
        }
        this.notifyObservers(null);
    }

    /**
     * Set a new gridWidth, will replace the old one. Must be between 
     * {@value GameConstants#GRID_MIN_HEIGHT} and {@value GameConstants#GRID_MAX_HEIGHT},
     * otherwise, do nothing
     * @param pValue new width
     */
    public void setGridHeight(int pValue) {
        if(pValue>=GRID_MIN_HEIGHT && pValue<=GRID_MAX_HEIGHT){
            this.gridHeight = pValue;
        }
        this.notifyObservers(null);
    }

    /**
     * Set a new Grid type. Must be a valid type, otherwise, do nothing.
     * @param pValue new width
     */
    public void setGridType(int pValue) {
        if(pValue==GRID_TYPE_SQUARE || pValue<=GRID_TYPE_HEXAGON){
            this.gridType = pValue;
        }
        this.notifyObservers(null);
    }
}