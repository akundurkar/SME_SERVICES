//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.19 at 09:12:51 AM IST 
//


package in.adcast.jaxb.controller;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the in.led.jaxb.controller.playlist package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: in.led.jaxb.controller.playlist
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Playlist }
     * 
     */
    public Playlist createPlaylist() {
        return new Playlist();
    }

    /**
     * Create an instance of {@link Playlist.Campain }
     * 
     */
    public Playlist.Campain createPlaylistCampain() {
        return new Playlist.Campain();
    }

    /**
     * Create an instance of {@link Playlist.Campain.Frame }
     * 
     */
    public Playlist.Campain.Frame createPlaylistCampainFrame() {
        return new Playlist.Campain.Frame();
    }

    /**
     * Create an instance of {@link Playlist.Campain.Frame.PlaylistFile }
     * 
     */
    public Playlist.Campain.Frame.PlaylistFile createPlaylistCampainFramePlaylistFile() {
        return new Playlist.Campain.Frame.PlaylistFile();
    }

}