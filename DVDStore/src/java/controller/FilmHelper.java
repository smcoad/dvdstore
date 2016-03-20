/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dvdrental.Actor;
import dvdrental.Category;
import dvdrental.Film;
import dvdrental.HibernateUtil;
import dvdrental.Language;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Scott
 */
public class FilmHelper {
    Session session = null;
    //create hibernate session
    public FilmHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    //retrieve the films where the film id is between a certain range specified by the variables startID and endID.
public List getFilmTitles(int startID, int endID) {
    List<Film> filmList = null;
    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery ("from Film as film where film.filmId between '"+startID+"' and '"+endID+"'");
        filmList = (List<Film>) q.list();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return filmList;
    }
    //retrieves the actors in a particular film. Constructs the query using filmID as the input variable
public List getActorsByID(int filmId){
    List<Actor> actorList = null;
    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery ("from Actor as actor where actor.actorId in (select filmActor.actor.actorId from FilmActor as filmActor where filmActor.film.filmId='" + filmId + "')");
        actorList = (List<Actor>) q.list();

    } catch (Exception e) {
        e.printStackTrace();
    }

    return actorList;
    }
    //retrieve a list of categories according to filmId
    public Category getCategoryByID(int filmId){
    List<Category> categoryList = null;
    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Category as category where category.categoryId in (select filmCat.category.categoryId from FilmCategory as filmCat where filmCat.film.filmId='" + filmId + "')");
        categoryList = (List<Category>) q.list();

    } catch (Exception e) {
        e.printStackTrace();
    }

    return categoryList.get(0);
    }
    //retrieve a single film according to filmId
    public Film getFilmByID(int filmId){

    Film film = null;

    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Film as film where film.filmId=" + filmId);
        film = (Film) q.uniqueResult();
    } catch (Exception e) {
        e.printStackTrace();
    }

    return film;
    }
    //retrieve the film language according to langId.
    public String getLangByID(int langId){

    Language language = null;

    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Language as lang where lang.languageId=" + langId);
        language = (Language) q.uniqueResult();
    } catch (Exception e) {
        e.printStackTrace();
    }

    return language.getName();
    }
}