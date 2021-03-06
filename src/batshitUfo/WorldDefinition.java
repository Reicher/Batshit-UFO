/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package batshitUfo;

import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.border.Border;
import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.World;

/**
 *
 * @author regen
 */
public class WorldDefinition {
        
    private World m_physicWorld;
    private Dimension m_screenRes;
    private Vec2 m_physicalSize;
    
    WorldDefinition(Dimension screenResolution){
        m_physicWorld = new World(new Vec2(0,9.82f));
        //m_physicWorld = new World(new Vec2(0,0));
        m_screenRes = screenResolution;
        m_physicalSize = new Vec2(screenResolution.width/20, screenResolution.height/20);
        
    }
    
    public void SetWorld(World world){
        m_physicWorld = world;
    }
    
    public World getPhysicsWorld(){
        return m_physicWorld;
    }

    public Vec2 getPixelsPerMeter(){
        return new Vec2(m_screenRes.height / m_physicalSize.x
                , m_screenRes.width / m_physicalSize.y);
    }
    
    public Vec2 getPhysicalSize(){
        return m_physicalSize;
    }    

}
